// public class Primeiro_C {
    
//     public void meuMetodo() {

//         System.out.println("Metodo"); // 4°
//     }
//     {
//         System.out.println("Bloco de instância"); // 2°
//     }
//     public void Primeiro_C() {

//         System.out.println("Construtor"); // 3°
//     }
//     static {

//         System.out.println("bloco estático"); // 1°
//     }
//     public static void main(String[] args) {
        
//         Primeiro_C c = new Primeiro_C();
//         c.Primeiro_C();
//         c.meuMetodo();
//     }

//     // A. Bloco de instância, método, bloco estático e construtor
//     // B. Método, construtor, bloco de instância e bloco estático
//     // C. Bloco estático, método, bloco de instância e construtor
//     // D. Bloco estático, bloco de instância, construtor e método

//     // Resposta D. Bloco estático, bloco de instância, construtor e método -  1° O bloco estático será executado sempre que a classe for carregada pela JVM.
//                                                                            // 2° O bloco de instância será executado sempre que um objeto for criado e será 
//                                                                            // invocado antes dos construtores. Por exemplo, se houver dois objetos, o bloco 
//                                                                            // de instância será executado duas vezes para cada objeto. 
//                                                                            // 3° O construtor será executado após o bloco de instância e também será executado 
//                                                                            // toda vez que o objeto for criado.
//                                                                            // 4° Um método é sempre executado no final.
// }

