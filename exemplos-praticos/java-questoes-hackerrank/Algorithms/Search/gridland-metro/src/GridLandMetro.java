import java.util.*;

public class GridLandMetro {

    
    public static int gridlandMetro(int n, int m, int k, List<List<Integer>> track) {
        Map<Integer, List<Intervalo>> linhas = new HashMap<>();
    
        for (List<Integer> lista : track) {
            int r = lista.get(0);
            int c1 = lista.get(1);
            int c2 = lista.get(2);
    
            if (!linhas.containsKey(r)) {
                linhas.put(r, new ArrayList());
            }
    
            linhas.get(r).add(new Intervalo(c1, c2));
        }
    
        long total = (long) n * m;
    
        for (List<Intervalo> intervalos : linhas.values()) {
            Collections.sort(intervalos);
    
            int prevC2 = 0;
    
            for (Intervalo intervalo : intervalos) {
                int c1 = intervalo.c1;
                int c2 = intervalo.c2;
    
                if (c1 > prevC2) {
                    total -= (long) (Math.min(c2, m) - c1 + 1);
                    prevC2 = Math.max(prevC2, c2);
                } else if (c2 > prevC2) {
                    total -= (long) (Math.min(c2, m) - prevC2);
                    prevC2 = c2;
                }
            }
    
            if (prevC2 < m) {
                total -= (long) (m - prevC2);
            }
        }
    
        return (int) total;
    }
    
    
    // public static int gridlandMetro(int n, int m, int k, List<List<Integer>> track) {

    //     // System.out.println(n);
    //     // System.out.println(m);
    //     // System.out.println(k);
    //     // System.out.println(track);

    //     Map<Integer, List<Intervalo>> linhas = new HashMap<>();

    //     for (List<Integer> lista : track) {
            
    //         int r = lista.get(0);
    //         int c1 = lista.get(1);
    //         int c2 = lista.get(2);

    //         if (!linhas.containsKey(r)) {
                
    //             linhas.put(r, new ArrayList());

    //         }

    //         linhas.get(r).add(new Intervalo(c1, c2));
    //     }

    //     long total = (long) n * m;

    //     for (List<Intervalo> intervalos : linhas.values()) {
            
    //         Collections.sort(intervalos);

    //         int prevC2 = 0;

    //         for (Intervalo intervalo : intervalos) {
                
    //             int c1 = intervalo.c1;
    //             int c2 = intervalo.c2;

    //             if (c1 > prevC2) {
                    
    //                 total -= (long) (Math.min(c2, m) -  c1 + 1);
    //                 prevC2 = Math.max(prevC2, c2);

    //             } else {

    //                 total -= (long) (c2 - prevC2);
    //                 prevC2 = c2;
    //             }

    //             if (prevC2 < m) {
                    
    //                 total -= (long) (m - prevC2);
    //             }
    //         }
    //     }
    //     return (int) total;
    
    // }
}
