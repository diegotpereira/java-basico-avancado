import static org.junit.Assert.assertEquals;
import java.util.*;

import org.junit.Test;

public class TesteQueensAttack {

    @Test
    public void testeCaso1() {

        int n = 4; 
        int k = 0; 
        int r_q = 4; 
        int c_q = 4; 
        List<List<Integer>> obstacles = new ArrayList<>();

        int esperado = 9;

        int resultado = Resultado.queensAttack(n, k, r_q, c_q, obstacles);

        assertEquals(esperado, resultado);
    }
}
