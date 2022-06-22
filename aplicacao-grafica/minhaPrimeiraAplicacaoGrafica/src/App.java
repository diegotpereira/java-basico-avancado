import javax.swing.JButton;
import javax.swing.JFrame;

public class App {

    JFrame janela = new JFrame();

    JButton botao = new JButton("OK");
    public static void main(String[] args){

        new App();
    }
    private App() {
        janela.setTitle("Primeira aplicação Gráfica");

        // definir largura e altura
        janela.setSize(350, 150);

        // defini posição da janela
        janela.setLocation(50, 50);

        // defini encerre a aplicaçãp
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adicionado botão a janela
        janela.add(botao);

        // mostrar janela
        janela.setVisible(true);
    }
}
