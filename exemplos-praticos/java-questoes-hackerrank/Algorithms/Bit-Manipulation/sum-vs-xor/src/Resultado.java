import java.util.*;


// O problema "Sum vs XOR" em HackerRank é um desafio de 
// programação que pede para você encontrar o número de 
// inteiros não negativos (0 e números positivos) que satisfazem a seguinte equação: n + x = n XOR x

// onde n é um número inteiro não negativo e x é um número inteiro não negativo que satisfaz a equação. 
// O seu objetivo é calcular quantos valores inteiros não negativos de x podem ser usados para satisfazer a equação.

public class Resultado {

    // public static long sumXor(long n) {

    //     // Inicialize o contador de zeros à esquerda
    //     int contador = 0;

    //     // Percorra os bits de n
    //     while (n > 0) {
            
    //         // Verifique se o bit menos significativo é 0 (zero)
    //         if ((n & 1) == 0) {
                
    //             // Se for zero, incremente o contador
    //             contador++;
                
    //         }

    //         // Desloque n um bit para a direita (equivalente a dividir por 2)
    //         n >>= 1;
    //     }

    //     // Retorne 2 elevado ao número de zeros à esquerda
    //     return (long) Math.pow(2, contador);
    // }

    // public static long sumXor(long n) {

    //     // Inicialize o contador de zeros
    //     int contador = 0;

    //     // Converta o número 'n' em uma representação binária como uma string
    //     String binario = Long.toBinaryString(n);

    //     // Percorra cada caractere da representação binária
    //     for (char elemento : binario.toCharArray()) {
            
    //         // Verifique se o caractere é '0' e, se for, incremente o contador
    //         contador += (elemento == '0' ? 1 : 0);

    //     }

    //     // Verifique se 'n' é diferente de zero e retorne 2 elevado ao contador de zeros
    //     // Caso contrário, retorne 1 (caso especial quando 'n' é zero)
    //     return (n != 0) ? (long) Math.pow(2, contador) : 1;
    // }

    public static long sumXor(long n) {

        // Inicialize o contador de zeros
        int contador = 0;

        // Enquanto 'n' não for igual a zero, continue o loop
        while (n != 0) {
            
            // Verifique se o bit menos significativo é 0 (zero)
            if (n % 2 == 0) {
                
                // Se for zero, incremente o contador
                contador += 1;
            }

            // Divida 'n' por 2 (equivalente a um deslocamento para a direita)
            // A divisão de n por 2 neste código está sendo usada para verificar 
            // cada bit individual de n e contar quantos deles são iguais a 0 (zero). 
            // Isso ocorre porque, em binário, a divisão por 2 é equivalente a um 
            // deslocamento para a direita, que remove o bit menos significativo.

            // Aqui está como o processo funciona:

            // Inicialmente, n é um número inteiro longo.

            // Dentro do loop while, a linha n = n / 2; divide n por 2. Isso tem o efeito 
            // de deslocar todos os bits de n para a direita em uma posição.

            // Quando você divide n por 2, o bit menos significativo (o bit da unidade) 
            // é removido, e um zero é adicionado como o bit mais significativo (à esquerda).

            // O loop continua repetindo esse processo até que n seja igual a zero. Durante 
            // cada iteração, o código verifica se o bit removido era igual a zero. 
            // Se for igual a zero, incrementa o contador.

            // O resultado é que o código conta quantos zeros estão presentes na representação 
            // binária de n. Essa abordagem é usada para resolver o problema específico proposto, 
            // que envolve calcular a quantidade de inteiros não negativos x que satisfazem uma equação específica.
            
            n = n / 2;
        }
        
        // Retorne 2 elevado ao contador de zeros
        return (long) Math.pow(2, contador);
    }
    
}
