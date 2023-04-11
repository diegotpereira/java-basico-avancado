import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int k = Integer.parseInt(primeiraMultiplaEntrada[1]);

        String s = bufferedReader.readLine();

        String resultado = Resultado.highestValuePalindrome(s, n, k);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static String highestValuePalindrome(String s, int n, int k) {
        
        return null;
    }

    // public static String highestValuePalindrome(String s, int n, int k) {

    //     // Transforma a String s em uma lista de caracteres
    //     List<Character> charList = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    
    //     // Calcula a quantidade de caracteres que precisam ser trocados
    //     int numChanges = (int) IntStream.range(0, n / 2).filter(i -> charList.get(i) != charList.get(n - i - 1)).count();
    
    //     // Caso a quantidade de caracteres que precisam ser trocados seja maior do que k, retorna -1
    //     if (numChanges > k) {
    //         return "-1";
    //     }
    
    //     // Troca os caracteres de forma a obter o maior palíndromo possível
    //     for (int i = 0; i < n / 2; i++) {
    //         if (charList.get(i) != charList.get(n - i - 1)) {
    //             charList.set(i, (char) Math.max(charList.get(i), charList.get(n - i - 1)));
    //             charList.set(n - i - 1, (char) Math.max(charList.get(i), charList.get(n - i - 1)));
    //             k--;
    //         }
    //     }
    
    //     // Substitui os caracteres que sobraram por '9' para obter o maior palíndromo possível
    //     for (int i = 0; i < n / 2 && k > 0; i++) {
    //         if (charList.get(i) != '9') {
    //             if (numChanges - (charList.get(i) != charList.get(n - i - 1) ? 1 : 0) <= k - 1) {
    //                 charList.set(i, '9');
    //                 charList.set(n - i - 1, '9');
    //                 k -= (charList.get(i) != charList.get(n - i - 1)) ? 1 : 2;
    //             }
    //         }
    //     }
    
    //     // Caso ainda seja possível trocar caracteres e n seja ímpar, troca o caractere do meio por '9'
    //     if (k > 0 && n % 2 == 1) {
    //         charList.set(n / 2, '9');
    //     }
    
    //     // Transforma a lista de caracteres em uma String e retorna
    //     return charList.stream().map(Object::toString).collect(Collectors.joining());
    // }
    

    // public static String highestValuePalindrome(String s, int n, int k) {

    //     // cria um StringBuilder a partir da string recebida como parâmetro
    //     StringBuilder sb = new StringBuilder(s);

    //     // cria um HashSet para armazenar as posições dos caracteres que foram modificados
    //     HashSet<Integer> set = new HashSet<>(n / 2);

    //     // itera pela metade da string (os caracteres a serem comparados já foram comparados na primeira metade)
    //     for (int i = 0; i < n / 2; i++) {
            
    //         // verifica se os caracteres das extremidades são diferentes
    //         if (s.charAt(i) != s.charAt(n - i - 1)) {
                
    //             // obtém o valor numérico do caractere da esquerda e da direita
    //             int max = Math.max(Integer.valueOf(s.charAt(i)), s.charAt(n - i - 1));

    //             // substitui os caracteres da esquerda e da direita pelo maior valor encontrado
    //             sb.setCharAt(i, (char) max);
    //             sb.setCharAt(n - i - 1, (char) max);

    //             // adiciona a posição do caractere modificado ao HashSet
    //             set.add(i);

    //             // decrementa a quantidade de modificações possíveis
    //             k = k - 1;

    //             // se não houverem mais modificações possíveis, retorna "-1"
    //             if (k < 0) {
                    

    //                 System.out.println("-1");

    //                 return "-1";
    //             }
    //         }
    //     }

    //     // itera pela metade da string novamente
    //     for (int i = 0; i < n / 2; i++) {
            
    //         // se ainda houverem modificações possíveis
    //         if (k > 0) {
                
    //             // se a posição atual foi modificada anteriormente, tenta modificar para o valor "9"
    //             if (set.contains(i)) {
                    
    //                 // se o valor já for "9", passa para a próxima iteração
    //                 if (sb.charAt(i) == '9') {

    //                     continue;
                        
    //                 } else {

    //                     // substitui o caractere atual e o correspondente pelo valor "9"
    //                     sb.setCharAt(i, '9');
    //                     sb.setCharAt(n - i - 1, '9');
    //                     k = k - 1;
    //                 }

    //             // se ainda houverem duas modificações possíveis, substitui o 
    //             // caractere atual e o correspondente por "9"
    //             } else if (k > 1) {
                    
    //                 if (sb.charAt(i) == '9') {
                        
    //                     continue;
                         
    //                 } else {

    //                     // substitui o caractere atual e o correspondente pelo valor "9"
    //                     sb.setCharAt(i, '9');
    //                     sb.setCharAt(n - i - 1, '9');
    //                     k = k - 2;
    //                 }
    //             }
    //         }
    //     }

    //     // se ainda houverem modificações possíveis e a string tiver tamanho ímpar, 
    //     // modifica o caractere do meio para "9"
    //     if (k > 0 && n % 2 == 1) {
            
    //         sb.setCharAt(n/2, '9');
    //     }

    //     // imprime a string resultante
    //     System.out.println(sb.toString());

    //     // retorna a string resultante
    //     return sb.toString();
        
    // }

    
}