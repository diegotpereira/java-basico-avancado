import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import java.awt.*;

public class Cadastro implements ActionListener{

    Cobranca cobranca;

    private JFrame janelaCobranca;

    private JTextField idReservaTextField,
                       nomeReservaTextField,
                       idadeTextField,
                       enderecoTextField,
                       cepTextField,
                       contatoTextField,
                       telefoneTextField,
                       diaMesAnoTextField,
                       quartoReservadoTextField,
                       emailTextField;

    JComboBox<String> pessoasAdultoscomboBox,
                      pessoasCriancascomboBox,
                      idVerificadocomboBox;

    private JRadioButton generoMasculinoRadioButton, generoFemininoRadioButton;

    Cadastro() {

        inicializar();
    }

    private void inicializar() {

        janelaCobranca = new JFrame();
        janelaCobranca.setTitle("Página de Cadastro");
        janelaCobranca.getContentPane().setLayout(null);

        JLabel idReservaLabel = new JLabel("ID da reserva: ");
        idReservaLabel.setBounds(10, 26, 118, 40);
        janelaCobranca.getContentPane().add(idReservaLabel);

        JLabel nomeReservaLabel = new JLabel("Nome da reserva: ");
        nomeReservaLabel.setBounds(10, 76, 118, 40);
        janelaCobranca.getContentPane().add(nomeReservaLabel);

        JLabel generoLabel = new JLabel("Genero: ");
        generoLabel.setBounds(10, 126, 137, 40);
        janelaCobranca.getContentPane().add(generoLabel);

        JLabel pessoasAdultosLabel = new JLabel("Pessoas adultas");
        pessoasAdultosLabel.setBounds(10, 188, 118, 40);
        janelaCobranca.getContentPane().add(pessoasAdultosLabel);

        String adultos[] = {"Selecionar", "1", "2", "3", "4", "5"};
        pessoasAdultoscomboBox = new JComboBox<>(adultos);
        pessoasAdultoscomboBox.setBounds(196, 192, 88, 33);
        janelaCobranca.getContentPane().add(pessoasAdultoscomboBox);

        JLabel pessoasCriancasLabel = new JLabel("Infantil (Abaixo dos 6 anos): ");
        pessoasCriancasLabel.setBounds(10, 247, 159, 40);
        janelaCobranca.getContentPane().add(pessoasCriancasLabel);

        String criancas[] = {"Selecionar", "1", "2", "3", "4", "5"};

        pessoasCriancascomboBox = new JComboBox<>(criancas);
        pessoasCriancascomboBox.setBounds(196, 251, 89, 33);
        janelaCobranca.getContentPane().add(pessoasCriancascomboBox);

        JLabel enderecoLabel = new JLabel("Endereço: ");
        enderecoLabel.setBounds(10, 310, 118, 40);
        janelaCobranca.getContentPane().add(enderecoLabel);

        JLabel cepLabel = new JLabel("Cep: ");
        cepLabel.setBounds(10, 371, 118, 33);
        janelaCobranca.getContentPane().add(cepLabel);

        JLabel contatoLabel = new JLabel("Contato No: ");
        contatoLabel.setBounds(10, 414, 112, 33);
        janelaCobranca.getContentPane().add(contatoLabel);

        JLabel telefoneLabel = new JLabel("Telefone No: ");
        telefoneLabel.setBounds(10, 457, 118, 28);
        janelaCobranca.getContentPane().add(telefoneLabel);

        JLabel idadeLabel = new JLabel("Idade: ");
        idadeLabel.setBounds(627, 134, 93, 31);
        janelaCobranca.getContentPane().add(idadeLabel);

        JLabel idVerificadoLabel = new JLabel("Identificação (Tipo): ");
        idVerificadoLabel.setBounds(4, 509, 186, 40);
        janelaCobranca.getContentPane().add(idVerificadoLabel);

        JButton enviarButton = new JButton("Enviar");
        enviarButton.setBounds(557, 591, 118, 43);
        enviarButton.addActionListener(this);
        janelaCobranca.getContentPane().add(enviarButton);

        JButton prosseguirButton = new JButton("Prossiga o faturamento");
        prosseguirButton.setBounds(744, 591, 186, 40);
        prosseguirButton.addActionListener(this);
        janelaCobranca.getContentPane().add(prosseguirButton);

        idReservaTextField = new JTextField();
        idReservaTextField.setBounds(296, 43, 86, 28);
        janelaCobranca.getContentPane().add(idReservaTextField);
        idReservaTextField.setColumns(10);

        nomeReservaTextField = new JTextField();
        nomeReservaTextField.setBounds(196, 76, 186, 32);
        janelaCobranca.getContentPane().add(nomeReservaTextField);
        nomeReservaTextField.setColumns(10);

        idadeTextField = new JTextField();
        idadeTextField.setBounds(731, 133, 93, 34);
        janelaCobranca.getContentPane().add(idadeTextField);
        idadeTextField.setColumns(10);

        enderecoTextField = new JTextField();
		enderecoTextField.setBounds(196, 314, 346, 34);
		janelaCobranca.getContentPane().add(enderecoTextField);
		enderecoTextField.setColumns(10);
		
		cepTextField = new JTextField();
		cepTextField.setBounds(196, 371, 118, 34);
		janelaCobranca.getContentPane().add(cepTextField);
		cepTextField.setColumns(10);
		
		contatoTextField = new JTextField();
		contatoTextField.setBounds(196, 414, 118, 35);
		janelaCobranca.getContentPane().add(contatoTextField);
		contatoTextField.setColumns(10);
		
		telefoneTextField = new JTextField();
		telefoneTextField.setBounds(196, 457, 118, 33);
		janelaCobranca.getContentPane().add(telefoneTextField);
		telefoneTextField.setColumns(10);

        String []v= {"Selecionar","CNH","RG","CPF","CTPS"};
		idVerificadocomboBox = new JComboBox(v);
		idVerificadocomboBox.setBounds(196, 515, 118, 28);
		janelaCobranca.getContentPane().add(idVerificadocomboBox);

        JButton btnHome = new JButton("Principal");
        btnHome.setBounds(381, 591, 112, 43);
        btnHome.addActionListener(this);
        janelaCobranca.getContentPane().add(btnHome);

        JLabel dataLabel = new JLabel("Data: ");
        dataLabel.setBounds(557, 79, 93, 34);
        janelaCobranca.getContentPane().add(dataLabel);

        diaMesAnoTextField = new JTextField();
        diaMesAnoTextField.setHorizontalAlignment(SwingConstants.CENTER);

        Date data = new Date();
        DateFormat dataFormata = new SimpleDateFormat("dd-mm-yyyy");
        String dataFormatada = dataFormata.format(data);
        diaMesAnoTextField.setText(dataFormatada);
        diaMesAnoTextField.setBounds(722, 76, 112, 33);
        janelaCobranca.getContentPane().add(diaMesAnoTextField);
        diaMesAnoTextField.setColumns(10);

        JLabel quartoReservadoLabel = new JLabel("Quarto reservado :");
		quartoReservadoLabel.setBounds(557, 199, 137, 41);
		janelaCobranca.getContentPane().add(quartoReservadoLabel);


        quartoReservadoTextField = new JTextField();
		quartoReservadoTextField.setBounds(722, 194, 112, 34);
		janelaCobranca.getContentPane().add(quartoReservadoTextField);
		quartoReservadoTextField.setColumns(10);

        JLabel emailLabel = new JLabel("E-mail ID  :");
		emailLabel.setBounds(557, 371, 86, 33);
		janelaCobranca.getContentPane().add(emailLabel);

        emailTextField = new JTextField();
		emailTextField.setHorizontalAlignment(SwingConstants.LEFT);
		emailTextField.setBounds(707, 374, 196, 28);
		janelaCobranca.getContentPane().add(emailTextField);
		emailTextField.setColumns(10);

        generoMasculinoRadioButton = new JRadioButton("Masculino");
        generoMasculinoRadioButton.setBounds(196, 136, 112, 29);

        generoFemininoRadioButton = new JRadioButton("Feminino");
        generoFemininoRadioButton.setBounds(330, 136, 112, 30);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(generoMasculinoRadioButton);
        buttonGroup.add(generoFemininoRadioButton);

        janelaCobranca.getContentPane().add(generoMasculinoRadioButton);
        janelaCobranca.getContentPane().add(generoFemininoRadioButton);


        janelaCobranca.setBounds(100, 100, 1019, 724);
        janelaCobranca.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("Prossiga o faturamento")) {
            
            cobranca = new Cobranca();
        }
        if (e.getActionCommand().equals("Principal")) {
            
            janelaCobranca.setVisible(false);
        }
        if (e.getActionCommand().equals("Enviar")) {
            
            try {
                int idReserva = Integer.parseInt(idReservaTextField.getText());
                String nomeReserva = nomeReservaTextField.getText();
                String dataReserva = diaMesAnoTextField.getText();

                String genero = "";

                if (generoMasculinoRadioButton.isSelected()) {
                    
                    genero = "Masculino";

                } else if (generoFemininoRadioButton.isSelected()) {
                    
                    genero = "Feminino";
                }

                int idade = Integer.parseInt(idadeTextField.getText());

                String pessoasAdultos = pessoasAdultoscomboBox.getItemAt(pessoasAdultoscomboBox.getSelectedIndex());
                String pessoasCriancas = pessoasCriancascomboBox.getItemAt(pessoasCriancascomboBox.getSelectedIndex());

                String quartoReservado = quartoReservadoTextField.getText();

                String endereco = enderecoTextField.getText();

                String cep = cepTextField.getText();

                String contato = contatoTextField.getText();

                String telefone = telefoneTextField.getText();

                String idVerificado = idVerificadocomboBox.getItemAt(idVerificadocomboBox.getSelectedIndex());

                String email = emailTextField.getText();

                // Conexão SQL e Consulta Database
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_banco_dados", "root", "root");

                String SQL = "INSERT INTO tb_cliente VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = connection.prepareStatement(SQL);

                ps.setInt(1, idReserva);
                ps.setString(2, nomeReserva);
                ps.setString(3, dataReserva);
                ps.setString(4, genero);
                ps.setInt(5, idade);
                ps.setString(6, pessoasAdultos);
                ps.setString(7, pessoasCriancas);
                ps.setString(8, quartoReservado);
                ps.setString(9, endereco);
                ps.setString(10, cep);
                ps.setString(11, contato);
                ps.setString(12, telefone);
                ps.setString(13, idVerificado);
                ps.setString(14, email);

                int status = ps.executeUpdate();

                if (status > 0) {
                    
                    JOptionPane.showMessageDialog(janelaCobranca, "Registro enviado com sucesso!");
                }

            } catch (Exception ae) {
                //TODO: handle exception
            }
        }
    }
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                
                try {

                    Cadastro cadastro = new Cadastro();
                    cadastro.janelaCobranca.setVisible(true);

                } catch (Exception e) {
                    
                    e.printStackTrace();
                }
            }
        });
    }
}
