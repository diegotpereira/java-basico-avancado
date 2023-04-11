class Arvore {

    int valor;
    Arvore esquerda;
    Arvore direita;

    Arvore(int valor) {
        this.valor = valor;
        esquerda = null;
        direita = null;
    }
}

class BuscaEmProfundidade {
    
    void PrimeiraPesquisaProfundidade(Arvore arvore) {

        if (arvore == null) return;

        System.out.print(arvore.valor + " ");
        PrimeiraPesquisaProfundidade(arvore.esquerda);
        PrimeiraPesquisaProfundidade(arvore.direita);
    }

    public static void main(String[] args) {
        
        Arvore root = new Arvore(1);
        root.esquerda = new Arvore(2);
        root.direita = new Arvore(3);
        root.esquerda.esquerda = new Arvore(4);
        root.direita.direita = new Arvore(5);

        BuscaEmProfundidade primeira = new BuscaEmProfundidade();
        primeira.PrimeiraPesquisaProfundidade(root);
    }
}
