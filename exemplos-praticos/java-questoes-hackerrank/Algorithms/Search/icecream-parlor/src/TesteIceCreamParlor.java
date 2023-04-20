import java.util.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class TesteIceCreamParlor {

    @Test
    public void testIcecreamParlor() {
        List<Integer> arr1 = Arrays.asList(1, 4, 5, 3, 2);
        List<Integer> arr2 = Arrays.asList(2, 2, 4, 3);

        List<Integer> expected1 = Arrays.asList(1, 4);
        List<Integer> expected2 = Arrays.asList(1, 2);

        assertEquals(expected1, Resultado.icecreamParlor(4, arr1));
        assertEquals(expected2, Resultado.icecreamParlor(4, arr2));

    }

    @Test
    public void testIcecreamParlor1() {
        List<Integer> arr1 = Arrays.asList(1, 3, 4, 6, 7, 9);
        List<Integer> arr2 = Arrays.asList(1, 3, 4, 4, 6, 8);
        List<Integer> arr3 = Arrays.asList(1, 2);

        List<Integer> expected1 = Arrays.asList(2, 4);
        List<Integer> expected2 = Arrays.asList(3, 4);
        List<Integer> expected3 = Arrays.asList(1, 2);

        assertEquals(expected1, Resultado.icecreamParlor(9, arr1));
        assertEquals(expected2, Resultado.icecreamParlor(8, arr2));
        assertEquals(expected3, Resultado.icecreamParlor(3, arr3));
    }

}
