import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        int contarConsulta = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> consultas = IntStream.range(0, contarConsulta).mapToObj(i -> {

            try {

                return bufferedReader.readLine().replaceAll("\\s+$", "");

            } catch (IOException e) {

                throw new RuntimeException(e);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<String> resultado = Resultado.weightedUniformStrings(s, consultas);

        bufferedWriter.write(resultado.stream().collect(joining("\n")) + "");

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Resultado {

    // Esse código implementa um programa que lê uma string e uma lista de consultas
    // a partir da entrada padrão, e então verifica se cada consulta é um peso
    // válido de alguma substring da string original. Para calcular o peso de uma
    // substring, o programa percorre a string original e calcula o peso de cada
    // caractere com base em sua posição na tabela ASCII. Se um caractere atual é
    // igual ao anterior, então o peso da substring atual é somado com o peso da
    // substring anterior. Em seguida, o programa verifica se cada consulta está
    // contida na lista de pesos das substrings e retorna "YES" ou "NO" em uma
    // lista.

    public static List<String> weightedUniformStrings(String s, List<Integer> consultas) {

        // cria uma lista de inteiros para armazenar os pesos das substrings
        List<Integer> strPesos = new ArrayList<>();

        // itera sobre cada caractere da string de entrada para calcular os pesos das
        // substrings
        for (int i = 0; i < s.length(); i++) {

            // obtém o caractere da posição atual
            char c = s.charAt(i);
            // calcula o peso do caractere usando a tabela ASCII
            int peso = c - 'a' + 1;

            // se o caractere atual é igual ao anterior, então soma o peso com o da
            // substring anterior
            if (i != 0 && c == s.charAt(i - 1))

                // calcular o peso atual de um caractere com base no peso do caractere anterior
                peso += strPesos.get(i - 1);

            // adiciona o peso da substring na lista
            strPesos.add(peso);

        }

        // verifica se cada consulta está contida na lista de pesos e retorna "YES" ou
        // "NO" em uma lista
        return consultas.stream().map(i -> strPesos.contains(i) ? "YES" : "NO").collect(Collectors.toList());
    }

    // // Método que recebe uma string e uma lista de consultas como argumentos e
    // // retorna uma lista de Strings
    // public static List<String> weightedUniformStrings(String s, List<Integer>
    // consultas) {

    // // Criação de um conjunto de inteiros para armazenar os pesos
    // Set<Integer> pesos = new HashSet<>();
    // // Inicialização da variável contar com o valor 1
    // int contar = 1;

    // // Criação de uma lista para armazenar o resultado
    // List<String> resultado = new ArrayList<>();

    // // Loop para percorrer cada caractere da string s
    // for (int i = 0; i < s.length(); i++) {

    // // Cálculo do peso e adição ao conjunto de pesos
    // pesos.add(contar * ((int) s.charAt(i) - 96));

    // // Verificação se o próximo caractere é igual ao atual
    // if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {

    // // Se for, incrementa a variável contar
    // contar++;

    // } else {

    // // Se não for, reseta a variável contar para 1
    // contar = 1;
    // }
    // }

    // // Loop para percorrer cada consulta da lista de consultas
    // for (Integer consulta : consultas) {

    // // Verificação se o conjunto de pesos contém a consulta
    // if (pesos.contains(consulta)) {

    // // Se contém, adiciona a String "YES" ao resultado
    // resultado.add("YES");

    // } else {

    // // Se não contém, adiciona a String "NO" ao resultado
    // resultado.add("NO");
    // }
    // }

    // // Retorna a lista de resultados
    // return resultado;
    // }

}