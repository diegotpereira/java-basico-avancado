import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TesteCutTheTree {

    @Test
    public void testeCaso1() {

        List<Integer> valores =  Arrays.asList(100, 200, 100, 500, 100, 600);
        List<List<Integer>> arestas = Arrays.asList(
            Arrays.asList(1, 2),
            Arrays.asList(2, 3),
            Arrays.asList(2, 5),
            Arrays.asList(4, 5),
            Arrays.asList(5, 6)
        );

        Resultado resultado = new Resultado();
        
        int resposta = resultado.cutTheTree(valores, arestas);
        int esperado = 400;

        assertEquals(esperado, resposta);
    }

     @Test
    public void testeCaso2() {

        List<Integer> valores =  Arrays.asList(205, 573, 985, 242, 830, 514, 592, 263, 142, 915);
        List<List<Integer>> arestas = Arrays.asList(
            Arrays.asList(2, 8),
            Arrays.asList(10, 5),
            Arrays.asList(1, 7),
            Arrays.asList(6, 9),
            Arrays.asList(4, 3),
            Arrays.asList(8, 10),
            Arrays.asList(5, 1),
            Arrays.asList(7, 6),
            Arrays.asList(9, 4)
        );

        Resultado resultado = new Resultado();
        
        int resposta = resultado.cutTheTree(valores, arestas);
        int esperado = 99;

        assertEquals(esperado, resposta);
    }
}
