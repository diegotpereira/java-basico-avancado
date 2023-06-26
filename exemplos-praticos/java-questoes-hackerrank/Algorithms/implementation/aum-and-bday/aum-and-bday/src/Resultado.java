// A tarefa do problema "Taum and B'day" do HackerRank é determinar 
// o custo mínimo necessário para comprar presentes de aniversário para 
// um número específico de amigos. A história do problema é a seguinte:

// Taum está planejando celebrar o aniversário de sua amiga Diksha, e quer 
// comprar presentes para ela e seus amigos. Há duas opções de presentes: pretos e brancos. 
// O preço de cada presente preto é "b" unidades e o preço de cada presente branco é "w" unidades.

// Além disso, Taum pode converter presentes de uma cor para outra, pagando uma taxa de conversão 
// "c" unidades. Portanto, se ele decidir comprar presentes pretos e convertê-los em 
// brancos (ou vice-versa), ele terá que pagar o custo do presente preto/branco, além da taxa de conversão.

// A tarefa é determinar o custo mínimo necessário para comprar presentes para todos os amigos de Diksha


public class Resultado {

    public static long taumBday(int numeroPresentesPretos, int numeroPresentesBrancos, int custoPresentePreto,
            int custoPresenteBranco, int custoParaConverter) {

                if (custoPresenteBranco + custoParaConverter < cusi) {
                    
                }
        return 0;
    }

    // public static long taumBday(int numeroPresentesPretos, int numeroPresentesBrancos, int custoPresentePreto,
    //         int custoPresenteBranco, int custoParaConverter) {


    //     // Retorna o menor valor entre o custo do presente preto e o custo do presente branco mais a taxa de conversão,
    //     // multiplicado pelo número de presentes pretos, somado ao menor valor entre o custo do presente branco e o custo do presente preto mais a taxa de conversão,
    //     // multiplicado pelo número de presentes brancos.
    //     return Math.min(custoPresentePreto, custoPresenteBranco + custoParaConverter) * numeroPresentesPretos + 
    //     Math.min(custoPresenteBranco, custoPresentePreto + custoParaConverter) * numeroPresentesBrancos;
    // }
    

    // // Calcula o custo mínimo para comprar presentes
    // public static long taumBday(int b, int w, int bc, int wc, int z) {
        
    //     // Encontra o menor custo de conversão para comprar presentes brancos
    //     long minBranco = Math.min(bc, (wc + z));

    //     // Encontra o menor custo de conversão para comprar presentes pretos
    //     long minPreto = Math.min(wc, (bc + z));
        
    //     // Retorna o custo mínimo total somando o custo dos presentes brancos e pretos
    //     return (b * minBranco) + (w * minPreto);

    // }
}
