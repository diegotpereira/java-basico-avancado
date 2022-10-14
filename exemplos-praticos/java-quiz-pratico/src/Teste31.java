public class Teste31 {
    
    static int i = 1;

    public static void main(String[] args) {
        
        System.out.println(i + " , ");
        m(i);
        System.out.println(i);
    }

    public static void m(int i) {

        i += 2;
    }
}

// (a) 1 , 3 
// (b) 3 , 1 
// (c) 1 , 1 
// (d) 1 , 0 
// (e) nenhuma das acima. 

// Resposta C. 1 , 1