package br.com.java.controller;

import java.util.ArrayList;

import br.com.java.data.Tupla;
import br.com.java.view.DadosDoQuadrado;
import br.com.java.view.Janela;

public class ThreadsController extends Thread{

    ArrayList<ArrayList<DadosDoQuadrado>> quadrados = new ArrayList<ArrayList<DadosDoQuadrado>>();
    Tupla cabecaCobraPos;
    int tamanhoCobra = 3;
    long velocidade = 50;
    public static int direcaoCobra;

    Tupla foodPosition;

    ArrayList<Tupla> posicoes = new ArrayList<Tupla>();

    
    public ThreadsController(Tupla posicaoPartir) {

        quadrados = Janela.Grade;

        cabecaCobraPos = new Tupla(posicaoPartir.x, posicaoPartir.y);

        direcaoCobra = 1;

        Tupla cabecaPos = new Tupla(cabecaCobraPos.getX(), cabecaCobraPos.getY());
        posicoes.add(cabecaPos);


    }
    
    // rodar 
    public void rodar() {
        while (true) {
            moverInterno(direcaoCobra);
            moverExterno();
            verificarColisao();
            excluirCalda();
        }
    }

    private void verificarColisao() {
        Tupla posCritico = posicoes.get(posicoes.size() - 1);

        for(int i = 0; i <= posicoes.size() - 2; i++) {
            boolean biteCome = posCritico.getX() == posicoes.get(i).getX() && posCritico.getY() == posicoes.get(i).getY();

            if (biteCome) {
                
            }
        }
        boolean eatingFood = posCritico.getX()==foodPosition.y && posCritico.getY()==foodPosition.x;
        if(eatingFood){
            System.out.println("Yummy!");
            tamanhoCobra=tamanhoCobra+1;
                foodPosition = getValAleaNotInSnake();

            spawnFood(foodPosition);	
        }
    }

    private void spawnFood(Tupla foodPositionIn){
        quadrados.get(foodPositionIn.x).get(foodPositionIn.y).clarearLuz(1);
}

    private Tupla getValAleaNotInSnake(){
        Tupla p ;
        int ranX= 0 + (int)(Math.random()*19); 
        int ranY= 0 + (int)(Math.random()*19); 
        p=new Tupla(ranX,ranY);
        for(int i = 0;i<=posicoes.size()-1;i++){
            if(p.getY()==posicoes.get(i).getX() && p.getX()==posicoes.get(i).getY()){
                ranX= 0 + (int)(Math.random()*19); 
                ranY= 0 + (int)(Math.random()*19); 
                p=new Tupla(ranX,ranY);
                i=0;
            }
        }
        return p;
    }
    private void moverInterno(int direcao) {
        switch (direcao) {
            case 4:
                cabecaCobraPos.alterarDado(cabecaCobraPos.x, (cabecaCobraPos.y + 1)%20);
                posicoes.add(new Tupla(cabecaCobraPos.x, cabecaCobraPos.y));
                break;

            case 3:
                if (cabecaCobraPos.y - 1 < 0) {
                    cabecaCobraPos.alterarDado(cabecaCobraPos.x, 19);
                } else {
                    // abs =  O valor absoluto se refere ao valor positivo correspondente ao número 
                    // passado como nos argumentos
                    cabecaCobraPos.alterarDado(cabecaCobraPos.x, Math.abs(cabecaCobraPos.y - 1)%20);
                }
                posicoes.add(new Tupla(cabecaCobraPos.x, cabecaCobraPos.y));
                break;

            case 2:
                if (cabecaCobraPos.x - 1 < 0) {
                    cabecaCobraPos.alterarDado(19, cabecaCobraPos.y);
                } else {
                    cabecaCobraPos.alterarDado(Math.abs(cabecaCobraPos.x - 1) %20, cabecaCobraPos.y);
                }
                posicoes.add(new Tupla(cabecaCobraPos.x, cabecaCobraPos.y));
                break;

            case 1:
                cabecaCobraPos.alterarDado(Math.abs(cabecaCobraPos.x + 1)%20, cabecaCobraPos.y);
                posicoes.add(new Tupla(cabecaCobraPos.x, cabecaCobraPos.y));
                break;
        }
    }
    private void moverExterno() {
        for(Tupla tupla : posicoes) {
            int y = tupla.getY();
            int x = tupla.getX();

            quadrados.get(x).get(y).clarearLuz(0);
        }
    }
    private void excluirCalda() {
        int cmpt = tamanhoCobra;

        for(int i = posicoes.size() - 1; i >= 0; i--) {

            if (cmpt == 0) {
                Tupla tupla = posicoes.get(i);
                quadrados.get(tupla.y).get(tupla.x).clarearLuz(2);
            } else {
                cmpt--;
            }
        }
        cmpt = tamanhoCobra;

        for(int i = posicoes.size() - 1; i >= 0; i--) {

            if (cmpt == 0) {
                posicoes.remove(i);
            } else {
                cmpt--;
            }
        }
    }
}
