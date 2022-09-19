// // public class Base {

// //     public void Imprimir() {
// //         System.out.println("Base");
// //     }
// // }
// // class Derivada extends Base {

// //     public void Imprimir() {

// //         System.out.println("Derivado");
// //     }
// // }
// // class Main {

// //     public static void Imprima(Base o) {

// //         o.Imprimir();
// //     }

// //     public static void main(String[] args) {

// //         Base x = new Base();
// //         Base y = new Derivada();

// //         Derivada z = new Derivada();

// //         Imprima(x); // Base - Criamos um objeto do tipo Base e chamamos Imprima(). Imprima chama a função print e obtemos a primeira linha.
// //         Imprima(y); // Derivado - atribuir uma referência de clase derivada a uma referência de classe base é permitida em java. Imprimir() se refere ao mesmo objeto por y.
// //         Imprima(z); // Derivado - passamos por referência do tipo Derivada e o método Imprimir() da classe Derivada é chamada novamente.
// //                     // Os tipos não primitivos são sempre atribuídos por referência.
// //     }
// // }

// class Base {

//     Base() {

//         System.out.println("Base");
//     }

//     Base(int n) {
        

//         System.out.println("Base: " + n);
//     }
// }

// class Derivar extends Base {

//     Derivar() {

//         super(10);
//         System.out.println("Derivar:");
//     }

//     Derivar(int n, int m) {

//         super(n);

//         System.out.println("Derivar: " + n + "," + m);
//     }
// }

// class Q6 {

//     public static void main(String[] args) {

//         Derivar D1 = new Derivar(); // Base: 10
//                                     // Derivar:
//         Derivar D2 = new Derivar(40, 50); // Base: 40
//                                                 // Derivar: 40,50
//     }
// }













