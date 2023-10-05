import static org.junit.Assert.*;

import org.junit.Test;

public class TesteInsertionSort {

    @Test
    public void testeCaso1() {

        // Define um array desordenado
        int[] arr = {4, 1, 3, 5, 6, 2};

        // Define o array esperado após a ordenação
        int[] esperado = {1, 2, 3, 4, 5, 6};

        // Chama o método "insertionSort" da classe "Resultado" para ordenar o array
        Resultado.insertionSort(arr);

        // Compara o array ordenado com o array esperado, garantindo que sejam iguais
        assertArrayEquals(esperado, arr);

    }

    @Test
    public void testeCaso2() {

        // Define um array desordenado
        int[] arr = {9, 8, 6, 7, 3, 5, 4, 1, 2};

        // Define o array esperado após a ordenação
        int[] esperado = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Chama o método "insertionSort" da classe "Resultado" para ordenar o array
        Resultado.insertionSort(arr);

        // Compara o array ordenado com o array esperado, garantindo que sejam iguais
        assertArrayEquals(esperado, arr);

    }
}
