import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class Cronometro extends JFrame implements ItemListener{

    private static final long serialVersionUID = 5924880907001755076L;

    private JLabel labelTempo;
    private JLabel labelTotalTempoMinutos;
    private JComboBox<Integer> comboPainel;
    public String tTempo;
    NumberFormat formato;

    private JButton btnIniciar;
    private JButton btnRedefinir;

    public Timer cronometro;
    public long restante;
    public long tConvertido;

    public long inicial;

    public Cronometro() {

        iniciarComponentes();
    }

    public void iniciarComponentes() {

        JPanel painelTempo = new JPanel();
        painelTempo.setForeground(Color.BLACK);

        labelTempo = new JLabel("00:00");
        labelTempo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        labelTempo.setForeground(Color.BLUE);
        labelTempo.setBackground(Color.BLACK);
        labelTempo.setOpaque(true);
        labelTempo.setFont(new Font("DS-Digital", Font.BOLD, 96));

        painelTempo.add(labelTempo);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());

        labelTotalTempoMinutos = new JLabel("TEMPO TOTAL (minutos):");
        panel1.add(labelTotalTempoMinutos);

        comboPainel = new JComboBox<Integer>();

        for(int i = 59; i > 0; i--) {
            comboPainel.addItem(Integer.valueOf(i));
        }

        comboPainel.setSelectedIndex(0);
        tTempo = "59";
        panel1.add(comboPainel);

        btnIniciar = new JButton("INICIAR");
        panel1.add(btnIniciar);

        btnRedefinir = new JButton("REDEFINIR");
        panel1.add(btnRedefinir);

        getContentPane().add(panel1, BorderLayout.NORTH);
        getContentPane().add(painelTempo, BorderLayout.CENTER);

        Event event = new Event();
        btnIniciar.addActionListener(event);
        btnRedefinir.addActionListener(event);

        comboPainel.addItemListener(this);


        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cronometro");
        pack();
        setLocationByPlatform(true);
        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        tTempo = (String) comboPainel.getSelectedItem().toString();
        
    }
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                
                new Cronometro();
                
            }
        });
    }

    // código para o que acontece quando o usuário 
    // pressiona o botão iniciar ou reiniciar
    public class Event implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            String bnome = e.getActionCommand();

            if (bnome.equals("INICIAR")) {
                atualizarDisplay();
            } else {
                labelTempo.setText("00:00");
                cronometro.stop();
                restante = converterTempo();
            }
        }
    }

    // código que é invocado pelo temporizador de 
    // swing para cada segundo passado
    public class TempoClasse implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            restante = converterTempo();
            long atual = System.currentTimeMillis();
            long decorrido = atual - inicial;

            restante -= decorrido;

            formato = NumberFormat.getNumberInstance();
            formato.setMinimumIntegerDigits(2);

            if (restante < 0) 
                restante = (long) 0;

                int minutos = (int) (restante / 60000);
                int segundos = (int) ((restante % 60000) / 1000);

                labelTempo.setText(formato.format(minutos) + ":"
                                 + formato.format(segundos));

                if (restante == 0) {
                    
                    labelTempo.setText("Parar");
                    cronometro.stop();
                }
        }

    }
    public void atualizarDisplay() {

        TempoClasse tempoClasse = new TempoClasse();
        cronometro = new Timer(1000, tempoClasse);
        inicial = System.currentTimeMillis();
        cronometro.start();
    }

    public long converterTempo() {

        tConvertido = Long.parseLong(tTempo);

        long convertido = (tConvertido * 60000) + 1000;

        return convertido;
    }
}
