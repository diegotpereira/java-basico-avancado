public class App {
    public static void main(String[] args) throws Exception {

        int index, j, contar;

        System.out.println("Números primos entre 1 e 100: ");

        for(index = 2; index <= 100; index++) {
            contar = 0;

            for(j= index; j >= 1; j--) {
                if (index % j == 0) 
                contar = contar + 1;
            }
            if(contar == 2)

            System.out.print("" + index + " ");
        }
    }
}
