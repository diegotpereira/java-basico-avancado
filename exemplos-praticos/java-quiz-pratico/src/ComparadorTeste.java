// import java.util.Arrays;
// import java.util.Comparator;

// public class ComparadorTeste {
    
//     public static void main(String[] args) {
        
//         String [] ar = { "c", "d", "b", "a", "e" };

//         ClasseInterna in = new ClasseInterna();

//         // parallelSort() também classifica uma array em ordem crescente 
//         // ou de acordo com o Comparador especificado.
//         Arrays.parallelSort(ar, in);

//         for(String str : ar) 

//         System.out.print(str + "");
//         System.out.print(Arrays.binarySearch(ar, "b"));
//     }

//     static class ClasseInterna implements Comparator<String> {

//         public int compare(String s1, String s2) {
    
//             return s2.compareTo(s1);
//         }
//     }
// }