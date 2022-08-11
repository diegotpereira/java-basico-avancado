import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexao {
    
    Connection con;
    Statement st;

    public Conexao() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_faturamento_eletricidade?useTimezone=true&serverTimezone=UTC", "root", "root");
            st = con.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
