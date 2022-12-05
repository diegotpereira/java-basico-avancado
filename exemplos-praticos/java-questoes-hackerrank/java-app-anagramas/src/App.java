import java.util.Arrays;
import java.util.Scanner;

public class App {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            
            return false;
        }
        
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        String sc1 = new String(c1);
        String sc2 = new String(c2);
        
        return sc1.equals(sc2);
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
