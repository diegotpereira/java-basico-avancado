import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Projeto extends JFrame implements ActionListener{

    Projeto() {
        super("Sistema de faturamento de eletricidade");
        setSize(1500, 800);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("imagens/main.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(1420, 720, Image.SCALE_DEFAULT);

        ImageIcon imageIcon2 = new ImageIcon(image);

        JLabel l1 = new JLabel(imageIcon2);

        add(l1);

        // Primeiro Coluna 
        JMenuBar menuBar = new JMenuBar();
        JMenu master = new JMenu("Principal");

        JMenuItem jMenuItem = new JMenuItem("Novo Cliente");
        JMenuItem jMenuItem2 = new JMenuItem("Cliente Detalhes");
        JMenuItem jMenuItem3 = new JMenuItem("Detalhes do depósito");

        master.setForeground(Color.BLUE);

        // detalhes cliente 
        jMenuItem.setFont(new Font("monospaced", Font.PLAIN, 12));

        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("imagens/icon1.jpg"));
        Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        jMenuItem.setIcon(new ImageIcon(image1));
        jMenuItem.setMnemonic('D');
        jMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        jMenuItem.setBackground(Color.WHITE);

        // Detalhes do medidor
        jMenuItem2.setFont(new Font("monospaced", Font.PLAIN, 12));

        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("imagens/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        
        jMenuItem2.setIcon(new ImageIcon(image2));
        jMenuItem2.setMnemonic('M');
        jMenuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        jMenuItem2.setBackground(Color.WHITE);

        // Detalhes do depósito
        jMenuItem3.setFont(new Font("monospaced", Font.PLAIN, 12));

        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("imagens/icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);

        jMenuItem3.setIcon(new ImageIcon(image3));
        jMenuItem3.setMnemonic('N');
        jMenuItem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        jMenuItem3.setBackground(Color.WHITE);

        jMenuItem.addActionListener(this);
        jMenuItem2.addActionListener(this);
        jMenuItem3.addActionListener(this);

        // segunda coluna 
        JMenu usuario = new JMenu("Usuário");
        JMenuItem u1 = new JMenuItem("Pagar conta");
        JMenuItem u2 = new JMenuItem("Calcular Conta");
        JMenuItem u3 = new JMenuItem("Última fatura");

        usuario.setForeground(Color.RED);

        // Pagar conta
        u1.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icone4 = new ImageIcon(ClassLoader.getSystemResource("imagens/icon4.png"));
        Image imagem4 = icone4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(imagem4));
        u1.setMnemonic('P');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);

        // Detalhes da fatura
        u2.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icone5 = new ImageIcon(ClassLoader.getSystemResource("imagens/icon5.png"));
        Image image5 = icone5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);

        u2.setIcon(new ImageIcon(image5));
        u2.setMnemonic('B');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);

        // Última fatura
        u3.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icone6 = new ImageIcon(ClassLoader.getSystemResource("imagens/icon6.png"));
        Image image6 = icone6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);

        u3.setIcon(new ImageIcon(image6));
        u3.setMnemonic('B');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        u3.setBackground(Color.WHITE);

        u1.addActionListener(this);
        u2.addActionListener(this);
        u3.addActionListener(this);

        // Terceira Coluna
        JMenu relatorio = new JMenu("Relatório");
        JMenuItem jRelatorio = new JMenuItem("Gerar fatura");

        // Relatório
        relatorio.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icone7 = new ImageIcon(ClassLoader.getSystemResource("imagens/icon7.png"));
        Image imagem7 = icone7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);

        relatorio.setIcon(new ImageIcon(imagem7));
        relatorio.setMnemonic('R');
        relatorio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        relatorio.setBackground(Color.WHITE);

        relatorio.addActionListener(this);

        // Quarta Coluna 

        master.add(jMenuItem);
        master.add(jMenuItem2);

        usuario.add(u1);
        usuario.add(u2);

        menuBar.add(master);
        menuBar.add(usuario);

        setJMenuBar(menuBar);

        
        setFont(new Font("Senserif", Font.BOLD, 16));
        setLayout(new FlowLayout());
        setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Entrou");
        
    }
    
}
