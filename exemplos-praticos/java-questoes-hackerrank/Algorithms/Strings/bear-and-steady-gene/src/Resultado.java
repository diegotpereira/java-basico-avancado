import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// A tarefa do problema "Bear and Steady Gene" do 
// site HackerRank é encontrar o menor tamanho da 
// substring em uma string dada que precisa ser 
// substituída para que a frequência de cada caractere 
// da string fique abaixo de um determinado valor. Mais 
// especificamente, dada uma string s de comprimento n, 
// a tarefa é encontrar o menor comprimento de uma substring 
// de s que precisa ser substituída para que cada caractere 
// da string apareça em não mais que n/4 vezes.

// Este é um problema de algoritmo que envolve a aplicação 
// de técnicas de manipulação de string e algoritmos de 
// busca em subcadeias. Ele é classificado como um problema 
// de dificuldade avançada no HackerRank.

// No caso do algoritmo, as letras A, C, G e T são usadas para 
// representar as quatro bases nitrogenadas encontradas no DNA: 
// adenina (A), citosina (C), guanina (G) e timina (T). A finalidade 
// do algoritmo é encontrar o menor comprimento de uma substring da 
// sequência de DNA que precisa ser substituída para que a frequência 
// de cada uma das quatro bases nitrogenadas seja pelo menos n/4, 
// onde n é o comprimento da sequência de DNA. As letras A, C, G e T 
// são usadas para contar a frequência de cada base nitrogenada na sequência 
// de DNA e determinar se uma substituição é necessária.

public class Resultado {

    public static int steadyGene(String gene) {

        // Cria um mapa para armazenar as frequências de cada letra (A, C, G, T)
        Map<Character, Integer> freqs = new HashMap<>();

        // Inicializa as frequências de todas as letras com 0
        freqs.put('A', 0);
        freqs.put('C', 0);
        freqs.put('G', 0);
        freqs.put('T', 0);

        // Percorre a string e atualiza as frequências de cada letra
        for (char ch : gene.toCharArray()) {

            freqs.put(ch, freqs.get(ch) + 1);
        }

        // Inicializa as variáveis de controle do loop
        int i = 0, j = 0, min = Integer.MAX_VALUE, l4 = gene.length() / 4;

        // Loop para percorrer a string e encontrar a menor substring que precisa ser
        // substituída
        while (i < gene.length() && j < gene.length()) {

            // Verifica se alguma letra tem uma frequência maior do que um quarto do
            // comprimento da string
            if (Arrays.asList('A', 'C', 'G', 'T').stream().anyMatch(ch -> freqs.get(ch) > l4)) {

                // Se sim, diminui a frequência da letra na posição j e incrementa j
                freqs.put(gene.charAt(j), freqs.get(gene.charAt(j)) - 1);
                j++;

            } else {

                // Se não, atualiza a menor substring encontrada e incrementa i
                min = Math.min(min, j - i);
                freqs.put(gene.charAt(i), freqs.get(gene.charAt(i)) + 1);
                i++;

            }
        }

        // Retorna o menor número de caracteres que precisam ser substituídos
        return min;
    }

    // private static final int A = 0;
    // private static final int C = 'C' - 'A';
    // private static final int T = 'T' - 'A';
    // private static final int G = 'G' - 'A';

    // public static int steadyGene(String gene) {

    // // Matriz para armazenar as frequências das letras
    // int[][] arr = new int[2][26];

    // // Frequência máxima de cada letra
    // int max = gene.length() / 4;

    // // Preenche arr[0] com a frequência de cada caractere em "gene
    // for (int i = 0; i < gene.length(); i++)

    // // Conta a frequência de cada letra
    // arr[0][gene.charAt(i) - 'A']++;

    // if (arr[0][A] == max && arr[0][C] == max && arr[0][T] == max && arr[0][G] ==
    // max)

    // // Caso especial em que a sequência já é "steady gene"
    // return 0;

    // // Variável para armazenar o resultado final
    // int res = Integer.MAX_VALUE;

    // for (int i = 0, j = 0; j < gene.length() && i <= j;) {

    // if (arr[1][A] < arr[0][A] - max || arr[1][C] < arr[0][C] - max || arr[1][T] <
    // arr[0][T] - max
    // || arr[1][G] < arr[0][G] - max)

    // // Adiciona uma letra à sequência atual
    // arr[1][gene.charAt(j++) - 'A']++;

    // else {

    // // Atualiza o resultado mínimo
    // res = Math.min(res, j - i);

    // // Remove a letra mais à esquerda da sequência
    // arr[1][gene.charAt(i++) - 'A']--;
    // }

    // }

    // // Retorna o resultado mínimo encontrado
    // return res;
    // }

    // public static int steadyGene(String gene) {

    // // Mapa que armazena o número de ocorrências de cada caractere da String gene
    // Map<Character, Integer> mapa = new HashMap<>();

    // // Mapa que armazena a quantidade que cada caractere deve ter
    // Map<Character, Integer> rotuloMapa = new HashMap<>();

    // // Loop que percorre a String gene e preenche o mapa com as ocorrências de
    // cada
    // // caractere
    // for (char c : gene.toCharArray()) {

    // mapa.put(c, mapa.getOrDefault(c, 0) + 1);
    // }

    // // Define a quantidade de cada caractere que a String gene deve ter (é um
    // quarto
    // // do tamanho da String)
    // int rotulo = gene.length() / 4;

    // // Loop que percorre o mapa e armazena a diferença entre a quantidade atual e
    // a
    // // quantidade que o caractere deve ter
    // // Se a diferença for negativa, adiciona a quantidade ao rotuloMapa
    // for (Map.Entry<Character, Integer> entre : mapa.entrySet()) {

    // entre.setValue(rotulo - entre.getValue());

    // if (entre.getValue() < 0) {

    // rotuloMapa.put(entre.getKey(), 0 - entre.getValue());
    // }
    // }

    // // Define o tamanho do rotuloMapa
    // int tTamanho = rotuloMapa.entrySet().size();

    // // Define o índice inicial como zero
    // int l = 0;

    // // Define o resultado inicial como o maior inteiro possível
    // int res = Integer.MAX_VALUE;

    // // Loop que percorre a String gene
    // for (int i = 0; i < gene.length(); i++) {

    // // Armazena o caractere atual da String gene
    // char atual = gene.charAt(i);

    // // Se o rotuloMapa não contém o caractere atual, continua o loop
    // if (!rotuloMapa.containsKey(atual)) {

    // continue;

    // } else {

    // // Armazena a quantidade do caractere atual
    // int cnt = rotuloMapa.get(atual);

    // // Se a quantidade é igual a um, diminui o tamanho do rotuloMapa
    // if (cnt == 1)

    // tTamanho--;

    // // Decrementa a quantidade do caractere atual no rotuloMapa
    // rotuloMapa.put(atual, cnt - 1);
    // }

    // // Loop que percorre a String gene enquanto o tamanho do rotuloMapa é igual a
    // // zero
    // while (tTamanho == 0) {

    // // Armazena o caractere atual da String gene na posição l
    // char lChar = gene.charAt(l);

    // // Atualiza o resultado com a menor distância entre i e l
    // res = Math.min(res, i - l + 1);

    // // Se o rotuloMapa não contém o caractere atual, incrementa l e continua o
    // loop
    // if (!rotuloMapa.containsKey(lChar)) {

    // l++;
    // continue;

    // } else {

    // // Armazena a quantidade do caractere atual
    // int cnt = rotuloMapa.get(lChar);

    // // Se a quantidade é igual a zero, incrementa o tamanho do rotuloMapa
    // if (cnt == 0) {

    // tTamanho++;
    // }

    // // Incrementa a quantidade do caractere atual no rotuloMapa
    // rotuloMapa.put(lChar, cnt + 1);
    // }

    // l++;
    // }
    // }
    // // se res for igual ao inteiro maximo valor recebe zero
    // // se não res recebe res;
    // return res == Integer.MAX_VALUE ? 0 : res;
    // }

}
