import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Painel extends JPanel implements ActionListener{

    private final int painel_altura = 300;
    private final int painel_largura = 300;
    private final int ponto_tamanho = 10;
    private final int todos_pontos = 900;
    private final int aleatoria_pos = 29;
    private final int atraso = 140;

    private boolean emJogo = true;

    private Timer cronometro;
    private Image bola;
    private Image maca;
    private Image cabeca;  
    
    private final int x[] = new int[todos_pontos];
    private final int y[] = new int[todos_pontos];

    private int pontos;
    private int maca_x;
    private int maca_y;

    private boolean direcaoEsquerda = false;
    private boolean direcaoDireita = false;
    private boolean direcaoCima = false;
    private boolean direcaoBaixo = false;

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

            x[z] = 50 - z * 10;
            y[z] = 50;
        }
        localizarMaca();

        cronometro = new Timer(atraso, this);
        cronometro.start();
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

    private void mover() {

        for(int z = pontos; z > 0; z--) {

            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }
        
        if (direcaoEsquerda) {
            x[0] -= ponto_tamanho;
        }

        if (direcaoDireita) {
            x[0] += ponto_tamanho;
        }

        if (direcaoCima) {
            y[0] -= ponto_tamanho;
        }

        if (direcaoBaixo) {
            y[0] += ponto_tamanho;
        }
    }

    private void localizarMaca() {
        int r = (int) (Math.random() * aleatoria_pos);
        maca_x = ((r * ponto_tamanho));

        r = (int) (Math.random() * aleatoria_pos);
        maca_y = ((r * ponto_tamanho));
    }

    private void verificarColisao() {

        for(int z = pontos; z > 0; z--) {

            if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
                
                emJogo = false;
            }
        }

        if (y[0] >= painel_altura) {
            emJogo = false;
        }

        if (y[0] < 0) {
            
            emJogo = false;
        }

        if (x[0] >= painel_largura) {
            
            emJogo = false;
        }

        if (x[0] < 0) {
            
            emJogo = false;
        }

        if (!emJogo) {
            cronometro.stop();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (emJogo) {

            localizarMaca();
            verificarColisao();
            mover();
        }
        repaint();
    }
}
