import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int resultado = Resultado.alternate(s);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {
    
    public static int alternate(String s) {

        // Verifica se a string é nula ou tem comprimento menor ou igual a 1
        if (s == null || s.length() <= 1) {

            return 0;
        }

        // Cria uma lista de caracteres únicos na string usando Streams
        List<Character> caracterUnico = s.chars()
                .distinct() // Remove caracteres duplicados
                .mapToObj(c -> (char) c) // Transforma em um objeto Character
                .collect(Collectors.toList()); // Coleta em uma lista

        // Encontra a maior sequência alternada de caracteres únicos
        int maxConta = caracterUnico.stream()
                .flatMap(c1 -> caracterUnico.stream()
                        .filter(c2 -> c1 != c2) // Seleciona somente caracteres diferentes
                        .map(c2 -> c1.toString() + c2.toString())) // Cria todas as possíveis combinações
                .mapToInt(pr -> {

                    int contar = 0;
                    int ultimoIndex = -1;

                    // Percorre a string e conta a maior sequência alternada de caracteres em pr

                    for (char c : s.toCharArray()) {

                        int idx = pr.indexOf(c);

                        if (idx < 0) {

                            continue;
                        }

                        if (ultimoIndex == idx) {

                            contar = 0;
                            break;
                        }

                        ultimoIndex = idx;
                        contar++;
                    }

                    return contar;

                })
                .max() // Encontra o maior número de caracteres alternados
                .orElse(0); // Retorna 0 se não houver caracteres alternados
        return maxConta;
    }

    // public static int alternate(String s) {

    // // Cria uma lista de caracteres únicos
    // List<Character> unico = new ArrayList<>();

    // for (int i = 0; i < s.length(); i++) {

    // // Adiciona os caracteres únicos na lista
    // if (!unico.contains(s.charAt(i))) {

    // unico.add(s.charAt(i));
    // }
    // }

    // // Variável que guarda a maior contagem de caracteres alternados
    // int maxConta = 0;

    // // Loop para verificar todos os pares de caracteres únicos
    // for (int i = 0; i < unico.size(); i++) {

    // for (int j = i + 1; j < unico.size(); j++) {

    // // Combinação de dois caracteres únicos
    // String pr = unico.get(i).toString() + unico.get(j);

    // // Variável que conta a quantidade de caracteres alternados
    // int contar = 0;

    // // Variável que guarda o último índice encontrado
    // int ultimoIndex = 1;

    // // Loop para percorrer a string original e verificar a alternância
    // for (int k = 0; k < s.length(); k++) {

    // // Verifica se o caractere atual é um dos caracteres da combinação
    // int idx = pr.indexOf(s.charAt(k));

    // // Verifica se o caractere atual é o mesmo que o anterior
    // if (idx < 0) {

    // continue;
    // }

    // if (ultimoIndex == idx) {

    // contar = 0;
    // break;
    // }

    // ultimoIndex = idx;
    // contar++;
    // }

    // // Verifica se o caractere atual é o mesmo que o anterior
    // maxConta = Math.max(contar, maxConta);
    // }
    // }

    // // Retorna a maior contagem encontrada
    // return maxConta;
    // }
}