public class App {

    // metodo basico
    static void meuMetodo() {
        System.out.println("Acabei de ser executado!");
    }

    // Parâmetros e argumentos
    static void meuSegundoMetodo(String fnome) {
        System.out.println(fnome + " Marley");
    }

    // Multiplos parâmetros
    static void meuTerceiroMetodo(String fnome, int idade) {
        System.out.println("");
    }

    // A sobrecarga de métodos (overload) 
    static int sobrecargaMetodoInt(int x, int y) {
        return x + y;
    }
    static double sobrecargaMetodoDouble(double x, double y) {
        return x + y;
    }

    //  sobrecarregamos o plusMethod
    static int sobrecargaMetodo(int x, int y) {
        return x + y;
    }
    
    static double sobrecargaMetodo(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) throws Exception {
        int meuNum1 = sobrecargaMetodoInt(8, 5);
        double meuNum2 = sobrecargaMetodoDouble(4.3, 6.26);

        int meuNum3 = sobrecargaMetodo(8, 5);
        double meuNum4 = sobrecargaMetodo(4.3, 6.26);
        
        meuMetodo();

        meuSegundoMetodo("Bob");
        meuSegundoMetodo("Ziggy");
        meuSegundoMetodo("Damian");

        meuTerceiroMetodo("Bob Marley", 36);
        meuTerceiroMetodo("Ziggy Marley", 53);
        meuTerceiroMetodo("Damian Marley", 43);

        System.out.println("int: " + meuNum1);
        System.out.println("double: " + meuNum2);

        System.out.println("int: " + meuNum3);
        System.out.println("double: " + meuNum4);
    }
}
