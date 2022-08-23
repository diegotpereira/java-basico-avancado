public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("O metodo Length() verifica comprimento de uma String");

        // declarar a String como um objeto S1 S2
        String s1 = "Olá Java Metodo String";
        String s2 = "RockStar";

        // método de String retorna o comprimento de uma String S1
        int comprimento = s1.length();

        System.out.println("O comprimento da String é: " + comprimento);
        
        // 8 Comprimento da String RockStar
        System.out.println("O comprimento da String é: "  + s2.length());
    }
}
