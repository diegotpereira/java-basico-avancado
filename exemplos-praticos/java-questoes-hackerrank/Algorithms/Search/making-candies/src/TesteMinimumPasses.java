import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteMinimumPasses {

    @Test
    public void testeCaso1() {

        long m = 3;
        long w = 1;
        long p = 2;
        long n = 12;

        Resultado resultado = new Resultado();

        long resposta = resultado.minimumPasses(m, w, p, n);
        long esperado = 3;

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso2() {

        long m = 1;
        long w = 1;
        long p = 6;
        long n = 45;

        Resultado resultado = new Resultado();

        long resposta = resultado.minimumPasses(m, w, p, n);
        long esperado = 16;

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso3() {

        long m = 5184889632L;
        long w = 5184889632L;
        long p = 20;
        long n = 10000;

        Resultado resultado = new Resultado();

        long resposta = resultado.minimumPasses(m, w, p, n);
        long esperado = 1;

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso4() {

        long m = 38;
        long w = 25;
        long p = 22;
        long n = 21;

        Resultado resultado = new Resultado();

        long resposta = resultado.minimumPasses(m, w, p, n);
        long esperado = 1;

        assertEquals(esperado, resposta);
    }

     @Test
    public void testeCaso5() {

        long m = 1;
        long w = 1;
        long p = 1000000000000L;
        long n = 1000000000000L;

        Resultado resultado = new Resultado();

        long resposta = resultado.minimumPasses(m, w, p, n);
        long esperado = 1000000000000L;

        assertEquals(esperado, resposta);
    }
}
