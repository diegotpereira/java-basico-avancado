import java.awt.*;
import javax.swing.*;

public class TelaAbertura {
    
    public static void main(String[] args) {

        Abertura abertura = new Abertura();
        abertura.setVisible(true);
        int i;
        int x = 1;

        for(i = 2; i <= 600; i += 4, x++) {
            abertura.setLocation(800-((i + x) /2), 500-(i/2));
            abertura.setSize((i+x), i);

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        
    }
    public static class Abertura extends JFrame implements Runnable {

        Thread thread;
    
        Abertura() {
    
            super("Sistema de faturamento de eletricidade");
            setLayout(new FlowLayout());
    
            ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("imagens/splash.jpg"));
            Image image = imageIcon.getImage().getScaledInstance(720, 550, Image.SCALE_DEFAULT);
            ImageIcon imageIcon2 = new ImageIcon(image);
    
            JLabel label = new JLabel(imageIcon2);
            add(label);
    
            thread = new Thread(this);
            thread.start();
        }
    
        @Override
        public void run() {
            try {
                Thread.sleep(7000);
                this.setVisible(false);
    
    
                new Login().setVisible(true);
    
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
    
    }
}

