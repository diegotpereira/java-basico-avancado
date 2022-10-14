public class Teste26 {
    
    // Qual é a saída do programa abaixo?

    public static void main(String[] args) {
        
        Teste26 obj = new Teste26();
        obj.iniciar();
    }
    void iniciar() {

        String strA = "do";
        String strB = metodo(strA);

        System.out.println(": " + strA + strB);
    }

    String metodo(String strA) {
        strA = strA + "good";

        System.out.println(strA);

        return " good";
    }
    // A. dogood : dogoodgood
    // B. dogood : gooddogood
    // C. dogood : dodogood
    // D. dogood : dogood

    // Resposta: 
}
