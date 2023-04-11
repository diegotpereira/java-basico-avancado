import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResultadoTeste {

    @Test
    public void testeCaesarCipher() {

        String entrada = "Always-Look-on-the-Bright-Side-of-Life";

        int k = 5;

        String experado = "Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj";

        String atual = Resultado.caesarCipher(entrada, k);

        assertEquals(experado, atual);
    }

    @Test
    public void testeCaesarCipher1() {

        String entrada = "middle-Outz";

        int k = 2;

        String experado = "okffng-Qwvb";

        String atual = Resultado.caesarCipher(entrada, k);

        assertEquals(experado, atual);
    }
    
}
