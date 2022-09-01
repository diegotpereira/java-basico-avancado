import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.*;
import java.awt.EventQueue;
import java.awt.event.*;

public class App extends JFrame{

    private JButton jButton10;
    private JButton jButton11;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JLabel jogadoro;
    private JLabel jogadorx;
    private JButton txtbtn1;
    private JButton txtbtn2;
    private JButton txtbtn3;
    private JButton txtbtn4;
    private JButton txtbtn5;
    private JButton txtbtn6;
    private JButton txtbtn7;
    private JButton txtbtn8;
    private JButton txtbtn9;

    private String iniciarJogo = "X";
    private int xContar = 0;
    private int oContar = 0;

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
        jogadorx = new JLabel();
        jogadoro = new JLabel();
        jButton10 = new JButton();
        jButton11 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha em Java");
        setResizable(false);

        jPanel1.setBackground(new Color(51, 153, 255));

        jLabel1.setFont(new Font("Segoe UI", 1, 48));
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Jogo da Velha em Java");

        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("DTP Software");


        GroupLayout jPainel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPainel1Layout);

        jPainel1Layout.setHorizontalGroup(
            jPainel1Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPainel1Layout.createSequentialGroup()
            .addGap(309, 309, 309)
            .addComponent(jLabel1)
            .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4)
            .addContainerGap())
        );

        jPainel1Layout.setVerticalGroup(
            jPainel1Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPainel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jPainel1Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel4))
        );

        txtbtn1.setFont(new Font("Segoe UI", 1, 48));
        txtbtn1.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        txtbtn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                
            }
            
        });

        txtbtn2.setFont(new Font("Segoe UI", 1, 48));
        txtbtn2.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        txtbtn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }

        });

        txtbtn3.setFont(new Font("Segoe UI", 1, 48));
        txtbtn3.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        txtbtn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }

        });

        txtbtn4.setFont(new Font("Segoe UI", 1, 48));
        txtbtn4.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        txtbtn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }

        });

        txtbtn5.setFont(new Font("Segoe UI", 1, 48));
        txtbtn5.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        txtbtn5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }

        });

        txtbtn6.setFont(new Font("Segoe UI", 1, 48));
        txtbtn6.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        txtbtn6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }

        });

        txtbtn7.setFont(new Font("Segoe UI", 1, 48));
        txtbtn7.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        txtbtn7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }

        });

        txtbtn8.setFont(new Font("Segoe UI", 1, 48));
        txtbtn8.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        txtbtn8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }

        });

        jLabel2.setBackground(new Color(153, 153, 153));
        jLabel2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, Color.darkGray));

        txtbtn9.setFont(new Font("Segoe UI", 1, 48));
        txtbtn9.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        txtbtn9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }

        });

        jPanel2.setBackground(new Color(153, 153, 153));
        jPanel2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, Color.darkGray));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Jogador X :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Jogador O :");

        jogadorx.setFont(new Font("Segoe UI", 1, 24));
        jogadorx.setForeground(new Color(0, 102, 255));
        jogadorx.setText("xxxxxxx");

        jogadoro.setFont(new Font("Segoe UI", 1, 24));
        jogadoro.setForeground(new Color(0, 102, 255));
        jogadoro.setText("xxxxxxx");

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
            .addComponent(jogadoro)
            .addComponent(jogadorx))
            .addContainerGap(67, Short.MAX_VALUE))
        );

        jPainel2Layout.setVerticalGroup(
            jPainel2Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPainel2Layout.createSequentialGroup()
            .addContainerGap(63, Short.MAX_VALUE)
            .addGroup(jPainel2Layout.createParallelGroup(Alignment.BASELINE)
            .addComponent(jLabel2)
            .addComponent(jogadorx))
            .addGap(54, 54, 54)
            .addGroup(jPainel2Layout.createParallelGroup(Alignment.BASELINE)
            .addComponent(jLabel3)
            .addComponent(jogadoro))
            .addContainerGap(74, Short.MAX_VALUE))
        );

        jButton10.setBackground(new Color(153, 153, 255));
        jButton10.setFont(new Font("Tahoma", 1, 24));
        jButton10.setText("REDEFINIR");
        jButton10.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jButton10.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }

        });

        jButton11.setBackground(new Color(255, 153, 255));
        jButton11.setFont(new Font("Tahoma", 1, 24));
        jButton11.setText("SAIR");
        jButton11.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jButton11.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                botaoSair(e);   
            }
        });


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addGroup(layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addComponent(txtbtn1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(ComponentPlacement.UNRELATED)
            .addComponent(txtbtn2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
            .addComponent(txtbtn4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(ComponentPlacement.UNRELATED)
            .addComponent(txtbtn5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
            .addComponent(txtbtn7, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(ComponentPlacement.UNRELATED)
            .addComponent(txtbtn8, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(Alignment.LEADING)
            .addComponent(txtbtn3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
            .addComponent(txtbtn6, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
            .addComponent(txtbtn9, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
            .addGap(35, 35, 35)
            .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
            .addGap(90, 90, 90)
            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(41, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
            .addGroup(layout.createSequentialGroup()
            .addComponent(txtbtn3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtbtn6, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(Alignment.BASELINE)
            .addComponent(txtbtn1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
            .addComponent(txtbtn2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(Alignment.BASELINE)
            .addComponent(txtbtn4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
            .addComponent(txtbtn5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
            .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(txtbtn7, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
            .addComponent(txtbtn8, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(ComponentPlacement.RELATED)
            .addComponent(txtbtn9, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 23, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
    }

    protected void botaoSair(ActionEvent e) {

        JFrame frame = new JFrame("SAIR");

        if (JOptionPane.showConfirmDialog(frame, "Tem certeza que deseja sair?", "Jogo Da Velha", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }

    private void pontuacaoJogo() {
        jogadorx.setText(String.valueOf(xContar));
        jogadoro.setText(String.valueOf(oContar));
    }

    private void escolhaJogador() {

        if (iniciarJogo.equalsIgnoreCase("X")) {
            
            iniciarJogo = "O";

        } else {
            iniciarJogo = "X";
        }
        
    }

    private void vencedorJogo() {

        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();

        

        // CODIFICAÇÃO JOGADOR X
        if (b1 == ("X") &&
            b2 == ("X") &&
            b3 == ("X")) {

                JOptionPane.showMessageDialog(this, "Jogador X venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                xContar++;
                pontuacaoJogo();

                txtbtn1.setBackground(Color.BLUE);
                txtbtn2.setBackground(Color.BLUE);
                txtbtn3.setBackground(Color.BLUE);
            
        }

        if (b4 == ("X") &&
            b5 == ("X") &&
            b6 == ("X")) {

                JOptionPane.showMessageDialog(this, "Jogador X venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                xContar++;
                pontuacaoJogo();

                txtbtn4.setBackground(Color.BLUE);
                txtbtn5.setBackground(Color.BLUE);
                txtbtn6.setBackground(Color.BLUE);
            
        }

        if (b7 == ("X") &&
            b8 == ("X") &&
            b9 == ("X")) {

                JOptionPane.showMessageDialog(this, "Jogador X venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                xContar++;
                pontuacaoJogo();

                txtbtn7.setBackground(Color.BLUE);
                txtbtn8.setBackground(Color.BLUE);
                txtbtn9.setBackground(Color.BLUE);
            
        }

        if (b1 == ("X") &&
            b4 == ("X") &&
            b7 == ("X")) {

                JOptionPane.showMessageDialog(this, "Jogador X venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                xContar++;
                pontuacaoJogo();

                txtbtn1.setBackground(Color.BLUE);
                txtbtn4.setBackground(Color.BLUE);
                txtbtn7.setBackground(Color.BLUE);
            
        }

        if (b2 == ("X") &&
            b5 == ("X") &&
            b8 == ("X")) {

                JOptionPane.showMessageDialog(this, "Jogador X venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                xContar++;
                pontuacaoJogo();

                txtbtn2.setBackground(Color.BLUE);
                txtbtn5.setBackground(Color.BLUE);
                txtbtn8.setBackground(Color.BLUE);
            
        }

        if (b3 == ("X") &&
            b6 == ("X") &&
            b9 == ("X")) {

                JOptionPane.showMessageDialog(this, "Jogador X venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                xContar++;
                pontuacaoJogo();

                txtbtn3.setBackground(Color.BLUE);
                txtbtn6.setBackground(Color.BLUE);
                txtbtn9.setBackground(Color.BLUE);
            
        }

        if (b1 == ("X") &&
            b5 == ("X") &&
            b9 == ("X")) {

                JOptionPane.showMessageDialog(this, "Jogador X venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                xContar++;
                pontuacaoJogo();

                txtbtn1.setBackground(Color.BLUE);
                txtbtn5.setBackground(Color.BLUE);
                txtbtn9.setBackground(Color.BLUE);
            
        }

        if (b3 == ("X") &&
            b5 == ("X") &&
            b7 == ("X")) {

                JOptionPane.showMessageDialog(this, "Jogador X venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                xContar++;
                pontuacaoJogo();

                txtbtn3.setBackground(Color.BLUE);
                txtbtn5.setBackground(Color.BLUE);
                txtbtn7.setBackground(Color.BLUE);
            
        }

        // CODIFICAÇÃO JOGADOR O
        if (b1 == ("O") &&
            b2 == ("O") &&
            b3 == ("O")) {

                JOptionPane.showMessageDialog(this, "Jogador O venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                oContar++;
                pontuacaoJogo();

                txtbtn1.setBackground(Color.BLUE);
                txtbtn2.setBackground(Color.BLUE);
                txtbtn3.setBackground(Color.BLUE);
            
        }

        if (b4 == ("O") &&
            b5 == ("O") &&
            b6 == ("O")) {

                JOptionPane.showMessageDialog(this, "Jogador O venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                oContar++;
                pontuacaoJogo();

                txtbtn4.setBackground(Color.BLUE);
                txtbtn5.setBackground(Color.BLUE);
                txtbtn6.setBackground(Color.BLUE);
            
        }

        if (b7 == ("O") &&
            b8 == ("O") &&
            b9 == ("O")) {

                JOptionPane.showMessageDialog(this, "Jogador O venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                oContar++;
                pontuacaoJogo();

                txtbtn7.setBackground(Color.BLUE);
                txtbtn8.setBackground(Color.BLUE);
                txtbtn9.setBackground(Color.BLUE);
            
        }

        if (b1 == ("O") &&
            b4 == ("O") &&
            b7 == ("O")) {

                JOptionPane.showMessageDialog(this, "Jogador O venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                oContar++;
                pontuacaoJogo();

                txtbtn1.setBackground(Color.BLUE);
                txtbtn4.setBackground(Color.BLUE);
                txtbtn7.setBackground(Color.BLUE);
            
        }

        if (b2 == ("O") &&
            b5 == ("O") &&
            b8 == ("O")) {

                JOptionPane.showMessageDialog(this, "Jogador O venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                oContar++;
                pontuacaoJogo();

                txtbtn2.setBackground(Color.BLUE);
                txtbtn5.setBackground(Color.BLUE);
                txtbtn8.setBackground(Color.BLUE);
            
        }

        if (b3 == ("O") &&
            b6 == ("O") &&
            b9 == ("O")) {

                JOptionPane.showMessageDialog(this, "Jogador O venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                oContar++;
                pontuacaoJogo();

                txtbtn3.setBackground(Color.BLUE);
                txtbtn6.setBackground(Color.BLUE);
                txtbtn9.setBackground(Color.BLUE);
            
        }

        if (b1 == ("O") &&
            b5 == ("O") &&
            b9 == ("O")) {

                JOptionPane.showMessageDialog(this, "Jogador O venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                oContar++;
                pontuacaoJogo();

                txtbtn1.setBackground(Color.BLUE);
                txtbtn5.setBackground(Color.BLUE);
                txtbtn9.setBackground(Color.BLUE);
            
        }

        if (b3 == ("O") &&
            b5 == ("O") &&
            b7 == ("O")) {

                JOptionPane.showMessageDialog(this, "Jogador O venceu", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
                oContar++;
                pontuacaoJogo();

                txtbtn3.setBackground(Color.BLUE);
                txtbtn5.setBackground(Color.BLUE);
                txtbtn7.setBackground(Color.BLUE);
            
        }
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
