import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Painel extends JPanel implements ActionListener{

    private final int painel_altura = 300;
    private final int painel_largura = 300;
    private final int todos_pontos = 900;

    private boolean emJogo = true;

    private Image bola;
    private Image maca;
    private Image cabeca;  
    
    private final int x[] = new int[todos_pontos];
    private final int y[] = new int[todos_pontos];

    private int pontos;
    private int maca_x;
    private int maca_y;

    public Painel() {

        iniciaPainel();
    }

    private void iniciaPainel() {

        setBackground(Color.BLACK);
        setFocusable(true);

        setPreferredSize(new Dimension(painel_largura, painel_altura));
        carregarImagem();
        iniciaJogo();
    }

    private void carregarImagem() {
        ImageIcon pt = new ImageIcon("src/resources/dot.png");
        bola = pt.getImage();

        ImageIcon mc = new ImageIcon("src/resources/apple.png");
        maca = mc.getImage();

        ImageIcon cb = new ImageIcon("src/resources/head.png");
        cabeca = cb.getImage();
    }
    private void iniciaJogo() {

        pontos = 3;

        for(int z = 0; z < pontos; z++) {

            x[z] = 50 - z * 50;
            y[z] = 50;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);

        facaDesenho(g);
    }

    private void facaDesenho(Graphics g) {

        if (emJogo) {
            g.drawImage(maca, maca_x, maca_y, this);

            for(int z = 0; z < pontos; z++) {
                
                if (z == 0) {
                    
                    g.drawImage(cabeca, x[z], y[z], this);
                } else {
                    g.drawImage(bola, x[z], y[z], this);
                }
            }
            Toolkit.getDefaultToolkit().sync();
        } else {

            // fim de jogo
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        repaint();
    }
}
