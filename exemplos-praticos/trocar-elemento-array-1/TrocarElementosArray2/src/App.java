public class App {
    public static void main(String[] args) throws Exception {

        // Crie um array de exemplo
        int[] arr = {1, 2, 3, 4, 5};

        for (int i : arr) {
            
            System.out.print(i + " ");
        }

        System.out.println();

        // Índices dos elementos que você deseja trocar
        int indice1 = 1;
        int indice2 = 3;

        // Verifique se os índices estão dentro dos limites do array
        if (indice1 >= 0 && indice1 < arr.length && indice2 >= 0 && indice2 < arr.length) {

            // Troque os elementos sem usar uma variável temporária
            arr[indice1] = arr[indice1] + arr[indice2];
            arr[indice2] = arr[indice1] - arr[indice2];
            arr[indice1] = arr[indice1] - arr[indice2];

            // Imprima o array após a troca
            for (int i : arr) {
                
                System.out.print(i + " ");
            }

        } else {

            System.out.println("Indice fora dos limites no arr.");
        }
    }
}
