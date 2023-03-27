import org.junit.Test;
import org.junit.Assert;

public class app1 {
    
    @Test
    public void testaSoma() {

        int a = 2;
        int b = 3;
        int resultadoEsperado = 5;
        int resultado = soma(a, b);

        Assert.assertEquals(resultadoEsperado, resultado);
    }

    private int soma(int a, int b) {

        return a + b;
    }
}
