// abstract class Demo {

//     public int a;

//     Demo() {

//         a = 10;
//     }

//     abstract public void set();
//     abstract final public void get();
// }
// class Teste22 extends Demo {

//     public void set(int a) {

//         this.a = a;
//     }
//     final public void get() {

//         System.out.println("a = " + a);
//     }
    
//     public static void main(String[] args) {
        
//         Teste22 obj = new Teste22();
//         obj.set(20);
//         obj.get();
//     }

//     // A. a = 10
//     // B. a = 20
//     // C. Erro de compilação

//     // Resposta C. Erro de compilação - O método final não pode ser substituído. Assim, uma função abstrata não pode ser final.
// }