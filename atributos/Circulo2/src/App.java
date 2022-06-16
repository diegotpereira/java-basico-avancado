public class App {
    public static void main(String[] args) throws Exception {

        Circulo umCirculo;
    
        umCirculo = new Circulo();

        umCirculo.x =  0;
        umCirculo.y = 0;
        umCirculo.raio = 12;

        umCirculo.mostra();
    
        umCirculo.move(10, 10);

        umCirculo.mostra();

        umCirculo.x = 100;

        umCirculo.mostra();
        
    }
}
