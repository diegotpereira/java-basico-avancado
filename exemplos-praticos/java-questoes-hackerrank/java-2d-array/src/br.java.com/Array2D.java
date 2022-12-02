package br.java.com;

import java.util.Scanner;

public class Array2D {
    
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Criação do array 2 d - 6 * 6
        int arr[][] = new int[6][6];

        for(int i = 0; i < 6; i++) {

            for(int j = 0; j < 6; j++) {

                arr[i][j] = teclado.nextInt();
            } 
        }

        int valorMax = -9 * 6;

        for(int i = 0; i < 4; i++) {

            for(int j = 0; j < 4; j++) {

                int soma = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];

                soma += arr[i + 1][j + 1];
                soma += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                if(soma > valorMax) {

                    valorMax = soma;
                }
            }
        }
        System.out.println(valorMax);
    }
}
