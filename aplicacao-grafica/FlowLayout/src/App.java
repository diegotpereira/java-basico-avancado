import javax.swing.*;
import java.awt.FlowLayout;


public class App {

    JFrame janela = new JFrame();

    JPanel painel = new JPanel();

    JLabel rotulo = new JLabel("Seu Nome: ");

    JTextField texto = new JTextField(5);

    JButton botao = new JButton("OK");

    public static void main(String[] args) throws Exception {
        
        new App();
    }
    private App() {

        janela.setTitle("Exemplo de FlowLayout");

        janela.setSize(300, 100);

        janela.setLocation(50, 50);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));

        painel.add(rotulo);

        painel.add(texto);

        painel.add(botao);

        janela.add(painel);

        janela.setVisible(true);
    }
}
