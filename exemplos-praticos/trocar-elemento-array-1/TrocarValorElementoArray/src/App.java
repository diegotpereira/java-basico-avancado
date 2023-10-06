public class App {
    public static void main(String[] args) throws Exception {

        // Crie um array de exemplo
        int[] arr = { 1, 2, 3, 4, 5};

        // Índice do elemento que você deseja trocar
        int indice = 2;

        // Novo valor que você deseja atribuir ao elemento
        int novoValor = 10;

        if (indice >= 0 && indice < arr.length) {
            
            arr[indice] = novoValor;

            for (int i : arr) {
            
                System.out.print(i + " ");
            }

        } else {

            System.out.println("Índice fora dos limites do arr");
        }
    } 
}
