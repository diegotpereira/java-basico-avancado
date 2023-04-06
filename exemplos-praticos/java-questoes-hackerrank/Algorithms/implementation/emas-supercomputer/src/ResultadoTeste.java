import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ResultadoTeste {

    @Test
    public void testTwoPluses() {
        List<String> grade = Arrays.asList(
                "GGGGGG",
                "GBBBGB",
                "GGGGGG",
                "GGBBGB",
                "GGGGGG");
        int resultadoEsperado = 5;
        int resultadoReal = Resultado.twoPluses(grade);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

}
