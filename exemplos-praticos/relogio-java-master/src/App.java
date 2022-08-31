import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.*;
import java.awt.EventQueue;

public class App extends JFrame{

    private JMenuItem cor_de_fundo;
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
    private JButton pararAlarme;
    private JMenuItem cor_texto;
    private JComboBox<String> fuso_horario;

    public App() {

        iniciarComponente();
    }

    @SuppressWarnings("unchecked")
    private void iniciarComponente() {

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

        jButton2 = new JButton();
        jButton2.setFont(new Font("Sitka Text", Font.BOLD, 15));
        jButton2.setForeground(new Color(31, 7, 7));
        jButton2.setText("Definir Alarme");

        fuso_horario = new JComboBox<>();
        fuso_horario.setFont(new Font("Noto Sans CJK KR Medium", 3, 5));
        fuso_horario.setModel(new DefaultComboBoxModel<>(new String[] {"teste", "teste 2"}));

        jLabel1 = new JLabel();
        jLabel1.setFont(new Font("Noto Sans CJK TC Medium", 1, 18));
        jLabel1.setForeground(new Color(254, 242, 242));
        jLabel1.setText("Escolha a zona");

        pararAlarme = new JButton();
        pararAlarme.setFont(new Font("Sitka Text", Font.BOLD, 15));
        pararAlarme.setText("Parar Alarme");

        JButton btnPararCronometro = new JButton("Parar Cronometro");
        // btnPararCronometro.addActionListener(new ActionListener() {
            
        // });
        btnPararCronometro.setFont(new Font("Sitka Text", Font.BOLD, 15));

        JButton btnTemporizador = new JButton("Temporizador");

        btnTemporizador.setFont(new Font("Sitka Text", Font.BOLD, 14));

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
            .addComponent(btnPararCronometro)
            .addPreferredGap(ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
            .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
            .addGap(191)
            .addComponent(btnTemporizador, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGap(113)
            .addComponent(fuso_horario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addGap(159))
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(93)
            .addComponent(relogio, GroupLayout.PREFERRED_SIZE, 822, GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(pararAlarme)
            .addGap(440))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(29)
            .addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
            .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
            .addComponent(fuso_horario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGap(65)
            .addComponent(relogio, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(ComponentPlacement.UNRELATED)
            .addComponent(campo_data, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
            .addGap(18)
            .addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
            .addComponent(btnPararCronometro, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
            .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTemporizador, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
            .addGap(26)
            .addComponent(pararAlarme)
            .addGap(96))
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

        cor_de_fundo = new JMenuItem();
        cor_de_fundo.setText("Cor de Fundo");

        jMenu1.add(cor_de_fundo);

        estilo_fonte = new JMenuItem();
        estilo_fonte.setText("Estilo da Fonte");

        jMenu1.add(estilo_fonte);

        jMenuBar1.add(jMenu1);

        jMenu3 = new JMenu();
        jMenu3.setText("Formato de hora");
        jMenu3.setFont(new Font("Noto Sans CJK TC Medium", 1, 15));

        buttonGroup1 = new ButtonGroup();
        jRadioButton12 = new JRadioButtonMenuItem();
        jRadioButton24 = new JRadioButtonMenuItem();
        jMenu3 = new JMenu();

        buttonGroup1.add(jRadioButton24);
        jRadioButton12.setText("12 horas");
        jMenu3.add(jRadioButton12);

        buttonGroup1.add(jRadioButton24);
        jRadioButton24.setSelected(true);
        jRadioButton24.setText("24 horas");
        jMenu3.add(jRadioButton24);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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
