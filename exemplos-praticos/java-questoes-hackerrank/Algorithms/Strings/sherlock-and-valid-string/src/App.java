import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String resultado = Resultado.isValid(s);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        
    }
}

class Resultado {

    public static String isValid(String s) {
        String retorno = "YES"; // inicializa a variável de retorno com "YES"
        
        char[] arr = s.toCharArray(); // transforma a string em um array de caracteres
        
        Arrays.sort(arr); // ordena o array em ordem alfabética
        
        char c = 0; // variável para guardar o último caractere lido
        
        int contarFreq = 0; // contador para guardar a frequência do último caractere lido
        
        List<Integer> lista =  new ArrayList<Integer>(); // lista para guardar as frequências dos caracteres
        
        if(s.length() == 1) // se a string tiver tamanho 1, já é um palíndromo
            return retorno;
            
        for (int i = 0; i < arr.length; i++) {
            
            if (i == 0) { // primeira iteração
                
                c = arr[i];
                continue; // pula para a próxima iteração sem executar o restante do código
            }
            
            if(c == arr[i]) { // se o caractere atual for igual ao anterior
                
                contarFreq++; // incrementa o contador de frequência
                
            } else { // se o caractere atual for diferente do anterior
                
                lista.add(++contarFreq); // adiciona a frequência do caractere anterior na lista
                contarFreq = 0; // reinicia o contador de frequência para o novo caractere
            }
            
            if (i == arr.length - 1) { // última iteração
                
                lista.add(++contarFreq); // adiciona a frequência do último caractere na lista
            }
            
            c = arr[i]; // atualiza o último caractere lido
        }
        
        int inicial = lista.get(0); // guarda a frequência do primeiro caractere
        int freq = inicial; // guarda a frequência do último caractere lido
        int contar = 0; // contador para contar o número de frequências diferentes encontradas
        int dif = 0; // contador para contar o número de diferenças entre as frequências
        
        for (int i = 1; i < lista.size(); i++) { // itera sobre a lista de frequências
            
            int atual = lista.get(i); // guarda a frequência do caractere atual
            
            if(atual != freq) { // se a frequência atual for diferente da frequência do último caractere lido
                
                contar++; // incrementa o contador de frequências diferentes
                
                if(atual > 1 && Math.abs(atual - inicial) > 1) { // se a frequência atual for maior que 1 e tiver diferença maior que 1 com a frequência do primeiro caractere
                    
                    dif++; // incrementa o contador de diferenças
                    
                } else {
                    
                    continue; // pula para a próxima iteração sem executar o restante do código
                }
            }
            
            inicial = atual; // atualiza a frequência do primeiro caractere
        }
        
        if(contar > 1 || dif > 0) { // se houver mais de uma frequência diferente ou houver diferenças entre as frequências
            
            retorno = "NO"; // altera a variável de retorno para "NO"
        }
    
        return retorno; // retorna a variável de retorno
    }


    // public static String isValid(String s) {

    //     // Inicializa um array de inteiros com 26 posições (para as 26 letras do alfabeto)
    //     int x[] = new int[26];

    //     // Inicializa uma variável que vai armazenar a maior frequência de uma letra na string s
    //     int max = 0;

    //     // Inicializa um array que vai contar quantas letras aparecem na mesma frequência
    //     int[] R = {0, 0};

    //     // Inicializa uma variável para contar quantas frequências diferentes aparecem
    //     int contar = -1;

    //     // Percorre a string s, contando a frequência de cada letra e atualizando o valor de max
    //     for(char c : s.toCharArray())

    //         // atualiza o valor de max para a contagem máxima de ocorrências de um mesmo caractere na string s.
    //         // compara o valor atual da variável max com o novo valor retornado pela expressão ++x[c - 'a'] e retorna o maior valor entre os dois.
    //         // ++x[c - 'a']: essa expressão incrementa o valor da posição correspondente ao caractere atual na matriz x e retorna o novo valor da posição. 
    //         // Note que estamos usando o fato de que o código ASCII de 'a' é 97, então c - 'a' retorna o índice do caractere atual na matriz x.
    //         max = Math.max(max, ++x[c - 'a']);

    //     // Percorre o array x, contando quantas letras aparecem na mesma frequência de max e max-1
    //     for(int i : x) {

    //         // Se i for 0, significa que essa letra não apareceu na string e podemos pular para a próxima letra
    //         if(i == 0) continue;

    //         // Se i for igual a max ou max-1, incrementa o contador correspondente em R
    //         else if(i == max || i == max - 1) R[max - i] ++;

    //         contar++;
    //     }
        
    //     // Retorna "YES" se apenas uma frequência diferente apareceu ou se há apenas uma letra diferente em uma frequência diferente
    //     return contar + 1 == R[0] || contar == R[1] || contar == R[0] ? "YES" : "NO";
    // }

    // // Método para verificar se a string s é uma sequência válida
    // public static String isValid(String s) {

    //     // Verifica se a string s é nula e retorna "YES" caso seja
    //     if(s == null) return "YES";

    //     // Cria um ArrayList de caracteres a partir da string s
    //     ArrayList<Character> charr = new ArrayList<>();

    //     char[] arr = s.toCharArray();

    //     for(char ch : arr) {

    //         charr.add(ch);
    //     }

    //     // Ordena o ArrayList em ordem crescente
    //     Collections.sort(charr);

    //     // Variáveis para verificar se a contagem máxima é consistente
    //     int maxConta = 0;
    //     int i = 0;

    //     // Loop para percorrer o ArrayList e verificar se a contagem é consistente
    //     while (i < charr.size() - 1) {
            
    //         // Variável para contar a quantidade de caracteres iguais consecutivos
    //         int contar = 1;

    //         // Loop para comparar o caractere atual com os seguintes e contar quantas vezes aparece
    //         for (int j = i + 1; j < charr.size(); j++) {
                
    //             if (charr.get(i) == charr.get(j)) {
                    
    //                 contar++;
    //             }

    //             // Se o loop está na primeira iteração, define o valor máximo de contagem
    //             if (i == 0) {
                    
    //                 maxConta = contar;
    //             }
    //         }

    //         // Se a contagem não é consistente, verifica se há apenas uma diferença de 1
    //         if (contar != maxConta) {
                
    //             int apenasUmaVezDifereUm = 0;

    //             if (Math.abs(contar - maxConta) == 1) {
                    
    //                 // Verifica se já foi encontrada uma única diferença de 1 anteriormente
    //                 if (apenasUmaVezDifereUm == 1) {
                        
    //                     apenasUmaVezDifereUm++;

    //                     // Retorna "YES" caso tenha encontrado uma diferença de 1
    //                     return "YES";
    //                 }
    //             }

    //             // Retorna "NO" caso a contagem não seja consistente e não haja apenas uma diferença de 1
    //             return "NO";
    //         }

    //         // Atualiza o valor de i para a próxima iteração do loop
    //         i = i + contar;
    //     }

    //     // Retorna "YES" caso a contagem seja consistente para todos os caracteres
    //     return "YES";
    // }
}