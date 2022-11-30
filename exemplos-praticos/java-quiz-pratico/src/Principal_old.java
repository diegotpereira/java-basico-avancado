//  class Base extends Exception{}
//  class Derivada extends Base {}

// public class Principal {
 
//     try {
//         throw new Derivada();

//     } catch (Base b) {
//         System.out.println("");
//     } catch(Derivada d) {
//         System.out.println("");
//     }
// }


// // A. Exceção de classe base capturada
// // B. Exceção de classe derivada capturada
// // C. Erro do compilador porque derivado não pode ser lançado
// // D. Erro do compilador porque a exceção da classe base é capturada antes da classe derivada

// // Resposta: D. Erro do compilador porque a exceção da classe base é capturada antes da classe derivada


// public class Principal {

//     private int a;

//     public Principal() {

//     }
//     public Principal(int temp) {

//         a = - 10;
//     }

//     public static void main(String[] args) {
        
//         Principal obj = new Principal();

//         System.out.println(obj.a);
//     }

//     // (A) -10
//     // (B) Undefined
//     // (C) Compilation Error
//     // (D) 0
// }


// public class Principal {

//     private int a;

//     public Principal() {

//         a = -10;
//     }

//     public static void main(String[] args) {
        
//         Principal obj = new Principal();

//         System.out.println(obj.a);
//     }

//     // (A) 0
//     // (B) Compilation Error
//     // (C) -10
//     // (D) Garbage Value

//     // Resposta: C. -10
// }


// // Qual é a saída do programa abaixo?

// public class Principal {

//     public static int soma(int a, int b) {

//         if(a + b > 1)

//            return 0;

//         System.out.println(a + b);

//         return a + b;
//     }

//     public static void main(String[] args) {
        
//         System.out.println(soma(1, soma(0, 1 ))); // saída D. 10
//     }

//     // (A) 12
//     // (B) 01
//     // (C) 11
//     // (D) 10
// }

// Qual é a saída do programa abaixo?
