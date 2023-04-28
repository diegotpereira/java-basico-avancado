import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;

public class TesteFindMedian {

    @Test
    public void testeCaso1() {

        List<Integer> arr = Arrays.asList(0, 1, 2, 4, 6, 5, 3);
        int esperado = 3;
        int resposta = Resultado.findMedian(arr);

        assertEquals(esperado, resposta);
    }

}
