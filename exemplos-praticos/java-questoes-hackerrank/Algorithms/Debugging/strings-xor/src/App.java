import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {


// O problema "Strings XOR" em HackerRank é um desafio de programação que envolve a manipulação de strings e operações de XOR (ou exclusivo) de bits. A tarefa consiste em realizar as seguintes ações:

// Você recebe duas strings de comprimento igual, a e b, ambas consistindo apenas de caracteres '0' e '1'. A tarefa é calcular uma nova string res de tal forma que res[i] seja igual a '1' se e somente se a[i] seja diferente de b[i], caso contrário, res[i] deve ser igual a '0'. Em outras palavras, você está realizando uma operação de XOR bit a bit entre as duas strings.

// Sua função deve receber as duas strings a e b como entrada e retornar a string resultante res.

// A tarefa envolve a manipulação de bits e strings para calcular o resultado da operação XOR em cada posição correspondente das duas strings de entrada. Certifique-se de considerar os casos em que a e b podem ter diferentes valores em cada posição e criar a string res com base nesses valores
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();
        String t = bufferedReader.readLine();

        String resultado = Resultado.stringsXOR(s, t);

        System.out.println(resultado);


        bufferedReader.close();
        bufferedWriter.close();
    }
}
