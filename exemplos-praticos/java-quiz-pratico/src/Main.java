// Qual é a saída do programa abaixo?

// public class Main {

//     public static int soma(int a, int b) {

//         if(a + b > 10)

//            return 0;

//         System.out.print(a + b); // saída: C. 122

//         return a + b;
//     }
    
//     public static void main(String[] args) {
        
//         System.out.println(soma(1, soma(0, 1)));
//     }

//     // (A) 123456789
//     // (B) 12345678
//     // (C) 122
//     // (D) Nenumha das acima
// }


// Qual é a saída do programa abaixo?

// public class Main {

//     public static int soma(int a, int b) {

//         System.out.print(a + "" + b); // saída: C. 12336

//         return a + b;
//     }

//     public static void main(String[] args) {
        
//         System.out.println(soma(3, soma(1, 2)));
//     }

//     // (A) 32136
//     // (B) 33126
//     // (C) 12336
//     // (D) 63321
// }

// Qual é a saída do programa abaixo?


// public class Main {

//     public static int soma(int a, int b) {

//         System.out.print(a + "" + b); // saída: D. 12336

//         return a + b;
//     }

//     public static void main(String[] args) {
        
//         System.out.println(soma(soma(1, 2), 3));
//     }

//     // (A) 63321
//     // (B) 36
//     // (C) 33
//     // (D) 12336
// }


// Qual é a saída do programa abaixo?


// public class Main {

//     public static int soma(int a, int b) {
    
//         return a + b;
//     }

//     public static void main(String[] args) {
        
//         System.out.println(soma(soma(1, 2), 3)); // saída: D. 6
//     }

//     // (A) Compilation Error
//     // (B) 3
//     // (C) 5
//     // (D) 6
// }

// Qual é a saída do programa abaixo?

// public class Main {

//     public void soma(int a, int b) {
//         System.out.println(a + b);
//     }

//     public static void main(String[] args) {
        
//         soma(0, 0);
//         soma(-1, -1);
//     }

//     // (A) -2
//     // (B) 0-1
//     // (C) 0-2
//     // (D) error: non-static method can't be called

//     // Resposta D. error: non-static method can't be called
// }


// Qual é a saída do programa abaixo?


// public class Main {

//     public static void soma(int a, int b) {

//         System.out.print(a + b); // saída: C. 0 -2
//     }

//     public static void main(String[] args) {
        
//         soma(0,0);
//         soma(-1, -1);
//     }

//     // (A) 00
//     // (B) 0-1
//     // (C) 0-2
//     // (D) -2
// }


// Qual é a saída do programa abaixo?


// public class Main {

//     private int a;

//     public Main() {

//         a = 10;
//     }

//     public static void main(String[] args) {
        
//         Main obj = new Main();
//         obj.a = -10;

//         System.out.println(obj.a); // saída: C. -10
//     }

//     // (A) 0
//     // (B) 10
//     // (C) -10
//     // (D) Compilation Error
// }


// Qual é a saída do programa abaixo?

// public class Main {

//     private int a;

//     public static void main(String[] args) {
        
//         Main obj = new Main();

//         System.out.println(obj.a); // saída: D. 0
//     }

//     // (A) Garbage Value
//     // (B) O código tem erro de compilação
//     // (C) null
//     // (D) 0
// }


// Qual é a saída do programa abaixo?

// public class Main {

//     public static void main(String[] args) {
        
//         Teste obj = new Teste();
//         obj.soma(); 
//     }

//     // (A) ola
//     // (B) nada é imprimido
//     // (C) error: soma() tem acesso privado
//     // (D) Exception

//     // Resposta C. erro soma() tem acesso privado
// }
// class teste{

//     private void soma() {

//         System.out.println("Ola");
//     }
// }


// Qual é a saída do programa abaixo?

// public class Main {

//     public static int ret() {

//         return 0;
//     }

//     public static void main(String[] args) {
        
//         int a = 0;

//         if(ret() == 0)

//            System.out.print("Sol");
//            System.out.println("Lua");
//     }

//     // (A) Sol
//     // (B) SolLua
//     // (C) Nada é impresso
//     // (D) Compilation Error

//     // Resposta B. SolLua
// }


// // Qual é a saída do programa abaixo?

// public class Main {

//     public static void teste(String s) {

//         System.out.println("String");
//     }

//     public static void teste2(Object o) {

//         System.out.println("Objeto");
//     }

//     public static void main(String[] args) {
        
//         teste(null); // saída: String
//     }
// }


// // Qual é a saída do programa abaixo?

// interface A {

//     int var = 2;
// }
//  class B implements A {

//     void mostrar() {

//         var = 3;

//         System.out.println("Var = " + var);
//     }

//     public class Main {

//         public static void main(String[] args) {
            
//             B obj = new B();
//             obj.mostrar();
//         }
//     }

//     // A) 2
//     // B) 3
//     // C) 5
//     // D) Compilation error

//     // Resposta D. Erro de compilação. - As variáveis ​​na interface são por padrão estáticas e finais e não podemos alterar seu valor depois de inicializadas.
//                                       // No código acima, o valor da variável 'var' é alterado no método show() o que não é permitido. Portanto, o erro de compilação é exibido.
//  }


// // Qual é a saída do código a seguir?

// interface A {
//      void mostrar();
// }

// class B implements A {

//     public void mostrar() {

//         System.out.println("Bem-vindo ao quiz java!");
//     }
// }

// public class Main {

//     public static void main(String[] args) {
        
//         A obj = new B();
//         obj.mostrar();
//     }

//     // A) Não podemos criar o objeto 'obj' a partir da interface 'A'.
//     // B) Bem-vindo ao quiz java!
//     // C) Erro de compilação
//     // D) Todas as respostas são falsas.

//     // Resposta: B. Bem-vindo ao quiz java!
// }
