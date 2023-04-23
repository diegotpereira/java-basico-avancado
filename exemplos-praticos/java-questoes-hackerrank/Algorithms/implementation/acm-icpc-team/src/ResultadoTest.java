import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ResultadoTest {

    @Test
    public void testAcmTeam() {

        List<String> tema = Arrays.asList("10101", "11100", "11010", "00101");
        List<Integer> experado = Arrays.asList(5, 2);
        List<Integer> obtido = Resultado.acmTeam(tema);

        assertEquals(experado, obtido);

    }

    @Test
    public void testAcmTeamComTemaVazio() {

        List<String> tema = Arrays.asList();
        List<Integer> resultadoEsperado = Arrays.asList(0, 0);
        List<Integer> resultadoObtido = Resultado.acmTeam(tema);
        assertEquals(resultadoEsperado, resultadoObtido);
    }
}
