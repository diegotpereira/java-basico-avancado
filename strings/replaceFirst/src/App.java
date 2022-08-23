public class App {
    public static void main(String[] args) throws Exception {

        String str = "Este site fornece tutoriais gratuitos";

        // Substitua apenas os primeiros 's' por '9'
        String str1 = str.replaceFirst("s", "9");

        System.out.println(str1);
    }
}
