public class App {
    public static void main(String[] args) throws Exception {

        String str_Amostra = "a";

        System.out.println("Comparado a 'a' b é : " + str_Amostra.compareTo("b"));

        str_Amostra = "b";

        System.out.println("Comparado a 'b' a é : " + str_Amostra.compareTo("a"));

        str_Amostra = "b";

        System.out.println("Comparado a 'b' b é : " + str_Amostra.compareTo("b"));

        String str_Amostra1 = "RockStar";

        System.out.println("Comparado a 'RockStar': " + str_Amostra1.compareTo("rockstar"));

        // Comparado a - Caso Ignorado 
        System.out.println("Comparado a 'ROCKSTAR' - Caso Ignorado: " + str_Amostra1.compareToIgnoreCase("ROCKSTAR") );

        String s1 = "Guru1";
        String s2 = "Guru2";

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        // Comparando as duas Strings
        int s = s1.compareTo(s2);

        // Mostre os resultados da comparação.
        if (s < 0 ) {
            
            System.out.println("\"" + s1 + "\"" + " é lexicograficamente maior do que " + "\"" + s2 + "\"");

        } else if (s == 0) {
            
            System.out.println("\"" + s1 + "\"" + " é lexicograficamente igual a " + "\"" + s2 + "\"");

        } else if (s > 0) {
            
            System.out.println("\"" + s1 + "\"" + " é lexicograficamente menor que " + "\"" + s2 + "\"");
        }
    }
}
