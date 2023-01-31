import java.io.*;
import java.util.*;

public class Solucao {
    

    public static void main(String[] args) {
        
        // listar();
        // buscar();
        // add();
        // listar();
        // remover();
        // listar();
        // add();
        // listar();

        listarNum();
        addInt();
        listarNum();
        // listarMult();


    }


    static String[] nomes = {"teste 4", "teste 1"} ;
    // static int[] arr = new int[3];
    static int[] arr = { 33, 3 , 4, 5};
    static int[][] arrMult = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};

    public static void listarNum() {

        for (int i = 0; i < arr.length; i++) {
            
            System.err.println(arr[i]);
        }

    }

    public static void addInt() {

        int tamanho_original = arr.length;

        int novoEl = 100;

        int[] novoArray = new int[tamanho_original + 1];

        for (int i = 0; i < arr.length; i++) {
            
            novoArray[i] = arr[i];
        }

        novoArray[novoArray.length - 1] = novoEl;

        arr = novoArray;
    }


    public static void listarMult() {

        for (int i = 0; i < arrMult.length; i++) {
            
            for (int j = 0; j < arrMult.length; j++) {
                
                System.out.print(arrMult[i][j] + " ");
            }

            System.out.println();
        }
    }
    // static ArrayList<String> nomes = new ArrayList<String>();

    public static void listar() {

        Arrays.sort(nomes);

        for(String nome : nomes) {

            System.out.println(nome + "");
            // System.out.println(Arrays.toString(nomes));

        }
    }

    public static void add() {

        int tamanho_original = nomes.length;

        String novoNome = "teste 2";

        String[] novoArray = new String[tamanho_original + 1];

        for (int i = 0; i < nomes.length; i++) {
            
            novoArray[i] = nomes[i];
        }

        novoArray[novoArray.length - 1] = novoNome;

        nomes = novoArray;

        // System.out.println(Arrays.toString(nomes));

    }

    public static void buscar() {

        boolean encontrado = false;


        int indice = 0;

        String palavra = "teste 1";

        for (int i = 0; i < nomes.length; i++) {
            
            if (palavra.equals(nomes[i])) {
                
                indice = i;
                encontrado = true;
            }

            if (encontrado) {
                

                System.out.println(Arrays.toString(nomes) + " indice " + indice);

            } else {

                System.out.println(Arrays.toString(nomes) + " não encontrado no array");
            }

        }
    }

    static void remover() {

        ArrayList<String> novoArray = new ArrayList<String>();

        for(String pos : nomes) {

            novoArray.add(pos);
        }

        novoArray.remove(0);

        System.err.println((novoArray));
    }
}
