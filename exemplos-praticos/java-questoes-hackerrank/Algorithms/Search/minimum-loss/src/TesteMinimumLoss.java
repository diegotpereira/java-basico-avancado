import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TesteMinimumLoss {
    
    @Test
    public void testeCaso1() {

        List<Long> preco = new ArrayList<>();

        preco.add(5L);
        preco.add(10L);
        preco.add(3L);

        int esperado = 2;

        int resultado = Resultado.minimumLoss(preco);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso2() {

        List<Long> preco = new ArrayList<>();

        preco.add(20L);
        preco.add(7L);
        preco.add(8L);
        preco.add(2L);
        preco.add(5L);

        int esperado = 2;

        int resultado = Resultado.minimumLoss(preco);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso3() {

        List<Long> preco = new ArrayList<>();

        preco.add(2L);
        preco.add(3L);
        preco.add(4L);
        preco.add(1L);

        int esperado = 1;

        int resultado = Resultado.minimumLoss(preco);

        assertEquals(esperado, resultado);

    }
}
