package br.com.java.view;

import java.util.ArrayList;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.KeyListener;

import br.com.java.controller.KeyboardListener;
import br.com.java.controller.ThreadsController;
import br.com.java.data.Tupla;

public class Janela extends JFrame{

    private static final long serialVersionUID = -2542001418764869760L;

    public static ArrayList<ArrayList<DadosDoQuadrado>> Grade;

    public static int width = 20;
    public static int height = 20;

    public Janela() {

        // Cria o arraylist que conterá os threads
        Grade = new ArrayList<ArrayList<DadosDoQuadrado>>();
        ArrayList<DadosDoQuadrado> dado;

        // Cria Threads e seus dados e os adiciona ao arrayList
        for(int i = 0; i < width; i++) {
            dado = new ArrayList<DadosDoQuadrado>();
            for(int j = 0; j < height; j++) {
                DadosDoQuadrado dadosDoQuadrado = new DadosDoQuadrado(2);
                dado.add(dadosDoQuadrado);
            }
            Grade.add(dado);
        }

        // Configurando o layout do painel
        getContentPane().setLayout(new GridLayout(20, 20, 0, 0));

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                getContentPane().add(Grade.get(i).get(j).quadrado);
            }
        }
        Tupla posicao = new Tupla(10, 10);

        ThreadsController threadsController = new ThreadsController(posicao);

        threadsController.start();

        this.addKeyListener((KeyListener) new KeyboardListener());
    }
}
