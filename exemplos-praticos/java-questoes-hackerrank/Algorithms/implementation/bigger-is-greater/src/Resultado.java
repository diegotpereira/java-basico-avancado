import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// A tarefa do problema "Bigger is Greater" no HackerRank 
// é escrever um programa que recebe uma string como entrada 
// e retorna a próxima maior permutação dessa string em ordem 
// lexicográfica, se existir. Em outras palavras, a tarefa é 
// encontrar a permutação seguinte na ordem alfabética que 
// usa os mesmos caracteres da string de entrada. Se não 
// houver uma permutação maior possível, o programa deve retornar a string "no answer".

public class Resultado {

    public static String biggerIsGreater(String w) {

        // Divide a string w em uma matriz de caracteres sequenciais
        // e inicializa uma subSequencia vazia
        String[] sequencia = w.split("");
        String subSequencia = "";

        // Loop reverso pela sequencia de caracteres
        for (int i = sequencia.length - 1; i >= 0; i--) {

            // Inicializa as listas que conterão os caracteres maiores e menores
            // do que o caractere na posição i
            List<Character> maiorais = new ArrayList<>();
            List<Character> rest = new ArrayList<>();

            // Itera pelas posições à direita de i
            for (int j = i + 1; j < sequencia.length; j++) {

                if (w.charAt(j) > w.charAt(i)) {

                    maiorais.add(w.charAt(j));

                } else {

                    rest.add(w.charAt(j));
                }
            }

            // Se há caracteres maiores do que o caractere em i
            if (!maiorais.isEmpty()) {

                // Constrói a nova subSequencia usando a subSequencia anterior
                subSequencia = String.join("", Arrays.copyOfRange(sequencia, 0, i));

                // Adiciona o menor caractere maior do que o caractere em i
                List<Character> classificar = maiorais.stream().sorted().collect(Collectors.toList());

                // o primeiro elemento da lista "classificar" é removido e adicionado ao final
                // da string "subSequencia".
                subSequencia += classificar.remove(0);

                // Adiciona o caractere em i e os demais caracteres
                rest.add(w.charAt(i));

                List<Character> novaL = Stream.concat(rest.stream(), classificar.stream())
                        .sorted(Comparator.naturalOrder()).collect(Collectors.toList());

                for (int k = 0; k < novaL.size(); k++) {

                    // adiciona cada elemento da lista novaL à string subSequencia
                    subSequencia += novaL.get(k);
                }

                return subSequencia;
            }
        }
        return "no answer";
    }

    // public static String biggerIsGreater(String w) {

    // // Define um array de caracteres com a string de entrada
    // char[] data = w.toCharArray();

    // // Inicializa a variável k com -1, a ser usada para armazenar o índice do
    // // caractere a ser permutado
    // int k = -1;

    // // Procura pelo caractere que pode ser permutado
    // for (int i = data.length - 2; i >= 0; i--)

    // if (data[i] < data[i + 1]) {

    // k = i;
    // break;
    // }

    // // Caso não exista um caractere para ser permutado, retorna "no answer"
    // if (k == -1)

    // return "no answer";

    // // Inicializa a variável l com -1, a ser usada para armazenar o índice do
    // // caractere que será trocado com k
    // int l = -1;

    // // Procura pelo caractere que deve ser trocado com k
    // for (int i = k + 1; i < data.length; i++)

    // if (data[k] < data[i] && i > l)

    // l = i;

    // // Troca os caracteres nas posições k e l
    // char aux = data[k];
    // data[k] = data[l];
    // data[l] = aux;

    // // Inverte a ordem dos caracteres da posição k + 1 até o final da string
    // int startI = k + 1;
    // int endI = data.length - 1;

    // while (startI < endI) {

    // aux = data[startI];
    // data[startI] = data[endI];
    // data[endI] = aux;
    // startI++;
    // endI--;
    // }

    // // Retorna a string permutada
    // return new String(data);
    // }

    // public static String biggerIsGreater(String w) {

    // // Obtém o comprimento da string de entrada
    // int n = w.length();

    // // Converte a string em um array de caracteres
    // char[] c = w.toCharArray();

    // // Cria um StringBuilder para construir a string de saída
    // StringBuilder sb = new StringBuilder();

    // // Percorre a string de trás para frente procurando o primeiro caractere que
    // // pode ser modificado
    // for (int i = n - 2; i >= 0; i--) {

    // // Percorre a string de trás para frente procurando o menor caractere que é
    // // maior do que o caractere em i
    // for (int j = n - 1; j > i; j--) {

    // // Se um caractere maior é encontrado
    // if (c[j] > c[i]) {

    // // Adiciona os caracteres antes de i na string de saída
    // sb.append(w.substring(0, i));

    // // Adiciona o caractere em j na string de saída
    // sb.append(c[j]);

    // // Cria uma string temporária com os caracteres entre i e j removidos
    // String tmp = w.substring(i, j) + w.substring(j + 1);

    // // Converte a string temporária em um array de caracteres
    // char[] c2 = tmp.toCharArray();

    // // Ordena os caracteres na string temporária em ordem crescente
    // Arrays.sort(c2);

    // // Adiciona os caracteres ordenados na string de saída
    // sb.append(c2);

    // // Retorna a próxima permutação em ordem lexicográfica
    // return sb.toString();
    // }
    // }
    // }

    // // Se não há permutação maior possível, retorna "no answer"
    // return "no answer";
    // }

    // A tarefa do problema "Bigger is Greater" no HackerRank é escrever um programa
    // que recebe uma string como entrada e retorna a próxima maior permutação dessa
    // string em ordem lexicográfica, se existir. Em outras palavras, a tarefa é
    // encontrar a permutação seguinte na ordem alfabética que usa os mesmos
    // caracteres da string de entrada. Se não houver uma permutação maior possível,
    // o programa deve retornar a string "no answer".

    // public static String biggerIsGreater(String w) {

    // // Inicialização de variáveis
    // int j;
    // int n = w.length();
    // int[] arr = new int[n];

    // // Converte a string em um array de inteiros, usando a tabela ASCII
    // for (int i = 0; i < n; i++)

    // arr[i] = (int) w.charAt(i);

    // // Encontra a posição do último caractere que pode ser modificado
    // for (j = n - 1; j > 0; j--)

    // if (arr[j] > arr[j - 1])

    // break;

    // int r = j - 1;

    // // Se nenhum caractere puder ser modificado, retorna "no answer"
    // if (j == 0)

    // return "no answer";

    // // Inicialização de um array que armazena a frequência de cada caractere da
    // // string após a posição j
    // int[] brr = new int[26];

    // for (int i = 0; i < 26; i++)

    // brr[i] = -1;

    // // Conta a frequência de cada caractere a partir da posição j
    // for (int i = j; i < n; i++)

    // brr[arr[i] - 97]++;

    // // Rearranja os caracteres após a posição j em ordem lexicográfica
    // for (int i = 0; i < 26; i++) {

    // if (brr[i] > -1) {

    // int tmp = brr[i];

    // while (tmp-- > -1) {

    // arr[j] = i + 97;
    // j++;
    // }
    // }
    // }

    // // Troca o caractere na posição r pelo menor caractere após a posição r que é
    // // maior do que ele
    // for (int i = r + 1; i < n; i++) {

    // if (arr[r] < arr[i]) {

    // int temp = arr[i];
    // arr[i] = arr[r];
    // arr[r] = temp;
    // break;
    // }
    // }

    // // Converte o array de inteiros de volta para uma string e retorna a resposta
    // String s = "";

    // for (int i = 0; i < n; i++) {

    // s += (char) arr[i];
    // }

    // return s;
    // }

}
