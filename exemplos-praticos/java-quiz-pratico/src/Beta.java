public class Beta extends Alfa{
    
    public Beta() {

        System.out.print("Beta ");
    }

    void ir() {

        tipo = "b";

        System.out.print(this.tipo + super.tipo);
    }

    public static void main(String[] args) {
        
        new Beta().ir();
    }
}

// Qual é a saída?

// A) Alfa Beta bb
// B) Alfa Beta ab
// C) Beta Alfa bb
// D) Beta Alfa ab

// Resposta A. Alfa Beta bb - A instrução new Beta().ir() é executada em duas fases.
                           // Na primeira fase , o construtor da classe Beta é chamado. 
                           // Não há nenhum membro de instância presente na classe Beta . 
                           // Então agora o construtor da classe Beta é executado.
                           // Como a classe Beta estende a classe Alfa,
                           // então a chamada vai para o construtor da classe Alfa como a primeira instrução por padrão (Colocada pelo compilador) é super() no construtor da classe Beta.
                           // Agora, como uma variável de instância (tipo) está presente na classe Alfa, ela obterá memória e agora Alfa construtor de classe é executado,
                           // então chame return para a próxima instrução do construtor de classe Beta.
                           // Então alfa beta é impresso.
                           // Na segunda fase, o método ir() é chamado neste objeto.
                           // Como existe apenas uma variável (tipo) no objeto cujo valor é a.
                           // Portanto, será alterado para b e impresso duas vezes. A palavra-chave super aqui é inútil.

class Alfa {

    public String tipo = "a";

    public Alfa() {

        System.out.print("Alfa ");
    }
}
