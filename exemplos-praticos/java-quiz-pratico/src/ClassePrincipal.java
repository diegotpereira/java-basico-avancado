// // public class ClassePrincipal {
    
// //     public static void main(String[] args) {
        

// //         Acesso obj1 = new Acesso();
// //         Acesso obj2 = new Acesso();

// //         obj1.x = 0;
// //         obj1.incrementar();
// //         obj2.incrementar();


// //         System.out.print(obj1.x + obj2.x); // saída: 4
// //         System.out.println();
// //     }

// // }

// // class Acesso {

// //     static int x;

// //     void incrementar() {

// //         ++x;
        
// //     }
// // }


// // Encontre a saída do seguinte programa. 

// class ClassePrincipal {

//     public static void main(String[] args) {
        
//         System.out.print(func()); // saida incorreta: The output of this code will not generate due to compilation error.
//                                   // saída depois da correção: 100
//         System.out.println();
//     }
//     // int func() {

//     //     int teste = 100;

//     //     return teste;S
//     // }

//     // O correto seria
//     static int func() {

//         int teste = 100;

//         return teste;
//     }
// }


// // Qual é a saída do código a seguir?

// class MinhaClasse {

//     int largura;
//     int altura;
//     int comprimento;
// }

// public class ClassePrincipal {

//     public static void main(String[] args) {
        
//         MinhaClasse obj = new MinhaClasse();

//         obj.largura = 5;
//         obj.altura = 2;
//         obj.comprimento = 5;

//         int y = obj.largura * obj.altura * obj.comprimento;

//         System.out.println(y); // saída: C. 50
//     }
// }

// // A) 10
// // B) 5
// // C) 50
// // D) 25


// // Qual é a saída do código a seguir?

// class MinhaClasse {

//     int largura;
//     int altura;
//     int comprimento;
// }

// public class ClassePrincipal {

//     public static void main(String[] args) {
        
//         MinhaClasse objA = new MinhaClasse();
//         MinhaClasse objB = new MinhaClasse();

//         objA.altura = 1;
//         objA.comprimento = 2;
//         objA.largura = 1;

//         objB = objA;

//         System.out.println(objB.altura); // saída: C. 1 - 
//     }
// }

// // A) Runtime error
// // B) Compilation error
// // C) 1
// // D) 2