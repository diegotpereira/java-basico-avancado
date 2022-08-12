import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class NovoCliente extends JFrame implements ActionListener{

    JLabel nomeLabel, medidorLabel, enderecoLabel, 
          estadoLabel, cidadeLabel, emailLabel, telefoneLabel, label8;
    JTextField nomeTextField, medidorTextField, enderecoTextField, telefoneTextField, 
          estadoTextField, cidadeTextField, emailTextField;

    JButton enviarBtn, cancelarBtn;

    public NovoCliente() {

        super("Adicionar Cliente");
        setLocation(350, 200);
        setSize(650, 600);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(9, 2, 10, 10));
        painel.setBackground(Color.WHITE);

        // nome
        nomeLabel = new JLabel("Nome");
        nomeTextField = new JTextField();
        painel.add(nomeLabel);
        painel.add(nomeTextField);

        // Nº do medidor
        medidorLabel = new JLabel("Nº do medidor");
        medidorTextField = new JTextField();
        painel.add(medidorLabel);
        painel.add(medidorTextField);

        // Endereço
        enderecoLabel = new JLabel("Endereço");
        enderecoTextField =  new JTextField();
        painel.add(enderecoLabel);
        painel.add(enderecoTextField);

        // Estado
        estadoLabel = new JLabel("Estado");
        estadoTextField = new JTextField();
        painel.add(estadoLabel);
        painel.add(estadoTextField);

        // Cidade
        cidadeLabel = new JLabel("Cidade");
        cidadeTextField = new JTextField();
        painel.add(cidadeLabel);
        painel.add(cidadeTextField);

        // Email
        emailLabel = new JLabel("Email");
        emailTextField = new JTextField();
        painel.add(emailLabel);
        painel.add(emailTextField);

        // Telefone
        telefoneLabel = new JLabel("Telefone");
        telefoneTextField = new JTextField();
        painel.add(telefoneLabel);
        painel.add(telefoneTextField);


        enviarBtn = new JButton("Enviar");
        cancelarBtn = new JButton("Cancelar");

        enviarBtn.setBackground(Color.BLACK);
        enviarBtn.setForeground(Color.WHITE);

        cancelarBtn.setBackground(Color.BLACK);
        cancelarBtn.setForeground(Color.WHITE);

        painel.add(enviarBtn);
        painel.add(cancelarBtn);
        setLayout(new BorderLayout());

        add(painel, "Center");

        ImageIcon hicone1 = new ImageIcon(ClassLoader.getSystemResource("imagens/hicon1.jpg"));
        Image icone1 = hicone1.getImage().getScaledInstance(150, 280, Image.SCALE_DEFAULT);
        ImageIcon icone2 = new ImageIcon(icone1);
        label8 = new JLabel(icone2);

        add(label8, "West");

        getContentPane().setBackground(Color.WHITE);

        enviarBtn.addActionListener(this);
        cancelarBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String nome = nomeTextField.getText();
        String medidor = medidorTextField.getText();
        String endereco = enderecoTextField.getText();
        String telefone = telefoneTextField.getText();
        String estado = estadoTextField.getText();
        String cidade = cidadeTextField.getText();
        String email = emailTextField.getText();

        String SQL = 
        "INSERT INTO clientes VALUES('"+nome+"','"+medidor+"','"+endereco+"','"+telefone+"','"+estado+"','"+cidade+"','"+email+"')";

        try {
            Conexao con = new Conexao();

            con.st.executeUpdate(SQL);

            JOptionPane.showMessageDialog(null, "Cliente Adicionado");
            this.setVisible(true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (e.getSource() == cancelarBtn) {
            nomeTextField.setText("");
            medidorTextField.setText("");
            enderecoTextField.setText("");
            telefoneTextField.setText("");
            estadoTextField.setText("");
            cidadeTextField.setText("");
            emailTextField.setText("");

        }
    }
    public static void main(String[] args) {
        new NovoCliente().setVisible(true);
    }
}
