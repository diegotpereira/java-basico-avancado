import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public class Calculadora {
    
    private static final int JANELA_LARGURA = 500;
    private static final int JANELA_ALTURA = 600;
    private static final int BOTAO_LARGURA = 80;
    private static final int BOTAO_ALTURA = 70;
    private static final int MARGEM_X = 20;
    private static final int MARGEM_Y = 60;

    private JFrame janela;
    private JComboBox<String> comboCalcTipo, comboTema;
    private JTextField noTexto;
    private JButton btnC, btnVoltar, btnMod, btnDiv, btnMul, btnSub, btnAdd,
            btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnPonto, btnIgual, btnRoot, btnLigar, btnLog;

    private char opc;
    private boolean ir = true;
    private boolean addEscrever = true;
    private double val = 0;

    

    public Calculadora() {

        janela = new JFrame("Calculadora");
        janela.setSize(JANELA_LARGURA, JANELA_ALTURA);
        janela.setLocationRelativeTo(null);

        comboTema = inicCombo(new String[]{"Simples", "Colorida", "TemaEscuro"}, 230, 30, "Tema", temaConsumidorEventoTroca);
        comboTema = inicCombo(new String[]{"Padrão", "Científica"}, 20, 30, "Calculadora Tipo", calcularConsumidorEventoTrocaTipo);

        int[]x = {MARGEM_X, MARGEM_X + 90, 200, 290, 380};
        int[]y = {MARGEM_Y, MARGEM_Y + 100, MARGEM_Y + 180, MARGEM_Y + 260, MARGEM_Y + 340, MARGEM_Y + 420};

        noTexto = new JTextField("0");
        noTexto.setBounds(x[0], y[0], 350, 70);
        noTexto.setEditable(false);
        noTexto.setBackground(Color.WHITE);
        noTexto.setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
        janela.add(noTexto);

        btnC = inicBotao("C", x[0], y[1], event -> {
            repintarFonte();
            noTexto.setText("0");
            opc = ' ';
            val = 0;
        });
        
        btnVoltar = inicBotao("<-", x[1], y[1], event-> {
            repintarFonte();

            String str = noTexto.getText();
            StringBuilder str2 = new StringBuilder();

            for(int i = 0; i < (str.length() - 1); i++) {
                str2.append(str.charAt(i));
            }
            if (str2.toString().equals("")) {
                noTexto.setText("0");

            } else {
                noTexto.setText(str2.toString());
            }
        });

        btnMod = inicBotao("%", x[2], y[1], event-> {
            repintarFonte();

            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", noTexto.getText())) {
                
                if (ir) {
                    val = calcular(val, noTexto.getText(), opc);
                    
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        noTexto.setText(String.valueOf((int) val));

                    } else {
                        noTexto.setText(String.valueOf(val));
                    }
                    opc = '%';
                    ir = false;
                    addEscrever = false;
                }
            }
        });

        btnDiv = inicBotao("/", x[3], y[1], event-> {
            repintarFonte();

            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", noTexto.getText())) {
                
                if (ir) {
                    val = calcular(val, noTexto.getText(), opc);
                    
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        noTexto.setText(String.valueOf((int) val));

                    } else {
                        noTexto.setText(String.valueOf(val));
                    }
                    opc = '/';
                    ir = false;
                    addEscrever = false;
                } else {
                    opc = '/';
                }
            }
        });

        btnAdd = inicBotao("+", x[3], y[4], event-> {
            repintarFonte();
            

            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", noTexto.getText())) 

                if (ir) {
                    val = calcular(val, noTexto.getText(), opc);

                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        
                        noTexto.setText(String.valueOf((int) val));
                    } else {
                        noTexto.setText(String.valueOf(val));
                    }
                    opc = '+';
                    ir = false;
                    addEscrever = false;   
                } else {
                    opc = '+';
                }       
        });

        btnMul = inicBotao("*", x[3], y[2], event-> {
            repintarFonte();

            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", noTexto.getText())) {
                
                if (ir) {
                    val = calcular(val, noTexto.getText(), opc);
                    
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        noTexto.setText(String.valueOf((int) val));

                    } else {
                        noTexto.setText(String.valueOf(val));
                    }
                    opc = '*';
                    ir = false;
                    addEscrever = false;
                } else {
                    opc = '*';
                }
            }
        });

        btnSub = inicBotao("-", x[3], y[3], event-> {
            repintarFonte();

            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", noTexto.getText())) {
                
                if (ir) {
                    val = calcular(val, noTexto.getText(), opc);
                    
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        noTexto.setText(String.valueOf((int) val));

                    } else {
                        noTexto.setText(String.valueOf(val));
                    }
                    opc = '-';
                    ir = false;
                    addEscrever = false;
                } else {
                    opc = '-';
                }
            }
        });

        btnPonto = inicBotao(".", x[0], y[5], event-> {

            repintarFonte();

            if (addEscrever) {
                
                if (!noTexto.getText().contains(".")) {
                    
                    noTexto.setText(noTexto.getText() + ".");
                }
            } else {

                noTexto.setText("0.");
                addEscrever = true;
            }
            ir = true;
        });

        btnIgual = inicBotao("=", x[2], y[5], event-> {

            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", noTexto.getText())) 
                
                if (ir) {
                    val = calcular(val, noTexto.getText(), opc);
                    
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        noTexto.setText(String.valueOf((int) val));

                    } else {
                        noTexto.setText(String.valueOf(val));
                    }
                    opc = '=';
                    addEscrever = false;
                }
        });

        btnIgual.setSize(2 * BOTAO_LARGURA + 10, BOTAO_ALTURA);

        btnRoot = inicBotao("√", x[4], y[1], event-> {

            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", noTexto.getText())) 
                
                if (ir) {
                    val = Math.sqrt(Double.parseDouble(noTexto.getText()));
                    
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        noTexto.setText(String.valueOf((int) val));

                    } else {
                        noTexto.setText(String.valueOf(val));
                    }
                    opc = '√';
                    addEscrever = false;
                }
        });
        btnRoot.setVisible(true);

        btnLigar = inicBotao("On", x[4], y[2], event-> {

            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", noTexto.getText())) 
                
                if (ir) {
                    val = calcular(val, noTexto.getText(), opc);
                    
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        noTexto.setText(String.valueOf((int) val));

                    } else {
                        noTexto.setText(String.valueOf(val));
                    }
                    opc = '^';
                    ir = false;
                    addEscrever = false;
                } else {
                    opc = '^';
                }
        });
        btnLigar.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        btnLigar.setVisible(true);

        btnLog = inicBotao("ln", x[4], y[3], event-> {

            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", noTexto.getText())) 
                
                if (ir) {
                    val = Math.log(Double.parseDouble(noTexto.getText()));
                    
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        noTexto.setText(String.valueOf((int) val));

                    } else {
                        noTexto.setText(String.valueOf(val));
                    }
                    opc = 'l';
                    addEscrever = false;
                }
        });
        btnLog.setVisible(true);

        btn7 = inicBotao("7", x[0], y[2], event-> {

            repintarFonte();

            if (addEscrever) {
                
                if (Pattern.matches("[0]", noTexto.getText())) {
                    
                    noTexto.setText("7");
                     
                } else {
                    
                    noTexto.setText(noTexto.getText() + "7");
                }
            } else {
                noTexto.setText("7");
                addEscrever = true;
            }
            ir = true;
        });

        btn8 = inicBotao("8", x[1], y[2], event-> {

            repintarFonte();

            if (addEscrever) {
                
                if (Pattern.matches("[0]", noTexto.getText())) {
                    
                    noTexto.setText("8");
                     
                } else {
                    
                    noTexto.setText(noTexto.getText() + "8");
                }
            } else {
                noTexto.setText("8");
                addEscrever = true;
            }
            ir = true;
        });

        
        btn9 = inicBotao("9", x[2], y[2], event-> {

            repintarFonte();

            if (addEscrever) {
                
                if (Pattern.matches("[0]", noTexto.getText())) {
                    
                    noTexto.setText("9");
                     
                } else {
                    
                    noTexto.setText(noTexto.getText() + "9");
                }
            } else {
                noTexto.setText("9");
                addEscrever = true;
            }
            ir = true;
        });

        
        btn4 = inicBotao("4", x[0], y[3], event-> {

            repintarFonte();

            if (addEscrever) {
                
                if (Pattern.matches("[0]", noTexto.getText())) {
                    
                    noTexto.setText("4");
                     
                } else {
                    
                    noTexto.setText(noTexto.getText() + "4");
                }
            } else {
                noTexto.setText("4");
                addEscrever = true;
            }
            ir = true;
        });

        btn5 = inicBotao("5", x[1], y[3], event-> {

            repintarFonte();

            if (addEscrever) {
                
                if (Pattern.matches("[0]", noTexto.getText())) {
                    
                    noTexto.setText("5");
                     
                } else {
                    
                    noTexto.setText(noTexto.getText() + "5");
                }
            } else {
                noTexto.setText("5");
                addEscrever = true;
            }
            ir = true;
        });

        btn6 = inicBotao("6", x[2], y[3], event-> {

            repintarFonte();

            if (addEscrever) {
                
                if (Pattern.matches("[0]", noTexto.getText())) {
                    
                    noTexto.setText("6");
                     
                } else {
                    
                    noTexto.setText(noTexto.getText() + "6");
                }
            } else {
                noTexto.setText("6");
                addEscrever = true;
            }
            ir = true;
        });

        btn1 = inicBotao("1", x[0], y[4], event-> {

            repintarFonte();

            if (addEscrever) {
                
                if (Pattern.matches("[0]", noTexto.getText())) {
                    
                    noTexto.setText("1");
                     
                } else {
                    
                    noTexto.setText(noTexto.getText() + "1");
                }
            } else {
                noTexto.setText("1");
                addEscrever = true;
            }
            ir = true;
        });

        btn2 = inicBotao("2", x[1], y[4], event-> {

            repintarFonte();

            if (addEscrever) {
                
                if (Pattern.matches("[0]", noTexto.getText())) {
                    
                    noTexto.setText("2");
                     
                } else {
                    
                    noTexto.setText(noTexto.getText() + "2");
                }
            } else {
                noTexto.setText("2");
                addEscrever = true;
            }
            ir = true;
        });

        btn3 = inicBotao("3", x[2], y[4], event-> {

            repintarFonte();

            if (addEscrever) {
                
                if (Pattern.matches("[0]", noTexto.getText())) {
                    
                    noTexto.setText("3");
                     
                } else {
                    
                    noTexto.setText(noTexto.getText() + "3");
                }
            } else {
                noTexto.setText("3");
                addEscrever = true;
            }
            ir = true;
        });

        btn0 = inicBotao("0", x[1], y[5], event-> {

            repintarFonte();

            if (addEscrever) {
                
                if (Pattern.matches("[0]", noTexto.getText())) {
                    
                    noTexto.setText("0");
                     
                } else {
                    
                    noTexto.setText(noTexto.getText() + "0");
                }
            } else {
                noTexto.setText("0");
                addEscrever = true;
            }
            ir = true;
        });

        janela.setLayout(null);
        janela.setResizable(false);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }

    private JComboBox<String> inicCombo(String[] itens, int x, int y, String dicaFerramenta, Consumer consumerEvent) {

        JComboBox<String> combo = new JComboBox<>(itens);
        combo.setBounds(x, y, 140, 25);
        combo.setToolTipText(dicaFerramenta);
        combo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        combo.addItemListener(consumerEvent::accept);

        janela.add(combo);

        return combo;
    }

    private JButton inicBotao(String label, int x, int y, ActionListener event) {

        JButton btn = new JButton(label);
        btn.setBounds(x, y, BOTAO_LARGURA, BOTAO_ALTURA);
        btn.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addActionListener(event);
        btn.setFocusable(false);
        janela.add(btn);


        return btn;
    }

    private double calcular(double x, String entrada, char opc) {

        noTexto.setFont(noTexto.getFont().deriveFont(Font.PLAIN));
        double y = Double.parseDouble(entrada);

        switch (opc) {
            case '+':
                return x + y;

            case '-':
                return x - y;

            case '*':
                return x * y;

            case '/':
                return x / y;

            case '%':
                return x % y;

            case '^':
                return Math.pow(x, y);
                
            default:
                noTexto.setFont(noTexto.getFont().deriveFont(Font.PLAIN));
                return y;
        }
    }

    private void repintarFonte() {
        noTexto.setFont(noTexto.getFont().deriveFont(Font.PLAIN));
    }

    private Consumer<ItemEvent> calcularConsumidorEventoTrocaTipo = event -> {

        if (event.getStateChange() != ItemEvent.SELECTED) return;

        String selecionaItem = (String) event.getItem();

        switch (selecionaItem) {
            case "Padrão":
                janela.setSize(JANELA_LARGURA, JANELA_ALTURA);
                btnRoot.setVisible(false);
                btnLigar.setVisible(false);
                btnLog.setVisible(false);
                break;
        
            case "Científica":
                janela.setSize(JANELA_LARGURA + 80, JANELA_ALTURA);
                btnRoot.setVisible(true);
                btnLigar.setVisible(true);
                btnLog.setVisible(true);
                break;  
        }
    };

    private Consumer<ItemEvent> temaConsumidorEventoTroca = event -> {

        if(event.getStateChange() != ItemEvent.SELECTED) return;

        String selecionaTema = (String) event.getItem();

        switch (selecionaTema) {
            case "Simples":
                janela.getContentPane().setBackground(null);
                btnC.setBackground(null);
                btnVoltar.setBackground(null);
                btnMod.setBackground(null);
                btnDiv.setBackground(null);
                btnMul.setBackground(null);
                btnSub.setBackground(null);
                btnAdd.setBackground(null);
                btnRoot.setBackground(null);
                btnLog.setBackground(null);
                btnLigar.setBackground(null);
                btnIgual.setBackground(null);
                btn0.setBackground(null);
                btn1.setBackground(null);
                btn2.setBackground(null);
                btn3.setBackground(null);
                btn4.setBackground(null);
                btn5.setBackground(null);
                btn6.setBackground(null);
                btn7.setBackground(null);
                btn8.setBackground(null);
                btn9.setBackground(null);
                btnPonto.setBackground(null);

                btnC.setForeground(Color.BLACK);
                btnVoltar.setForeground(Color.BLACK);
                btnMod.setForeground(Color.BLACK);
                btnDiv.setForeground(Color.BLACK);
                btnMul.setForeground(Color.BLACK);
                btnSub.setForeground(Color.BLACK);
                btnAdd.setForeground(Color.BLACK);
                btnIgual.setForeground(Color.BLACK);
                btnLog.setForeground(Color.BLACK);
                btnLigar.setForeground(Color.BLACK);
                btnRoot.setForeground(Color.BLACK);
                break;

            case "Colorida":
                janela.getContentPane().setBackground(null);
                btnC.setBackground(Color.RED);
                btnVoltar.setBackground(Color.ORANGE);
                btnMod.setBackground(Color.GREEN);
                btnDiv.setBackground(Color.PINK);
                btnMul.setBackground(Color.PINK);
                btnSub.setBackground(Color.PINK);
                btnAdd.setBackground(Color.PINK);
                btnRoot.setBackground(Color.PINK);
                btnLog.setBackground(Color.PINK);
                btnLigar.setBackground(Color.PINK);
                btnIgual.setBackground(Color.BLUE);
                btn0.setBackground(Color.WHITE);
                btn1.setBackground(Color.WHITE);
                btn2.setBackground(Color.WHITE);
                btn3.setBackground(Color.WHITE);
                btn4.setBackground(Color.WHITE);
                btn5.setBackground(Color.WHITE);
                btn6.setBackground(Color.WHITE);
                btn7.setBackground(Color.WHITE);
                btn8.setBackground(Color.WHITE);
                btn9.setBackground(Color.WHITE);
                btnPonto.setBackground(Color.WHITE);

                btnC.setForeground(Color.WHITE);
                btnVoltar.setForeground(Color.WHITE);
                btnMod.setForeground(Color.WHITE);
                btnDiv.setForeground(Color.WHITE);
                btnMul.setForeground(Color.WHITE);
                btnSub.setForeground(Color.WHITE);
                btnAdd.setForeground(Color.WHITE);
                btnIgual.setForeground(Color.WHITE);
                btnLog.setForeground(Color.WHITE);
                btnLigar.setForeground(Color.WHITE);
                btnRoot.setForeground(Color.WHITE);

                break;

            case "TemaEscuro":
                final Color corEscuraPrimaria = new Color(141, 38, 99);
                final Color corEscuraSecundaria = new Color(171, 171, 171);

                janela.getContentPane().setBackground(new Color(68, 68, 68));
                btn0.setBackground(corEscuraSecundaria);
                btn1.setBackground(corEscuraSecundaria);
                btn2.setBackground(corEscuraSecundaria);
                btn3.setBackground(corEscuraSecundaria);
                btn4.setBackground(corEscuraSecundaria);
                btn5.setBackground(corEscuraSecundaria);
                btn6.setBackground(corEscuraSecundaria);
                btn7.setBackground(corEscuraSecundaria);
                btn8.setBackground(corEscuraSecundaria);
                btn9.setBackground(corEscuraSecundaria);
                btnPonto.setBackground(corEscuraSecundaria);

                btnC.setForeground(corEscuraSecundaria);
                btnVoltar.setForeground(corEscuraSecundaria);
                btnMod.setForeground(corEscuraSecundaria);
                btnDiv.setForeground(corEscuraSecundaria);
                btnMul.setForeground(corEscuraSecundaria);
                btnSub.setForeground(corEscuraSecundaria);
                btnAdd.setForeground(corEscuraSecundaria);
                btnIgual.setForeground(corEscuraSecundaria);
                btnLog.setForeground(corEscuraSecundaria);
                btnLigar.setForeground(corEscuraSecundaria);
                btnRoot.setForeground(corEscuraSecundaria);
                btnC.setBackground(corEscuraPrimaria);
                btnVoltar.setBackground(corEscuraPrimaria);
                btnMod.setBackground(corEscuraPrimaria);
                btnDiv.setBackground(corEscuraPrimaria);
                btnMul.setBackground(corEscuraPrimaria);
                btnSub.setBackground(corEscuraPrimaria);
                btnAdd.setBackground(corEscuraPrimaria);
                btnRoot.setBackground(corEscuraPrimaria);
                btnLog.setBackground(corEscuraPrimaria);
                btnLigar.setBackground(corEscuraPrimaria);
                btnIgual.setBackground(corEscuraPrimaria);
        
            default:
                break;
        }
    };
    public static void main(String[] args) {
        new Calculadora();
    }
}
