public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("substituir todos os caracteres velhoChar por caracteres novoChar.");

        String s1 = new String("A raposa saltou rápido!.");
        
        System.out.println("A String Original é : " + s1);

        System.out.println("String depois de substituir 'fox'  com 'cachorro': " + s1.replace("raposa", "lebre"));

        System.out.println("String depois de substituir todos 't' com 'a' : " + s1.replace('t', 'a'));
    }
}
