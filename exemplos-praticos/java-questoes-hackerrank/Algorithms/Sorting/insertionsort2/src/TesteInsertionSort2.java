import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;

import org.junit.Test;

public class TesteInsertionSort2 {

    @Test
    public void testeCaso1() {

        // Tamanho da entrada
        int n = 6;

        // Entrada de teste
        List<Integer> entrada = new ArrayList<>(Arrays.asList(1, 4, 3, 5, 6, 2));

        // Redireciona a saída padrão para capturar a saída do método
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Chama o método a ser testado
        Resultado.insertionSort2(n, entrada);

        // Divide a saída em linhas e a converte em uma lista de listas de inteiros
        String[] lines = outContent.toString().trim().split("\\r?\\n");
        List<List<Integer>> realOutput = new ArrayList<>();

        for (String line : lines) {
            List<Integer> row = Arrays.stream(line.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            realOutput.add(row);
        }

        // Saída esperada
        List<List<Integer>> expectedOutput = Arrays.asList(
            Arrays.asList(1, 4, 3, 5, 6, 2),
            Arrays.asList(1, 3, 4, 5, 6, 2),
            Arrays.asList(1, 3, 4, 5, 6, 2),
            Arrays.asList(1, 3, 4, 5, 6, 2),
            Arrays.asList(1, 2, 3, 4, 5, 6)
        );

        // Compara a saída real com a saída esperada
        assertEquals(expectedOutput, realOutput);
    }

    @Test
    public void testeCaso2() {

        // Tamanho da entrada
        int n = 8;

        // Entrada de teste
        List<Integer> entrada = new ArrayList<>(Arrays.asList(7, 8, 6, 5, 4, 3, 2, 1));

        // Redireciona a saída padrão para capturar a saída do método
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Chama o método a ser testado
        Resultado.insertionSort2(n, entrada);

        // Divide a saída em linhas e a converte em uma lista de listas de inteiros
        String[] linhas = outContent.toString().trim().split("\\r?\\n");

        // Saída esperada
        List<List<Integer>> realOutput = new ArrayList<>();

        for (String linha : linhas) {
            List<Integer> row = Arrays.stream(linha.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            realOutput.add(row);
        }

        // Compara a saída real com a saída esperada
        List<List<Integer>> expectedOutput = Arrays.asList(
            Arrays.asList(7, 8, 6, 5, 4, 3, 2, 1),
            Arrays.asList(6, 7, 8, 5, 4, 3, 2, 1),
            Arrays.asList(5, 6, 7, 8, 4, 3, 2, 1),
            Arrays.asList(4, 5, 6, 7, 8, 3, 2, 1),
            Arrays.asList(3, 4, 5, 6, 7, 8, 2, 1),
            Arrays.asList(2, 3, 4, 5, 6, 7, 8, 1),
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)
        );

        assertEquals(expectedOutput, realOutput);
    }

}

