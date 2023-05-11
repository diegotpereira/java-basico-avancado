import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteLuckBalance {

    @Test
    public void testeCaso1() {

        int k = 3;
        List<List<Integer>> competicoes = Arrays.asList(
                Arrays.asList(5, 1),
                Arrays.asList(2, 1),
                Arrays.asList(1, 1),
                Arrays.asList(8, 1),
                Arrays.asList(10, 0),
                Arrays.asList(5, 0));

        int experado = 29;
        int resultado = Resultado.luckBalance(k, competicoes);

        assertEquals(experado, resultado);
    }

    @Test
    public void casoTeste2() {

        List<List<Integer>> competicoes = Arrays.asList(

                Arrays.asList(13, 1),
                Arrays.asList(10, 1),
                Arrays.asList(9, 1),
                Arrays.asList(8, 1),
                Arrays.asList(13, 1),
                Arrays.asList(12, 1),
                Arrays.asList(18, 1),
                Arrays.asList(13, 1));

        int numeroCompeticoesImportantesQuePodePerder = 5;
        int experado = 42;
        int resultado = Resultado.luckBalance(numeroCompeticoesImportantesQuePodePerder, competicoes);

        assertEquals(experado, resultado);
    }

    @Test
    public void casoTeste3() {

        List<List<Integer>> competicoes = Arrays.asList(

                Arrays.asList(5, 1),
                Arrays.asList(4, 0),
                Arrays.asList(6, 1),
                Arrays.asList(2, 1),
                Arrays.asList(8, 0));

        int numeroCompeticoesImportantesQuePodePerder = 2;
        int experado = 21;
        int resultado = Resultado.luckBalance(numeroCompeticoesImportantesQuePodePerder, competicoes);

        assertEquals(experado, resultado);
    }
}
