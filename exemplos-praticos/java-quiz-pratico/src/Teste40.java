public class Teste40 {
    
    // Verifique se o número fornecido é Prime?
    public static void main(String[] args) {
        
        System.out.println(ehPrimo(19)); // saída: true
        System.out.println(ehPrimo(49)); // saída: false - 
    }
    public static boolean ehPrimo(int n) {

        // se n é igual a zero ou igual a 1, retorna falso
        if(n == 0 || n == 1) {

            return false;
        }
        // se n é igual a 2, retorna verdadeiro
        if (n == 2) {
            
            return true;
        }
        // percorre o laço
        for(int i = 2; i <= n /2; i++) {

            // se resto de n por i for zero, retorna false(resto de 19 é um é primo, resto de 49 é zero não é primo)
            if(n % i == 0) {

                return false;
            }
        }
        // se não é falso retorna verdadeiro(true) é ímpar.
        return true;
    }
}
