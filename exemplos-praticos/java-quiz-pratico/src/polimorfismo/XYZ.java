package polimorfismo;

// Qual é a diferença entre polimorfismo em tempo de compilação e polimorfismo em tempo de execução?

// Polimorfismo de tempo de execução:

// Também é conhecido como Despacho de Método Dinâmico.
//  O polimorfismo dinâmico é um processo no qual uma chamada para um método substituído 
// é resolvida em tempo de execução, por isso é chamado de polimorfismo de tempo de execução.

class ABC {

    public void meuMetodo() {

        System.out.println("Método substituído");
    }
}

public class XYZ extends ABC{
    
    public void meuMetodo() {

        System.out.println("Método de substituição");
    }

    public static void main(String[] args) {
        
        ABC obj = new XYZ();
        obj.meuMetodo();
    }
}

// saída: Método de substituição
