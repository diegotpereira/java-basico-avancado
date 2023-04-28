import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TesteMarcsCakewalk {

    @Test
    public void testeCaso1() {

        List<Integer> calorias = Arrays.asList(1, 3, 2);
        int esperado = 11;
        long resposta = Resultado.marcsCakewalk(calorias);

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso2() {

        List<Integer> calorias = Arrays.asList(7, 4, 9, 6);
        int esperado = 79;
        long resposta = Resultado.marcsCakewalk(calorias);

        assertEquals(esperado, resposta);
    }

}
