public class Estudante {
    
    private int rolo;
    private String nome;

    public int getRolo() {

        return rolo;
    }

    public void setRolo(int rolo) {

        this.rolo = rolo;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void mostrar() {

        System.out.println("Lista no: " + rolo);
        System.out.println("Estudante nome: " + nome);
    }
}

