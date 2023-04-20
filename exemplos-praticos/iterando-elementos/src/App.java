import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        List<Livro> compras = new ArrayList<Livro>();

        compras.add(new Livro("Java", 25.50));
        compras.add(new Livro("HTML", 21.30));
        compras.add(new Livro("Android", 22.54));

        double total = 0;

        for(int indice = 0; indice < compras.size(); indice += 1) {

            total = total + compras.get(indice).getPreco();
        }
        
        System.out.println(total);

        for(Livro livro : compras) {

            System.out.println(livro.getNome());
        }

        compras.forEach(livro -> System.out.println(livro.getNome()));
    }
}

class Livro {

    private String nome;
    private double preco;
    
    public Livro(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    


}