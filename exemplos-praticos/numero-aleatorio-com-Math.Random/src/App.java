public class App {
    public static void main(String[] args) throws Exception {
        int min = 1;
        int max = 10;

        for(int index = min; index <= max; index++) {
            int buscarValorAleatorio = (int) (Math.random() * (max - min)) + min;
            System.out.println(buscarValorAleatorio);
        }
    }
}
