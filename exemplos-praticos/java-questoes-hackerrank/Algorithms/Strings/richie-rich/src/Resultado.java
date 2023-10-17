// O problema "Richie Rich" no HackerRank é um problema de programação que envolve a 
// criação do número palíndromo mais alto possível a partir de um número dado e um 
// limite de alterações permitidas. Um número palíndromo é aquele que permanece o 
// mesmo quando lido da esquerda para a direita e da direita para a esquerda.

// A tarefa pode ser resumida da seguinte forma:

// Dado um número inteiro e um número máximo de alterações permitidas, você deve 
// fazer as alterações mínimas necessárias no número para torná-lo um palíndromo 
// ou determinar que isso não é possível dentro do limite de alterações permitidas.

// As alterações permitidas incluem a substituição de dígitos em posições 
// específicas do número original. A tarefa é encontrar o número palíndromo 
// mais alto possível que pode ser formado ou determinar que é impossível 
// fazer um palíndromo com o número de alterações permitidas.

public class Resultado {

    // public static String highestValuePalindrome(String s, int tamanhoString, int numeroMaximaMudancas) {

    //     // Converte a string de entrada em um array de caracteres
    //     char[] arr = s.toCharArray();

    //     // Inicializa um índice para a esquerda
    //     int paraEsquerda = 0;
        
    //     // Inicializa um índice para a direita
    //     int paraDireita = tamanhoString - 1;

    //     // Inicializa o contador de mudanças feitas
    //     int mudancas = 0;

    //     // Itera através do array enquanto o índice à esquerda for menor que o índice à direita
    //     while (paraEsquerda < paraDireita) {
            

    //         // Verifica se os caracteres nos índices à esquerda e à direita são diferentes
    //         if (arr[paraEsquerda]  != arr[paraDireita]) {

    //             // Encontra o caracter máximo entre os dois caracteres
    //             char caracterMaximo = (char) Math.max(arr[paraEsquerda], arr[paraDireita]);

    //             // Atualiza ambos os caracteres para o caracter máximo
    //             arr[paraEsquerda] = caracterMaximo;
    //             arr[paraDireita] = caracterMaximo;

    //             // Incrementa o contador de mudanças
    //             mudancas +=  1;
    //         }

    //         // Atualiza os índices para continuar verificando os próximos caracteres
    //         paraEsquerda += 1;
    //         paraDireita -= 1;
    //     }

    //     // Verifica se o número de mudanças feitas excede o número máximo permitido
    //     if (mudancas > numeroMaximaMudancas) {
                
    //         // Retorna "-1" se o número de mudanças exceder o limite
    //         return "-1";
    //     }

    //     // Redefine os índices para a posição inicial
    //     paraEsquerda = 0;
    //     paraDireita = tamanhoString - 1;

    //     // Itera novamente pelos caracteres
    //     while (paraEsquerda <= paraDireita) {
            
    //         // Verifica se o índice à esquerda é igual ao índice à direita
    //         if (paraEsquerda == paraDireita) {
                

    //             // Se forem iguais, verifica se ainda é possível fazer mudanças
    //             if (numeroMaximaMudancas - mudancas > 0) {
                    
    //                 // Define o caractere à esquerda para '9
    //                 arr[paraEsquerda] = '9';
               
    //             }

    //         } else {

    //             // Se os caracteres não são iguais e o caractere à esquerda é menor que '9'
    //             if (arr[paraEsquerda] < '9') {
                    
    //                 // Verifica se é possível fazer 2 mudanças e se os caracteres originais são iguais
    //                 if (numeroMaximaMudancas - mudancas >= 2 && arr[paraEsquerda] == s.charAt(paraEsquerda) && arr[paraDireita] == s.charAt(paraDireita)) {
                        
    //                     // Define ambos os caracteres para '9'
    //                     arr[paraEsquerda] = '9';
    //                     arr[paraDireita] = '9';

    //                     // Incrementa o contador de mudanças
    //                     mudancas += 2;

                    
    //                 } else if (numeroMaximaMudancas - mudancas >= 1 && s.charAt(paraEsquerda) != s.charAt(paraDireita)) {
                        
    //                     // Define ambos os caracteres para '9' se ainda for possível fazer uma mudança
    //                     arr[paraEsquerda] = '9';
    //                     arr[paraDireita] = '9';

    //                     // Incrementa o contador de mudanças
    //                     mudancas += 1;
    //                 }
    //             }
    //         }

    //         // Atualiza os índices para continuar verificando os próximos caracteres
    //         paraEsquerda += 1;
    //         paraDireita -= 1;
    //     }

    //     // Retorna a string resultante após todas as alterações
    //     return new String(arr);
    // }
    

    public static String highestValuePalindrome(String s, int tamanhoString, int numeroMaximaMudancas) {

        // Converte a string de entrada em um array de caracteres
        char[] carateres = s.toCharArray();

        // Calcula o comprimento da metade da string
        int comprimentoString = tamanhoString / 2;

        // Inicializa um comparador que usaremos para iterar
        int comparador = -1;

        // Cria um array de booleanos para acompanhar se os caracteres na metade da string são iguais
        boolean[] B = new boolean[comprimentoString];

        // Itera pela primeira metade da string
        for (int i = 0; i < comprimentoString; i++) {
            
            // Verifica se os caracteres simétricos na string são iguais
            B[i] = carateres[i] == carateres[tamanhoString - i - 1];

            // Verifica se ultrapassamos o número máximo de mudanças permitidas
            if (!B[i] && --numeroMaximaMudancas < 0 ) return "-1";

            // Atualiza os caracteres para serem iguais e maximiza o valor
            carateres[i] = (char) Math.max(carateres[i], carateres[tamanhoString - i - 1]);
            carateres[tamanhoString - i - 1] = carateres[i];
        }

        // Itera enquanto ainda temos mudanças disponíveis e não ultrapassamos a metade da string
        while (numeroMaximaMudancas > 0 && ++comparador < comprimentoString) {
            
            // Verifica se o caractere atual não é '9' e se é possível fazer mudanças
            if (carateres[comparador] != '9' && ((B[comparador] && numeroMaximaMudancas > 1) || numeroMaximaMudancas > 0 && !B[comparador])) {
                
                // Define o caractere atual e o seu simétrico para '9'
                carateres[comparador] = '9';
                carateres[tamanhoString - comparador - 1] = '9';

                // Atualiza o número máximo de mudanças de acordo com a situação
                numeroMaximaMudancas = numeroMaximaMudancas + (B[comparador] ? - 2 : -1);
                
            }
        }

        // Verifica se a string original tinha um comprimento ímpar e ainda temos mudanças disponíveis
        if (tamanhoString % 2 == 1 && numeroMaximaMudancas > 0)  carateres[comprimentoString] = '9';

        // Retorna a string resultante após todas as alterações
        return new String(carateres);
    }
}


