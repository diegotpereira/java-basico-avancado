public class App {
    public static void main(String[] args) throws Exception {

        // Crie um array de exemplo
        int[] arr = {1, 2, 3, 4, 5};

        // Elemento que você deseja encontrar
        int elementoDesejado = 3;

        // Use um loop para encontrar o elemento no array
        boolean encontrado = false;
        int indiceEncontrado = -1;

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] == elementoDesejado) {
                
                encontrado = true;
                indiceEncontrado = i;

                // O elemento foi encontrado, saia do loop
                break;
            }
        }

        // Verifique se o elemento foi encontrado
        if (encontrado) {
            
            System.out.println("O elemento " + elementoDesejado + " foi encontrado no índice " + indiceEncontrado);

        } else {

            System.out.println("O elemento " + elementoDesejado + " não foi encontrado no array.");
        }
    }
}
