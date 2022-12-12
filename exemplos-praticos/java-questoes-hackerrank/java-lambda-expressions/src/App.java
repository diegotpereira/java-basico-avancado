import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

interface ExecutarOperacao {

    boolean verifique(int a);
}

class MinhaMatematica {

    public static boolean verifique (ExecutarOperacao p, int num) {

        return p.verifique(num);
    }

    ExecutarOperacao ehPar() {

        ExecutarOperacao eo = (int a)-> a % 2 == 0 ? false : true;

        return eo;
    }

    ExecutarOperacao ehPrimo() {

        ExecutarOperacao eo = (int a)-> {

            if(a == 1)

                return true;
           
            else {

                for(int i = 2; i < Math.sqrt(a); i++) 

                    if(a % i == 0)

                        return false;

                    return true;
                
            }    
        };

        return eo;
    }
    ExecutarOperacao ehPalindrome() {

        ArrayList<Integer> aa = new ArrayList<>();

        ExecutarOperacao eo = (int a)-> {

            String str = Integer.toString(a);
            String reverte = "";

            for(int i = str.length() - 1; i >= 0; i--) {

                reverte = reverte + str.charAt(i);
            }

            if(reverte.equals(str))

                return true;

            return false;
        };

        return eo;
    }
}




public class App {
    public static void main(String[] args) throws Exception {

        MinhaMatematica mm = new MinhaMatematica();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        ExecutarOperacao eo;

        boolean ret = false;
        String ans = null;

        while (T--> 0) {
            
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if(ch == 1) {

                eo = mm.ehPar();
                ret = mm.verifique(eo, num);
                ans = (ret) ? "IMPAR" : "ATÉ";

            } else if (ch == 2) {
                
                eo = mm.ehPrimo();
                ret = mm.verifique(eo, num);
                ans = (ret) ? "PRIMO" : "COMPOSTO";

            } else if (ch == 3) {
                
                eo = mm.ehPalindrome();
                ret = mm.verifique(eo, num);
                ans = (ret) ? "PALINDROME" : "NAO PALINDROME";
            }

            System.out.println(ans);
        }
    }
}
