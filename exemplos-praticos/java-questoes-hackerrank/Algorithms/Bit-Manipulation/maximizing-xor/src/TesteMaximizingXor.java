import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteMaximizingXor {

    @Test
    public void testeCaso1() {

        int primeiro = 10; 
        int segundo = 15;
        int esperado = 7;

        int resultado = Resultado.maximizingXor(primeiro, segundo);

        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testeCaso2() {

        int primeiro = 11; 
        int segundo = 100;
        int esperado = 127;

        int resultado = Resultado.maximizingXor(primeiro, segundo);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        int primeiro = 1; 
        int segundo = 10;
        int esperado = 15;

        int resultado = Resultado.maximizingXor(primeiro, segundo);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso4() {

        int primeiro = 5; 
        int segundo = 6;
        int esperado = 3;

        int resultado = Resultado.maximizingXor(primeiro, segundo);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso5() {

        int primeiro = 1; 
        int segundo = 1000;
        int esperado = 1023;

        int resultado = Resultado.maximizingXor(primeiro, segundo);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso6() {

        int primeiro = 304; 
        int segundo = 313;
        int esperado = 15;

        int resultado = Resultado.maximizingXor(primeiro, segundo);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso7() {

        int primeiro = 578; 
        int segundo = 909;
        int esperado = 511;

        int resultado = Resultado.maximizingXor(primeiro, segundo);

        assertEquals(esperado, resultado);
    }
}
