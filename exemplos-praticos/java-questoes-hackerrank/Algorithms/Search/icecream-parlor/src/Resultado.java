import java.util.*;
import java.util.stream.IntStream;

public class Resultado {

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

        // cria um HashMap para armazenar os sabores que podem ser comprados com a
        // quantia disponível
        HashMap<Integer, Integer> podeComprar = new HashMap<>();

        // cria uma lista para armazenar os índices dos sabores escolhidos
        List<Integer> indices = new ArrayList<>();

        // percorre a lista de sabores
        IntStream.range(0, arr.size()).forEach(a -> {

            // verifica se o sabor que complementa o valor disponível já foi comprado antes
            if (podeComprar.containsKey(m - arr.get(a))) {

                // se sim, adiciona os índices correspondentes à lista de índices
                indices.add(podeComprar.get(m - arr.get(a)));
                indices.add(a + 1);

            } else {

                // se não, adiciona o sabor atual e seu índice ao HashMap
                podeComprar.put(arr.get(a), a + 1);
            }
        });

        // retorna a lista de índices dos sabores escolhidos
        return indices;
    }

    // public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

    // // cria uma lista vazia para armazenar o resultado
    // List<Integer> resultado = new ArrayList<>();

    // // itera sobre os elementos da lista até o penúltimo elemento
    // for (int i = 0; i < arr.size() - 1; i++) {

    // // armazena o primeiro sabor
    // int c1 = arr.get(i);

    // // itera sobre os elementos após o primeiro sabor
    // for (int j = i + 1; j < arr.size(); j++) {

    // // armazena o segundo sabor
    // int c2 = arr.get(j);

    // if (c1 + c2 == m) {

    // // adiciona o índice do primeiro sabor à lista de resultados
    // resultado.add(i + 1);

    // // adiciona o índice do segundo sabor à lista de resultados
    // resultado.add(j + 1);

    // }

    // }

    // }

    // // retorna a lista de resultados
    // return resultado;
    // }

    // // O método "icecreamParlor" recebe como parâmetro um inteiro "m" e uma lista
    // de
    // // inteiros "arr" e retorna uma lista de inteiros.
    // public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

    // // É criada uma nova lista chamada "podeComprar" que armazenará os índices
    // dos
    // // sabores que podem ser comprados.
    // List<Integer> podeComprar = new ArrayList<>();

    // // O loop percorre todos os elementos da lista "arr".
    // for (int i = 0; i < arr.size(); i++) {

    // // O loop interno percorre todos os elementos da lista "arr" que estão à
    // direita
    // // do elemento "i".
    // for (int j = i + 1; j < arr.size(); j++) {

    // // Se a soma dos elementos "i" e "j" for igual a "m", então os índices desses
    // // elementos são adicionados à lista "podeComprar".
    // if (arr.get(i) + arr.get(j) == m) {

    // // Adiciona os índices dos elementos "i" e "j" à lista "podeComprar".
    // podeComprar.add(i + 1);
    // podeComprar.add(j + 1);
    // }
    // }
    // }

    // // Retorna a lista de índices dos sabores que podem ser comprados.
    // return podeComprar;
    // }

    // public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

    // List<Integer> indice = new ArrayList<>();

    // // Percorre a lista 'arr' até o penúltimo elemento
    // for (int i = 0; i < arr.size() - 1; i++) {

    // // Percorre a lista 'arr' a partir do elemento i + 1
    // for (int j = i + 1; j < arr.size(); j++) {

    // // Se a soma dos sabores de sorvete i e j for igual a 'm',
    // // adiciona os índices na lista 'indice'
    // if (arr.get(i) + arr.get(j) == m) {

    // indice.add(i + 1);
    // indice.add(j + 1);
    // }
    // }

    // // Se a lista 'indice' não estiver vazia, sai do loop
    // if (!indice.isEmpty()) {

    // break;
    // }
    // }

    // // Retorna a lista 'indice' com os índices dos sabores de sorvete
    // // que somados dão 'm'
    // return indice;
    // }

}
