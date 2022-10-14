public class Teste43 {
    

    public static void main(String[] args) {
        
        // Como invertemos uma string?

        String str = "JavaScript";
        String reverte = new StringBuffer(str).reverse().toString();

        System.out.printf("Atual palavra: %s, Palavra depois de reverter %s", 
                          str, reverte); // saída: Atual palavra: JavaScript, Palavra depois de reverter tpircSavaJ
    }

    public static String reverte(String fonte) {

        if (fonte == null || fonte.isEmpty()) {
            
            return fonte;
        }

        String reverte = "";

        for(int i = fonte.length() - 1; i >= 0; i--) {

            reverte = reverte + fonte.charAt(i);
        }

        return reverte;
    }
}
