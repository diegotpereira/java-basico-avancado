import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String resultado = Resultado.superReducedString(s);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class Resultado {

    public static String superReducedString(String s) {

        for (int index = 1; index < s.length(); index += 1) {
            
            if (s.charAt(index) == s.charAt(index - 1)) {
                
                s = s.substring(0, index - 1) + s.substring(index + 1); 
                index = 0;

            }
        }
        return s.length() == 0 ? "Empty String" : s;
    }

    // public static String superReducedString(String s) {

    //     for (int index = 1; index < s.length(); index += 1) {
            
    //         char atual = s.charAt(index);
    //         char anterior = s.charAt(index - 1);

    //         if(atual == anterior) {

    //             s = s.substring(0, index - 1) + s.substring(index + 1);
    //             index = 0;
    //         }
    //     }
    //     return s.length() > 1 ? s : "Empty String";
    // }

    // public static String superReducedString(String s) {

    //     char[] resultado = new char[s.length()];
    //     int resultadoTamanho = 0;

    //     for (int index = 0; index < s.length(); index += 1) {
            
    //         char atual = s.charAt(index);

    //         if (resultadoTamanho == 0 || resultado[resultadoTamanho - 1] != atual ) {
                
    //             resultado[resultadoTamanho] = atual;
    //             resultadoTamanho++;

    //         } else {

    //             resultadoTamanho--;
    //         }
    //     }

    //     if(resultadoTamanho == 0) return "Empty String";

    //     return new String(resultado, 0, resultadoTamanho);
    // }


    // public static String superReducedString(String s) {

    //     for(int i=1;i<s.length();i++){
    //         char ch=s.charAt(i);
    //         char c = s.charAt(i-1);
    //         if(ch==c){
    //             s = s.substring(0,i-1)+s.substring(i+1);
    //             i=0;
    //         }  
    //     }
    //     return s.length()>1?s:"Empty String";
        
    //     StringBuilder sb = new StringBuilder(s);
        
    //     for (int index = 0; index < sb.length() - 1; index += 1) {
            
    //         if(sb.charAt(index) == sb.charAt(index + 1)) {
                
    //             sb.delete(index, index + 2);
                
    //             // reduzindo index
    //             index = -1;
        
    //         }
    //     }
        
    //     if(sb.length() == 0) {
            
    //         return "Empty String";
    //     }
        
    //     return String.valueOf(sb);

    // }
}
