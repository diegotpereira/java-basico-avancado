import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteHighestValuePalindrome {
    
    @Test
    public void testeCaso1() {

        String s = "3943";
        int tamanhoString = 4;
        int numeroMaximaMudancas = 1;

        String esperado = "3993";

        String resultado = Resultado.highestValuePalindrome(s, tamanhoString, numeroMaximaMudancas);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        String s = "092282";
        int tamanhoString = 6;
        int numeroMaximaMudancas = 3;

        String esperado = "992299";

        String resultado = Resultado.highestValuePalindrome(s, tamanhoString, numeroMaximaMudancas);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        String s = "0011";
        int tamanhoString = 4;
        int numeroMaximaMudancas = 1;

        String esperado = "-1";

        String resultado = Resultado.highestValuePalindrome(s, tamanhoString, numeroMaximaMudancas);

        assertEquals(esperado, resultado);
    }
}
