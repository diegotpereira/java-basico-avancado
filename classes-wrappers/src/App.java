public class App {
    public static void main(String[] args) throws Exception {

        Integer meuInt = 5;
        Double meuDouble = 5.99;
        Character meuCaracter = 'A';

        System.out.println(meuInt.intValue());
        System.out.println(meuDouble.doubleValue());
        System.out.println(meuCaracter.charValue());

        // toString(), length
        Integer meuInteiro = 100;
        String meuString = meuInteiro.toString();

        System.out.println(meuString.length());
    }
}
