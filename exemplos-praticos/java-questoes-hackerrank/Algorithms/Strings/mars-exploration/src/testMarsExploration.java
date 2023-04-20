import static org.junit.Assert.assertEquals;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;

public class testMarsExploration {
    
    @Test
    public void testMarsExploration1() {

        assertEquals(0, Resultado.marsExploration("SOSSOSSOS"));
        assertEquals(1, Resultado.marsExploration("SOSSOT"));
        assertEquals(2, Resultado.marsExploration("SOSSOTT"));
        assertEquals(3, Resultado.marsExploration("SOSSPSSQSSOR"));
    }
    
}
