public class App {
    public static void main(String[] args) throws Exception {

        // criar uma string
        String txt = "Isso é um Programa";
        String str1 = "Programa";
        String str2 = "Programando";

        // verifica se str1 está presente no txt
        // usando indexOf()
        int resultado = txt.indexOf(str1);

        if (resultado ==  -1) {
            System.out.println(str1 + " não está presente na string.");
        } else {
            System.out.println(str1 + " está presente na string.");
        }

        
        // verifica se str2 está presente no txt
        // usando indexOf()
        resultado = txt.indexOf(str2);
        if (resultado == -1) {
            System.out.println(str2 + " não está presente na string.");
        } else {
            System.out.println(str2 + " está presente na string.");
        }
    }
}
