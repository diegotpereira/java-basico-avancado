import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;

public class ResultadoTwoArrays {

    @Test
    public void casoTeste1() {

        int limiteDeSoma = 10;
        List<Integer> a = Arrays.asList(2, 1, 3);
        List<Integer> b = Arrays.asList(7, 8, 9);
        String experado = "YES";
        String resultado = Resultado.twoArrays(limiteDeSoma, a, b);

        assertEquals(experado, resultado);
    }

    @Test
    public void casoTeste2() {

        int limiteDeSoma = 5;
        List<Integer> a = Arrays.asList(1, 2, 2, 1);
        List<Integer> b = Arrays.asList(3, 3, 3, 4);
        String experado = "NO";
        String resultado = Resultado.twoArrays(limiteDeSoma, a, b);

        assertEquals(experado, resultado);

    }

    @Test
    public void casoTeste3() {

        int limiteDeSoma = 10;
        List<Integer> a = Arrays.asList(7, 6, 8, 4, 2);
        List<Integer> b = Arrays.asList(5, 2, 6, 3, 1);
        String experado = "NO";
        String resultado = Resultado.twoArrays(limiteDeSoma, a, b);

        assertEquals(experado, resultado);

    }

}
