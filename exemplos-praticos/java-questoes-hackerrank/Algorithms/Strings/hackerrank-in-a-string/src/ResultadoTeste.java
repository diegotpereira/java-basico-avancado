import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResultadoTeste {

    @Test
    public void testHackerrankInString() {

        String entrada = "hereiamstackerrank";
        String experado = "YES";
        String resultado = Resultado.hackerrankInString(entrada);

        assertEquals(experado, resultado);
    }
    
    @Test 
    public void testHackerrankInString1() {

        String entrada = "hhaacckkekraraannk";
        String experado = "YES";
        String resultado = Resultado.hackerrankInString(entrada);

        assertEquals(experado, resultado);
    }

    @Test 
    public void testHackerrankInString2() {

        String entrada = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        String experado = "NO";
        String resultado = Resultado.hackerrankInString(entrada);

        assertEquals(experado, resultado);
    }

    @Test
    public void testHackerrankInString3() {

        String entrada = "hereiamstackerrank";
        String experado = "YES";
        String resultado = Resultado.hackerrankInString(entrada);

        assertEquals(experado, resultado);
    }

    @Test
    public void testHackerrankInString4() {

        String entrada = "hackerworld";
        String experado = "NO";
        String resultado = Resultado.hackerrankInString(entrada);

        assertEquals(experado, resultado);

    }
}
