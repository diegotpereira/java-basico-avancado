import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame janela = new JFrame();
        Jogabilidade jogabilidade = new Jogabilidade();

        janela.setBounds(10, 10, 700, 600);
        janela.setTitle("Bola de Breakout");
        janela.setResizable(false);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.add(jogabilidade);
        janela.setVisible(true);
    }
}
