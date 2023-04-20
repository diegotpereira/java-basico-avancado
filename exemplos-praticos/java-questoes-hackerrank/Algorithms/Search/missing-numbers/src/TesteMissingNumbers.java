import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteMissingNumbers {

    @Test
    public void testCaso1() {

        List<Integer> arr = Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206);
        List<Integer> brr = Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204);
        List<Integer> experado = Arrays.asList(204, 205, 206);

        List<Integer> resultado = Resultado.missingNumbers(arr, brr);

        assertEquals(experado, resultado);
    }

    @Test
    public void testCaso2() {

        List<Integer> arr = Arrays.asList(11, 4, 11, 7, 13, 4, 12, 11, 10, 14);
        List<Integer> brr = Arrays.asList(11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12);
        List<Integer> experado = Arrays.asList(3, 7, 8, 10, 12);

        List<Integer> resultado = Resultado.missingNumbers(arr, brr);

        assertEquals(experado, resultado);
    }

}
