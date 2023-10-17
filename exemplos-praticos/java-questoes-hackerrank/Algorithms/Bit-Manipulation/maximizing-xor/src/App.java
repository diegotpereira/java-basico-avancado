import java.io.*;
import java.util.*;
import java.util.stream.Stream;

// O problema "Maximizing XOR" no HackerRank consiste em encontrar o valor máximo da 
// operação XOR (^) entre dois números inteiros em um intervalo específico. A tarefa específica é a seguinte:

// Você recebe dois inteiros, L e R, que definem um intervalo fechado [L, R]. Sua 
// tarefa é encontrar dois números inteiros, A e B, onde L <= A <= B <= R, de forma que o valor de A XOR B seja o máximo possível.

// A operação XOR (^) entre dois números binários compara bit a bit e produz um 
// resultado 1 onde os bits forem diferentes e 0 onde os bits forem iguais. 
// Portanto, o objetivo é encontrar dois números no intervalo [L, R] de modo 
// que haja o máximo número possível de bits diferentes entre eles ao fazer a operação XOR.

// Para resolver esse problema, você precisa encontrar os valores de A e B que 
// maximizam a operação XOR. Há várias abordagens para resolver esse problema, 
// incluindo força bruta e técnicas mais eficientes. O desafio é encontrar a 
// solução mais eficiente para esse problema específico.

public class App {
    public static void main(String[] args) throws Exception {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int primeiro = Integer.parseInt(bufferedReader.readLine().trim());

        int segundo = Integer.parseInt(bufferedReader.readLine().trim());

        int resultado = Resultado.maximizingXor(primeiro, segundo);

        bufferedWriter.write(String.valueOf(resultado));

        bufferedReader.close();
        bufferedWriter.close();
        
    }
}
