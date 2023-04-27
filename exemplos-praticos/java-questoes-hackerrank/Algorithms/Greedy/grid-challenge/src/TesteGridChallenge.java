import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TesteGridChallenge {

    @Test
    public void casoTeste1() {

        List<String> grade = Arrays.asList("eabcd", "fghij", "olkmn", "trpqs", "xywuv");
        String experado = "YES";

        String resposta = Resultado.gridChallenge(grade);

        assertEquals(experado, resposta);
    }

    @Test
    public void casoTeste2() {

        List<String> grade = Arrays.asList("abc", "lmp", "qrt");
        String experado = "YES";

        String resposta = Resultado.gridChallenge(grade);

        assertEquals(experado, resposta);
    }

    @Test
    public void casoTeste3() {

        List<String> grade = Arrays.asList("mpxz", "abcd", "wlmf");
        String experado = "NO";

        String resposta = Resultado.gridChallenge(grade);

        assertEquals(experado, resposta);
    }

    @Test
    public void casoTeste4() {

        List<String> grade = Arrays.asList("abc", "hjk", "mpq", "rtv");
        String experado = "YES";

        String resposta = Resultado.gridChallenge(grade);

        assertEquals(experado, resposta);
    }

}
