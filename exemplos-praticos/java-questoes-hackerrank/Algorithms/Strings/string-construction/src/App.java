import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {

            try {
                String s = bufferedReader.readLine();

                int resultado = Resultado.stringConstruction(s);

                bufferedWriter.write(String.valueOf(resultado));
                bufferedWriter.newLine();

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });
        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int stringConstruction(String s) {

        HashSet<Character> hashSet = new HashSet<>();
        
        for(int i = 0 ; i < s.length(); i++){

            hashSet.add(s.charAt(i));
        }

        return hashSet.size();
    }

    // public static int stringConstruction(String s) {

    //     Set set1 = new HashSet<>(Arrays.asList(s.split("")));

    //     return set1.size();
    // }

    // public static int stringConstruction(String s) {

           // Declaração de um novo objeto HashSet vazio
    //     HashSet<Character> loja = new HashSet<>();

           // Percorre cada caractere da string s e adiciona-o ao HashSet
    //     for(char ch : s.toCharArray()) {

               
    //         loja.add(ch);

    //     }

           // Cria uma nova lista ArrayList a partir dos elementos do HashSet
    //     ArrayList<Character> loja_lista = new ArrayList<>(loja);
           // Retorna o tamanho da lista, que é o número de caracteres únicos na string s
    //     return loja_lista.size();
    // }
}
