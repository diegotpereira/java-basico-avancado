import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class CalcularConta extends JFrame implements ActionListener{

    JLabel calcularLabel, medidorLabel, unidadeConsumoLabel, mesLabel,
           label4;
    JTextField textoTextField;
    Choice escolha1, escolha2;

    JButton enviarBtn, cancelarBtn;

    JPanel painel;

    CalcularConta() {

        painel = new JPanel();
        painel.setLayout(new GridLayout(4, 2, 30, 30));
        painel.setBackground(Color.WHITE);

        calcularLabel = new JLabel("Calcular Conta de Eletricidade");
        medidorLabel = new JLabel("Medidor No");
        unidadeConsumoLabel = new JLabel("Unidades consumidas");
        mesLabel = new JLabel("Mês");

        textoTextField = new JTextField();

        escolha1 = new Choice();
        escolha1.add("1001");
        escolha1.add("1002");
        escolha1.add("1003");
        escolha1.add("1004");
        escolha1.add("1005");
        escolha1.add("1006");
        escolha1.add("1007");
        escolha1.add("1008");
        escolha1.add("1009");
        escolha1.add("1010");

        escolha2 = new Choice();
        escolha2.add("Janeiro");
        escolha2.add("Fevereiro");
        escolha2.add("Março");
        escolha2.add("Abril");
        escolha2.add("Maio");
        escolha2.add("Junho");
        escolha2.add("Julho");
        escolha2.add("Agosto");
        escolha2.add("Setembro");
        escolha2.add("Outubro");
        escolha2.add("Novembro");
        escolha2.add("Dezembro");

        enviarBtn = new JButton("Enviar");
        cancelarBtn = new JButton("Cancelar");

        enviarBtn.setBackground(Color.BLACK);
        enviarBtn.setForeground(Color.WHITE);

        cancelarBtn.setBackground(Color.BLACK);
        cancelarBtn.setForeground(Color.WHITE);

        ImageIcon hicon2 = new ImageIcon(ClassLoader.getSystemResource("imagens/hicon2.jpg"));
        Image icone2 = hicon2.getImage().getScaledInstance(180, 270, Image.SCALE_DEFAULT);
        ImageIcon icone3 = new ImageIcon(icone2);
        label4 = new JLabel(icone3);

        calcularLabel.setFont(new Font("Senserif", Font.PLAIN, 26));

        // mover label para o centro
        calcularLabel.setHorizontalAlignment(JLabel.CENTER);

        painel.add(medidorLabel);
        painel.add(escolha1);
        painel.add(mesLabel);
        painel.add(escolha2);
        painel.add(unidadeConsumoLabel);
        painel.add(textoTextField);
        painel.add(enviarBtn);
        painel.add(cancelarBtn);

        setLayout(new BorderLayout(30, 30));

        add(calcularLabel, "North");
        add(painel, "Center");
        add(label4, "West");

        enviarBtn.addActionListener(this);
        cancelarBtn.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        setSize(650, 500);
        setLocation(350, 220);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String a = escolha1.getSelectedItem();
        String b = textoTextField.getText();
        String c = escolha2.getSelectedItem();

        int p1 = Integer.parseInt(b);

        int p2 = p1 * 7;
        int p3 = p2 + 50 + 12 + 102 + 20 + 50;

        String SQL = "INSERT INTO conta VALUES('" + a + "', '" + b + "', '" + c + "', '" + p3 + "')";
        
        try {
            Conexao con = new Conexao();

            con.st.executeUpdate(SQL);

            JOptionPane.showMessageDialog(null, "Conta Atualizada");
        } catch (Exception e) {
            
        }
    }
    public static void main(String[] args) {
        new CalcularConta().setVisible(true);
    }
}
