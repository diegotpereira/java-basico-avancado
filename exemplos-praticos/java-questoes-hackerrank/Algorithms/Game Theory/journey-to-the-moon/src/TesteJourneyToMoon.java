import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;

public class TesteJourneyToMoon {

    @Test
    public void testeCaso1() {

        int numeroAstronautas = 5;
        List<List<Integer>> astronauta = new ArrayList<>();

        astronauta.add(Arrays.asList(0, 1));
        astronauta.add(Arrays.asList(2, 3));
        astronauta.add(Arrays.asList(0, 4));

        int esperado = 6;
        long resultado = Resultado.journeyToMoon(numeroAstronautas, astronauta);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        int numeroAstronautas = 4;
        List<List<Integer>> astronauta = new ArrayList<>();

        astronauta.add(Arrays.asList(0, 2));

        int esperado = 5;
        long resultado = Resultado.journeyToMoon(numeroAstronautas, astronauta);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        int numeroAstronautas = 10;
        List<List<Integer>> astronauta = new ArrayList<>();

        astronauta.add(Arrays.asList(0, 2));
        astronauta.add(Arrays.asList(1, 8));
        astronauta.add(Arrays.asList(1, 4));
        astronauta.add(Arrays.asList(2, 8));
        astronauta.add(Arrays.asList(2, 6));
        astronauta.add(Arrays.asList(3, 5));
        astronauta.add(Arrays.asList(6, 9));
        
        int esperado = 23;
        long resultado = Resultado.journeyToMoon(numeroAstronautas, astronauta);

        assertEquals(esperado, resultado);
    }
}
