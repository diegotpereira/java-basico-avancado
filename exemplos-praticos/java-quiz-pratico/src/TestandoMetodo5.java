public class TestandoMetodo5 {
    
    // Qual é a saída do programa Java com variáveis ​​estáticas?

    static int gatos = 25;

    public static void main(String[] args) {
        
        TestandoMetodo5 testandoMetodo5 = new TestandoMetodo5();

        System.out.println("testandoMetodo5 PASSAROS antes = " + testandoMetodo5.gatos);

        TestandoMetodo5 testandoMetodo7 = new TestandoMetodo5();
        testandoMetodo7.gatos = 10;

        System.out.println("testandoMetodo5 depois = " + testandoMetodo5.gatos);
    }

    // A) 
    // testandoMetodo5 PASSAROS antes=25
    // testandoMetodo5 PASSAROS depois=25

    // B) 
    // testandoMetodo5 PASSAROS antes=25
    // testandoMetodo5 PASSAROS depois=10

    // C) 
    // testandoMetodo5 PASSAROS antes=25
    // testandoMetodo5 PASSAROS depois=0

    // D) Nenhum

    // Resposta: B. A variável estática "gatos" é comum a todos os objetos. Não há cópia separada como variáveis ​​não estáticas.

    
}
