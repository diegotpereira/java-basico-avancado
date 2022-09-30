public class Teste37 {
    
    static Teste37 t;
    static int contar = 0;

    public static void main(String[] args) throws InterruptedException{
        
        Teste37 teste37 = new Teste37();

        // tornando teste37 elegível para garbage collector
        teste37 = null;

        // chamando garbage collector
        System.gc();

        // esperando o gc terminar
        Thread.sleep(1000);

        t = null;

        System.gc();

        Thread.sleep(1000);

        System.out.println("metodo finalize chamado " + contar + " tempos");
    }

    @Override
    protected void finalize() throws Throwable {
        
        contar++;

        t = this;
    }
}

// Resposta: metodo finalize chamado 1 tempos