public class Teste24 {
    
    // Qual é a saída do programa?
    
    public void demo(String str) {


        String[] arr = str.split(";");

        for(String s : arr) {

            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        
        char array[] = { 'a', 'b', ' ', 'c', 'd', ';', 'e', 'f', ' ', 'g', 'h', ';', 'i', 'j', ' ', 'k', 'l'};

        String str = new String(array);

        Teste24 obj = new Teste24();
        obj.demo(str);
    }

    // A.  ab cd
    //     ef gh
    //     ij kl

    // B.  ab
    //     cd;ef
    //     gh;ij
    //     kl

    // C. Erro de compilação

    // Resposta: A
}
