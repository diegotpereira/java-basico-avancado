import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TesteGridLandMetro {

    @Test
    public void testeCaso1() {

        List<List<Integer>> track = new ArrayList<>();

        int n = 4;
        int m = 4;
        int k = 3;

        track.add(Arrays.asList(2, 2, 3));
        track.add(Arrays.asList(3, 1, 4));
        track.add(Arrays.asList(4, 4, 4));
        int experado = 9;

        int resultado = GridLandMetro.gridlandMetro(n, m, k, track);

        assertEquals(experado, resultado);
    }

    // @Test
    // public void testeCaso2() {

    //     List<List<Integer>> track = new ArrayList<>();

    //     int n = 4;
    //     int m = 4;
    //     int k = 0;

    //     track.add(Arrays.asList(0));
        
    //     int experado = 16;

    //     int resultado = GridLandMetro.gridlandMetro(n, m, k, track);

    //     assertEquals(experado, resultado);
    // }
    
}
