import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
import java.awt.*;


public class Relogio extends JFrame{
    
    Calendar calendario;
    SimpleDateFormat tempoFormato;
    SimpleDateFormat diaFormato;
    SimpleDateFormat dataFormato;

    JLabel tempoLabel;
    JLabel diaLabel;
    JLabel dataLabel;

    String tempo;
    String dia;
    String data;

    Relogio() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Relógio Digital");
        this.setLayout(new FlowLayout());
        this.setSize(350, 220);
        this.setResizable(false);

        tempoFormato = new SimpleDateFormat("hh:mm:ss a");

        tempoLabel = new JLabel();
        tempoLabel.setFont(new Font("SANS_SERIF", Font.PLAIN, 59));
        tempoLabel.setBackground(Color.BLACK);
        tempoLabel.setForeground(Color.WHITE);
        tempoLabel.setOpaque(true);

        diaLabel = new JLabel();
        diaLabel.setFont(new Font("SANS_SERIF", Font.BOLD, 34));

        dataLabel = new JLabel();
        dataLabel.setFont(new Font("SANS_SERIF", Font.BOLD, 34));

        this.add(tempoLabel);
        this.add(diaLabel);
        this.add(dataLabel);

        this.setVisible(true);

        definirTempo();
    }
    public void definirTempo() {

        while (true) {
            
            tempo = tempoFormato.format(Calendar.getInstance().getTime());
            tempoLabel.setText(tempo);

            dia = diaFormato.format(Calendar.getInstance().getTime());
            diaLabel.setText(dia);

            data = dataFormato.format(Calendar.getInstance().getTime());
            dataLabel.setText(data);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new Relogio().setVisible(true);
    }
}
