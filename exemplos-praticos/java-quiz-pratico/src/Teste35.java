public class Teste35 {

    // Qual é a saída do programa abaixo?
    
    public static void main(String[] args) throws InterruptedException{
        
        String str = new String("JAVAQUIZ");

        str = null;

        System.gc();

        Thread.sleep(1000);

        System.out.println("fim do metodo principal");
    }

    @Override
    protected void finalize() throws Throwable {
        
        System.out.println("método finalize chamado");
        
    }
}

// Resposta: fim do metodo principal
