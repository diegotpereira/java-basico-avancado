import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteMaximumPerimeterTriangle {

    @Test
    public void casoTeste1() {

        List<Integer> sticks = Arrays.asList(1, 1, 1, 3, 3);
        List<Integer> experado = Arrays.asList(1, 3, 3);
        List<Integer> resposta = Resultado.maximumPerimeterTriangle(sticks);

        assertEquals(experado, resposta);

    }

    @Test
    public void casoTeste2() {

        List<Integer> sticks = Arrays.asList(1, 2, 3);
        List<Integer> esperado = Arrays.asList(-1);
        List<Integer> resposta = Resultado.maximumPerimeterTriangle(sticks);

        assertEquals(esperado, resposta);
    }

    @Test
    public void casoTeste3() {

        List<Integer> sticks = Arrays.asList(1, 1, 1, 2, 3, 5);
        List<Integer> esperado = Arrays.asList(1, 1, 1);
        List<Integer> resposta = Resultado.maximumPerimeterTriangle(sticks);

        assertEquals(esperado, resposta);
    }

    @Test
    public void casoTeste4() {

        List<Integer> sticks = Arrays.asList(9, 2015, 5294, 58768, 285, 477, 72, 13867, 97, 22445, 48, 36318, 764, 8573,
                183, 3270, 81, 1251, 59, 95094);
        List<Integer> esperado = Arrays.asList(72, 81, 97);
        List<Integer> resposta = Resultado.maximumPerimeterTriangle(sticks);

        assertEquals(esperado, resposta);
    }

}
