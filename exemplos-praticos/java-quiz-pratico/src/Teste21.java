public class Teste21 {

    // Qual é a saída do programa?
    
    public static void swap(Integer i, Integer j) {

        Integer temp = new Integer(i);

        i = j;
        j = temp;
    }
    public static void main(String[] args) {
        
        Integer i =  new Integer(10);
        Integer j = new Integer(20);
        swap(i, j);

        System.out.println("i = " + i + ", j = " + j); // A. i = 10, j = 20
    }

    // A. i = 10, j = 20
    // B. i = 20, j = 10
    // C. i = 10, j = 10
    // D. i = 20, j = 20;
    
}
