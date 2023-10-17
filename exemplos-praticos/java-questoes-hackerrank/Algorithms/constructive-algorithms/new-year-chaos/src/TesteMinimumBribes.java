import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TesteMinimumBribes {

    @Test
    public void testeCaso1() {

        List<Integer> q = Arrays.asList(2, 1, 5, 3, 4);
        int esperado = 3;
        int resultado = Resultado.minimumBribes(q);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        List<Integer> q = Arrays.asList(2, 5, 1, 3, 4);

        String esperado = "Too chaotic";
        int resultado = Resultado.minimumBribes(q);

        assertEquals(esperado, resultado == -1 ? "Too chaotic" : String.valueOf(resultado));
    }

    @Test
    public void testeCaso3() {

        List<Integer> q = Arrays.asList(5, 1, 2, 3, 7, 8, 6, 4);

        String esperado = "Too chaotic";
        int resultado = Resultado.minimumBribes(q);

        assertEquals(esperado, resultado == -1 ? "Too chaotic" : String.valueOf(resultado));
    }
    
     @Test
    public void testeCaso4() {

        List<Integer> q = Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4);
        int esperado = 7;
        int resultado = Resultado.minimumBribes(q);

        assertEquals(esperado, resultado);
    }
}
