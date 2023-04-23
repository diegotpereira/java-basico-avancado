import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteBalancedSums {

    @Test
    public void testeCaso1() {

        List<Integer> entrada = Arrays.asList(1, 2, 3);

        String experado = "NO";

        String resposta = Resultado.balancedSums(entrada);

        assertEquals(experado, resposta);

    }

    @Test
    public void testeCaso2() {

        List<Integer> entrada = Arrays.asList(1, 2, 3, 3);

        String experado = "YES";

        String resposta = Resultado.balancedSums(entrada);

        assertEquals(experado, resposta);

    }

    @Test
    public void testeCaso3() {

        List<Integer> entrada = Arrays.asList(1, 1, 4, 1, 1);

        String experado = "YES";

        String resposta = Resultado.balancedSums(entrada);

        assertEquals(experado, resposta);

    }

    @Test
    public void testeCaso4() {

        List<Integer> entrada = Arrays.asList(2, 0, 0, 0);

        String experado = "YES";

        String resposta = Resultado.balancedSums(entrada);

        assertEquals(experado, resposta);

    }

    @Test
    public void testeCaso5() {

        List<Integer> entrada = Arrays.asList(0, 0, 2, 0);

        String experado = "YES";

        String resposta = Resultado.balancedSums(entrada);

        assertEquals(experado, resposta);

    }
}