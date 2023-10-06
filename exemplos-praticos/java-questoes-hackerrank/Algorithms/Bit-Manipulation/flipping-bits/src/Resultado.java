public class Resultado {

// Dado um número inteiro não negativo n, 
// você deve inverter todos os bits da representação 
// binária de n, ou seja, trocar 0s por 1s e 1s por 0s. 
// O objetivo é calcular o resultado dessa operação de 
// inversão e retornar o valor resultante como um novo número inteiro.

// Você deve implementar uma função chamada flippingBits 
// que recebe um número inteiro n e retorna o resultado da 
// inversão dos bits de n. A função deve realizar a 
// inversão de bits e retornar o valor resultante.

    // public static long flippingBits(long n) {

    //     // Defina um valor constante longo que representa todos os bits 1 (32 bits definidos como 1)
    //     long longo = 4294967295L;

    //     // Realize a operação de inversão dos bits subtraindo 'n' do valor máximo
    //     long resultado = longo - n;

    //     // Retorne o valor resultante após a inversão dos bits
    //     return resultado;
    // }

    public static long flippingBits(long n) {

        // Defina um valor máximo usando deslocamento de bits (todos os 32 bits definidos como 1)
        long max = (1L << 32) - 1;

        // Realize a operação de inversão dos bits usando operador XOR (^)
        long trocado = n ^ max;

        // Retorne o valor resultante após a inversão dos bits
        return trocado;
        
    }
    
}
