
// Você pode ter funções virtuais em Java?

// Em Java, todos os métodos não estáticos são, por padrão, funções virtuais. 
// Apenas os métodos marcados com a palavra-chave final, que não pode ser substituído, 
// junto com private methods, que não são herdados, não são virtuais.


// Exemplo: função virtual com interface

interface Bicicleta {

    void aplicarFreio();
}

class QuizBicicleta implements Bicicleta{

    public void aplicarFreio() {

        System.out.println("Freios Aplicados");
    }
}
