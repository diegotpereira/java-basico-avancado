import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


// O problema pede que você encontre a quantidade mínima 
// de movimentos necessários para resolver um quebra-cabeça 
// e Torres de Hanói com torres diferentes.

// As regras básicas das Torres de Hanói são:

// Você tem três hastes (A, B e C) e vários discos de diferentes tamanhos.
// Os discos estão inicialmente empilhados em ordem decrescente de tamanho em uma haste (por exemplo, haste A).
// O objetivo é mover todos os discos para outra haste (por exemplo, haste C), mantendo a ordem decrescente de tamanho.
// Você pode mover um único disco de cada vez de uma haste para outra.
// Um disco maior não pode ser colocado sobre um disco menor.

public class Resultado {

    // Este método recebe uma lista de postes e resolve o problema de Hanoi.
    public static int hanoi(List<Integer> postagens) {

        int tamanhoArray = postagens.size();
        int comecar = 0;

        // Itera através dos discos e seus postes iniciais.
        for (int i = 1; i <= tamanhoArray; ++i) {
            
            // Obtém o poste do disco atual.
            int caminho = postagens.get(i - 1) - 1;

            // Realiza o movimento do disco.
            comecar = mover(comecar, caminho, i);

        }

        // Resolve o problema com os discos e o estado inicial.
        return resolver(tamanhoArray, comecar);
    }

    // Move um disco para um novo poste e atualiza o estado.
    private static int mover(int estado, int caminho, int disco) {

        // estado: Isso representa o estado atual do quebra-cabeça de Torres de Hanoi, 
        // que é um número inteiro. Cada bit desse número é usado para representar a 
        // posição de um disco em um dos quatro postes.

        // caminho: Representa o novo poste para onde o disco será movido. Este 
        // valor é um número inteiro que varia de 0 a 3, onde 0 representa o 
        // primeiro poste e 3 representa o último poste.

        // disco: Indica qual disco está sendo movido. Discos são numerados de 1 a N, 
        // onde N é o número total de discos no quebra-cabeça.
        return (estado & ~(3 << 2 * (disco - 1))) | caminho << 2 * (disco - 1);
        
    }

    // Resolve o problema de Hanoi a partir do estado inicial.
    private static int resolver(int tamanhoArray, int comecar) {
      
        // O estado de vitória, onde o quebra-cabeça está resolvido.
        final int vencer = 0;

        // Se o quebra-cabeça já estiver resolvido no início, a resposta é 0 passos.
        if (comecar == vencer) {
            
            return 0;
        }

        // Inicializa uma fila para a busca em largura.
        LinkedList<Integer> bfs = new LinkedList<>();
        bfs.addLast(comecar);

        // Inicializa um array para armazenar a profundidade de cada estado.
        List<Integer> profundidade = Arrays.asList(new Integer[1 << 2 * tamanhoArray]);

        // Define a profundidade do estado inicial como 0.
        profundidade.set(comecar, 0);

        // Início do loop principal para busca em largura.
        while (true) {
            
            // Obtém o primeiro estado na fila.
            int par = bfs.getFirst();

            // Remove o estado da fila.
            bfs.removeFirst();

            // Um array para armazenar as informações sobre os discos em cada poste.
            int[] d = new int[4];

            // Obtém informações sobre os discos em cada poste.
            for (int i = 0; i < 4; ++i) {
                
                d[i] = getTamanho(tamanhoArray, par, i);
            }

            for (int de = 0; de < 4; ++de) {
                
                if (d[de] == tamanhoArray + 1) {
                    
                    // Se não houver disco no poste "de", passe para o próximo poste.
                    continue;
                }

                for (int para = 0; para < 4; ++para) {
                    
                    if (d[para] > d[de]) {
                        
                        // Move um disco do poste "de" para o poste "para".
                        int ch = mover(par, para, d[de]);

                        if (ch == vencer) {
                            
                            // Se o quebra-cabeça estiver resolvido, retorne a profundidade + 1.
                            return 1 + profundidade.get(par);
                        }

                        if (profundidade.get(ch) == null && ch != comecar) {
                            
                            // Atualiza a profundidade do novo estado.
                            profundidade.set(ch, 1 + profundidade.get(par));

                            // Adiciona o novo estado à fila para posterior exploração.
                            bfs.addLast(ch);
                        }
                    }

                }
            }
        }
        // return 0;
    }
    
    private static int getTamanho(int tamanhoArray, int estado, int i) {

        int proximo = tamanhoArray + 1;

        for (int j = tamanhoArray; j != 0; --j) {
            
            int r = 3 & estado >> 2 * (j - 1);

            if (r == i) {
                
                proximo = j;
            }
        }
        return proximo;
    }
}
