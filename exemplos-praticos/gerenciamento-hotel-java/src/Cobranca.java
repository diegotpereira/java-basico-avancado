import java.awt.event.*;

import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Cobranca implements ActionListener{

    private JFrame janelaCobranca;

    private JTextField dataEntradaTextField;
    private JTextField dataSaidaTextField;
    private JTextField refeicoesVegtextField;
    private JTextField refeicoesNaoVegTextField;
    private JTextField reservaNometextField;
    private JTextField entradatextField;
    private JTextField diasDeHospedagemTextField;
    private JTextField reservaIdTextField;

    private JLabel quartoNo;
    private JLabel encargosLabel;
    private JLabel vatGstLabel;
    private JLabel lblNewLabel_18;

    private JRadioButton executivoRadioButton,
                         premiumRadioButton;
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                
                try {
                    Cobranca janela = new Cobranca();
                    janela.janelaCobranca.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
        });
    }

    public Cobranca() {

        inicializar();
    }
    public void inicializar() {

        janelaCobranca = new JFrame();
        janelaCobranca.setBounds(100, 100, 1033, 752);
        janelaCobranca.setTitle("Gerenciamento de Reserves");
        janelaCobranca.getContentPane().setLayout(null);

        JLabel jPrincipalLabel = new JLabel("Página de cobrança");
        jPrincipalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jPrincipalLabel.setBounds(379, 10, 175, 43);
        janelaCobranca.getContentPane().add(jPrincipalLabel);

        JLabel reservaIdLabel = new JLabel("Digite o ID da reserva:");
        reservaIdLabel.setBounds(10, 72, 103, 32);
        janelaCobranca.getContentPane().add(reservaIdLabel);

        JButton buscarButton=  new JButton("Buscar");
        buscarButton.addActionListener(this);
        buscarButton.setBounds(165, 126, 78, 26);
        janelaCobranca.getContentPane().add(buscarButton);

        JLabel quartoNoLabel = new JLabel("Quarto No");
        quartoNoLabel.setBounds(10, 168, 93, 32);
        janelaCobranca.getContentPane().add(quartoNoLabel);

        JLabel quartoNo = new JLabel("");
		quartoNo.setHorizontalAlignment(SwingConstants.CENTER);
		quartoNo.setBounds(165, 168, 78, 33);
		janelaCobranca.getContentPane().add(quartoNo);

        JLabel diasDeHospedagemLabel = new JLabel("Dias de Hospedagens:");
		diasDeHospedagemLabel.setBounds(10, 220, 103, 32);
		janelaCobranca.getContentPane().add(diasDeHospedagemLabel);

        diasDeHospedagemTextField = new JTextField();
        diasDeHospedagemTextField.setBounds(165, 221, 78, 31);
        janelaCobranca.getContentPane().add(diasDeHospedagemTextField);
        diasDeHospedagemTextField.setColumns(10);

        reservaIdTextField = new JTextField();
        reservaIdTextField.setBounds(165, 76, 78, 26);
        janelaCobranca.getContentPane().add(reservaIdTextField);
        reservaIdTextField.setColumns(10);

        JLabel quartoTipoLabel = new JLabel("Quarto tippo:");
        quartoTipoLabel.setHorizontalAlignment(SwingConstants.LEFT);
        quartoTipoLabel.setBounds(10, 265, 115, 32);
        janelaCobranca.getContentPane().add(quartoTipoLabel);

        JLabel dataEntradaLabel = new JLabel("Data de Entrada:");
        dataEntradaLabel.setBounds(10, 329, 109, 32);
        janelaCobranca.getContentPane().add(dataEntradaLabel);

        JLabel dataSaidaLabel = new JLabel("Data de Saida:");
        dataSaidaLabel.setBounds(10, 382, 115, 32);
        janelaCobranca.getContentPane().add(dataSaidaLabel);

        dataEntradaTextField = new JTextField();
        dataEntradaTextField.setBounds(165, 335, 93, 26);
        janelaCobranca.getContentPane().add(dataEntradaTextField);
        dataEntradaTextField.setColumns(10);

        dataSaidaTextField = new JTextField();
		dataSaidaTextField.setBounds(165, 386, 93, 26);
		janelaCobranca.getContentPane().add(dataSaidaTextField);
		dataSaidaTextField.setColumns(10);

        JLabel jLabel8 = new JLabel("Refeições Pedidas (Veg.)");
        jLabel8.setBounds(545, 329, 137, 32);
        janelaCobranca.getContentPane().add(jLabel8);

        JLabel jLabel9 = new JLabel("Refeições Pedidas (Não-Veg.)");
        jLabel9.setBounds(545, 382, 137, 32);
        janelaCobranca.getContentPane().add(jLabel9);

        refeicoesVegtextField = new JTextField();
        refeicoesVegtextField.setBounds(747, 329, 56, 32);
        janelaCobranca.getContentPane().add(refeicoesVegtextField);
        refeicoesVegtextField.setColumns(10);

        refeicoesNaoVegTextField = new JTextField();
        refeicoesNaoVegTextField.setBounds(747, 382, 56, 32);
        janelaCobranca.getRootPane().add(refeicoesNaoVegTextField);
        refeicoesNaoVegTextField.setColumns(10);

        JLabel encargosDeHabitacaoLabel = new JLabel("Encargos de Habitação");
        encargosDeHabitacaoLabel.setBounds(10, 484, 103, 26);
        janelaCobranca.getContentPane().add(encargosDeHabitacaoLabel);

        JLabel encargosLabel = new JLabel("");
		encargosLabel.setBounds(165, 485, 93, 26);
		janelaCobranca.getContentPane().add(encargosLabel);

        JLabel reservaNomeLabel = new JLabel("Reserva Nome: ");
        reservaNomeLabel.setBounds(545, 179, 137, 32);
        janelaCobranca.getContentPane().add(reservaNomeLabel);

        reservaNometextField = new JTextField();
		reservaNometextField.setBounds(692, 180, 144, 32);
		janelaCobranca.getContentPane().add(reservaNometextField);
		reservaNometextField.setColumns(10);

        JLabel quantidadeLabel = new JLabel("Quantidade: ");
        quantidadeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        quantidadeLabel.setBounds(721, 277, 115, 32);
        janelaCobranca.getContentPane().add(quantidadeLabel);

        JButton confirmaButton = new JButton("Confirmar");
		confirmaButton.setBounds(395, 435, 103, 32);
		confirmaButton.addActionListener(this);
		janelaCobranca.getContentPane().add(confirmaButton);

        JLabel lblNewLabel_14 = new JLabel("VAT/GST :");
		lblNewLabel_14.setBounds(10, 531, 93, 32);
		janelaCobranca.getContentPane().add(lblNewLabel_14);

        JLabel entradaLabel = new JLabel("Entrada: ");
		entradaLabel.setBounds(10, 573, 115, 32);
		janelaCobranca.getContentPane().add(entradaLabel);

        entradatextField = new JTextField();
		entradatextField.setBounds(165, 574, 93, 32);
		janelaCobranca.getContentPane().add(entradatextField);
		entradatextField.setColumns(10);

        JLabel vatGstLabel = new JLabel("");
		vatGstLabel.setBounds(165, 528, 93, 26);
		janelaCobranca.getContentPane().add(vatGstLabel);

        JLabel valorLquidoLabel = new JLabel("Valor Liquido :");
		valorLquidoLabel.setBounds(10, 626, 103, 32);
		janelaCobranca.getContentPane().add(valorLquidoLabel);

        JButton calcularContaButton = new JButton("Calcular Conta");
        calcularContaButton.setBounds(395, 674, 109, 32);
        calcularContaButton.addActionListener(this);
        janelaCobranca.getContentPane().add(calcularContaButton);


        JButton valorBrutoButton = new JButton("Valor Bruto: ");
		valorBrutoButton.setBounds(555, 674, 109, 32);
		valorBrutoButton.addActionListener(this);
		janelaCobranca.getContentPane().add(valorBrutoButton);

        JButton contaDeCozinhaButton = new JButton("Conta de cozinha: ");
		contaDeCozinhaButton.setBounds(710, 674, 115, 32);
		contaDeCozinhaButton.addActionListener(this);
		janelaCobranca.getContentPane().add(contaDeCozinhaButton);

        JButton sairButton = new JButton("Sair");
		sairButton.setBounds(860, 674, 103, 32);
		sairButton.addActionListener(this);
		janelaCobranca.getContentPane().add(sairButton);

        executivoRadioButton = new JRadioButton("Executive");
		executivoRadioButton.setBounds(165, 271, 115, 26);
		janelaCobranca.getContentPane().add(executivoRadioButton);

        premiumRadioButton = new JRadioButton("Premium");
        premiumRadioButton.setBounds(307, 271, 126, 26);
        janelaCobranca.getContentPane().add(premiumRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(executivoRadioButton);
        buttonGroup.add(premiumRadioButton);

        JLabel lblNewLabel_18 = new JLabel();
		lblNewLabel_18.setBounds(165, 631, 93, 27);
		janelaCobranca.getContentPane().add(lblNewLabel_18);
        janelaCobranca.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String reservaNome; //g
        double diasDeHospedagem; // g0
        double taxaQuartoTipo = 0; //g1 = 0;
        double g4;
        double g5;
        double g6 = 0.0;
        double g7 = 0.0;
        double g8;
        double encargos; // g9;
        double taxvatGst; // g10;
        double g11 = 0.0;
        double g12;
        double g13;
		 
        

        if (e.getActionCommand().equals("Buscar")) {
            
            try {

                String SQL = "SELECT * FROM cliente WHERE rid = ?";
                int k = Integer.parseInt(reservaIdTextField.getText());
                

                Class.forName("com.mysql.cj.jdbc.Driver117");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_banco_dados", "root", "root");

                PreparedStatement ps = con.prepareStatement(SQL);
                ps.setInt(1, k);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    quartoNo.setText(rs.getString("qno"));
                    dataEntradaTextField.setText(rs.getString("data"));
                    reservaNometextField.setText(rs.getString("qnome"));

                }

            } catch (Exception ae) {
                
                ae.printStackTrace();
            }
        } else if (e.getActionCommand().equals("Confirmar")) {
            
            reservaNome = reservaNometextField.getText();
            diasDeHospedagem = Double.parseDouble(diasDeHospedagemTextField.getText());

            if (premiumRadioButton.isSelected()) {
                
                taxaQuartoTipo = 2500;
            } else if (executivoRadioButton.isSelected()) {
                
                taxaQuartoTipo = 4100;
            }

            taxaQuartoTipo = taxaQuartoTipo * diasDeHospedagem;
            g8 = (18.0 / 100) * taxaQuartoTipo;

            encargosLabel.setText(String.valueOf(taxaQuartoTipo));
            vatGstLabel.setText(String.valueOf(g8));
            
        } else if (e.getActionCommand().equals("Calcular Cobranca")) {
            encargos = Double.parseDouble(encargosLabel.getText());

            taxvatGst = Double.parseDouble(vatGstLabel.getText());

            g11 = taxvatGst + 9;
            g12 =  Double.parseDouble(entradatextField.getText());
            g11 = g11 - g12;

            lblNewLabel_18.setText(String.valueOf(g11));

        } else if (e.getActionCommand().equals("Calcular Conta")) {
            
            encargos = Double.parseDouble(encargosLabel.getText());
            taxvatGst = Double.parseDouble(vatGstLabel.getText());

            g11 = taxvatGst * encargos; 
            g12 = Double.parseDouble(entradatextField.getText());

            g11 = g11 - g12;

            lblNewLabel_18.setText(String.valueOf(g11));

        } else if (e.getActionCommand().equals("Conta Bruta")) {

            encargos = Double.parseDouble(encargosLabel.getText());
            taxvatGst = Double.parseDouble(vatGstLabel.getText());

            g11 = taxvatGst * encargos; 
            g12 = Double.parseDouble(entradatextField.getText());

            g11 = g11 - g12;

            g4 = Double.parseDouble(refeicoesVegtextField.getText());
            g5 = Double.parseDouble(refeicoesNaoVegTextField.getText());

            g6 = g4 * 199;
            g7 = g5 * 249;

            g13 = g11 + g6 + g7;

            JOptionPane.showMessageDialog(janelaCobranca, " Sua fatura bruta é: " + g13);

        } else if (e.getActionCommand().equals("Conta de cozinha")) {
            
            g4 = Double.parseDouble(refeicoesVegtextField.getText());
            g5 = Double.parseDouble(refeicoesNaoVegTextField.getText());

            g6 = g4 * 199;
            g7 = g5 * 249;

            double g14 = g6 + g7;

            JOptionPane.showMessageDialog(janelaCobranca, "Sua conta de Cozinha é: " + g14);

        } else if (e.getActionCommand().equals("Sair")) {
            
            janelaCobranca.setVisible(false);
        }
    } 
}
