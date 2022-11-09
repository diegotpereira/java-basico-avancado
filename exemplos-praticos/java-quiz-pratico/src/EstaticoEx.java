// public class EstaticoEx {

//     // Qual é a saída do programa abaixo?
    
//     public static void main(String[] args) {
        
//         Amostra amostra = new Amostra();
//         Amostra amostra2 = new Amostra();
//         Amostra amostra3 = new Amostra();

//         Amostra.ObjetoContar(); // saída: 3
//     }
    

// }

// class Amostra {

//     private static int contar;

//     Amostra() {

//         contar++;
//     }

//     static void ObjetoContar() {

//         System.out.println(contar);
//     }
// }
public class EstaticoEx {

    // Qual é a saída do programa abaixo?
    
    public static void main(String[] args) {
        
        Amostra amostra = new Amostra();
        Amostra amostra2 = new Amostra();
        Amostra amostra3 = new Amostra();

        amostra.ObjetoContar(); // saída: 3
        amostra2.ObjetoContar(); // saída: 3
        amostra3.ObjetoContar(); // saída: 3
    }
    

}

class Amostra {

    private static int contar;

    Amostra() {

        contar++;
    }

    static void ObjetoContar() {

        System.out.println(contar);
    }
}
