package br.com.java.view;

import java.util.ArrayList;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.KeyListener;

public class Janela extends JFrame{

    private static final long serialVersionUID = -2542001418764869760L;

    public static ArrayList<ArrayList<DadosDoQuadrado>> Grid;

    public static int width = 20;
    public static int height = 20;

    public Janela() {

        // Cria o arraylist que conterá os threads
        Grid = new ArrayList<ArrayList<DadosDoQuadrado>>();
        ArrayList<DadosDoQuadrado> dado;

        // Cria Threads e seus dados e os adiciona ao arrayList
        for(int i = 0; i < width; i++) {
            dado = new ArrayList<DadosDoQuadrado>();
            for(int j = 0; j < height; j++) {
                DadosDoQuadrado dadosDoQuadrado = new DadosDoQuadrado(2);
                dado.add(dadosDoQuadrado);
            }
            Grid.add(dado);
        }

        // Configurando o layout do painel
        getContentPane().setLayout(new GridLayout(20, 20, 0, 0));

        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                getContentPane().add(Grid.get(i).get(j).quadrado);
            }
        }
        Tupla posicao = new Tupla(10, 10);

        ThreadsController threadsController = new ThreadsController(posicao);

        threadsController.start();

        this.addKeyListener((KeyListener) new KeyboardListener());
    }
}
