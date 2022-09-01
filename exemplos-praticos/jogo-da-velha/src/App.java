import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.EventQueue;

public class App extends JFrame{

    private JButton jButton10;
    private JButton jButton11;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JLabel playero;
    private JLabel playerx;
    private JButton txtbtn1;
    private JButton txtbtn2;
    private JButton txtbtn3;
    private JButton txtbtn4;
    private JButton txtbtn5;
    private JButton txtbtn6;
    private JButton txtbtn7;
    private JButton txtbtn8;
    private JButton txtbtn9;

    public App() {
        inicializarComponentes();
    }

    @SuppressWarnings("unchecked")
    private void inicializarComponentes() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel4 = new JLabel();
        txtbtn1 = new JButton();
        txtbtn2 = new JButton();
        txtbtn3 = new JButton();
        txtbtn4 = new JButton();
        txtbtn5 = new JButton();
        txtbtn6 = new JButton();
        txtbtn7 = new JButton();
        txtbtn8 = new JButton();
        txtbtn9 = new JButton();
        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        playerx = new JLabel();
        playero = new JLabel();
        jButton10 = new JButton();
        jButton11 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha em Java");
        setResizable(false);

        jPanel1.setBackground(new Color(51, 153, 255));

        jLabel1.setFont(new Font("Segoe UI", 1, 48));
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Jogo da Velha em Java");


        GroupLayout jPainel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPainel1Layout);

        jPainel1Layout.setHorizontalGroup(
            jPainel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPainel1Layout.createSequentialGroup()
            .addGap(309, 309, 309)
            .addComponent(jLabel1)
            .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPainel1Layout.setVerticalGroup(
            jPainel1Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPainel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jPainel1Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE))
        );

        GroupLayout jPainel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPainel2Layout);

        jPainel2Layout.setHorizontalGroup(
            jPainel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPainel2Layout.createSequentialGroup()
            .addGap(38, 38, 38)
            .addGroup(jPainel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addComponent(jLabel3))
            .addGap(77, 77, 77)
            .addGroup(jPainel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(playero)
            .addComponent(playerx))
            .addContainerGap(67, Short.MAX_VALUE))
        );

        jPainel2Layout.setVerticalGroup(
            jPainel2Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPainel2Layout.createSequentialGroup()
            .addContainerGap(63, Short.MAX_VALUE)
            .addGroup(jPainel2Layout.createParallelGroup(Alignment.BASELINE)
            .addComponent(jLabel2)
            .addComponent(playerx))
            .addGap(54, 54, 54)
            .addGroup(jPainel2Layout.createParallelGroup(Alignment.BASELINE)
            .addComponent(jLabel3)
            .addComponent(playero))
            .addContainerGap(74, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addGroup(layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            )))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
            .addGroup(layout.createSequentialGroup())))
        );
        pack();
        setLocationRelativeTo(null);
    }




    public static void main(String[] args) throws Exception {

        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {

                new App().setVisible(true);
            }
        });
    }
}