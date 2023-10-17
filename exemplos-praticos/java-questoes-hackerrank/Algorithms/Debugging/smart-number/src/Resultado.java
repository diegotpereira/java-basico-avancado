// O problema "Smart Number" em HackerRank é um desafio de programação que envolve a identificação de números "inteligentes" (smart numbers). Um número "inteligente" é um número inteiro positivo que atende a uma condição específica.

// A tarefa consiste em implementar uma função chamada isSmartNumber que recebe um número inteiro num como entrada e retorna um valor booleano (true ou false) indicando se num é um número "inteligente" de acordo com a regra estabelecida.

// A regra para determinar se um número é "inteligente" é a seguinte:

// Um número inteiro positivo num é considerado "inteligente" se a raiz quadrada de num for um número inteiro. Em outras palavras, se a raiz quadrada de num for um número inteiro sem casas decimais, então num é considerado "inteligente".

// Sua tarefa é implementar a função isSmartNumber que verifica se o número num é "inteligente" de acordo com a regra mencionada e retorna true se for, ou false se não for. A tarefa envolve operações de cálculo da raiz quadrada e verificação de números inteiros.


public class Resultado {

    // public static boolean isSmartNumber(int num) {

    //     // Calcula a raiz quadrada do número 'num' e converte o resultado para um inteiro
    //     int valor = (int) Math.sqrt(num);

    //     // Verifica se o quadrado do valor calculado é igual ao número 'num'
    //     if(valor * valor == num)

    //        // Se for igual, retorna verdadeiro (é um número "inteligente")
    //        return true;

    //     // Caso contrário, retorna falso (não é um número "inteligente")
    //     return false;
    // }

    public static boolean isSmartNumber(int num) {

        // Calcula a raiz quadrada do número 'num' e converte o resultado para um inteiro
        int valor = (int) Math.sqrt(num);

        // Verifica se a divisão de 'num' por 'valor' resulta em 'valor'
        if(num / valor == valor)

           // Se for igual, retorna verdadeiro (é um número "inteligente")
           return true;

        // Caso contrário, retorna falso (não é um número "inteligente")
        return false;
    }
    
}
