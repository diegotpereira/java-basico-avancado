import java.util.*;

public class Resultado {

    public static int beautifulPairs(List<Integer> a, List<Integer> b) {

        // Caso a lista "a" tenha apenas 1 elemento, não é possível criar um par
        int n = a.size();

        if(n == 1) return 0;

        // Ordena as duas listas em ordem crescente
        Collections.sort(a);
        Collections.sort(b);

        // Se as listas "a" e "b" são iguais, só é possível criar n-1 pares
        if(a.equals(b)) return n - 1;

        int contar = 0;

        // Verifica se há elementos iguais em "a" e "b" e incrementa o contador
        for (Integer elemento : a) {
            
            for (int i = 0; i < n; i++) {
                
                if (elemento == b.get(i)) {
                    
                    contar += 1;

                    // Remove o elemento da lista "b"
                    b.set(i, 0);

                    // Interrompe a iteração quando encontra um elemento igual
                    break;
                }
            }
        }

        // Se todas as combinações de pares forem bonitas, é possível criar n pares
        if (contar == n) contar--;

        // Retorna o número de pares bonitos
        return contar + 1   ;
    }

    

    // // Este método recebe duas listas de inteiros como parâmetros de entrada e retorna um valor inteiro.
    // public static int beautifulPairs(List<Integer> a, List<Integer> b) {

    //     // Se o tamanho da lista a for 1, então não é possível formar pares bonitos.
    //     if (a.size() == 1) {
            
    //         return 0;   
    //     }

    //     // Inicializa uma variável chamada "saida" com 0.
    //     int saida = 0;

    //     // Itera por cada elemento da lista a.
    //     for (int i = 0; i < a.size(); i++) {
            
    //         // Obtém o elemento atual da lista a.
    //         int tempA = a.get(i);

    //         // Itera por cada elemento da lista b.
    //         for (int j = 0; j < b.size(); j++) {
                
    //             // Se o elemento atual da lista a for igual ao elemento atual da lista b.
    //             if (tempA == b.get(j)) {

    //                 // Incrementa a variável "saida".
    //                 saida++;

    //                 // Define o elemento atual da lista b como 10000.
    //                 b.set(j, 10000);

    //                 // Sai do loop interno.
    //                 break;
    //             }
    //         }
    //     }

    //     // Se o número de pares bonitos for menor que o tamanho da lista a, 
    //     // incrementa "saida" e retorna o resultado.
    //     if (saida < a.size()) {
            
    //         return ++saida;

    //     } else {

    //         // Caso contrário, decrementa "saida" e retorna o resultado.
    //         return --saida;
    //     }
    // }

    // public static int beautifulPairs(List<Integer> a, List<Integer> b) {

    //     // Declaração e inicialização de dois arrays de inteiros com 1001 elementos cada.
    //     int[] a_ = new int[1001];
    //     int[] b_ = new int[1001];

    //     // Loop for que itera sobre os elementos da Lista a e b, incrementando os valores nos arrays a_ e b_.
    //     for (int i = 0; i < a.size(); i++) {
            
    //         a_[a.get(i)]++;
    //         b_[b.get(i)]++;
    //     }

    //     // Declaração e inicialização da variável res com zero.
    //     int res = 0;

    //     // Loop for que itera sobre os elementos dos arrays a_ e b_ comparando-os 
    //     // e incrementando res com o menor valor entre eles.
    //     for (int i = 0; i < 1001; i++) {
            
    //         res += Math.min(a_[i], b_[i]);

    //     }

    //     // Verificação se o valor de res é igual ao tamanho da lista a. Se for, 
    //     // retorna res - 1, caso contrário retorna res + 1.
    //     return res == a.size() ? res -1 : res + 1;
    // }

// Inicializar uma variável conteLindosPares com zero para contabilizar a quantidade de lindos pares encontrados.
// Criar uma cópia da lista a e duas novas listas listaA e listaB para serem modificadas durante o loop.
// Percorrer cada elemento da lista a verificando se ele também existe na lista b. Se existir, incrementa a variável conteLindosPares e remove o elemento das listas listaA e listaB.
// Se ainda houver elementos em ambas as listas após o loop, significa que é possível formar mais um lindo par, então incrementa a variável conteLindosPares.
// Caso contrário, se o número de lindos pares encontrados for igual ao tamanho da lista a, significa que não é possível formar mais nenhum lindo par adicional, então decrementa a variável conteLindosPares.
// Retorna a variável conteLindosPares com o número total de lindos pares encontrados.

    // // Definindo a assinatura do método, que recebe duas listas de inteiros e retorna um inteiro
    // public static int beautifulPairs(List<Integer> a, List<Integer> b) {

    //     // Inicializando a variável que contará a quantidade de lindos pares
    //     int conteLindosPares = 0;

    //     // Criando uma cópia da lista "a" e duas listas novas para serem modificadas durante o loop
    //     // Cópia da lista "a"
    //     List<Integer> tmp = new ArrayList<>(a);
    //     // Nova lista para a lista "a"
    //     List<Integer> listaA = new ArrayList<>(a);
    //     // Nova lista para a lista "b"
    //     List<Integer> listaB = new ArrayList<>(b);

    //     // Loop para verificar se cada elemento da lista "a" tem um correspondente na lista "b"
    //     for (Integer item : tmp) {

    //         // Se a lista "a" contém o item atual e a lista "b" também, então há um lindo par
    //         if (listaA.contains(item) && b.contains(item)) {
                
    //             // Remove o item da lista "a" e "b" e incrementa a variável conteLindosPares
    //             // Os elementos são removidos da lista antes de incrementar a variável conteLindosPares 
    //             // porque o objetivo é garantir que cada elemento da lista a seja verificado apenas uma 
    //             // vez e que cada elemento que forma um lindo par seja removido de ambas as listas.
    //             listaA.remove(item);
    //             listaB.remove(item);
    //             conteLindosPares++;

    //         }
    //     }

    //     // Se ainda restarem elementos em ambas as listas, adiciona mais um lindo par
    //     if (listaA.size()  >= 1 && listaB.size() >= 1) {
            
    //         conteLindosPares++;

    //     // Caso contrário, se o número de lindos pares encontrados for igual ao tamanho da lista "a", 
    //     // decrementa a variável
    //     } else if (conteLindosPares == tmp.size()) {
            
    //         conteLindosPares--;
    //     }

    //     // Retorna o número de lindos pares encontrados
    //     return conteLindosPares;
    // }

    // public static int beautifulPairs(List<Integer> a, List<Integer> b) {
        
    //     List<Integer> listaB = new ArrayList<>(b);

    //     // Inicializa o contador de lindos pares como zero.
    //     int conteLindosPares = 0;

    //     // Percorre a lista 'a'.
    //     for (int i = 0; i < a.size(); i++) {
            
    //         // Verifica se o elemento atual da lista 'a' está contido na lista 'listaB'.
    //         if (listaB.contains(a.get(i))) {

    //             // Verifica se o elemento atual da lista 'a' está contido na lista 'listaB'.
    //             conteLindosPares++;
                
    //             // Remove o elemento da lista 'listaB' para garantir que não seja contado novamente.
    //             listaB.remove(listaB.indexOf(a.get(i)));
    //         }
    //     }

    //     // Se todos os elementos da lista 'a' tiverem formado pares lindos, subtrai 1 do contador.
    //     // Caso contrário, adiciona 1.
    //     conteLindosPares += (conteLindosPares == a.size()) ? -1 : 1;

    //     // Retorna o número de lindos pares.
    //     return conteLindosPares;
    // }
    
}
