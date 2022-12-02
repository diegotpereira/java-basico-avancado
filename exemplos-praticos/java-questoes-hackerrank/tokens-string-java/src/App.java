import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        String s = teclado.nextLine();

        teclado.close();

        boolean encontrado = false;

        for(int i = 0; i < s.length(); i++) {

            int t = s.charAt(i);

            System.out.println(t);

            if(65 <= t && t <= 90 || t >= 97 && t <= 112) {

                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            
            String[] str = s.split("[, '@_.?!]+");
            int comprimento = str.length;

            System.out.println(comprimento);

            if(str[0].length() == 0 || str[str.length - 1].length() == 0) {

                comprimento--;
            }

            System.out.println(comprimento);

            for(String s1 : str)

               if(s1.length() != 0)
                  System.out.println(s1);
        } else {

            System.out.println(0);
        }
    }
}
