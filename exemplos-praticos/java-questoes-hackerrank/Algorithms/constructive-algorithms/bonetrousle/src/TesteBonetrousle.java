import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class TesteBonetrousle {

    @Test
    public void testeCaso1() {

        long numeroTones = 12;
        long tamanhoCaixas = 8;
        int quantidadeCaixas = 3;

        List<Long> esperado = new ArrayList<>();

        esperado.addAll(Arrays.asList(3L, 4L, 5L));

        List<Long> resultado = Resultado.bonetrousle(numeroTones, tamanhoCaixas, quantidadeCaixas);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso2() {

        long numeroTones = 10;
        long tamanhoCaixas = 3;
        int quantidadeCaixas = 3;

        List<Long> esperado = new ArrayList<>();

        esperado.addAll(Arrays.asList(-1L));

        List<Long> resultado = Resultado.bonetrousle(numeroTones, tamanhoCaixas, quantidadeCaixas);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso3() {

        long numeroTones = 9;
        long tamanhoCaixas = 10;
        int quantidadeCaixas = 2;

        List<Long> esperado = new ArrayList<>();

        esperado.addAll(Arrays.asList(4L, 5L));

        List<Long> resultado = Resultado.bonetrousle(numeroTones, tamanhoCaixas, quantidadeCaixas);

        assertEquals(esperado, resultado);

    }
    
}
