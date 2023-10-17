public class App {
    public static void main(String[] args) throws Exception {
        
        // for (int i = 1; i <= 10; i++) {
        //     System.out.print(i + " ");
        // }

        // System.out.println();

        // for (int i = 10; i >= 1; i--) {
            
        //     System.out.print(i + " ");
        // }

        int[][] matriz = {

            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
                
            }

            System.out.println();
        }
    }
}
