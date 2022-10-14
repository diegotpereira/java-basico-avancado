public class TestandoMetodo8 {

    // Qual é a saída do programa Java abaixo?

    public static void main(String[] args) {
        
        AlgumaClasse algumaClasse1 = new AlgumaClasse();

        System.out.println("Antes: " + algumaClasse1.lote);

        AlgumaClasse algumaClasse2 = new AlgumaClasse();
        algumaClasse2.lote = 'B';

        System.out.println("Depois: " + algumaClasse1.lote);

    }
    // A)
    // Antes: A 
    // Depois: B

    // B)
    // Antes: A 
    // Depois: 
    
    // C)
    // Antes: A 
    // Depois:

    // D)
    // Antes: B 
    // Depois: B

    // Resposta: B. Antes: A, Depois: A - A variável de instância "lote" é separada para cada instância
                                       // Portanto, as alterações em um objeto de instância não afetam outro objeto de instância.
}

class AlgumaClasse {

    char lote = 'A';
}
