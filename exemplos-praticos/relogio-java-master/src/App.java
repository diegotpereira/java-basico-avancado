import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.*;
import java.awt.EventQueue;

public class App extends JFrame{

    private JMenuItem bg_colour;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private JLabel relogio;
    private JLabel campo_data;
    private JMenuItem estilo_fonte;
    private JMenuItem frame_cor;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JPanel jPanel1;
    private JRadioButtonMenuItem jRadioButton12;
    private JRadioButtonMenuItem jRadioButton24;
    private JRadioButtonMenuItem jRadioButtonMenuItem1;
    private JSlider jSlider1;
    private JSlider jSlider2;
    private JButton parar_Alarme;
    private JMenuItem cor_texto;
    private JComboBox<String> fuso_horario;

    public App() {

        iniciarComponente();
    }

    @SuppressWarnings("unchecked")
    private void iniciarComponente() {
        // jSlider1 = new JSlider();
        // jSlider2 = new JSlider();
        // jMenuItem1 = new JMenuItem();
        // jMenuItem2 = new JMenuItem();

        jRadioButtonMenuItem1 = new JRadioButtonMenuItem();
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1 = new JMenuItem();
        jMenuItem1.setText("jMenuItem1");

        jMenuItem2 = new JMenuItem();
        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(7, 6, 5));

        jPanel1 = new JPanel();
        jPanel1.setBackground(Color.BLACK);

        relogio = new JLabel();
        relogio.setFont(new Font("DS-Digital", 0, 100));
        relogio.setForeground(new Color(0, 153, 255));
        relogio.setHorizontalAlignment(SwingConstants.CENTER);
        relogio.setBorder(BorderFactory.createLineBorder(new Color(209, 131, 131), 4));

        campo_data = new JLabel();
        campo_data.setFont(new Font("DS-Digital", 1, 24));
        campo_data.setForeground(new Color(255, 245, 245));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap(93, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(campo_data, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
            .addGap(359))
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(45)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(93)
            .addComponent(relogio, GroupLayout.PREFERRED_SIZE, 822, GroupLayout.PREFERRED_SIZE)))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(29)
            .addComponent(relogio, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(ComponentPlacement.UNRELATED)
            .addComponent(campo_data, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
            .addGap(18))
        );

        jPanel1.setLayout(jPanel1Layout);

        jButton1 = new JButton();
        jButton1.setText("jButton1");

        jMenuBar1 = new JMenuBar();
        jMenuBar1.setFont(new Font("URW Bookman L", 1, 15));

        jMenu2 = new JMenu();
        jMenuBar1.add(jMenu2);

        jMenu1 = new JMenu();
        jMenu1.setText("Relógio Digital");
        jMenu1.setFont(new Font("Noto Sans CJK KR Medium", 1, 15));

        cor_texto = new JMenuItem();
        cor_texto.setText("ClockText colour");
        

        jMenu1.add(cor_texto);


        frame_cor = new JMenuItem();
        frame_cor.setText("Frame Cor");

        jMenu1.add(frame_cor);


        GroupLayout layout = new GroupLayout(getContentPane());
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(29)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().setLayout(layout);

        pack();
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
