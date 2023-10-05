
import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteQuickSort {
    
    @Test
    public void testeCaso1() {

        List<Integer> arr = Arrays.asList(4, 5, 3, 7, 2);

        List<Integer> esperado = Arrays.asList(3, 2, 4, 5, 7);

        List<Integer> resultado = Resultado.quickSort(arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        List<Integer> arr = Arrays.asList(0, -3, 6, 4, -10, 8, -5, 2, -7);

        List<Integer> esperado = Arrays.asList(-3, -10, -5, -7, 0, 6, 4, 8, 2);

        List<Integer> resultado = Resultado.quickSort(arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        List<Integer> arr = Arrays.asList(2, 10, 3, 7, 9, 4, 6, 12, 8);

        List<Integer> esperado = Arrays.asList(2, 10, 3, 7, 9, 4, 6, 12, 8);

        List<Integer> resultado = Resultado.quickSort(arr);

        assertEquals(esperado, resultado);
    }
}
