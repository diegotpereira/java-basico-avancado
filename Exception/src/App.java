public class App {
    public static void main(String[] args) throws Exception {

        // vai gerar uma excessão
        // int[] numeros = {1, 2, 3};

        // System.out.println(numeros[10]);
        try {
            int[] numeros = {1, 2, 3};

            System.out.println(numeros[10]);
        } catch (Exception e) {
            System.out.println("Algo deu errado.");

            // adicionando finally
        } finally {
            System.out.println("O 'try catch' está concluído.");
            
        }
    }
}
