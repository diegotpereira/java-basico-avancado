public class Principal {
    public static void main(String[] args) {
        Trava umaTrava;

        umaTrava = new Trava();
        umaTrava.trave("ProgramaPrincipal");

        System.out.println(umaTrava.estado());

        umaTrava.destrave("ProgramaPrincipal");

        System.out.println(umaTrava.estado());
    }
}
