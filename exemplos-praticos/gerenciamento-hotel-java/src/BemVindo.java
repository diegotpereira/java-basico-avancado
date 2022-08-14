import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class BemVindo implements ActionListener {

    Cadastro cadastro;
    
    private JFrame janelHotel;

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                
                try {
                    BemVindo bemVindo = new BemVindo();
                    bemVindo.janelHotel.setVisible(true);

                } catch (Exception e) {
                    
                    e.printStackTrace();
                }
                
            }
        });
    }

    public BemVindo() {

        inicializar();
    }

    private void inicializar() {

        janelHotel = new JFrame();
        janelHotel.getContentPane().setLayout(null);

        JLabel bemVindoLabel = new JLabel("Bem Vindo!");
        bemVindoLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
        bemVindoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bemVindoLabel.setBounds(97, 31, 457, 49);

        janelHotel.getContentPane().add(bemVindoLabel);

        JLabel sistemaLabel = new JLabel("Gerenciamento de Hotel DTP Software");
        sistemaLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
        sistemaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        janelHotel.setBounds(64, 105, 548, 62);

        janelHotel.getContentPane().add(sistemaLabel);

        JButton btnProsseguir = new JButton("Prosseguir");
        btnProsseguir.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        btnProsseguir.setBounds(479, 301, 151, 42);
        btnProsseguir.addActionListener(this);

        janelHotel.getContentPane().add(btnProsseguir);

        JLabel sobreLabel = new JLabel("Porto Alegre, RS - Brasil, Contato: diegoteixeirapereira@hotmail.com");
        sobreLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        sobreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        janelHotel.setBounds(22, 207, 627, 84);

        janelHotel.getContentPane().add(sobreLabel);

        janelHotel.setTitle("Gerenciamento de Hotel");
        janelHotel.setBounds(100, 100, 685, 402);
        janelHotel.setVisible(true);
        janelHotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Prosseguir")) {
            
            cadastro = new Cadastro();
        }
    }
}