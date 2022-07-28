
public class Carro {

    public int tamanhoTanque;
    public int combustivelMaximo;
    public int combustivelRestante;
    public int combustivelPorQuilometro;
    public int restante;
    
    public Carro(int combustivelMaximo, int combustivelPorQuilometro) {
        this.combustivelMaximo = combustivelMaximo;
        this.combustivelPorQuilometro = combustivelPorQuilometro;
    }

    public void dirigir(int quilomretros) {

    }
    public int obterCombustivelRestante() {

        return combustivelRestante;
    }
    public int reabastecer(int livros) {

        return combustivelMaximo = 100;
    }
}
