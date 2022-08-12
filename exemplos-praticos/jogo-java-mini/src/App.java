import javax.swing.*;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;	
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class App extends JFrame{

    PainelJogo gp;
    int linhas, colunas;
    Dimension telaTamanho;
    int largura, altura;
    int app_len;

    public App() {

        super("App");

        colunas = 6;
        linhas = colunas * 2;
        telaTamanho = Toolkit.getDefaultToolkit().getScreenSize();
        largura = telaTamanho.width;
        altura = telaTamanho.height;

        app_len = (altura/8) * 2 / colunas;
        gp = new PainelJogo(app_len, linhas, colunas);


        setBounds ((largura/8)*3-app_len*3/2,(altura/6)*1-app_len,(largura/8)*2+app_len*3+6,(altura/6)*4+25+app_len);
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando o Jogo!");
        JFrame.setDefaultLookAndFeelDecorated(true);

        new App();
    }
}

class PainelJogo extends JComponent implements ActionListener{

    static int linhas, colunas;
    static int scr[][];
    Node tetris;
    Timer contador, contador1, contaodr2, anim_contador;
    Image img[] = new Image[4];
    Image ftubo, btudo;
    int len;
    int a, b;

    String arquivos[] =  {"intro.mid","enter.wav","sound735.wav","blip.wav","sound65.wav","sound136.wav","tada.wav","sound713.wav"};
    AudioClip clipes[] = new AudioClip[8];

    Toolkit tk;
    Random rand;

    public PainelJogo(int l,int r,int c) {
        len = 1;
        linhas =  r + 1;

        colunas = c;

        init();

        carregarImagens();
        carregarMusicas();
        gerarPedras();

        setFocusable(true);
    }

    public void carregarImagens() {

        
        String s =  "";

        URL urlImage = App.class.getResource("../imagens/puyo__2.png");
        

        if (len >= 42) 
        s = "_";
        for(int i = 0; i < img.length; i++) 
        
        img[i]=tk.getImage(urlImage);
        ftubo = tk.getImage("imagens\\pipe"+s+"1.png");
        btudo = tk.getImage("/imagens/pipe"+s+".png");

            
        
    }
    public void carregarMusicas() {

        try {
            for(int i = 0; i < clipes.length; i++) {
                clipes[i] = Applet.newAudioClip(new URL("file:"+System.getProperty("user.dir")+"\\sounds\\"+arquivos[i]));
            }
        } catch (MalformedURLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void gerarPedras() {

        int p;

        if(colunas % 2 == 0)
        p = colunas/2-1;
        else 
        p = colunas/2;

        if (scr[0][p] == 0 && scr[1][p] == 0) {
            clipes[4].play();
            scr[0][p] = a;
            scr[1][p] = b;
        } else {
            clipes[2].play();
            contador.stop();
            
            return;
        }
        int r;

        while((r = rand.nextInt(8)) % 2 == 0);
        a = r;

        while((r = rand.nextInt(8)) % 2 == 0);
        b = r;

        
    }
    public void init() {

        scr = new int[linhas][colunas];
        rand = new Random();
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
        
}

class Node {

    int x, y;
    Node proxNode;
    Node antNode;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
        proxNode = null;
        antNode = null;
    }

    public Node(Node p) {
        x = p.x;
        y = p.y;
        proxNode = null;
        antNode = null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Node getProx() {
        return proxNode;
    }

    public void setProx(Node lnode) {
        proxNode = lnode;
    }

    public Node getAnt() {
        return antNode;
    }

    public void setAnt(Node lnode) {
        antNode = lnode;
    }
    
    

    
}