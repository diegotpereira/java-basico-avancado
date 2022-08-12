import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;

public class Login extends JFrame implements ActionListener{

    JLabel nomeUsuariolbl, passwordlbl, l3;
    JTextField nometField;
    JPasswordField senhatField;
    JButton b1, b2;
    JPanel p1, p2, p3, p4;

    Login() {

        super("Página de Login");
        nomeUsuariolbl = new JLabel("Usuário Nome");
        passwordlbl = new JLabel("Senha");
        nometField = new JTextField(15);
        senhatField = new JPasswordField(15);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("imagens/login.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);

        b1 = new JButton("Entrar", new ImageIcon(image));

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("imagens/cancel.png"));
        Image image2 = imageIcon2.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);

        b2 = new JButton("Cencelar", new ImageIcon(image2));

        b1.addActionListener(this);
        b2.addActionListener(this);

        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("imagens/pop.png"));
        Image image3 = imageIcon3.getImage().getScaledInstance(340, 370, Image.SCALE_DEFAULT);
        ImageIcon imageIcon4 = new ImageIcon(image3);
        
        l3 = new JLabel(imageIcon4);

        setLayout(new BorderLayout());

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        
        add(l3, BorderLayout.WEST);
        p2.add(nomeUsuariolbl);
        p2.add(nometField);
        p2.add(passwordlbl);
        p2.add(senhatField);
        add(p2, BorderLayout.CENTER);

        p4.add(b1);
        p4.add(b2);
        add(p4, BorderLayout.SOUTH);

        p2.setBackground(Color.WHITE);
        p4.setBackground(Color.WHITE);

        setSize(640, 450);
        setLocation(600, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            Conexao con = new Conexao();

            String a = nometField.getText();
            String b = senhatField.getText();

            String SQL = "SELECT * FROM login WHERE usuarioNome = '" + a + "' and password = '" + b + "'";

            ResultSet rs = con.st.executeQuery(SQL);

            if (rs.next()) {
                new Projeto().setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Login Inválido!");
                setVisible(false);
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();

            System.out.println("erro:" + e);
        }
        
    }
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
