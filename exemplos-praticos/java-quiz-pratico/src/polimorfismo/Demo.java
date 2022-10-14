package polimorfismo;


// Qual é a diferença entre polimorfismo em tempo de compilação e polimorfismo em tempo de execução?

// Polimorfismo Estático:

// A sobrecarga de métodos é uma das maneiras pelas quais o java suporta polimorfismo estático. 
// Aqui temos três definições do mesmo método add() que o método add seria chamado é determinado 
// pela lista de parâmetros em tempo de compilação. Essa é a razão pela qual isso também é conhecido 
// como polimorfismo em tempo de compilação

class SimplesCalculadora {
    
    int add(int a, int b) {

        return a + b;
    }
    
    int add(int a, int b, int c) {

        return a + b + c;
    }

    int add(int a, int b, int c, int d) {

        return a + b + c + d;
    }
}

public class Demo {

    public static void main(String[] args) {

        SimplesCalculadora obj = new SimplesCalculadora();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(10, 20, 30, 40));
    }
}
