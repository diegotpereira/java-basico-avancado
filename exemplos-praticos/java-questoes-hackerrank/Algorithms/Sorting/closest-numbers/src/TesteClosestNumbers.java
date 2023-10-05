import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TesteClosestNumbers {
    
    @Test
    public void testeCaso1() {

        List<Integer> arr = Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854);
        List<Integer> esperado = Arrays.asList(-20, 30);
        
        List<Integer> resultado = Resultado.closestNumbers(arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        List<Integer> arr = Arrays.asList(-5, 15, 25, 71, 63);
        List<Integer> esperado = Arrays.asList(63, 71);
        
        List<Integer> resultado = Resultado.closestNumbers(arr);

        assertEquals(esperado, resultado);
    }
}
