public class Teste25 {
    
    int contar = 0;

    void A() throws Exception {

        try {
            
            contar++;

            try {
                
                contar++;

                try {
                    
                    contar++;

                    throw new Exception();

                } catch (Exception e) {
                    contar++;
                }
            } catch (Exception e) {
                contar++;
            }
        } catch (Exception e) {
            contar++;
        }
    }
    void exibir() {
        System.out.println(contar); // saída: 5
    }
    public static void main(String[] args) throws Exception {
        
        Teste25 obj = new Teste25();
        obj.A();
        obj.exibir();

    }

    // A. 4
    // B. 5
    // C. 6
    // D. Erro de compilação

    // Resposta: B. 5
}
