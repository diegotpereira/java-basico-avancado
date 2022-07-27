import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Jogabilidade extends JPanel implements KeyListener, ActionListener{

    private boolean jogar = false;
    private int pontuacao = 0;
    private int totalTijolos = 48;

    private Timer cronometro;
    private int atraso = 8;

    private int jogadorX = 310;

    private int bolaposX = 120;
    private int bolaposY = 350;
    private int boladirX = -1;
    private int boladirY = -2;

    private GeradorMapas map;

    public Jogabilidade() {

        map = new GeradorMapas(4, 12);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        cronometro = new Timer(atraso, this);
        cronometro.start();
    }

    public void paint(Graphics g) {

        // cor de fundo
        g.setColor(Color.black);
        g.fillRect(1, 1, 692, 592);

        // desenhando map
        map.desenhar((Graphics2D) g);

        // bordas
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);

        // os pontos 
        g.setColor(Color.white);
        g.setFont(new Font("serif", Font.BOLD, 25));
        g.drawString("" + pontuacao, 590, 30);

        // o remo
        g.setColor(Color.green);
        g.fillRect(jogadorX, 550, 100, 8);

        // a bola 
        g.setColor(Color.yellow);
        g.fillOval(bolaposX, bolaposY, 20, 20);

        // se você ganhou o jogo
        if (totalTijolos <= 0) {
            jogar = false;
            boladirX = 0;
            boladirY = 0;
            g.setColor(Color.RED);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("Você Venceu", 260, 300);

            g.setColor(Color.RED);
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Pressione (Enter) para reiniciar", 230, 350);

        }
        // se você perde o jogo
        if (bolaposY > 570) {
            
            jogar = false;
            boladirX = 0;
            boladirY = 0;
            g.setColor(Color.RED);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("Fim de jogo, pontuações:" + pontuacao, 190, 300);

            g.setColor(Color.RED);
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Pressione (Enter) para reiniciar", 230, 350);
        }
        g.dispose();
    }

    //  responsável por tomar alguma ação caso algum evento ocorra
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        cronometro.start();

        if (jogar) {
            
            if (new Rectangle(bolaposX, bolaposY, 20, 20).intersects(new Rectangle(jogadorX, 550, 30, 8))) {
                
                boladirY = -boladirY;
                boladirX = -2;
            }
        } else if (new Rectangle(bolaposX, bolaposY, 20, 20).intersects(new Rectangle(jogadorX + 70, 550, 30, 8))) {
            boladirY = -boladirY;
            boladirX = boladirX + 1;
        } else if (new Rectangle(bolaposX, bolaposY, 20, 20).intersects(new Rectangle(jogadorX + 30, 550, 40, 8))) {
            boladirY = -boladirY;
        }
        // verifique a colisão do mapa com a bola
        A: for(int i = 0; i < map.map.length; i++) {

            for(int j = 0; j <map.map[0].length; j++) {

                if (map.map[i][j] > 0) {
                    
                    // pontuação ++
                    int tijoloX = j * map.tijoloLargura  + 80;
                    int tijoloY = i * map.tijoloAltura + 50;
                    int tijoloLargura = map.tijoloLargura;
                    int tijoloAltura = map.tijoloAltura;
                    
                    Rectangle retangulo = new Rectangle(tijoloX, tijoloY, tijoloLargura, tijoloAltura);
                    Rectangle bolaRetangulo = new Rectangle(bolaposX, bolaposY, 20, 20);
                    Rectangle tijoloRetangulo = retangulo;

                    if (bolaRetangulo.intersects(tijoloRetangulo)) {
                        
                        map.setTijoloValor(0, i, j);
                        
                        pontuacao += 5;
                        totalTijolos--;

                        // quando a bola bate à direita ou à esquerda do tijolo
                        if (bolaposX + 19 <= tijoloRetangulo.x || bolaposX + 1 >= tijoloRetangulo.x + tijoloRetangulo.width) {
                            
                            boladirX = -boladirX; 
                        } else {
                            // quando a bola atinge o topo ou o fundo do tijolo
                            boladirY = -boladirY;
                        }
                        break A;
                    }
                }
            }
        }
        bolaposX += boladirX;
        bolaposY += boladirY;

        if (bolaposX < 0) {
            boladirX = -boladirX;
        }
        if (bolaposY < 0) {
            boladirY = -boladirY;
        }
        if (bolaposX > 670) {
            boladirX = -boladirX;
        }
        repaint();
    }

    // para indicar que uma tecla que não de controle foi pressionada e solta
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    // para indicar que a tecla foi pressionada 
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            
            if (jogadorX >= 600) {
                jogadorX = 600;
            } else {
                moverDireita();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            
            if (jogadorX < 10) {
                jogadorX = 10;
            } else {
                moverEsquerda();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            
            if (!jogar) {
                
                jogar = true;
                bolaposX = 120;
                bolaposY = 350;
                boladirX = -1;
                boladirY = -2;
                jogadorX = 310;
                pontuacao = 0;
                totalTijolos = 21;

                map = new GeradorMapas(3, 7);

                repaint();
            }
        }
    }
    public void moverDireita() {

        jogar = true;
        jogadorX += 20;
    }
    public void moverEsquerda() {

        jogar = true;
        jogadorX -= 20;
    }

    // para indicar que a tecla foi solta
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
