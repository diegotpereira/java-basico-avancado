import java.util.*;
import java.util.stream.Collectors;

public class Resultado {

    // public static List<Integer> missingNumbers(List<Integer> arr, List<Integer>
    // brr) {

    // // Cria uma lista para armazenar os números ausentes
    // List<Integer> ausentes = new ArrayList<>();

    // // Cria dois arrays de contagem com 1000 elementos cada
    // int arr1[] = new int[1000];
    // int arr2[] = new int[1000];

    // // Percorre o primeiro array (arr) e incrementa o contador
    // // correspondente no arr1
    // for (int i = 0; i < arr.size(); i++) {

    // arr1[arr.get(i)]++;
    // }

    // // Percorre o segundo array (brr) e incrementa o contador
    // // correspondente no arr2
    // for (int i = 0; i < brr.size(); i++) {

    // arr2[brr.get(i)]++;
    // }

    // // Percorre ambos os arrays de contagem e verifica se há alguma diferença
    // // Se houver, adiciona o número ausente à lista
    // for (int i = 0; i < 1000; i++) {

    // if (arr1[i] != arr2[i]) {

    // ausentes.add(i);
    // }
    // }

    // // Retorna a lista de números ausentes
    // return ausentes;
    // }

    // public static List<Integer> missingNumbers(List<Integer> arr, List<Integer>
    // brr) {

    // // Cria um HashMap para contar a frequência de cada número em brr
    // Map<Integer, Integer> mapaDeContagem = new HashMap<>();

    // // Subtrai a frequência de cada número em arr do mapaDeContagem
    // for (int num : brr) {
    // mapaDeContagem.put(num, mapaDeContagem.getOrDefault(num, 0) + 1);
    // }

    // for (int num : arr) {
    // mapaDeContagem.put(num, mapaDeContagem.get(num) - 1);
    // }

    // // Percorre o mapaDeContagem e adiciona os números com frequência maior que
    // zero
    // // a uma lista
    // List<Integer> faltandoNúmeros = new ArrayList<>();

    // for (Map.Entry<Integer, Integer> entry : mapaDeContagem.entrySet()) {
    // if (entry.getValue() > 0) {
    // faltandoNúmeros.add(entry.getKey());
    // }
    // }

    // // classifica a lista em ordem crescente
    // Collections.sort(faltandoNúmeros);

    // // Ordena a lista de números ausentes
    // return faltandoNúmeros;
    // }

    // public static List<Integer> missingNumbers(List<Integer> arr, List<Integer>
    // brr) {

    // // Cria uma cópia da lista brr
    // List<Integer> brrCopia = new ArrayList<>(brr);

    // // Remove todos os elementos da lista arr da lista brrCopia
    // for (int elemento : arr) {

    // brrCopia.remove(Integer.valueOf(elemento));
    // }

    // // Remove elementos duplicados e ordena a lista brrCopia
    // brrCopia = brrCopia.stream()
    // .distinct()
    // .sorted()
    // .collect(Collectors.toList());

    // // Ordena a lista brrCopia
    // brrCopia.sort(Comparator.naturalOrder());

    // // Retorna a lista com os números ausentes
    // return brrCopia;
    // }

    // public static List<Integer> missingNumbers(List<Integer> arr, List<Integer>
    // brr) {

    // // Cria uma cópia modificável da lista brr
    // List<Integer> brrCopia = new ArrayList<>(brr);

    // // Ordena a lista brrCopia em ordem crescente
    // Collections.sort(brrCopia);

    // // Remove da lista brrCopia os elementos da lista arr
    // for (int i = 0; i < arr.size(); i++) {

    // brrCopia.remove(arr.get(i));
    // }

    // // Remove da lista brrCopia elementos repetidos adjacentes
    // for (int i = 0; i < brrCopia.size() - 1; i++) {

    // int atual = brrCopia.get(i);
    // int proximo = brrCopia.get(i + 1);

    // if (atual == proximo) {

    // brrCopia.remove(i);
    // }
    // }

    // // Retorna a lista brrCopia contendo os números ausentes
    // return brrCopia;
    // }

    // public static List<Integer> missingNumbers(List<Integer> arr, List<Integer>
    // brr) {

    // // inicializa variável para armazenar o valor mínimo de brr
    // int min = Integer.MAX_VALUE;

    // // inicializa lista para armazenar os números ausentes
    // List<Integer> ausente = new ArrayList<>();

    // // inicializa array de inteiros B com tamanho 100
    // int frequencia[] = new int[100];

    // // busca o valor mínimo em brr
    // for (int i : brr)

    // min = Math.min(i, min);

    // // incrementa em 1 a posição i - min no array B
    // // onde i é o elemento em brr
    // for (int i : brr)

    // frequencia[i - min]++;

    // // decrementa em 1 a posição i - min no array B
    // // onde i é o elemento em arr
    // for (int i : arr)

    // frequencia[i - min]--;

    // // adiciona os valores ausentes ao arraylist ausente
    // for (int i = 0; i < 100; i++)

    // if (frequencia[i] != 0)

    // ausente.add(i + min);

    // // retorna a lista com os valores ausentes
    // return ausente;
    // }

    // public static List<Integer> missingNumbers(List<Integer> arr, List<Integer>
    // brr) {

    // // cria uma cópia da lista brr para não modificar a lista original
    // List<Integer> brrCopia = new ArrayList<>(brr);

    // // remove da lista brrCopia todos os elementos que estão presentes na lista
    // arr
    // for (Integer elemento : arr) {

    // brrCopia.remove(elemento);
    // }

    // // cria um conjunto a partir da lista brrCopia, removendo assim as duplicatas
    // Set<Integer> set = new HashSet<>(brrCopia);

    // // cria uma nova lista a partir do conjunto set
    // List<Integer> resultado = new ArrayList<>(set);

    // // ordena a lista resultado em ordem crescente
    // Collections.sort(resultado);

    // // retorna a lista resultado
    // return resultado;
    // }

    // public static List<Integer> missingNumbers(List<Integer> arr, List<Integer>
    // brr) {
    // // Inicializa dois HashMaps para armazenar a contagem de cada número
    // // na primeira e na segunda lista
    // HashMap<Integer, Integer> hash1 = new HashMap<>();
    // HashMap<Integer, Integer> hash2 = new HashMap<>();

    // // Cria uma lista para armazenar os números faltantes
    // List<Integer> faltandoNumeros = new ArrayList<>();

    // // Percorre a primeira lista, incrementando a contagem de cada número
    // for (int i = 0; i < arr.size(); i++) {
    // int num = arr.get(i);

    // // Se o número já foi visto antes, incrementa a contagem
    // if (hash1.containsKey(num)) {
    // int conta = hash1.get(num);
    // hash1.put(num, conta + 1);
    // } else {
    // // Se o número não foi visto antes, adiciona ele no HashMap
    // // e inicia a contagem com 1
    // hash1.put(num, 1);
    // }
    // }

    // // Percorre a segunda lista, fazendo o mesmo procedimento da primeira
    // for (int j = 0; j < brr.size(); j++) {
    // int num = brr.get(j);

    // // Se o número já foi visto antes, incrementa a contagem
    // if (hash2.containsKey(num)) {
    // int conta = hash2.get(num);
    // hash2.put(num, conta + 1);
    // } else {
    // // Se o número não foi visto antes, adiciona ele no HashMap
    // // e inicia a contagem com 1
    // hash2.put(num, 1);
    // }
    // }

    // // Percorre os números do segundo HashMap, comparando com a contagem
    // // do mesmo número no primeiro HashMap. Se a contagem no primeiro HashMap
    // // é menor que a contagem no segundo HashMap, então o número está faltando.
    // for (int num : hash2.keySet()) {
    // int conta = hash2.get(num);

    // if (!hash1.containsKey(num) || hash1.get(num) < conta) {
    // faltandoNumeros.add(num);
    // }
    // }

    // // Ordena a lista de números faltantes em ordem crescente
    // Collections.sort(faltandoNumeros);

    // // Retorna a lista de números faltantes
    // return faltandoNumeros;
    // }

    // public static List<Integer> missingNumbers(List<Integer> arr, List<Integer>
    // brr) {

    // HashMap<Integer, Integer> freq = new HashMap<>();
    // ArrayList<Integer> ausente = new ArrayList<>();

    // // Conta a frequência de cada número no array brr
    // for (int num : brr) {

    // freq.put(num, freq.getOrDefault(num, 0) + 1);
    // }

    // // Verifica quais números do array arr estão faltando em brr
    // for (int num : arr) {

    // if (freq.containsKey(num) && freq.get(num) > 0) {

    // freq.put(num, freq.get(num) - 1);

    // } else {

    // ausente.add(num);
    // }
    // }

    // // Adiciona os números de brr que estão faltando em arr
    // for (int num : freq.keySet()) {

    // if (freq.get(num) > 0) {

    // ausente.add(num);
    // }
    // }

    // // Ordena a lista de números faltando em ordem ascendente
    // Collections.sort(ausente);

    // return ausente;
    // }

}
