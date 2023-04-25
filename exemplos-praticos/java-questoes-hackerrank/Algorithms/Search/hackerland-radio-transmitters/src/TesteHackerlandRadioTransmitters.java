import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteHackerlandRadioTransmitters {
    
    @Test
    public void testeCaso1() {

        List<Integer> casas = Arrays.asList(1, 2, 3, 4, 5);
        int alcance = 1;
        int experado = 2;
        int resultado = Resultado.hackerlandRadioTransmitters(casas, alcance);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso2() {

        List<Integer> casas = Arrays.asList(7, 2, 4, 6, 5, 9, 12, 11);
        int alcance = 2;
        int experado = 3;
        int resultado = Resultado.hackerlandRadioTransmitters(casas, alcance);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso3() {

        List<Integer> casas = Arrays.asList(1, 2, 3, 5, 9);
        int alcance = 1;
        int experado = 3;
        int resultado = Resultado.hackerlandRadioTransmitters(casas, alcance);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso4() {

        List<Integer> casas = Arrays.asList(9, 5, 4, 2, 6, 15, 12);
        int alcance = 2;
        int experado = 4;
        int resultado = Resultado.hackerlandRadioTransmitters(casas, alcance);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso5() {

        List<Integer> casas = Arrays.asList(2, 2, 2, 2, 1, 1, 1, 1);
        int alcance = 2;
        int experado = 1;
        int resultado = Resultado.hackerlandRadioTransmitters(casas, alcance);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso6() {

        List<Integer> casas = Arrays.asList(10, 10, 10);
        int alcance = 3;
        int experado = 1;
        int resultado = Resultado.hackerlandRadioTransmitters(casas, alcance);

        assertEquals(experado, resultado);
    }

    @Test
    public void TesteCaso7() {

        List<Integer> casas = Arrays.asList(1);
        int alcance = 1;
        int experado = 1;
        int resultado = Resultado.hackerlandRadioTransmitters(casas, alcance);

        assertEquals(experado, resultado);
    }
}
