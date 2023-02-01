import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int precoPrimeiroJogo = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int desconto = Integer.parseInt(primeiraMultiplaEntrada[1]);
        int custoMinimo = Integer.parseInt(primeiraMultiplaEntrada[2]);
        int orcamento = Integer.parseInt(primeiraMultiplaEntrada[3]);


        int resposta = Resultado.howManyGames(precoPrimeiroJogo, desconto, custoMinimo, orcamento);

        bufferedWriter.write(String.valueOf(resposta));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Resultado {

    public static int howManyGames(int precoPrimeiroJogo, int desconto, int custoMinimo, int orcamento) {

        int iterar = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(precoPrimeiroJogo);

        while (iterar < 10000) {
            
            precoPrimeiroJogo -= desconto;
            arr.add(precoPrimeiroJogo > custoMinimo ? precoPrimeiroJogo : custoMinimo);
            iterar++;
        }

        int contar = 0;
        int soma = 0;

        for (int compare = 0; compare < arr.size(); compare += 1) {
            
            soma += arr.get(compare);

            if(soma <= orcamento)

                contar++;
        }
        return contar;
    }

    // public static int howManyGames(int precoPrimeiroJogo, int desconto, int custoMinimo, int orcamento) {

    //     int iterar = 0;

    //     while (orcamento > 0) {
            
    //         int subtracao = Math.max((precoPrimeiroJogo - desconto * iterar), custoMinimo);
    //         orcamento = orcamento - subtracao;
    //         iterar++;
    //     }
    //     return orcamento >= 0 ? iterar : iterar - 1;
    // }

    // public static int howManyGames(int precoPrimeiroJogo, int desconto, int custoMinimo, int orcamento) {

    //     int contar = 0;

    //     if (precoPrimeiroJogo < orcamento) {
            
    //         List<Integer> lista = new ArrayList<>();
    //         int temp = 0;

    //         for (int indice = precoPrimeiroJogo; indice >= custoMinimo; indice = indice - desconto) {
                
    //             temp += indice;

    //             if(temp < orcamento)

    //                 lista.add(indice);

    //         }

    //         if (temp <= orcamento) {
                
    //             contar = lista.size() + (orcamento - temp) / custoMinimo;

    //         } else {

    //             contar = lista.size();
    //         }
    //     }
    //     return contar;
    // }

    // public static int howManyGames(int precoPrimeiroJogo, int desconto, int custoMinimo, int orcamento) {

    //     int contar = 0;

    //     while (orcamento >= precoPrimeiroJogo) {
            
    //         orcamento -= precoPrimeiroJogo;

    //         precoPrimeiroJogo = (precoPrimeiroJogo - desconto >= custoMinimo) ? precoPrimeiroJogo - desconto : custoMinimo;
    //         contar++;
    //     }
    //     return contar;
    // }

    // public static int howManyGames(int precoPrimeiroJogo, int desconto, int custoMinimo, int orcamento) {

    //     int contar = 0;

    //     while (orcamento - precoPrimeiroJogo >= 0) {
            
    //         orcamento -= precoPrimeiroJogo;
    //         precoPrimeiroJogo = Math.max((precoPrimeiroJogo - desconto), custoMinimo);
    //         contar++;
    //     }
    //     return contar;
    // }

    // public static int howManyGames(int precoPrimeiroJogo, int desconto, int custoMinimo, int orcamento) {

    //     int iterar = 0;
    //     int soma = 0;
    //     int contar = 0;

    //     while (orcamento > 0) {
            
    //         contar = precoPrimeiroJogo - (iterar * desconto);

    //         if (contar <= custoMinimo) {
                
    //             contar = custoMinimo;
    //         }

    //         orcamento -= contar;

    //         if (orcamento >= 0) {
                
    //             soma++;
    //         }

    //         iterar++;
    //     }
    //     return soma;
    // }

    // public static int howManyGames(int precoPrimeiroJogo, int desconto, int custoMinimo, int orcamento) {

    //     int contar = 0;
    //     int soma = 0;

    //     while (soma <= orcamento) {
            
    //         if (precoPrimeiroJogo < custoMinimo) {
                
    //             precoPrimeiroJogo = custoMinimo;
    //         }

    //         soma += precoPrimeiroJogo;

    //         // se após o cálculo o valor exceder o orçamento, pare a iteração
    //         if (soma > orcamento) {
                
    //             break;
    //         }

    //         // diminuir o preço periodicamente
    //         precoPrimeiroJogo -= desconto;

    //         // aumentar o contador para o número de jogos adquiríveis
    //         contar++;
    //     }
    //     return contar;
    // }

    // public static int howManyGames(int precoPrimeiroJogo, int desconto, int custoMinimo, int orcamento) {

    //     int jogos = 0;
    //     int total = 0;
    //     int item = 0;

    //     while (true) {
            
    //         int custo = precoPrimeiroJogo - (desconto * item);

    //         if (custo <= custoMinimo) {
                
    //             custo = custoMinimo;
    //         }

    //         if (total + custo <=  orcamento) {
                
    //             total += custo;
    //             jogos++;

    //         } else if (total + custo > orcamento) {
    //             break;
    //         }

    //         item++;
    //     }
    //     return jogos;
    // }
}
