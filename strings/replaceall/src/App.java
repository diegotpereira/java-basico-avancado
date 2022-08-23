public class App {
    public static void main(String[] args) throws Exception {

        String str = "Meu github/diegotpereira é um repositorio que oferece tutoriais gratuitos";

        // remover espaços em branco
        String str2 = str.replaceAll("\\s", "");
        System.out.println(str2);
    }
}
