// import java.util.Arrays;
// import java.util.Comparator;

// public class Teste14 {
    
//     public static void main(String[] args) {
        
//         // Qual será a saída?

//         String[] ar = { "c", "d", "b", "a", "e"};

//         ClasseAninhada in = new ClasseAninhada();

//         Arrays.sort(ar, in);

//         for(String str : ar)

//         System.out.print(str + " ");
//         System.out.println(Arrays.binarySearch(ar, "b"));
//     }
//     static class ClasseAninhada implements Comparator<String> {

//         @Override
//         public int compare(String s1, String s2) {
            
//             return s2.compareTo(s1);
//         }
//     }
// }

// // Resposta e d c b a -1 - compareTo() fará a ordenação inversa.
// // binarySearch() fornece –1 porque deveria ter sido invocado usando o mesmo Comparador que foi usado durante a ordenação reversa do array.