import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        // matriz de n Objetos do jogador
        Jogador[] jogador = new Jogador[n];
        Verificar verificar = new Verificar();

        for(int i = 0; i < n; i++) {

            jogador[i] = new Jogador(teclado.next(), teclado.nextInt());
        }

        Arrays.sort(jogador, verificar);

        for(int i = 0; i < jogador.length; i++) {

            System.out.printf("%s %s\n", jogador[i].nome, jogador[i].pontuacao);
        }

        teclado.close();
    }
}

class Jogador {

    String nome;
    int pontuacao;

    Jogador(String nome, int pontuacao) {

        this.nome = nome;
        this.pontuacao = pontuacao;
    }
}

// comparador que classifica em ordem decrescente de pontuação
class Verificar implements Comparator <Jogador>{

    @Override
    public int compare(Jogador jogador1, Jogador jogador2) {
        // TODO Auto-generated method stub

        if(jogador1.pontuacao ==  jogador2.pontuacao) {

            return jogador1.nome.compareTo(jogador2.nome);
        }
        // E se 2 ou mais jogadores tiverem a mesma pontuação, classifique esses jogadores em ordem alfabética por nome.
        return ((Integer) jogador2.pontuacao).compareTo(jogador1.pontuacao);
    }

}