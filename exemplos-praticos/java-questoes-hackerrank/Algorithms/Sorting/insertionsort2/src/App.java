import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> meuArr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

        Resultado.insertionSort2(n, meuArr);

        bufferedReader.close();
    }
}


















// import java.io.*;
// import java.util.*;
// import java.util.stream.*;

// import static java.util.stream.Collectors.toList;

// public class App {
//     public static void main(String[] args) throws Exception {

//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int n = Integer.parseInt(bufferedReader.readLine().trim());

//         String[] arrItens = bufferedReader.readLine().split(" ");

//         // List<Integer> meuArr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "")).map(Integer::parseInt).collect(toList());

//         List<Integer> meuArr = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
            
//             meuArr.add(Integer.parseInt(arrItens[i]));
//         }

//         Resultado.insertionSort2(n, meuArr);

//         System.out.println("Lista Ordenada:");

//         for (int num : meuArr) {
            
//             System.out.println(num + " ");
//         }

//         bufferedReader.close();
//     }
// }
