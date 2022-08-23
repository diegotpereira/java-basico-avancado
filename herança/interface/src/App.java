public class App implements AnimalEstimcao{
    public static void main(String[] args) throws Exception {
        
        AnimalEstimcao a = new App();
        a.teste();
    }

    @Override
    public void teste() {
        
        System.out.println("Método de interface implementado");
        
    }
}

interface AnimalEstimcao {

    public void teste();
}