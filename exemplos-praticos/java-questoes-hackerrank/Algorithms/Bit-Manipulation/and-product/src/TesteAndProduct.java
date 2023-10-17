import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TesteAndProduct {
    
    @Test
    public void testeCaso1() {

        // Lista de argumentos dos casos de teste
        List<long[]> testCases = Arrays.asList(
                new long[]{12, 15, 12},   // (12 & 13 & 14 & 15) = 12
                new long[]{2, 3, 2},      // (2 & 3) = 2
                new long[]{8, 13, 8}      // (8 & 9 & 10 & 11 & 12 & 13) = 8
        );

        // Iterar sobre os casos de teste
        for (long[] testCase : testCases) {

            // Obter os valores de entrada a e b
            long a = testCase[0];
            long b = testCase[1];

            // Obter o valor esperado do resultado
            long expected = testCase[2];

            // Chamar o método andProduct para obter o resultado atual
            long result = Resultado.andProduct(a, b);

            // Verificar se o resultado atual é igual ao valor esperado
            assertEquals(expected, result);
        }
    }

    @Test
    public void testeCaso2() {

        List<long[]> testeCasos = Arrays.asList(

            new long[] {17, 23, 16},
            new long[] {11, 15, 8}
        );

        for (long[] testeCaso : testeCasos) {
            
            long a = testeCaso[0];
            long b = testeCaso[1];

            long esperado = testeCaso[2];

            long resultado = Resultado.andProduct(a, b);

            assertEquals(esperado, resultado);
        }
    }

    @Test
    public void testeCaso3() {
        long a = 8;
        long b = 13;
        long esperado = 8;

        long resultado = Resultado.andProduct(a, b);
        assertEquals(esperado, resultado);
    }
}
