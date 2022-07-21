package br.com.java.view;

import java.util.*;
import java.awt.Color;

public class DadosDoQuadrado {
    
    //ArrayList que conterá as cores
    ArrayList<Color> cores = new ArrayList<Color>();
    int cor;
    PainelQuadrado quadrado;

    public DadosDoQuadrado(int coluna) {

        //Vamos adicionar a cor ao arrayList
        cores.add(Color.darkGray);
        cores.add(Color.BLUE);
        cores.add(Color.white);

        cor = coluna;

        quadrado = new PainelQuadrado(cores.get(cor));
    }

    public void clarearLuz(int c) {
        quadrado.alterarCor(cores.get(c));
    }
}
