import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteResultado {

    @Test
    public void TestTheLoveLetterMystery1() {

        String entrada = "abc";
        int experado = 2;

        int resultado = Resultado.theLoveLetterMystery(entrada);

        assertEquals(experado, resultado);

    }

    @Test
    public void TestTheLoveLetterMystery2() {

        String entrada = "abcba";
        int experado = 0;

        int resultado = Resultado.theLoveLetterMystery(entrada);

        assertEquals(experado, resultado);

    }

    @Test
    public void TestTheLoveLetterMystery3() {

        String entrada = "abcd";
        int experado = 4;

        int resultado = Resultado.theLoveLetterMystery(entrada);

        assertEquals(experado, resultado);

    }

    @Test
    public void TestTheLoveLetterMystery4() {

        String entrada = "cba";
        int experado = 2;

        int resultado = Resultado.theLoveLetterMystery(entrada);

        assertEquals(experado, resultado);

    }

}
