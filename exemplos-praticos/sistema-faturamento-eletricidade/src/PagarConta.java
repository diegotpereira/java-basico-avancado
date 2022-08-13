import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class PagarConta extends JFrame{
    
    PagarConta() {

        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false);

        try {
            editorPane.setPage("https://www.rge-rs.com.br/");

        } catch (Exception e) {
            editorPane.setContentType("text/html");
            editorPane.setText("<html>Não foi possível carregar</html>");
        }
        JScrollPane scrollPane = new JScrollPane(editorPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800, 600));
        setSize(800, 800);
        setLocation(250, 120);
        setVisible(true);
    }
    public static void main(String[] args) {
        new PagarConta().setVisible(true);
    }
}
