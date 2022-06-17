public class App {
    public static void main(String[] args) throws Exception {

        // criar uma string 
        String txt = "Isso é um programa";
        String str1 = "programa";
        String str2 = "Programando";

        // verifica se o nome está presente no txt
        // usando contains()
        boolean resultado = txt.contains(str1);

        if (resultado) {
            System.out.println(str1 + " está presente na String.");
        } else {
            System.out.println(str1 + " não está presente na String.");
        }
        resultado = txt.contains(str2);

        if (resultado) {
            System.out.println(str2 + " está presente na String.");
        } else {
            System.out.println(str2 + " não está presente na String.");
        }
    }
}
