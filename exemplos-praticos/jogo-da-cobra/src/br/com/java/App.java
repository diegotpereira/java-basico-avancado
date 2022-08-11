package br.com.java;

import javax.swing.JFrame;

import br.com.java.view.Janela;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // https://github.com/hexadeciman/Snake

        Janela janela = new Janela();

        janela.setTitle("Jogo da Cobra");
        janela.setSize(300, 300);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
