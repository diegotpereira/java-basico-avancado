import java.util.*;

public class Resultado {

    // public static long journeyToMoon(int numeroAstronautas, List<List<Integer>> astronauta) {
        
    //     // Inicializa um mapa para armazenar os astronautas e seus países associados
    //     // Mapa para associar cada astronauta ao seu país
    //     Map<Integer, Integer> paises = new HashMap<>();

    //     // Inicializar cada astronauta com o próprio país
    //     for (int i = 0; i < numeroAstronautas; i++) {
            
    //         paises.put(i, i);
    //     }

    //     // Mesclar os países com base nos pares fornecidos
    //     for (List<Integer> pares : astronauta) {
            
    //         int a = pares.get(0);
    //         int b = pares.get(1);

    //         mesclarPaises(paises, a, b);
    //     }

    //     // Conta o tamanho de cada componente conectado
    //     Map<Integer, Integer> tamanhos = new HashMap<>();

    //     for (int i = 0; i < numeroAstronautas; i++) {
            
    //         int c = encontrarPais(paises, i);

    //         tamanhos.put(c, tamanhos.getOrDefault(c, 0) + 1);
    //     }

    //     // Calcula o número total de pares
    //     long totalPares = 0;
    //     long somando = 0;

    //     for (int tamanho : tamanhos.values()) {
            
    //         totalPares += somando * tamanho;
    //         somando += tamanho;
    //     }

    //     return totalPares;
    // }

    // // Mesclar os países dos astronautas fornecidos
    // private static void mesclarPaises(Map<Integer, Integer> paises, int astronauta1, int astronauta2) {

    //     int pais1 = encontrarPais(paises, astronauta1);
    //     int pais2 = encontrarPais(paises, astronauta2);

    //     paises.put(pais2, pais1);
    // }

    // // Encontra o país do astronauta dado
    // private static int encontrarPais(Map<Integer, Integer> paises, int astronauta) {


    //     if (paises.get(astronauta) == astronauta) {
            
    //         return astronauta;

    //     } else {

    //         return encontrarPais(paises, paises.get(astronauta));
    //     }
    // }

    public static long journeyToMoon(int numeroAstronautas, List<List<Integer>> astronauta) {

        // Array para rastrear os pais de cada astronauta
        int[] pai = new int[numeroAstronautas];

        // Array para rastrear o número de astronautas em cada grupo
        long[] num = new long[numeroAstronautas];

        // Inicializar os arrays pai e num
        for (int i = 0; i < pai.length; i++) {
            
            pai[i] = i;
            num[i] = 1;
        }

        // Percorrer a lista de pares de astronautas
        for (List<Integer> astr : astronauta) {
            
            int p1 = encontrarPar(astr.get(0), pai);
            int p2 = encontrarPar(astr.get(1), pai);

            // Realizar a união dos grupos se necessário
            if (p1 != p2) {
                
                uniao(p1, p2, pai, num);
            }
        }

        long total = 0;
        long numAnterior = -1;

        // Calcular o número total de pares de astronautas de diferentes países
        for (int i = 0; i < pai.length; i++) {
            
            if (i == pai[i]) {
                
                if (numAnterior == -1) 
                    
                    numAnterior = num[i];

                else {

                    total += numAnterior * num[i];
                    numAnterior += num[i];
                }
            }   
        }

        return total;
    }

    // Função para encontrar o pai de um grupo
    static int encontrarPar(int p, int[] pai) {

        if (p == pai[p]) return p;

        return pai[p] = encontrarPar(pai[p], pai);
    }

    // Função para unir dois grupos
    static void uniao(int p1, int p2, int[] pai, long[] num) {

        if (num[p1] <= num[p2]) {
            
            pai[p1] = p2;
            num[p2] += num[p1];

        } else {

            pai[p2] = p1;
            num[p1] += num[p2];
        }
    }
    
}
