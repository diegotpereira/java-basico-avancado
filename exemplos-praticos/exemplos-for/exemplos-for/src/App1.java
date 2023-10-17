public class App1 {
    
    public static void main(String[] args) {
        
        int linhas = 5;
        int colunas = 5;

        for (int i = 1; i < linhas; i++) {
            
            for (int j = 1; j < colunas; j++) {
                
                if (i >= j) {
                    

                    System.out.print(j + " ");

                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
