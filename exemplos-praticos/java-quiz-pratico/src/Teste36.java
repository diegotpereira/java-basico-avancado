public class Teste36 {
    
    public static void main(String[] args) throws InterruptedException{
        
        Teste36 teste36 = new Teste36();

        teste36 = null;

        System.gc();

        Thread.sleep(1000);

        System.out.println("fim metodo principal");
    }

    @Override
    protected void finalize() throws Throwable {
        
        System.out.println("metodo finalize chamado");
        System.out.println(10/0);
    }
}

// Resposta: metodo finalize chamado
            // fim metodo principal
            // Quando o Garbage Collector chama o método finalize() em um objeto,
            // ele ignora todas as exceções levantadas no método e o programa termina normalmente.