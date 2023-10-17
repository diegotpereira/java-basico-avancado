public class Resultado {

    // public static String stringsXOR(String s, String t) {

    //     // Inicialize uma string vazia para armazenar o resultado
    //     String res = new String("");

    //     // Percorra cada posição das strings 's' e 't'
    //     for (int i = 0; i < s.length(); i++) {
            
    //         // Verifique se os caracteres em 's' e 't' na posição 'i' são iguais
    //         if(s.charAt(i) == t.charAt(i))

    //            // Se forem iguais, concatene '0' ao resultado
    //            res = res.concat("0");

    //         else 
  
    //            // Se forem diferentes, concatene '1' ao resultado
    //            res = res.concat("1");
    //     }

    //     // Retorne a string resultante após a operação XOR bit a bit
    //     return res;
    // }

    public static String stringsXOR(String s, String t) {

        // Inicialize uma string vazia para armazenar o resultado
        String res = new String("");

        // Percorra cada posição das strings 's' e 't'
        for(int i = 0; i < s.length(); i++) {
        
            // Verifique se os caracteres em 's' e 't' na posição 'i' são iguais
            if(s.charAt(i) == t.charAt(i))
            
                // Se forem iguais, concatene '0' ao resultado
                res += "0";

            else

                // Se forem diferentes, concatene '1' ao resultado
                res += "1";
        }

        // Retorne a string resultante após a operação XOR bit a bit
        return res;

    }
    
}
