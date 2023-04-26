import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;

public class TesteJimOrders {

    @Test
    public void testeCaso1() {

        List<List<Integer>> pedidos = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(2, 3),
                Arrays.asList(3, 3));

        List<Integer> experado = Arrays.asList(1, 2, 3);
        List<Integer> resultado = Resultado.jimOrders(pedidos);

        assertEquals(experado, resultado);

    }

    @Test
    public void testeCaso2() {

        List<List<Integer>> pedidos = Arrays.asList(
                Arrays.asList(8, 1),
                Arrays.asList(4, 2),
                Arrays.asList(5, 6),
                Arrays.asList(3, 1),
                Arrays.asList(4, 3));

        List<Integer> experado = Arrays.asList(4, 2, 5, 1, 3);
        List<Integer> resultado = Resultado.jimOrders(pedidos);

        assertEquals(experado, resultado);
    }

}
