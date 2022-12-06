public class Potenciade2 {
    
    public static void main(String[] args) {
        
        int numero = 5;
        int potencia = 3;
        // String resultado = PotenciaDe2(numero);

        // int resultado = CalcularPotencia(numero, potencia);
        // int resultado = CalcularPotenciaRecursao(numero, potencia);
        double resultado = CalcularPotenciaPow(numero, potencia);

        // System.out.println(resultado);

        System.out.println(numero + "^" + potencia +  "=" + resultado);
        
    }

    static String PotenciaDe2(int num) {

        return ((num & num) == 0) ? "potencia de 2" : "não é potencia de 2";
    }

    // usando loop for
    static int CalcularPotencia(int num, int potencia) {

        int resposta = 1;

        if(num > 0 && potencia == 0) {

            return resposta;

        } else if (num == 0 && potencia >=  1) {
            
            return 0;

        } else {


            for(int i = 1; i <= potencia; i++) {

                resposta = resposta * potencia;
                
            }

            return resposta;
        }
        // return resposta;
    }

    // usando recursão
    static int CalcularPotenciaRecursao(int num, int potencia) {

        if(potencia == 0)
            return 1;
        else 
            return num * CalcularPotenciaRecursao(num, potencia - 1);
    }

    // usando Math.pow()
    static double CalcularPotenciaPow(int num, int potencia) {

        return Math.pow(num, potencia);
    }
}
