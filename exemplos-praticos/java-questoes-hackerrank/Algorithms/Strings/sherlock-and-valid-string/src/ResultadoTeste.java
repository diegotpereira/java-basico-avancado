import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResultadoTeste {
    
    @Test
    public void testIsValidForValidInput() {

        String entrada = "aabbc";
        String experado = "YES";
        String atual = Resultado.isValid(entrada);
        assertEquals(experado, atual);
    }

    // @Test
    // public void testIsValidForValidInput() {
        
    //     String entrada = "aabbcd";
    //     String experado = "NO";
    //     String atual = Resultado.isValid(entrada);

    //     assertEquals(experado, atual);
    // }

    // @Test
    // public void testIsValidForValidInput() {
        
    //     String entrada = null;
    //     String experado = "YES";
    //     String atual = Resultado.isValid(entrada);

    //     assertEquals(experado, atual);
    // }
}

