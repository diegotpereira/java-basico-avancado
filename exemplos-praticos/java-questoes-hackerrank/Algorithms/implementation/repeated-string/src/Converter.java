import java.text.*;
import java.util.*;

import javax.swing.*;
import java.awt.event.*;

public class Converter {
    
    public static void main(String[] args) throws ParseException {
        
        String numeroString = "200";

        int numeroInteiro = Integer.parseInt(numeroString);

        // System.out.println(numeroInteiro);

        int numeroInteiro1 = 300;
        
        String numeroString2 = String.valueOf(numeroInteiro1);

        // System.out.println(numeroString2);

        String numeroString3 = "9990449935";

        Long numerLong = Long.parseLong(numeroString3);

        // System.out.println(numerLong);

        String numeroString4 = "23.6";

        float numeroFloat = Float.parseFloat(numeroString4);

        // System.out.println(numeroFloat);

        float numeroFloat1 = 12.3F;

        String numeroString5 = String.valueOf(numeroFloat1);

        // System.out.println(numeroString5);

        String numeroString6 = "23.6";

        double numeroDouble = Double.parseDouble(numeroString6);

        // System.out.println(numeroDouble);

        String sdata1 = "01/01/2000";

        Date data1 = new SimpleDateFormat("dd/MM/yyyy").parse(sdata1);

        // System.out.println(sdata1 + "\t" + data1);

        Date data2 =  Calendar.getInstance().getTime();

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        String strData = dateFormat.format(data2);

        // System.out.println("Converter String: " + strData);

        DateFormat dataFormatada24horas = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        try {
            Date hora = dateFormat.parse(strData);


            String hora24 = dataFormatada24horas.format(hora);


            // System.out.println(hora24);
        } catch (Exception e) {
            
            e.printStackTrace();
        }

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Jim");
        nomes.add("Mark");
        nomes.add("Jose");
        nomes.add("Bob");

        nomes.set(1, "Peter");

        Collections.sort(nomes);

        

        for(String str : nomes) {

            if (nomes.contains("Carlos")) {
                
                // System.out.println("esta presente");

            } else {

                // System.out.println("não esta presente");
            }
        }

        HashMap<Integer, String> hMap = new HashMap<>();

        hMap.put(101, "Futebol");
        hMap.put(105, "Skate");
        hMap.put(125, "Volei");

        // System.out.println("Elementos HashMap: " );

        for(Map.Entry mEntry : hMap.entrySet()) {

            // System.out.print("chave: " + mEntry.getKey() + " & valor: ");
            // System.out.println(mEntry.getValue());
        }

        int[] arr = { 11, 55, 22, 0, 99 };
        Arrays.sort(arr);

        // System.out.print("Array de inteiros classificado:");
        // System.out.println(Arrays.toString(arr));

        String[] nomesA = {"Bob", "Peter", "Bonny"};

        Arrays.sort(nomesA);

        // System.out.print("Array de string classificado:");
        // System.out.println(Arrays.toString(nomesA));

        // System.out.print("Lista classificada: ");

        List<String> frutas = new ArrayList<>();
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");

        Collections.sort(frutas);

        for (String fruta : frutas) {
            // System.out.print(fruta + ", ");
        }

        for (int i = 0; i < 6; i++) {

            if (i == 4) {
                
                continue;
            }
            
            // System.out.print(i + " ");
        }

        int contar = 10;

        while (contar >= 0) {
            
            if (contar == 7) {
                
                contar--;

                continue;
            }

            // System.out.print(contar + " ");
            contar--;
        }

        int j = 0;

        do {

            if (j == 7) {
                
                j++;
                continue;
            }
            
            // System.out.print(j + " ");
            j++;

        } while (j < 10);


        JFrame frame = new JFrame("Meu primeiro programa Swing");

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();

        frame.add(painel);

        iniciarPainel(painel);


        frame.setVisible(true);

    }

    private static void iniciarPainel(JPanel painel) {

        painel.setLayout(null);

        JLabel rotuloUsuario = new JLabel("Usuário:");

        rotuloUsuario.setBounds(10, 20, 80, 25);
        painel.add(rotuloUsuario);

        JTextField textoUsuario = new JTextField(20);

        textoUsuario.setBounds(100, 20, 165, 24);
        painel.add(textoUsuario);

        JButton botaoUsuario = new JButton("Enviar");
        botaoUsuario.setBounds(10, 80, 80, 25);
        painel.add(botaoUsuario);

        botaoUsuario.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                exibirTexto();
                
            }

            private void exibirTexto() {

                String texto = textoUsuario.getText();

                System.out.print(texto);
            }
        });
    }
}
