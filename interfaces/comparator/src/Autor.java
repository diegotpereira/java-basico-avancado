/**
 * Autor Diego Pereira
 */
public class Autor  implements Comparable<Autor>{

    String nome;
    String livroNome;
    int auIdade;

    Autor(String nome, String livro, int idade) {
        this.nome = nome;
        this.livroNome = livro;
        this.auIdade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLivroNome() {
        return livroNome;
    }

    public void setLivroNome(String livroNome) {
        this.livroNome = livroNome;
    }

    public int getAuIdade() {
        return auIdade;
    }

    public void setAuIdade(int auIdade) {
        this.auIdade = auIdade;
    }

    @Override
    public int compareTo(Autor au) {
        // TODO Auto-generated method stub
        return this.nome.compareTo(au.nome);
    }
}