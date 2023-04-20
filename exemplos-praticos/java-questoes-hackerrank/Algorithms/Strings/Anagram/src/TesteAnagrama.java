import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteAnagrama {

    @Test
    public void TestAnagrama1() {

        String entrada = "aaabbb";
        int experado = 3;

        int resultado = Resultado.anagram(entrada);

        assertEquals(experado, resultado);
    }

    @Test
    public void TestAnagrama2() {

        String entrada = "ab";
        int experado = 1;

        int resultado = Resultado.anagram(entrada);

        assertEquals(experado, resultado);
    }

    @Test
    public void TestAnagrama3() {

        String entrada = "abc";
        int experado = -1;

        int resultado = Resultado.anagram(entrada);

        assertEquals(experado, resultado);
    }

    @Test
    public void TestAnagrama4() {

        String entrada = "mnop";
        int experado = 2;

        int resultado = Resultado.anagram(entrada);

        assertEquals(experado, resultado);
    }

    @Test
    public void TestAnagrama5() {

        String entrada = "xyyx";
        int experado = 0;

        int resultado = Resultado.anagram(entrada);

        assertEquals(experado, resultado);
    }

    @Test
    public void TestAnagrama6() {

        String entrada = "xaxbbbxx";
        int experado = 1;

        int resultado = Resultado.anagram(entrada);

        assertEquals(experado, resultado);
    }

    @Test
    public void TestAnagrama7() {

        String entrada = "asdfjoieufoa";
        int experado = 3;

        int resultado = Resultado.anagram(entrada);

        assertEquals(experado, resultado);
    }

    @Test
    public void TestAnagrama8() {

        String entrada = "fdhlvosfpafhalll";
        int experado = 5;

        int resultado = Resultado.anagram(entrada);

        assertEquals(experado, resultado);
    }

    @Test
    public void TestAnagrama9() {

        String entrada = "mvdalvkiopaufl";
        int experado = 5;

        int resultado = Resultado.anagram(entrada);

        assertEquals(experado, resultado);
    }
}
