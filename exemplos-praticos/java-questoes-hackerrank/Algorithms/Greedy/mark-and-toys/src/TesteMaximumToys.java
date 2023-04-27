import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteMaximumToys {

    @Test
    public void casoTeste1() {

        List<Integer> precos = Arrays.asList(1, 12, 5, 111, 200, 1000, 10);
        int dinheiroDisponivel = 50;
        int experado = 4;
        int resultado = Resultado.maximumToys(precos, dinheiroDisponivel);

        assertEquals(experado, resultado);

    }

    @Test
    public void casoTeste2() {

        List<Integer> precos = Arrays.asList(33324560, 77661073, 31948330, 21522343, 97176507, 5724692, 24699815,
                12079402, 6479353, 28430129, 42427721, 57127004, 26256001, 29446837, 65107604, 9809008, 65846182,
                8470661, 13597655, 360);
        int dinheiroDisponivel = 100000;
        int experado = 1;
        int resultado = Resultado.maximumToys(precos, dinheiroDisponivel);

        assertEquals(experado, resultado);

    }

}
