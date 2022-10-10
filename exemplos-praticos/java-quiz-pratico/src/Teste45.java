// public class Teste45 {
    
//     // Qual é a saída do seguinte programa java?

//     private static int temp1 = 1;
//     private static int temp2 = 2;
//     public int temp3 = 3;
//     public int temp4 = 4;

//     public static class Interno {

//         private static int temp5 = 5;

//         private static int buscarSoma() {

//             return (temp1 + temp2 + temp3 + temp4 + temp5);
//         }
//     }
    
//     public static void main(String[] args) {
        
//         Teste45.Interno obj = new Teste45.Interno();

//         System.out.println(obj.buscarSoma());
//     }

//     // a) 15
//     // b) 9
//     // c) 5
//     // d) Compilation Error

//     // Resposta: D. Erro de compilação - classes internas estáticas não podem acessar campos não estáticos da classe
// }
