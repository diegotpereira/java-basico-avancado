package br.com.java.view;

import java.awt.Color;
import javax.swing.JPanel;

public class PainelQuadrado extends JPanel{
    
    private static final long serialVersionUID = 1L;

    public PainelQuadrado(Color d) {
        this.setBackground(d);
    }

    public void alterarCor(Color d) {
        this.setBackground(d);
        this.repaint();
    }
}
