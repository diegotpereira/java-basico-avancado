import java.util.LinkedList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + idade;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (idade != other.idade)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
    public static void main(String[] args) {
        List<Pessoa> listaDePessoas = new LinkedList<>();

        Pessoa pessoa1 = new Pessoa("Bob", "1234567789", 20);
        Pessoa pessoa2 = new Pessoa("Bob", "1234567789", 20);

        listaDePessoas.add(pessoa1);

        if (listaDePessoas.contains(pessoa2)) {
            System.out.println("Pessoa já existe na lista");
        }
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Lista vazia: " + listaDePessoas.isEmpty());
    }
}