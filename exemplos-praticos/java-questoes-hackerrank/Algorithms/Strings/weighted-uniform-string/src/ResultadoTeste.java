import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class ResultadoTeste {

    @Test
    public void testWeightedUniformStrings() {

        String entrada = "abccddde";

        List<Integer> consultas = Arrays.asList(1, 3, 12, 5, 9, 10);
        List<String> experado = Arrays.asList("YES", "YES", "YES", "YES", "NO", "NO");
        List<String> obtido = Resultado.weightedUniformStrings(entrada, consultas);

        assertEquals(experado, obtido);
    }
}
