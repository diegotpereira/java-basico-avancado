import java.util.*;
import java.util.stream.Collectors;

// O problema "Sherlock and Anagrams" do HackerRank tem como 
// tarefa determinar o número de anagramas que existem em uma string. 
// Um anagrama é uma palavra ou frase formada pela transposição das 
// letras de outra palavra ou frase, mantendo-se os nomes das letras. 
// Por exemplo, as palavras "mary" e "army" são anagramas uma da outra, 
// assim como as palavras "cinema" e "iceman". O problema pede para que 
// sejam encontrados todos os pares de substrings da string dada que são 
// anagramas, e retornar o número total de pares encontrados.

public class Resultado {

    public static int sherlockAndAnagrams(String s) {

        int contar = 0;

        for (int i = 1; i < s.length(); i++) {
            
        
        }
        return 0;
    }

    // public static int sherlockAndAnagrams(String s) {

    // Map<String, Integer> mapa = new HashMap<>();
    // int contar = 0;

    // for (int i = 0; i < s.length(); i++) {

    // for (int j = i; j < s.length(); j++) {

    // // Obtém a substring de s a partir do índice i até j e a converte para um
    // array
    // // de caracteres
    // char[] c = s.substring(i, j + 1).toCharArray();

    // // Ordena as letras da substring em ordem alfabética
    // Arrays.sort(c);

    // // Cria uma chave a partir do array de caracteres ordenado
    // String key = new String(c);

    // // Verifica se a chave já existe no mapa
    // if (mapa.containsKey(key)) {

    // // Incrementa o contador de anagramas com o valor correspondente à chave no
    // mapa
    // contar += mapa.get(key);

    // // Adiciona a chave ao mapa com o valor incrementado
    // mapa.put(key, mapa.getOrDefault(key, 0) + 1);

    // } else {

    // // Adiciona a chave ao mapa com o valor inicializado em 1
    // mapa.put(key, mapa.getOrDefault(key, 0) + 1);
    // }
    // }
    // }
    // return contar;
    // }

    // public static int sherlockAndAnagrams(String s) {

    // // Cria um HashMap para armazenar as subcadeias e sua quantidade de
    // ocorrências
    // HashMap<String, Integer> hm = new HashMap<>();
    // int soma = 0;

    // // Percorre todas as subcadeias de 's'
    // for (int i = 0; i < s.length(); i++)
    // for (int j = i + 1; j <= s.length(); j++)

    // // Adiciona a subcadeia atual ao HashMap
    // add(hm, s.substring(i, j));

    // // Percorre o HashMap para calcular o número de anagramas
    // for (int k : hm.values())
    // if (k != 1)

    // soma += (k * (k - 1) / 2);

    // return soma;
    // }

    // // Adiciona a subcadeia atual ao HashMap
    // public static void add(HashMap<String, Integer> hm, String s) {

    // // Transforma a subcadeia em um array de caracteres, e depois o ordena
    // char a[] = s.toCharArray();

    // System.out.println(new String(a));

    // Arrays.sort(a);

    // // Substitui a subcadeia pela sua versão ordenada e atualiza
    // // a contagem no HashMap
    // s = new String(a);

    // hm.putIfAbsent(s, 0);
    // hm.put(s, hm.get(s) + 1);
    // }

    // public static int sherlockAndAnagrams(String s) {

    // // criação de um objeto do tipo HashMap que armazenará sublistas de
    // caracteres
    // // como chaves e valores do tipo Long.
    // Map<List<Character>, Long> subMapa = new HashMap<>();

    // // inicialização de uma variável contar com o valor 0, que será usada para
    // // armazenar a contagem de anagramas.
    // int contar = 0;

    // // laço externo que percorre a string s a partir do índice 0 até o seu
    // // comprimento.
    // for (int i = 0; i < s.length(); i++) {

    // // laço interno que percorre a string s a partir do índice i+1 até o seu
    // // comprimento.
    // for (int j = i + 1; j <= s.length(); j++) {

    // // criação de uma substring a partir da string s, com início no índice i e
    // fim
    // // no índice j-1.
    // String sub = s.substring(i, j);

    // // criação de uma lista de caracteres a partir da substring sub, ordenada em
    // // ordem crescente.
    // List<Character> classificado = sub.chars().mapToObj(c -> (char) c).sorted()
    // .collect(Collectors.toList());

    // // recuperação do valor associado à chave classificado no mapa subMapa, ou o
    // // valor 0 caso a chave não esteja presente.
    // Long subContar = subMapa.getOrDefault(classificado, 0L);

    // // adição do valor subContar à variável contar.
    // contar += subContar;

    // // inserção da chave classificado no mapa subMapa e incremento do valor
    // // associado à chave em 1.
    // subMapa.put(classificado, ++subContar);
    // }
    // }

    // // retorno do valor armazenado na variável contar.
    // return contar;
    // }

}
