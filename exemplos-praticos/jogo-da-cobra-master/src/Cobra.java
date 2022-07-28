import javax.swing.*;

public class Cobra extends JFrame{

    public Cobra() {

        inicInterfaceUsuario();
    }
    
    private void inicInterfaceUsuario() {

        add(new Painel());
        setResizable(false);

        pack();

        setTitle("Jogo da Cobra");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
