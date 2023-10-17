import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < n; i++) {
            
            int num = Integer.parseInt(bufferedReader.readLine().trim());
            boolean encontrada = Resultado.isSmartNumber(num);

            if (encontrada) {
                
                System.out.println("YES");

            } else 

               System.out.println("NO");
        }

        bufferedReader.close();
        bufferedWriter.close();
        System.out.println("Hello, World!");
    }
}
