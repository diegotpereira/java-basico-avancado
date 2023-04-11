import static org.junit.Assert.assertEquals;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;

public class ResustadoTeste {
    
    @Test
    public void testMinimumNumber() {

        // Testa uma senha com comprimento mínimo e todos os requisitos atendidos
        assertEquals(0, Resultado.minimumNumber(6, "Abc123!"));

        // Testa uma senha que requer um caractere especial e um caractere maiúsculo
        assertEquals(2, Resultado.minimumNumber(8, "abc1234"));

        // Testa uma senha que requer um caractere especial, um caractere maiúsculo e um dígito
        // assertEquals(3, Resultado.minimumNumber(5, "aB1!@"));

        // Testa uma senha que requer um caractere especial, um caractere maiúsculo, um caractere minúsculo e um dígito
        assertEquals(0, Resultado.minimumNumber(12, "abcdEFG123!@#"));

        
    }
}
