import java.util.*;


// Você receberá uma string de entrada que contém apenas caracteres alfabéticos e espaços em branco.

// Seu objetivo é criptografar essa string da seguinte maneira:

// Remova todos os espaços em branco da string de entrada.
// Determine o número de linhas e colunas para uma grade de caracteres.
// Coloque os caracteres da string na grade, lendo da esquerda para a direita e de cima para baixo.
// Concatene os caracteres das colunas para formar a string criptografada.

public class Resultado {

    // public static String encryption(String s) {

    //     // Inicializa uma string vazia para armazenar a saída final
    //     String saida = "";

    //     // Variável temporária para armazenar substrings
    //     String tmp;

    //     // Variável para controlar a posição atual na string de entrada
    //     int lembrete;
        
    //     // Calcula a raiz quadrada do comprimento da string de entrada
    //     double raizQuadradaS = Math.sqrt(s.length());

    //     // Calcula o número de colunas arredondando para cima
    //     int colunas = (int) Math.ceil(raizQuadradaS);

    //     // Calcula o número de linhas arredondando para baixo
    //     int linhas = (int) Math.floor(raizQuadradaS);
        
    //     // Verifica se o número calculado de colunas vezes o número 
    //     // de linhas é menor que o comprimento da string
    //     if (colunas * linhas < s.length()) {

    //         // Se for menor, incrementa o número de linhas
    //         linhas++;
    //     }

    //     // Inicializa uma lista para armazenar as substrings resultantes
    //     List<String> fimLista = new ArrayList<>();

    //     // Percorre a string de entrada
    //     for (int i = 0; i < s.length(); i++) {
            
    //         // Calcula o índice da coluna atual
    //         lembrete = i % colunas;

    //         // Verifica se a lista de substrings já atingiu o número de colunas
    //         if (fimLista.size() == colunas) {
                
    //             // Se já atingiu, obtém a substring atual
    //             tmp = fimLista.get(lembrete);

    //             // Concatena o caractere atual à substring
    //             tmp = tmp.concat(String.valueOf(s.charAt(i)));

    //             // Atualiza a substring na lista
    //             fimLista.set(lembrete, tmp);

    //         } else {

    //             // Caso contrário, adiciona uma nova substring à lista
    //             fimLista.add(lembrete, String.valueOf(s.charAt(i)));
    //         }
    //     }

    //     // Concatena as substrings com espaços em branco para formar a saída final
    //     for (String st : fimLista) {
            
    //         saida += st + " ";
    //     }

    //     // Remove espaços em branco extras no final da saída e retorna a saída final
    //     return saida.trim();
    // }

    // public static String encryption(String s) {

    //     // Variável para armazenar o texto cifrado
    //     String tmp = "";

    //     // Comprimento da string de entrada
    //     int tamanhoString = s.length();

    //     // Cálculo da raiz quadrada do comprimento da string
    //     double raizQuadradaString = Math.sqrt(tamanhoString);

    //     // Cálculo do número de linhas (arredondando para baixo) 
    //     // e colunas (arredondando para cima)
    //     double linhas = Math.floor(raizQuadradaString);
    //     double colunas = Math.ceil(raizQuadradaString);

    //     // Se o produto de linhas e colunas for menor que o comprimento, 
    //     // incrementa linhas em 1
    //     if (linhas * colunas < tamanhoString) {
            
    //         linhas = linhas + 1;
    //     }

    //     // Loop para distribuir os caracteres da string nas colunas
    //     for (int i = 0; i < colunas; i++) {

    //         int contador = i;
            
    //         // Enquanto o contador estiver dentro dos limites do comprimento da string
    //         while (contador < tamanhoString) {
                
    //             // Adiciona o caractere atual à variável tmp
    //             tmp += s.charAt(contador);

    //             // Move o contador para a próxima coluna
    //             contador = contador + (int) colunas;
    //         }

    //         // Adiciona um espaço para separar as colunas
    //         tmp += " ";
    //     }
        
    //     // Retorna o texto cifrado, removendo espaços em branco extras
    //     return tmp.trim();
    // }

    // public static String encryption(String s) {

    //     // Remove espaços em branco da string de entrada
    //     String semEspacos = s.replaceAll("", "");

    //     // Obtém o tamanho da string após a remoção de espaços em branco
    //     int tamanhoString = semEspacos.length();

    //     // Calcula a raiz quadrada do tamanho da string
    //     double raizQuadradaString = Math.sqrt(tamanhoString);

    //     // Calcula o número de linhas arredondando para baixo e colunas arredondando para cima
    //     int linhas = (int) Math.floor(raizQuadradaString);
    //     int colunas = (int) Math.ceil(raizQuadradaString);

    //     // Se o produto de linhas e colunas for menor que o tamanho da string, 
    //     // incrementa o número de linhas
    //     if (linhas * colunas < tamanhoString) {
            
    //         linhas++;
    //     }

    //     // Cria uma matriz para representar a grade de caracteres
    //     char[][] grade = new char[linhas][colunas];

    //     // Preenche a matriz com os caracteres da string
    //     for (int l = 0; l < tamanhoString; l++) {
            
    //         int i = l / colunas;
    //         int j = l % colunas;

    //         grade[i][j] = semEspacos.charAt(l);
    //     }

    //     // Constrói o texto cifrado a partir da matriz
    //     StringBuilder st = new StringBuilder();

    //     for (int j = 0; j < colunas; j++) {
            
    //         for (int i = 0; i < linhas; i++) {
                
    //             // Verifica se o caractere na posição (i, j) não é nulo e o adiciona ao texto cifrado
    //             if (grade[i][j] != 0) {
                    
    //                 st.append(grade[i][j]);
    //             }
    //         }

    //         // Adiciona um espaço para separar as colunas
    //         st.append(" ");
    //     }

    //     // Retorna o texto cifrado, removendo espaços em branco extras
    //     return st.toString().trim();
    // }

    // public static String encryption(String s) {

    //     // Calcula a raiz quadrada do tamanho da string de entrada
    //     double raizQuadradaS = Math.sqrt(s.length());

    //      // Calcula o número de colunas arredondando para cima
    //     int colunas = (int) Math.ceil(raizQuadradaS);

    //     // Inicializa a string de resultado
    //     String res = " ";

    //     // Loop pelas colunas
    //     for (int i = 0; i < colunas; i++) {
            
    //         // Inicializa o índice de caractere j
    //         int  j = 0;

    //         // Enquanto a posição atual (i + j) estiver dentro dos limites da string
    //         while (i + j < s.length()) {
                
    //             // Adiciona o caractere correspondente à posição (i + j) ao resultado
    //             res += s.charAt(i + j);

    //             // Avança para a próxima linha, movendo-se verticalmente com base no número de colunas
    //             j += colunas;
    //         }

    //         // Adiciona um espaço em branco para separar as colunas
    //         res += " ";
    //     }

    //     // Retorna o resultado, removendo espaços em branco extras no início e no final
    //     return res.trim();
    // }
    
    // public static String encryption(String s) {

    //     // Cria um HashMap para armazenar as strings cifradas com base nas colunas.
    //     HashMap<Integer, String> dado = new HashMap<>();

    //     // Calcula o comprimento da string de entrada.
    //     int indice = s.length();

    //     // Calcula o número de colunas arredondando para cima usando a raiz quadrada do comprimento da string.
    //     int coluna = (int) Math.ceil(Math.sqrt(indice));

    //     // Percorre a string de entrada para cifrá-la.
    //     for (int i = 0; i < indice; i++) {
            
    //         // Calcula a coluna atual com base na posição atual.
    //         int contador = i % coluna;

    //         // Obtém o caractere atual da string de entrada.
    //         String cip = String.valueOf(s.charAt(i));

    //         // Verifica se já existe uma entrada no HashMap para a coluna atual.
    //         if (dado.containsKey(contador)) {
                
    //             // Se sim, concatena o caractere atual à entrada existente.
    //             dado.put(contador, dado.get(contador) + cip);

    //         } else {

    //             // Caso contrário, cria uma nova entrada no HashMap.
    //             dado.put(contador, cip);
    //         }
    //     }

    //     // Cria um StringBuilder para construir a string de resultado de maneira eficiente.
    //     StringBuilder res = new StringBuilder();

    //     // Percorre as entradas do HashMap e constrói a string de resultado.
    //     for (String i : dado.values()) {

    //         res.append(i).append(" ");
    //     }

    //     // Retorna a string de resultado após remover espaços em branco extras no final.
    //     return res.toString().trim();
    // }

    public static String encryption(String s) {

        // Remove espaços em branco da string de entrada (parece não fazer nada).
        // s = s.replaceAll(" ", " ");

        // Calcula o número de colunas arredondando para cima com base na raiz quadrada do comprimento da string.
        int sqr = (int) Math.ceil(Math.sqrt(s.length()));

        // Cria um array de strings para armazenar os resultados das colunas.
        String[] resultado = new String[sqr];

        // Percorre a string de entrada e distribui os caracteres nas colunas.
        for (int i = 0; i < sqr; i++) {
            
            for (int j = i; j < s.length(); j = j + sqr) {

                // Obtém o caractere da posição atual.
                char c = s.charAt(j);

                // Adiciona o caractere à coluna correspondente no resultado.
                resultado[i] = j >= sqr ? resultado[i] + c : "" + c;
            }
        }

        // Junta as colunas em uma única string com espaços entre elas e a retorna.
        return String.join(" ", resultado);
    }
}
