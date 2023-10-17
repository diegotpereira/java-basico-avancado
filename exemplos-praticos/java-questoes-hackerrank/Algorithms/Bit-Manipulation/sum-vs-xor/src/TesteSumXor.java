import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteSumXor {
    
    @Test
    public void testeCaso1() {

        long n = 5;
        int esperado = 2;
        long resposta = Resultado.sumXor(n);

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso2() {

        long n = 10;
        int esperado = 4;
        long resposta = Resultado.sumXor(n);

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso3() {

        long n = 0;
        int esperado = 1;
        long resposta = Resultado.sumXor(n);

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso4() {

        long n = 100;
        int esperado = 16;
        long resposta = Resultado.sumXor(n);

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso5() {

        long n = 50;
        int esperado = 8;
        long resposta = Resultado.sumXor(n);

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso6() {

        long n = 79;
        int esperado = 4;
        long resposta = Resultado.sumXor(n);

        assertEquals(esperado, resposta);
    }
}
