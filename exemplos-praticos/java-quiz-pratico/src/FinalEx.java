// public class FinalEx {
    
//     final int X;

//     FinalEx() {

//         X = 10;
//     }

//     public static void main(String[] args) {
        
//         int Z = 0;
//         int Y = 20;

//         FinalEx finalEx = new FinalEx();

//         Z = finalEx.X + Y;

//         System.out.println(Z); // saída: 30

//         // Z = finalEx + Y;
//         // Z = 10 + 20;
//         // Z = 30;
//     }
// }


// class Amostra {

//     final static void digaOla() {

//         System.out.println("Olá mundo!");
//     }
// }

// public class FinalEx extends Amostra{
    

//     public static void main(String[] args) {
        
//         digaOla(); // saída: Olá mundo1
//     }
// }



// class Amostra {
//     void digaOla() {
//         System.out.println("Olá mundo");
//     }
// }

// public class FinalEx {

//     public static void main(String[] args) {
        
//         final Amostra amostra = new Amostra();
//         amostra.digaOla(); // saída: Olá mundo
//     }
// }

// class Amostra {

//     final void diversao() {

//         System.out.println("Amostra.diversao() chamado");
//     }
// }
// public class FinalEx {

//     void diversao() {

//         System.out.println("FinalEx.diversao() chamado");
//     }

//     public static void main(String[] args) {
        
//         Amostra amostra = new Amostra();
//         amostra.diversao(); // saída: Amostra.diversao() chamado
//     }
// }