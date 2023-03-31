import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

import javax.management.RuntimeErrorException;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int r = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int c = Integer.parseInt(primeiraMultiplaEntrada[1]);
        int n = Integer.parseInt(primeiraMultiplaEntrada[3]);

        List<String> grade = IntStream.range(0, r).mapToObj(i -> {
            
            try {
                return bufferedReader.readLine();

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        }).collect(toList());

        List<String> resultado = Resultado.bomberMan(n, grade);

        bufferedWriter.write(resultado.stream().collect(joining("\n")));

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Resultado {

    public static List<String> bomberMan(int n, List<String> grid) {
        
        char[][] newGrid = new char[grid.size()][grid.get(0).length()];
        for (int i = 0; i < newGrid.length; i++) {
            for (int j = 0; j < newGrid[0].length; j++) {
                newGrid[i][j] = grid.get(i).charAt(j);
            }
        }
        
        char[][] firstState = getStates(newGrid, false);
        char[][] secondState = getStates(firstState, false);
        
        boolean next = false;
        int state = -1;
        
        for (int i = 2; i <= n; i++) {
            if (state != 0) {
                state = 0;
                continue;
            }
            
            if (next) state = 1;
            else state = 2;
            next = !next;
        }
        
        if (state == -1) return grid;
        if (state == 0) return convertBack(firstState, true);
        if (next) return convertBack(firstState, false);
        return convertBack(secondState, false);
    }
    
    private static List<String> convertBack(char[][] grid, boolean empty) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            StringBuilder cur = new StringBuilder();
            for (int j = 0; j < grid[0].length; j++) {
                if (empty) cur.append('O');
                else cur.append(grid[i][j]);
            }
            
            res.add(cur.toString());
        }
        
        return res;
    }
    
    private static char[][] getStates(char[][] grid, boolean fill) {
        Set<Integer[]> bombs = new HashSet<>();
        char[][] newGrid = new char[grid.length][grid[0].length];
        
        for (int i = 0; i < grid.length; i++) {
            newGrid[i] = grid[i].clone();
        }
        
        for (int i = 0; i < newGrid.length; i++) {
            for (int j = 0; j < newGrid[i].length; j++) {
                if (newGrid[i][j] == 'O') bombs.add(new Integer[] {i, j});
                else newGrid[i][j] = 'O';
            }
        }
        
        for (Integer[] bomb : bombs) {
            newGrid[bomb[0]][bomb[1]] = '.';
            if (bomb[0] - 1 >= 0) newGrid[bomb[0] - 1][bomb[1]] = '.';
            if (bomb[1] + 1 < newGrid[0].length) newGrid[bomb[0]][bomb[1] + 1] = '.';
            if (bomb[0] + 1 < newGrid.length) newGrid[bomb[0] + 1][bomb[1]] = '.';
            if (bomb[1] - 1 >= 0) newGrid[bomb[0]][bomb[1] - 1] = '.';
        }
        
        return newGrid;
    }

    
}