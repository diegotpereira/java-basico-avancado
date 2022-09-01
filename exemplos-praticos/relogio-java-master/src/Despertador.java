import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.acl.Group;

public class Despertador extends JFrame{

    private int alarme_hora_valor;
    private int alarme_minuto_valor;
    private int alarme_segundo_valor;
    private String alarme_am_pm;
    private boolean alarme_estah_definido;

    private JTextField amPm;
    private JButton completo;
    private JTextField hora;
    private JTextField minuto;
    private JTextField segundo;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;

    public boolean getStatus() {
        return alarme_estah_definido;
    }

    public int getHora() {
        return alarme_hora_valor;
    }

    public int getMinuto() {
        return alarme_minuto_valor;
    }

    public int getSegundo() {
        return alarme_segundo_valor;
    }
    
    public int getAmPm() {
        if(alarme_am_pm.equals("PM"))
           return 1;
        return 0;
    }

    public Despertador() {

        iniciarComponentes();
    }

    private void iniciarComponentes() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1 = new JPanel();
        jPanel1.setBackground(new Color(192, 187, 182));
        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 4));

        jLabel1 = new JLabel();
        jLabel1.setFont(new Font("Noto Sans CJK TC Medium", 3, 15));
        jLabel1.setText("Hora");

        jLabel2 = new JLabel();
        jLabel2.setFont(new Font("Noto Sans CJK TC Medium", 3, 15));
        jLabel2.setText("Minuto");

        jLabel3 = new JLabel();
        jLabel3.setFont(new Font("Noto Sans CJK TC Medium", 3, 15));
        jLabel3.setText("Segundo");

        jLabel4 = new JLabel();
        jLabel4.setFont(new Font("Noto Sans CJK TC Medium", 3, 15));
        jLabel4.setText("AM/PM");

        jLabel5 = new JLabel();
        jLabel5.setFont(new Font("Ubuntu", 1, 15));
        jLabel5.setText(":");

        jLabel6 = new JLabel();
        jLabel6.setFont(new Font("Ubuntu", 1, 15));
        jLabel6.setText(":");

        hora = new JTextField();
        minuto = new JTextField();
        segundo = new JTextField();
        amPm = new JTextField();

        completo = new JButton();
        completo.setText("Pronto");
        completo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {

                completar(evt);
            }

        });
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(145, 145, 145)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
            .addComponent(completo)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
            .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
            .addComponent(hora))
            .addGap(7, 7, 7)
            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
            .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
            .addComponent(minuto))
            .addGap(5, 5, 5)
            .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)))
            .addGap(4, 4, 4)
            .addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
            .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
            .addComponent(segundo))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
            .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(amPm))
            .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel2)
            .addComponent(jLabel3)
            .addComponent(jLabel4)
            .addComponent(jLabel1))
            .addPreferredGap(ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(hora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(minuto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(segundo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(amPm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel5)
            .addComponent(jLabel6))
            .addGap(18, 18, 18)
            .addComponent(completo)
            .addContainerGap(17, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
        );
        pack();
    }

    private void completar(ActionEvent evt) {
        alarme_hora_valor = Integer.parseInt(hora.getText());
        alarme_minuto_valor = Integer.parseInt(minuto.getText());
        alarme_segundo_valor = Integer.parseInt(segundo.getText());
        alarme_am_pm = amPm.getText();
        alarme_estah_definido = true;

        this.dispose();
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                
                new Despertador().setVisible(true);
                
            }
        });
    }
}
