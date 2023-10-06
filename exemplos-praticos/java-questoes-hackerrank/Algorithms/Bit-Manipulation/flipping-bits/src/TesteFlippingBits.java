import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteFlippingBits {

    @Test
    public void testeCaso1() {

        long n = 2147483647;
        long esperado = 2147483648L;

        long resultado = Resultado.flippingBits(n);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso2() {

        long n = 1;
        long esperado = 4294967294L;

        long resultado = Resultado.flippingBits(n);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso3() {

        long n = 0;
        long esperado = 4294967295L;

        long resultado = Resultado.flippingBits(n);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso4() {

        long n = 4;
        long esperado = 4294967291L;

        long resultado = Resultado.flippingBits(n);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso5() {

        long n = 123456;
        long esperado = 4294843839L;

        long resultado = Resultado.flippingBits(n);

        assertEquals(esperado, resultado);

    }
    
}
