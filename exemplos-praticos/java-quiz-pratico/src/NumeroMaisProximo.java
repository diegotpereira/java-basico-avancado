import java.util.Arrays;

public class NumeroMaisProximo {
    
    static void imprimirParesDiferencasMinimas(int arr[], int n) {


        if(n <= 1)
           return;

           // Classificar elementos da matriz
           Arrays.sort(arr);

           int minDiferente = arr[1] - arr[0];

           System.out.println(arr[0]);
           System.out.println(arr[1]);

           for(int i = 2; i < n; i++) 
              minDiferente = Math.min(minDiferente, arr[i] - arr[i - 1]);

              System.out.println(minDiferente);

              for(int i = 1; i < n; i++) {

                if((arr[i] -  arr[i - 1]) == minDiferente) {

                    System.out.println("(" + arr[i - 1] + ","  + arr[i] + "),");
                }
              }
    }

    
    public static void main(String[] args) {
     
        int arr[] = { 5, 3, 2, 4, 1 };
        int n =  arr.length; // 5

        imprimirParesDiferencasMinimas(arr, n);
        System.out.println(n);
    }
}
