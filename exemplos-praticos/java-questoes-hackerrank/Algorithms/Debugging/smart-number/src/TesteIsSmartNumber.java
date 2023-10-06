import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteIsSmartNumber {

    @Test
    public void testeCaso1() {

        int num = 1;
        boolean esperado = true;

        boolean resultado = Resultado.isSmartNumber(num);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        int num = 2;
        boolean esperado = false;

        boolean resultado = Resultado.isSmartNumber(num);

        assertEquals(esperado, resultado);
    }


    @Test
    public void testeCaso3() {

        int num = 7;
        boolean esperado = false;

        boolean resultado = Resultado.isSmartNumber(num);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso4() {

        int num = 169;
        boolean esperado = true;

        boolean resultado = Resultado.isSmartNumber(num);

        assertEquals(esperado, resultado);
    }
    
}
