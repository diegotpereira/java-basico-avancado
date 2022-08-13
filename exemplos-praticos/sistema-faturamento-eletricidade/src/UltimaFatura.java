import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class UltimaFatura extends JFrame implements ActionListener{

    JLabel faturaLabel;
    JTextArea faturaTextArea;
    JButton gerarButton;
    Choice escolha1;
    JPanel painel;

    UltimaFatura() {

        setSize(500, 900);
        setLayout(new BorderLayout());

        painel = new JPanel();

        faturaLabel = new JLabel("Gerar fatura");

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

        faturaTextArea = new JTextArea(50, 15);

        JScrollPane scrollPane = new JScrollPane(faturaTextArea);
        faturaTextArea.setFont(new Font("Senserif", Font.ITALIC, 18));

        gerarButton = new JButton("Gerar Fatura");

        painel.add(faturaLabel);
        painel.add(escolha1);
        add(painel, "North");

        add(scrollPane, "Center");
        add(gerarButton, "South");

        gerarButton.addActionListener(this);

        setLocation(350, 40);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        try {
            Conexao con = new Conexao();

            ResultSet rs = con.st.executeQuery("SELECT * FROM clientes WHERE medidor=" + escolha1.getSelectedItem());

            if (rs.next()) {
                faturaTextArea.append("\n Cliente Nome:" + rs.getString("nome"));
                faturaTextArea.append("\n Medidor No:" + rs.getString("medidor"));
                faturaTextArea.append("\n Cliente Endereço:" + rs.getString("endereco"));
                faturaTextArea.append("\n Cliente Estado:" + rs.getString("estado"));
                faturaTextArea.append("\n Cliente Cidade:" + rs.getString("cidade"));
                faturaTextArea.append("\n Cliente Email:" + rs.getString("email"));
                faturaTextArea.append("\n Cliente Telefone:" + rs.getString("telefone"));
                faturaTextArea.append("\n------------------------------------------------------");
                faturaTextArea.append("\n");
            }
            faturaTextArea.append("Detalhes das últimas contas\n\n\n");

            rs = con.st.executeQuery("SELECT * FROM conta WHERE medidorNo=" + escolha1.getSelectedItem());

            while (rs.next()) {
                faturaTextArea.append(" " + rs.getString("mes") + " " + rs.getString("total") + "\n");
            }

        } catch (Exception ae) {
            ae.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        new UltimaFatura().setVisible(true);
    }
}
