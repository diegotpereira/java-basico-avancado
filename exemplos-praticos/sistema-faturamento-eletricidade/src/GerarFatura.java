import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class GerarFatura extends JFrame implements ActionListener{

    JLabel faturaLabel;
    JTextArea faturaTextArea;
    JButton gerarButton;
    Choice escolha1, escolha2;

    JPanel painel;

    GerarFatura() {

        setSize(500, 900);
        setLayout(new BorderLayout());

        painel = new JPanel();

        faturaLabel = new JLabel("Gerar Fatura");

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

        faturaTextArea = new JTextArea(50, 15);
        JScrollPane scrollPane = new JScrollPane(faturaTextArea);
        faturaTextArea.setFont(new Font("Senserif", Font.ITALIC, 18));

        gerarButton = new JButton("Gerar Fatura");

        painel.add(faturaLabel);
        painel.add(escolha1);
        painel.add(escolha2);
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

            String mes = escolha2.getSelectedItem();

            faturaTextArea.setText("\tGrupo CPFL\nFATURA DE ELECTRICIDADE PARA O MÊS DE " + mes + ", 2022\n\n\n");

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
            rs = con.st.executeQuery("SELECT * FROM taxa");

            if (rs.next()) {
                faturaTextArea.append("\n Localização do Medidor:" + rs.getString("medidor_localizacao"));
                faturaTextArea.append("\n Tipo do Medidor:" + rs.getString("medidor_tipo")); 
                faturaTextArea.append("\n Código de fase:" + rs.getString("codigo_fase"));
                faturaTextArea.append("\n Tipo de fatura:" + rs.getString("tipo_fatura"));
                faturaTextArea.append("\n Dias:" + rs.getString("dias"));
                faturaTextArea.append("\n");
                faturaTextArea.append("\n------------------------------------------------------");
                faturaTextArea.append("\n\n");
                faturaTextArea.append("\n Aluguel do Medidor:\t\t" + rs.getString("medidor_aluguel")); 
                faturaTextArea.append("\n Aluguel do MCB:\t\t" + rs.getString("mbc_aluguel")); 
                faturaTextArea.append("\n Taxa de Serviço:\t" + rs.getString("servico_taxa")); 
                faturaTextArea.append("\n    GST@9%:\t\t"+rs.getString("gst"));
                faturaTextArea.append("\n");
            }

            rs = con.st.executeQuery("SELECT * FROM conta WHERE medidorNo=" + escolha1.getSelectedItem());

            if (rs.next()) {
                faturaTextArea.append("\n    Mês atual :\t"+rs.getString("mes"));
                faturaTextArea.append("\n    Unidades consumidas:\t"+rs.getString("unidades"));
                faturaTextArea.append("\n    Custos totais :\t"+rs.getString("total"));
                faturaTextArea.append("\n---------------------------------------------------------------");
                faturaTextArea.append("\n    TOTAL A PAGAR :\t"+rs.getString("total"));
            }
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        new GerarFatura().setVisible(true);
    }
}
