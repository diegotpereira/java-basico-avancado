import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {

            try {
                
                String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int R = Integer.parseInt(primeiraMultiplaEntrada[0]);
                int C = Integer.parseInt(primeiraMultiplaEntrada[1]);

                List<String> G = IntStream.range(0, R).mapToObj(i -> {

                    try {
                        
                        return bufferedReader.readLine();

                    } catch (IOException e) {
                        
                        throw new RuntimeException(e);
                    }
                }).collect(toList());

                String[] segundaMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int r = Integer.parseInt(segundaMultiplaEntrada[0]);
                
                int c = Integer.parseInt(segundaMultiplaEntrada[1]);

                List<String> P = IntStream.range(0, r).mapToObj(i -> {

                    try {
                        
                        return bufferedReader.readLine();

                    } catch (IOException e) {
                        
                        throw new RuntimeException(e);
                    }
                }).collect(toList());
                
                String resultado = Resultado.gridSearch(G, P);

                bufferedWriter.write(resultado);
                bufferedWriter.newLine();

                
            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });
        
        bufferedReader.close();
        bufferedWriter.close();
    }
}


class Resultado{

    public static String gridSearch(List<String> g, List<String> p) {

        for (int i = 0; i <= g.size() - p.size(); i++) {
            
            if (g.get(i).contains(p.get(0))) {
                
                int indice = g.get(i).indexOf(p.get(0));

                for (int j = 0; j < i + p.size(); j++) {
                    
                    int k = 0;

                    while (indice + k < g.get(i).length() && k < p.get(0).length()) {
                        
                        if (g.get(j).charAt(indice + k) != p.get(j - i).charAt(k)) {
                            
                            int novoIndice = g.get(i).subSequence(indice + 1, g.get(i).length()).toString().indexOf(p.get(0));

                            indice = indice + novoIndice + 1;
                            k = 0;
                            j = i;

                            if (novoIndice ==  -1) {
                                
                                indice = g.get(j).length();
                                break;
                            }
                        } else {

                            k++;
                        }
                    }

                    if (j == i + p.size() - 1 && k == p.get(0).length()) {
                        
                        return "YES";
                    }

                    if (indice > g.get(j).length() - p.get(0).length()) {
                        
                        break;
                    }
                }
            }
        }
        return "NO";
    }

    // public static String gridSearch(List<String> g, List<String> p) {

    //     for (int x = 0; x <= g.get(0).length() - p.get(0).length(); x++) {
            
    //         for (int y = 0; y <= g.size() - p.size(); y++) {
                
    //             if (ehCompativel(x, y, g, p)) {
                    
    //                 return "YES";
    //             }
    //         }
    //     }
    //     return "NO";
    // }

    // static boolean ehCompativel(int x, int y, List<String> G, List<String> P) {

    //     int w = P.get(0).length();
    //     int h = P.size();

    //     for (int i = 0; i < h; i++) {
            
    //         for (int j = 0; j < w; j++) {
                
    //             if (P.get(i).charAt(j) != G.get(y + i).charAt(x + j)) {
                    
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
}