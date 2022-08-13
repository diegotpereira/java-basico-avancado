import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class DetalheCliente extends JFrame implements ActionListener{

    JTable tabela;
    JButton buscarButton;

    String x[] = {"Clinete Nome", "Medidor No", "Endereco", "Estado", "Cidade", "Email", "Telefone"};
    String y[][] = new String[20][8];
    int i = 0,  j = 0;

    DetalheCliente() {
        super("Cliente Detalhes");
        setSize(1200, 650);
        setLocation(200, 200);

        try {
            Conexao con = new Conexao();

            String SQL = "SELECT * FROM clientes";
            ResultSet rs = con.st.executeQuery(SQL);

            while(rs.next()) {
                y[i][j++] = rs.getString("nome");
                y[i][j++] = rs.getString("medidor");
                y[i][j++] = rs.getString("endereco");
                y[i][j++] = rs.getString("estado");
                y[i][j++] = rs.getString("cidade");
                y[i][j++] = rs.getString("email");
                y[i][j++] = rs.getString("telefone");
                i++;
                j = 0;           
            }
            tabela = new JTable(y, x);
        } catch (Exception e) {
            e.printStackTrace();
        }
        buscarButton = new JButton("Imprimir");
        add(buscarButton, "South");

        JScrollPane jScrollPane = new JScrollPane(tabela);
        add(jScrollPane);
        
        buscarButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            tabela.print();

        } catch (Exception e) {
            
        }
        
    }
    public static void main(String[] args) {
        new DetalheCliente().setVisible(true);
    }
    
}
