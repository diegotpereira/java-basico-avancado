import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

// Bob gosta muito de música, especialmente de músicas chamadas "tunes". Bob tem um aparelho de som que 
// ele costuma usar para ouvir músicas. O aparelho de som tem uma característica peculiar: ele permite 
// que o usuário escolha a quantidade exata de "tunes" que deseja ouvir. No entanto, as "tunes" estão 
// disponíveis em pacotes, e os pacotes têm tamanhos fixos.

// Um dia, Bob decidiu comprar uma nova coleção de "tunes" para o seu aparelho de som. O lojista lhe 
// disse que eles têm exatamente "n" "tunes" disponíveis à venda, numerados de 1 a n. Cada "tune" 
// individual tem um custo específico.

// Bob gostaria de comprar exatamente "k" "tunes" para o seu aparelho de som. Ele quer gastar a menor 
// quantia possível, portanto, ele deseja minimizar o custo. No entanto, ele também tem algumas restrições 
// sobre sua compra:

// Bob pode comprar qualquer quantidade de "tunes", desde que ele compre todos os "tunes" em um pacote completo.
// Bob não quer comprar mais de um "tune" do mesmo número.
// Bob quer comprar "k" "tunes".
// Dada a quantidade "n" de "tunes" disponíveis para compra, a quantidade "k" de "tunes" que Bob deseja 
// comprar e o número "b" de pacotes disponíveis, cada um com um tamanho específico, você deve ajudar 
// Bob a descobrir a forma de comprar os "tunes" que minimize o custo total.

// Você deve imprimir a lista de "tunes" que Bob deve comprar e, se não for possível comprar "k" "tunes", imprima -1.

public class Resultado {

    public static List<Long> bonetrousle(long numeroTones, long tamanhoCaixas, int quantidadeCaixas) {

        List<Long> resultado = new ArrayList<>();
        long[] tunes = new long[quantidadeCaixas];
        long somaMin = (long) (1 + quantidadeCaixas) * quantidadeCaixas / 2;
        BigInteger somaMax = BigInteger.valueOf(tamanhoCaixas + tamanhoCaixas - (quantidadeCaixas - 1)).multiply(BigInteger.valueOf(quantidadeCaixas)).divide(BigInteger.valueOf(2));

        if (numeroTones < somaMin || BigInteger.valueOf(numeroTones).compareTo(somaMax) > 0) {
            
            resultado.add(-1L);

        } else {

            long div = (numeroTones - somaMin) / quantidadeCaixas;
            int mod = (int) ((numeroTones - somaMin) % quantidadeCaixas);

            for (int i = 0; i < quantidadeCaixas; i++) {
                
                tunes[i] = i + 1 + div;
            }

            if (mod != 0) {
                
                long proximo = tunes[quantidadeCaixas - 1] + 1;
                tunes[quantidadeCaixas - mod] = proximo;
            }

            for (int i = 0; i < quantidadeCaixas; i++) {
                
                resultado.add(tunes[i]);
            }
        }

        return resultado;
    }
    
}
