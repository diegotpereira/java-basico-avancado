// public class MeuPrimeiro {
    
//     public static void main(String[] args) {
        
//         MeuPrimeiro obj = new MeuPrimeiro(n);
//     }
//     static int a = 10;
//     static int n;
//     int b = 5;
//     int c;

//     public MeuPrimeiro(int m) {

//         System.out.println(a + "," + b + "," + c + "," + n + "," + m);
//     }

//     // Bloco de instância 
//     {
//         b =  30;
//         n = 20;
//     }

//     // Bloco estático
//     static {

//         a = 60;
//     }

//     // A. 10, 5, 0, 20, 0
//     // B. 10, 30, 20
//     // C. 60, 5, 0, 20
//     // D. 60, 30, 0, 20, 0

//     // Resposta: D. 60, 30, 0, 20, 0 - No código acima, existem dois valores da variável a, ou seja, 10 e 60.
//                                     // E dois valores da variável b, ou seja, 5 e 30.
//                                     // Ordem de execução é bloco estático execute primeiro
//                                     // 2° depois o bloco de instância e depois o construtor.
//                                     // Assim, a JVM considerará o valor de a e b como 60 e 30 referente à ordem de execução.
//                                     // O valor de a = 10 e b = 5 são inúteis.
//                                     // E o valor das variáveis ​​c e m é 0, pois não atribuímos nenhum valor a elas.
// }
