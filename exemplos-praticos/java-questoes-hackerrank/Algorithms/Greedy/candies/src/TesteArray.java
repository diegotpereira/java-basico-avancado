public class TesteArray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int key = 4;

        int resultado = linearSearch(arr, key);

        System.out.println("O indice de " + key + " é " + resultado);

        int resultado1 = binarySearch(arr, key);

        System.out.println("O indice de " + key + " é " + resultado1);

        // int[] arr = { 1, 2, 3, 4, 5 };

        // for (int i = 0; i < arr.length; i++) {

        // // System.out.print(arr[i]);
        // }

        // int[] arr1 = { 1, 2, 3, 4, 5 };

        // for (int i = arr.length - 1; i >= 0; i--) {

        // // System.out.print(arr1[i]);
        // }

        // int[][] arrDiagonal = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };

        // for (int i = 0; i < arrDiagonal.length; i++) {

        // for (int j = 0; j < arrDiagonal[i].length; j++) {

        // if (i == j) {

        // System.out.println(arrDiagonal[i][j]);
        // }
        // }
        // }

        // int[][] arrOutraDiagonal = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };

        // for (int i = 0; i < arrOutraDiagonal.length; i++) {

        // System.err.println(arrOutraDiagonal[i][arrOutraDiagonal.length - i - 1]);
        // }

    }

    private static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {

                return i;
            }
        }

        return -1;

    }

    public static int binarySearch(int[] arr, int key) {

        int esquerda = 0;
        int direita = arr.length - 1;

        while (esquerda <= direita) {

            int meio = esquerda + (direita - esquerda) / 2;

            if (arr[meio] == key) {

                return meio;

            } else if (arr[meio] < key) {

                esquerda = meio + 1;

            } else {

                direita = meio + 1;
            }
        }

        return -1;
    }
}
