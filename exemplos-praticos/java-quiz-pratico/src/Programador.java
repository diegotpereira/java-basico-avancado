public class Programador extends Autor{
    
    public static void escrever() {

        System.out.println("Escrevendo código...");
    }

    public static void main(String[] args) {
        
        Autor a = new Programador();
        a.escrever();
    }
}

class Escritor {

    public static void escrever() {

        System.out.println("Escrevendo...");
    }
}

class Autor extends Escritor {

    public static void escrever() {

        System.out.println("Escrevendo livro");
    }
}

// Qual é a sáida do programa abaixo?

// A) Escrevendo…
// B) Escrevendo livro
// C) Escrevendo código
// D) Compilation fails

// Resposta B. Escrevendo livro