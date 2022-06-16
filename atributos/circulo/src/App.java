public class App {
    public static void main(String[] args) throws Exception {

        Circulo umCirculo;

        umCirculo = new Circulo();
        
        System.out.println("(" + umCirculo.x + "," + umCirculo.y + "," + umCirculo.raio + ")");

        umCirculo.x = umCirculo.x + 17;

        System.out.println("(" + umCirculo.x + "," + umCirculo.y + "," + umCirculo.raio + ")");
    }
}
