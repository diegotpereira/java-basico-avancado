import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResultadoTeste {
    
    @Test
    public void testeCamelcase() {

        String s = "helloWorld";
        int experado = 2;
        int atual = Resultado.camelcase(s);

        assertEquals(experado, atual);
    }

    @Test
    public void testeCamelcase1() {

        String s = "meuAplicativoDeTeste";
        int experado = 4;
        int atual = Resultado.camelcase(s);

        assertEquals(experado, atual);
    }
}
