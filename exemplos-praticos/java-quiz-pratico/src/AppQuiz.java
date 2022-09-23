import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// import java.net.*;
// import java.util.*;

public class AppQuiz {
    public static void main(String[] args) throws Exception {
        
        // Qual das opções abaixo é uma maneira válida de instanciar uma matriz em java?
        // A. int meuArray [] = {1,3, 5};
        // B. int meuArray[] [] = {1, 2, 3, 4}; é inválido porque myArray é um array bidimensional, enquanto neste caso está sendo definido como um array unidimensional. O compilador reclamará como Tipo incompatível: não pode converter de int para int[].
        // C. int[] meuArray = (5, 4, 3); // é inválido porque os elementos da matriz devem ser definidos entre chaves ({}).
        // D. int[] meuArray = {"1", "2", "3"}; // é inválido porque String não pode ser convertido em um int.
        // Resposta A. int meuArray [] = {1,3, 5};

        // Quais das opções abaixo são palavras-chave reservadas em Java?
        // A. array 
        // B. goto 
        // C. null 
        // D. int 
        // Resposta B. goto e D. int

        // // O que acontecerá se tentarmos compilar e executar o programa abaixo?
        // interface Foo { int x = 10; }

        // public class App {
        //     public static void main(String[] args) {
        //         Foo.x = 20;

        //         System.out.println(Foo.x);
        //     }
        // }
        // Resposta C. Compile Time Error

        // // Qual será a saída do programa abaixo?
        // char c = 65;

        // System.out.println("c = " + c); // B. Impressão "c = A"

        // // A. Compile Time Error
        // // B. Impressão "c = A"
        // // C. Runtime Error
        // // D. Impressão "c = 65"


        // // Qual será a saída do programa abaixo?
        // int x = 10 * 20 - 20;

        // System.out.println(x); // B. Impressão 180

        // // A. Runtime Error
        // // B. Impressão 180
        // // C. Impressão 0
        // // D. Compile-time error.

        // Quais são as instruções válidas para a palavra-chave static em Java?

        // A. Podemos ter um bloco estático em uma classe.
        // B. O bloco estático em uma classe é executado toda vez que um objeto da classe é criado.
        // C. Podemos ter implementações de métodos estáticos na interface.
        // D. Podemos definir um bloco estático dentro de um método.

        // Resposta A e B - Podemos ter um bloco estático em uma classe, ele é executado apenas uma vez quando a classe é carregada. 
        // A partir do java 8, podemos ter implementações de métodos estáticos em interfaces.


        // Selecione todos os conceitos centrais de Programação Orientada a objetos (POO).
        // A. Abstração
        // B. Herança
        // C. Interface
        // D. Polimorfismo
        // E. Genéricos
        
        // Resposta A, B e D


        // Quais das seguintes afirmações são verdadeiras para herança em Java?

        // A. A palavra-chave "extend" é usada para estender uma classe em java.
        // B. Você pode estender várias classes em java.
        // C. Membros privados da superclasse são acessíveis à subclasse.
        // D. Não podemos estender classes Final em java.

        // Resposta D

        
        // // Qual será a saída do programa abaixo?
        // String x = "abc";
        // String y = "abc";

        // x.concat(y);

        // System.out.println(x); // B. abc

        // // A. abcabc
        // // B. abc
        // // C. null


        // Quais das opções abaixo são exceções não verificadas em java?
        // A. RuntimeException
        // B. ClassCastException
        // C. NullPointerException
        // D. IOException

        // Resposta A, B, e C - RuntimeException e suas subclasses são exceções não verificadas. 
        // Exceções não verificadas não precisam ser declaradas em um método ou cláusula throws do construtor


        // // Qual será a saída do programa abaixo?
        // String s1 = "abc";
        // String s2 = "abc";

        // System.out.println("s1 == s2 é:" + s1 == s2);

        // // A. s1 == s2 é:true
        // // B. false
        // // C. s1 == s2 é:false
        // // D. true

        // // Resposta B.falso (false)
        

        // // Qual será o resultado das declarações abaixo?
        // String s = "Java String Quiz";

        // System.out.println(s.charAt(s.toUpperCase().length()));

        // // A. Converte "Z" para inteiro 90 e imprime "90"
        // // B. Exceção de tempo de execução (Runtime Exception)
        // // C. Imprime "z"
        // // D. Imprime "Z"

        // // Resposta B. Exceção de tempo de execução (Runtime Exception)


        // Qual será a saída das declarações abaixo?

        // String s = "Java String Quiz";
        // System.out.println(s.substring(5,3));
 

        // // A. Imprime "Str"
        // // B. Exceção de tempo de execução (Runtime Exception)
        // // C. Exceção de tempo de execução IndexOutOfBoundsException (IndexOutOfBoundsException Runtime Exception)
        // // D. StringIndexOutOfBoundsException Erro em tempo de compilação (StringIndexOutOfBoundsException Compile-time error)

        // // Resposta B (verificar)


        // Selecione todos os métodos válidos da classe String.
       
        // A. trim()
        // B. intern()
        // C. toLower()
        // D. split()

        // Resposta A, B


        // // Qual será o resultado das declarações abaixo?
        // String s1 = "Gato";
        // String s2 = "Gato";
        // String s3 = new String("Gato");

        // System.out.println(s1 == s2); // true
        // System.out.println(s1 == s3); // false

        // // A. true false
        // // B. true true
        // // C. false false
        // // D. false true


        // Quais das seguintes afirmações são verdadeiras para string no switch case?

        // A. String é permitido no switch case Java 1.5 ou versões superiores.
        // B. String é permitido no switch case para Java 1.7 ou versões superiores.
        // C. O método equals() é usado pela implementação switch-case, portanto, adicione verificação nula para evitar NullPointerException.
        
        // Resposta B, C


        // Quais das seguintes afirmações são verdadeiras para StringBuffer e StringBuilder?

        // A. StringBuilder não é thread-safe.
        // B. StringBuffer é thread-safe porque seus métodos são sincronizados.
        // C. StringBuilder foi introduzido no Java 1.4
        // D. StringBuffer e StringBuilder são imutáveis.

        // Resposta A, B. - A principal diferença é que o StringBuffer é sincronizado, enquanto que o outro não.

        
        // A implementação de string segue qual dos padrões de design abaixo?

        // A. Padrão de Projeto Flyweight
        // B. Padrão de Factory
        // C. Padrão Singleton
        // D. Nenhuma das opções acima

        // Resposta A. Padrão de Projeto Flyweight


        // // Qual será o resultado das declarações abaixo?

        // String s1 = "abc";
        // String s2 = "def";

        // System.out.println(s1.compareTo(s2));

        // // A. 0
        // // B. true
        // // C. -3
        // // D. false

        // // Resposta C. -3


        // // Qual será a saída do programa abaixo?
        // String s1 = "abc";
        // String s2 = "abc";

        // System.out.println("s1 == s2 é: " + s1 == s2 );

        // // A. falso
        // // B. s1 == s2 é:verdadeiro
        // // C. s1 == s2 é:falso
        // // D. verdadeiro

        // // Resposta A. falso(false) - A saída das instruções fornecidas será "false" 
        // // porque em java a precedência do operador + é maior que o operador ==. 
        // // Assim, a expressão dada será avaliada como "s1 == s2 é:abc" == "abc" ou seja false.


        // // Qual será o resultado das declarações abaixo?
        // String s = "Java" + 1 + 2 + "Quiz" + "" + (3+4);

        // System.out.println(s);

        // // A. Java3Quiz7
        // // B. Java12Quiz7
        // // C. Java12Quiz34
        // // D. Java3Quiz34

        // // Resposta B. Java12Quiz7 - Em primeiro lugar, a expressão entre colchetes é executada. 
        // // Então são todos os operadores +, então eles são executados da esquerda para a direita.
        // // "Java"+1+2+"Quiz"+""+(3+4)
        // // = "Java"+1+2+"Quiz"+""+7
        // // = "Java1"+2+"Quiz"+""+7
        // // = "Java12"+"Quiz"+""+7
        // // = "Java12Quiz"+""+7
        // // = "Java12Quiz"+7
        // // = "Java12Quiz7"


        // // Quantos objetos String criados nas instruções abaixo?
        // String s = "abc";
        // String s1 = new String("abcd");

        // // A. 1
        // // B. 2
        // // C. 3
        // // D. 4

        // // Resposta C. 3 - Na instrução 1, "abc" é criado no pool de Strings.
        // // Na instrução 2, primeiro "abcd" é criado no pool de strings. Em seguida, é passado 
        // // como um argumento para o operador String new e outra string é criada na memória heap.

        
        // // Qual será o resultado das declarações abaixo?
        // String s1 = "abc";
        // String s2 = new String("abc");

        // System.out.println(s1 == s2); // false
        // System.out.println(s1 == s2.intern()); // true

        // // A. false true
        // // B. false false
        // // C. true true
        // // D. true false

        // // Resposta A. false true 

        // Selecione todas as interfaces implementadas pela classe String.
        // A. Serializable
        // B. Comparable
        // C. Constable
        // D. Cloneable

        // Resposta A, B e C - String é serializável e comparável. O Constable é uma nova interface da versão Java 12.

        // Selecione todos os motivos que tornam String o candidato perfeito para a chave Map?

        // A. String é imutável
        // B. String é final
        // C. String implementa corretamente os métodos hashCode() e equals()
        // C. O hashcode de string é armazenado em cache

        // Resposta A, B e C - A implementação adequada dos métodos hashCode() e equals() é uma obrigação para uma chave Map. 
        // Como a string é final e imutável, não há chances de corrupção dos dados da chave.

        // // Qual será a saída do trecho de código abaixo?
        // String s1 = new String("java");
        // String s2 = new String("JAVA");

        // System.out.println(s1 = s2);

        // // A. JAVA
        // // B.java
        // // C. true
        // // D. false

        // // Resposta A - Irá imprimir “JAVA” porque o argumento dentro do método println() é uma atribuição. 
        // // Portanto, será tratado como  System.out.println("JAVA").

        // // Qual será o resultado das declarações abaixo?

        // String s1 = "abc";
        // StringBuffer s2 = new StringBuffer(s1);

        // System.out.println(s1.equals(s2));

        // // A. false
        // // B. true
        // // C. ClassCastException em tempo de execução
        // // D. Erro em tempo de compilação

        // // Resposta A. false

        
        // // Qual será a saída do trecho de código abaixo?
        // String s1 = "abc";
        // String s2 = new String("abc");

        // s2.intern();

        // System.out.println(s1 == s2); // falso (false) - Sabemos que o método intern() retornará a referência do objeto String do pool de strings, mas como não a atribuímos de volta a s2, não há alteração em s2. Portanto, tanto s1 quanto s2 estão tendo uma referência diferente.

        // // A. false
        // // B. true
        // // C. null

        
        // Selecione todas as classes que estendem a classe String.

        // A. StringBuffer
        // B. StringBuilder
        // C. StringWriter
        // D. Nenhuma

        // Resposta D. nenhuma - A String é uma classe final, então você não pode estendê-la.


        // Quais das seguintes afirmações são verdadeiras sobre String em java?

        // A. Podemos estender a classe String como StringBuffer faz.
        // B. A classe String é definida no pacote java.util.
        // C. String é imutável em Java.
        // D. String é thread-safe em Java.
        // E. String diferencia maiúsculas de minúsculas em Java.

        // Resposta C, D, e E - Não podemos estender a classe String porque é final. 
        // StringBuffer não o estende. A classe String é definida no  java.lang pacote. 
        // A string é imutável e, portanto, thread-safe em java. 
        // String diferencia maiúsculas de minúsculas, portanto, "abc" não é igual a "ABC".

        // // Qual será o resultado das declarações abaixo?
        // String s1 = null;

        // System.out.print(s1);
        // System.out.print(s1.toString());

        // // A. null null
        // // B. null seguido por NullPointerException
        // // C. NullPointerException

        // // Resposta B.


        // O que garante a segurança de tipo em uma coleção?
        // A. Generics
        // B. Abstract classes
        // C. Interfaces
        // D. Collection

        // Resposta A. Genericos

        // O que HashSet usa internamente?

        // A. Set
        // B. HashMap
        // C. List
        // D. Collection

        // Resposta A. set


        // As interfaces mais usadas do framework de coleção são?
        
        // A. List
        // B. Map
        // C. Set

        // Resposta B. Map

        // A interface raiz da hierarquia do framework de coleção Java é –

        // A. Collection
        // B. Root
        // C. Collections
        // D. List/Set

        // Resposta D. List/Set


        // Qual deles é sincronizado?

        // A. ArrayList
        // B. LinkedList
        // C. Vector
        // D. Nenhuma das acima

        // Resposta C. Vector

        // ArrayList implementa o seguinte?

        // A. List
        // B. RandomAccess
        // C. Cloneable
        // D. Todos esses

        // Resposta D. Todos esses

        
        // Qual deles permite o armazenamento de muitos valores nulos?

        // A. Set
        // B. List
        // C. Nenhum desses
        // D. Todos esses

        // Resposta D. Todos esses


        // nextIndex() e previousIndex() são métodos de qual interface?

        // A. IndexIterator
        // B. Iterator
        // C. ListIterator
        // D. NextPreviousIterator

        // Resposta B. Iterator


        // Vector estende que destes?

        // A. ArrayList
        // B. LinkedList
        // C. AbstractList
        // D. Nenhum

        // Resposta C. AbstractList

        // LinkedList implements?

        // A. Deque
        // B. List
        // C. Nenhuma das acima
        // D. Ambos acima

        // Resposta: A. C D. Ambos Acima


        // No Iterator, o método nextElement() de Enumeration foi alterado para:

        // A. next()
        // B. genNext()
        // C. returnNext()
        // D. o nome continua o mesmo

        // Resposta D. o nome continua o mesmo

        // O Enumeration retornada por Vector é?

        // A. fail-fast
        // B. fail-safe
        // C. nenhuma 

        // Resposta A. fail-fast


        // Do Java cinco em diante, aquele entre eles é sugerido para substituir Hashtable?

        // A. ConcurrentHashMap
        // B. HashMap
        // C. ConcurrentHashtable
        // D.  nenhum

        // Resposta B. HashMap


        // O que não permite armazenar um valor nulo?

        // A. TreeSet
        // B. LinkedHashSet
        // C. HashSet
        // D. nenhum

        // Resposta A. TreeSet


        // Iterator retornado por Vector é?

        // A. fail-fast
        // B. fail-safe
        // C. nenhum

        // Resposta A. fail-fast


        // Como descreve o desempenho de um algoritmo em cenários de melhor, médio ou pior caso?

        // A. Big-B
        // B. Big-O
        // C. Big-Data
        // D. Big-N

        // Resposta B. Big-O

        // Indique a complexidade do tempo de pesquisa de uma matriz ordenada.

        // A. O(n)
        // B. O(1)
        // C. O(log n)
        // D. O(n-1)

        // Resposta A. O(n)


        // Nomeie o mapa que deve ser mantido em um ambiente multi-threading para manter a ordem natural das chaves?
        
        // A. ConcurrentHashMap
        // B. ConcurrentSkipListMap
        // C. ConcurrentMap

        // Resposta A. ConcurrentHashMap


        // Implementa TreeMap?

        // A. Dictionary
        // B. HashMap
        // C. AbstractMap
        // D. Navigable Map

        // Resposta D. Navigable Map


        // Qual classe de lista deve ser mais popular em um ambiente multithread, considerando a restrição de desempenho?

        // A. Vector
        // B. CopyOnWriteArrayList
        // C. ArrayList
        // D. ConcurrentArrayList

        // Resposta B. CopyOnWriteArrayList
        

        // // Qual será a saída do código abaixo?
        // if(true)
        //    break;

        // // A. Nada
        // // B. Erro

        // // Resposta B. Erro - A instrução Break só pode ser usada com loop ou switch. Portanto, usar break com a instrução if causa o erro "break outside switch or loop".


        // // Qual será a saída do código abaixo?
        // System.out.println('j' + 'a' + 'v' + 'a');
        

        // // A. java
        // // B. Outra coisa (além da simples concatenação)

        // // Resposta B. Outra coisa (além da simples concatenação) - “java” seria impresso se String literals (entre aspas duplas) fossem usados
        // // Como não foram usados não serão concatenados
        // // a saida é 106 + 97 + 118 + 97 = 418


        // // Qual será a saída do código abaixo?
        // int $_ = 5;

        // System.out.println($_);

        // // A. Nada 
        // // B. Erro 

        // // Resposta A. Nada -  Em java, a regra do identificador diz que o identificador pode começar com qualquer alfabeto ou sublinhado ("_") ou dólar ("$").


        // // Qual será a saída do código abaixo?
        // Integer num1 = 100;
        // Integer num2 = 100;
        // Integer num3 = 500;
        // Integer num4 = 500;

        // if (num1 == num2) {
        //     System.out.println("num1 == num2");

        // } else {
        //     System.out.println("num1 != num2");
        // }

        // if (num3 == num4) {
        //     System.out.println("num3 == num4");

        // } else {
        //     System.out.println("num3 != num4");
        // }

        // // A. num1 == num2
        // //     num3 == num4
        // // B. num1 == num2
        // //     num3!= num4
        // // C. num1!= num2
        // //     num3 == num4
        // // D. num1 != num2
        // //     num3 != num4

        // // Resposta B. num1 == num2 e num3 != num4 -  A classe Integer tem um intervalo de cache de -128 a 127.
        // // entre esse valor está o 100, nas outras está fora desse intervalo.


        // // Qual será a saída do código abaixo?
        // public static void main(String[] arr){
          
        // }
        // public static void main(String arr){
              
        // }

        // // A. Nada 
        // // B. Erro

        // // Resposta A. Nada - Podemos sobrecarregar main() também. Mas a JVM sempre chamará main() que tem o argumento String[].

        // // Qual será a saída do código abaixo?
        // App t = new App();

        // System.out.println(t.x + " " + t.y);

        // // Resposta 0 0 - um membro protegido é acessível em todas as classes do mesmo pacote e em classes herdadas de outros pacotes;
        // //  Além disso, os construtores padrões inicializam variáveis ​​integrais como 0 em Java.


        // // Qual será a saída do código abaixo?
        // for(int i = 0; 1; i++) {

        //     System.out.println("Ola");
        //     break;
        // }

        // // Resposta Erro no compilador(Compiler Error) - expressão de valor inteiro não pode ser colocada onde um booleano é esperado em Java.


        // // Qual será a saída do programa a seguir?
        // System.out.println('A' + 'B');

        // // A.AB
        // // B. 195
        // // C. 131
        // // D. Error

        // // Resposta C. - Unicode de 'A' é 65 e 'B' é 66. Portanto, a saída será 131.

        
        // // Qual será a saída do programa a seguir?
        // System.out.print(20 + 1.3f + "A" + "B"); //  C. 21.34AB - 20 e 1.34f serão somados e então 21.34 será concatenado com "A" e "B".

        // // A. 201.34AB
        // // B. 201.34fAB
        // // C. 21.34AB
        // // D. Error


        // // Qual será a saída do programa a seguir?
        // char [] str={'i','n','c','l','u','i','r','a','j','u','d', 'a'};

        // System.out.println(str.toString()); // C. [C@19e0bfd (Memory Address) - str é um array de caracteres, se você tentar imprimir str.toString() ele não será convertido em string porque str é um objeto de array de caracteres que imprimirá um endereço no formato string.
        
        // // A. incluirajuda
        // // B. Error
        // // C. [C@19e0bfd (Memory Address)
        // // D. NULL


        // // Qual será a saída do programa a seguir?
        // System.out.print("Ola");
        // System.out.println("Pessoal!");

        // // A. OlaPessoal!
        // // B. Ola Pessoal!
        // // C. Ola
        // //    Pessoal!
        // // D. Compilar com um aviso

        // // Resposta A. OlaPessoal!


        // // Qual será a saída do programa a seguir?
        // char a=0x41;	//Unicode de 'A'
        // char b=0x42;	//Unicode de 'B'

        // System.out.print(a + "" + b + ""); // AB
        // System.out.print("-"); // -
        // System.out.print(a + b); // 131

        // // A. AB-AB
        // // B. AB-131
        // // C. AB-ERROR
        // // D. A B -131

        // // Resposta B. AB-131 - a+"" e b+"" serão convertidos em string, .toString() ou +"" após a variável ou valor converter o valor na string e a+b será adicionado porque eles não são convertidos em string.

        
        // //  Qual deve ser o nome do arquivo de programa java que contém este programa?
        // public class MeuPrg{
        //     public static void main(String args[]){
        //         System.out.print("IncludeHelp");
            
        //     }
        // }
        // // A. MeuPrg.class
        // // B. MeuPrg.java
        // // C. MeuPrg
        // // D. Qualquer nome de arquivo com extensão java

        // // Resposta B. MeuPrg.java


        // O que é código de byte em Java?

        // A. É outro nome para o arquivo de origem java que contém as informações sobre o hardware.
        // B. É um código binário gerado pela Java Virtual Machine (JVM) para o sistema operacional.
        // C. É um código intermediário gerado pelo compilador java para Java Virtual Machine (JVM).
        // D. Nenhum desses

        // Resposta C. É um código intermediário gerado pelo compilador java para Java Virtual Machine (JVM).


        // // Qual será a saída do programa a seguir?
        // const int a = 10;

        // System.out.println(a);

        // // A. 10
        // // B. a
        // // C. Unprintable Character
        // // D. Erro

        // // Resposta D. Erro

        
        // // Qual será a saída do programa a seguir?

        // System.out.println( (byte) 0xff); // A. -1 - 0xff é o valor máximo de um byte. E em Decimal o valor máximo de um byte é -1.

        // // A. -1
        // // B. 255
        // // C. 65535
        // // D. 0xff


        // // Qual será a saída do programa a seguir?

        // System.out.println( (int) (char)(byte) 0xff);  // C. 65535

        // // A. -1
        // // B. 255
        // // C. 65535
        // // D. 0xff

        

        // // Qual é a declaração correta de uma variável booleana?

        // A. boolean ehAdulto = 'false';
        // B. boolean ehAdulto = 0;
        // C. boolean ehAdulto = "false";
        // D. boolean ehAdulto = false;

        // Resposta D. boolean ehAdulto = false

        // // Qual será a saída do seguinte código Java?
        // int g = 3;

        // System.out.println(++g * 8);
        
        // A. 32
        // B. 33
        // C. 24
        // D. 25 

        // Resposta A. 32 - Operador ++ tem mais preferência que *, então g se torna 4 e quando multiplicado por 8 dá 32.

        // // Qual será a saída do seguinte programa Java?
        // double a, b, c;

        // a = 3.0/0;
        // b = 0/4.0;
        // c = 0/0.0;

        // System.out.println(a); // Infinity
        // System.out.println(b); // 0.0
        // System.out.println(c); // NaN

        // // A. NaN
        // // B. Infinity
        // // C. 0.0
        // // D. todos os mencionados

        // // Resposta D. todos os mencionados


        // Qual não se usa a palavra-chave "this" em Java?

        // A. Referindo-se à variável de instância quando uma variável local tem o mesmo nome
        // B. Passando-se para o método da mesma classe
        // C. Passando-se para outro método
        // D. Chamando outro construtor no encadeamento de construtores

        // Resposta B. Passando-se para o método da mesma classe - "this" é uma palavra-chave importante em java. Isso ajuda a distinguir entre variáveis ​​locais e variáveis ​​passadas no método como parâmetros.


        // // Qual será a saída do seguinte programa Java?
        // int x;
        // x = 5;
        // {
        //     int y = 6;

        //     System.out.print(x + " " + y);
        // }
        // System.out.println(x + " " + y );

        // A. Compilation error
        // B. Runtime error
        // C. 5 6 5 6
        // D. 5 6 5

        // // Resposta A - Compilation error

        
        // // Qual será o erro no seguinte código Java?
        // byte b = 50;
        // b = b * 50;

        // A. b cannot contain value 50
        // B. b cannot contain value 100, limited by its range
        // C. No error in this code
        // D. * operator has converted b * 50 into int, which can not be converted to byte without casting

        // Resposta D. * operator has converted b * 50 into int, which can not be converted to byte without casting.


        // Qual dos seguintes é um tipo de polimorfismo na programação Java?

        // A. Polimorfismo múltiplo
        // B. Polimorfismo de tempo de compilação
        // C. Polimorfismo multinível
        // D. Polimorfismo de tempo de execução

        // Resposta B, D


        // // Qual será a saída do seguinte programa Java?
        // byte x = 64;
        // System.out.println(x); // 64

        // int i;
        // byte y;

        // i = x << 2;
        // System.out.println(i); // 256

        // y = (byte) (x << 2);
        // System.out.println(y); // 0

        // System.out.println(i + " " + y); // 256 0

        // // A. 0 256
        // // B. 0 64
        // // C. 256 0
        // // D. 64 0

        // // Resposta: A. C C. 256 0 

        
        // O que é Truncamento em Java?

        // A. Valor de ponto flutuante atribuído a um tipo flutuante
        // B. Valor de ponto flutuante atribuído a um tipo inteiro
        // C. Valor inteiro atribuído a um tipo flutuante
        // D. Valor inteiro atribuído a um tipo flutuante

        // Resposta B. Valor de ponto flutuante atribuído a um tipo inteiro


        // // Qual será a saída do seguinte programa Java?

        // int arr[] = {1, 2, 3, 4, 5 };

        // for(int i = 0; i < arr.length - 2; ++i) {
            
        //     System.out.println(arr[i] + " "); //  1 2 3
        // }

        // // A. 1 2 3 4 5
        // // B. 1 2 3 4
        // // C. 1 2
        // // D. 1 2 3


        // // Qual será a saída do seguinte trecho de código Java?

        // if(args.length > 0)

        // System.out.println(args.length);

        // // A. O trecho compila e roda mas não imprime nada
        // // B. O trecho compila, roda e imprime 0
        // // C. O trecho compila, roda e imprime 1
        // // D. O trecho não compila

        // // Resposta A. O trecho compila e roda mas não imprime nada. - Como nenhum argumento é passado para o código, o comprimento de args é 0. Portanto, o código não será impresso.


        // Qual é a extensão das classes Java compiladas?
        // A. .txt
        // B. .js
        // C. .class
        // D. .java

        // Resposta C. .class


        // Qual exceção é lançada quando o java está sem memória?

        // A. MemoryError
        // B. OutOfMemoryError
        // C. MemoryOutOfBoundsException
        // D. MemoryFullException

        // Resposta B. OutOfMemoryError - O sinalizador Xms não tem valor padrão e Xmx normalmente tem um valor padrão de 256 MB. Um uso comum para esses sinalizadores é quando você encontra um java.lang.OutOfMemoryError.


        // // Qual será a saída do seguinte código Java?
        // char chars [] = { 'a', 'b', 'c'};

        // String s =  new String(chars);

        // System.out.println(s); // A. abc

        // // A. abc
        // // B. a
        // // C. b
        // // D. c


        // Quais destas são instruções de seleção em Java?

        // A. break
        // B. continue
        // C. for()
        // D. if()

        // Resposta D. if()


        // // Qual será a saída do seguinte código Java?
        // String c = "Ola eu amo java";
        // boolean var ;

        // var = c.startsWith("ola");

        // System.out.println(var); // D. false

        // // A. 0
        // // B. true
        // // C. 1
        // // D. false

        // Qual dessas palavras-chave é usada para definir interfaces em Java?

        // A. intf
        // B. Intf
        // C. interface
        // D. Interface

        // Resposta C. interface


        // // Qual será a saída do seguinte programa Java?
        
        // StringBuffer s1 = new StringBuffer("Quiz");
        // StringBuffer s2 = s1.reverse();

        // System.out.println(s2); // 4. ziuQ


        // // 1. QuizziuQ
        // // 2. ziuQQuiz
        // // 3. Quiz
        // // 4. ziuQ


        // // Qual será a saída do seguinte programa Java?
        // Integer i = new Integer(257);
        // byte x = i.byteValue();

        // System.out.println(x); // C. 1 - O método i.byteValue() retorna o valor do wrapper i como um valor de byte. 
        // // i é 257, o intervalo de bytes é 256, portanto, o valor de i excede o intervalo de bytes em 1, 
        // // portanto, 1 é retornado e armazenado em x.

        // // A. 257
        // // B. 256
        // // C. 1
        // // D. 0


        // // Qual será a saída do seguinte programa Java?
        // double x = 2.0;
        // double y = 3.0;
        // double z = Math.pow(x, y);

        // System.out.println(z); // B. 8.0 - y = 2.0 ^ 3.0 = 8.0

        // // A. 9.0
        // // B. 8.0
        // // C. 4.0
        // // D. 2.0


        // Qual das seguintes é uma superclasse de cada classe em Java?

        // A. ArrayList
        // B. Abstract class
        // C. Object class
        // D. String

        // Resposta C. Object Class - A classe de objeto é a superclasse de todas as classes em Java.


        // // Qual será a saída do seguinte código Java?
        // double x = 3.14;
        // int y = (int) Math.ceil(x);

        // System.out.println(y); // c) 4


        // // a) 3
        // // b) 0
        // // c) 4
        // // d) 3.0


        // // Qual será a saída do seguinte código Java?
        // URL obj = new URL("https://www.sanfoundry.com/javamcq");
        // URLConnection obj1 = obj.openConnection();
        // int len = obj1.getContentLength();

        // System.out.println(len); // a) 127

        // // a) 127
        // // b) 126
        // // c) Runtime Error
        // // d) Compilation Error


        // Qual das opções abaixo não é um Java Profiler?
        
        // a) JProfiler
        // b) Eclipse Profiler
        // c) JVM
        // d) JConsole

        // Resposta c) JVM


        // // Qual será a saída do seguinte trecho de código Java?
        // ArrayList obj = new ArrayList();

        // obj.add("A");
        // obj.add("B");
        // obj.add("C");
        // obj.add(1, "D");

        // System.out.println(obj); // d) [A, D, B, C] - 


        // // a) [A, D, C]
        // // b) [A, B, C]
        // // c) [A, B, C, D]
        // // d) [A, D, B, C]


        // Qual desses pacotes contém a exceção Stack Overflow em Java?

        // a) java.io
        // b) java.system
        // c) java.lang
        // d) java.util

        // Resposta c) java.lang


        // // Qual será a saída do seguinte trecho de código Java?
        // LinkedList lista = new LinkedList();

        // lista.add(new Integer(2));
        // lista.add(new Integer(8));
        // lista.add(new Integer(5));
        // lista.add(new Integer(1));

        // Iterator i = lista.iterator();

        // Collections.reverse(lista);
        // Collections.sort(lista);

        // while (i.hasNext()) {
             
        //     System.out.print(i.next() + " "); a) 1 2 5 8 - Collections.sort(lista) ordena a lista dada, a lista era 2->8->5->1 depois de ordenar tornou-se 1->2->5->8.
        // }
        
        // // a) 1 2 5 8
        // // b) 2 1 8 5
        // // c) 1 5 8 2
        // // d) 2 8 5 1


        // Qual destas afirmações está incorreta sobre o Thread?

        // a) o método start() é usado para iniciar a execução da thread
        // b) o método run() é usado para iniciar a execução de uma thread antes do método start() em casos especiais
        // c) Uma thread pode ser formada implementando apenas a interface Runnable
        // d) Uma thread pode ser formada por uma classe que estende a classe Thread

        // Resposta B - o método run() é utilizado para definir o código que constitui a nova thread, contém o código a ser executado. 
        // O método start() é usado para iniciar a execução da thread que é a execução de run(). run() em si nunca é usado para iniciar a execução do thread.


        // Quais dessas palavras-chave são usadas para o bloco a ser examinado em busca de exceções?

        // a) check
        // b) throw
        // c) catch
        // d) try

        // Resposta d) try


        // Qual é o intervalo numérico de um tipo de dados char em Java?

        // a) 0 até 256
        // b) -128 até 127
        // c) 0 até 65535
        // d) 0 até 32767

        // Resposta c) 0  até 65535 - Char ocupa 16 bits na memória, portanto suporta 2 16 i:e de 0 a 65535.


        // Qual classe fornece implementação do lado do servidor independente do sistema?

        // a) Server
        // b) ServerReader
        // c) Socket
        // d) ServerSocket

        // Resposta d) ServerSocket - é uma classe java.net que fornece implementação independente do sistema de conexão de soquete do lado do servidor.


        //  ​​Qual das seguintes afirmações é verdadeira sobre servlets?

        // a) Servlets podem usar toda a funcionalidade das bibliotecas de classes Java
        // b) Servlets executam dentro do espaço de endereçamento do servidor web, independente de plataforma e usa a funcionalidade das bibliotecas de classes Java
        // c) Servlets executam dentro do espaço de endereçamento do servidor web
        // d) Servlets são independente de plataforma porque eles são escritos em java

        // Resposta b) Os servlets são executados no espaço de endereço de um servidor web. Uma vez que é escrito em java, é independente de plataforma. A funcionalidade completa está disponível através de bibliotecas.


        // // Qual será a saída do seguinte trecho de código Java?

        // ArrayList arrayList = new ArrayList();

        // arrayList.add(1);
        // arrayList.add('1');
        // arrayList.add("1");

        // System.out.println(arrayList); // 1 1 1 


        
        // // Qual será a saída do seguinte trecho de código Java?
        // for(int i = 0; 0; i++) {

        //     System.out.println("Ola Mundo");
        // }

        // // Resposta: Exception in thread "main" java.lang.Error: Unresolved compilation problem: 


        // Qual afirmação sobre um arquivo .java válido é verdadeira?

        // A. Ele só pode conter uma declaração de classe.
        // B. Pode conter uma declaração de classe pública e uma definição de interface pública.
        // C. Deve definir pelo menos uma classe pública.
        // D. Pode definir no máximo uma classe pública.

        // Resposta D. Pode definir no máximo uma classe pública.

        
        // // Número de tipos de dados primitivos em Java são?

        // A. 6
        // B. 7
        // C. 8
        // D. 9

        // Resposta C. 8 - int, char, boolean, byte, long, float, short, double

        // // Qual é o tamanho de float e double em java?

        // A. 32 e 64
        // B. 32 e 32
        // C. 64 e 64
        // D. 64 e 32

        // // Resposta A. O tamanho de float e double em java é 32 e 64.


        // // A conversão automática de tipo é possível em qual dos casos possíveis?

        // A. Byte para int 
        // B. int para long
        // C. Long para int 
        // D. Short para int 

        // // Resposta A. Byte para int - A conversão automática de tipo é possível em Int para long.


        // // Encontre a saída do código a seguir.
        // int Integer = 24;
        // char String = 'I';

        // System.out.print(Integer);
        // System.out.print(String);

        // // A. Compiler Error
        // // B. throws Exception
        // // C. I 
        // // D. 24 I

        // // Resposta: D. 24 I

        
        // // Encontre a saída do programa a seguir.

        // short x = 10;
        // x =  x * 5;
        
        // System.out.print(x);

        // A. 50
        // B. 10
        // C. Erro de compilação
        // D. Exceção

        // Resposta: Erro de compilação -  cannot convert from int to short

        
        // // Encontre a saída do programa a seguir.

        // byte x = 127;
        // x++;
        // x++;

        // System.out.print(x);

        // A. -127
        // B. 127
        // C. 129
        // D. 2


        // Resposta: A. -127 - O intervalo de dados de byte em java é de -128 a 127. Mas o tipo de dados de byte em java é de natureza cíclica.


        // // Selecione a declaração válida.

        // A. char[] ch = new char(5)
        // B. char[] ch = new char[5]
        // C. char[] ch = new char()
        // D. char[] ch = new char[]

        // Resposta B. char[] ch = new char[5]


        // // Encontre a saída do programa a seguir.

        // int[] x = {120, 200, 016 };

        // for(int i = 0; i < x.length; i++) {

        //     System.out.println(x[i] + " "); // B. 120 200 14 - 016 é um número octal, seu número decimal equivalente é 14.
        // }

        // // A. 120 200 016 
        // // B. 120 200 14 
        // // C. 120 200 16 
        // // D. Nenhum


        // // Selecione a instrução válida para declarar e inicializar uma matriz.

        // A. int[] A = {}
        // B. int[] A = {1, 2, 3}
        // C. int[] A = (1, 2 ,3)
        // D. int[][] A = {1, 2, 3}

        // Resposta B. int[] A = {1, 2, 3} é a forma válida de declarar arrays.


        // // Encontre o valor de A[1] após a execução do programa a seguir.

        // int [] a = {0, 2, 4, 1, 3};

        // for(int i = 0; i < a.length; i++) {

        //     a[i] = a[(a[i] + 3) % a.length];
        // }

        // System.out.println(a[1]);
        // // A. 0
        // // B. 1
        // // C. 2
        // // D. 3

        // // Resposta B. 1 - a.length = 5
        // //                 a[0] = a[(0 = 3) % 5] = a[3] = 1
        // //         então   a[0] = a[3]1
        // //                 a[1] = a[(2 + 3) % 5] = a[0] = 1
        // //        Portanto a[1] = 1



        // // Arrays em java são:

        // A. Referencia de Objetos 
        // B. Objetos 
        // C. Tipo de dado primitivo 
        // D. Nenhum 

        // Resposta B. Objetos 



        // // Quando o objeto é criado com a palavra-chave new?

        // A. Em tempo de execução
        // B. Em tempo de compilação 
        // C. Depende do código 
        // D. Nenhum 

        // Resposta O objeto criado com palavra-chave new, durante o tempo de execução.



        // // Identifique a definição certa de um pacote.

        // A. Um pacote é uma coleção de ferramentas de edição.
        // B. Um pacote é uma coleção de classes.
        // C. Um pacote é uma coleção de classes e interfaces.
        // D. Um pacote é coleção de interfaces.

        // Resposta C. Um pacote é uma coleção de classes e interfaces.



        // // Identifique o que pode acessar diretamente e alterar o valor da variável res.
        // Public class Solucao {

        //     private int res = 100;
        // }

        // // A. Qualquer classe
        // // B. Apenas classe Solucao 
        // // C. Qualquer classe que estenda Solucao 
        // // D. Nenhum
        
        // // Resposta B. Apenas classe Solucao pode acessar diretamente o valor da variável.


        // // Em qual das seguintes opções o método toString() está definido?

        // A. java.lang.Object 
        // B. java.lang.String
        // C. java.lang.util 
        // D. Nenhum

        // Resposta: A. java.lang.Object 


        // // compareTo() retorna 

        // A. true 
        // B. false 
        // C. Um valor int 
        // D. Nenhum 

        // Resposta C. um valor int 


        // // Identifique a saída do programa a seguir.

        // String str = "abcde";

        // System.out.println(str.substring(1, 3)); // B. bc - str.substring(inicial, final) retorna a string de s[inicial] até s[final - 1]

        // // A. abc 
        // // B. bc 
        // // C. bcd 
        // // D. cd 


        // //  Identifique a saída do programa a seguir.

        // String str = "Ola";

        // System.out.println(str.indexOf("t")); // D. -1 - indexOf permite localizar a primeira ocorrência de uma sequência de caracteres em uma string.
        //                                                      // Retorna -1 se o caractere não for encontrado.

        // // A. 0 
        // // B. 1 
        // // C. true 
        // // D. -1 



        // //  Identifique a saída do programa a seguir.

        // String str1 = "um";
        // String str2 = "dois";

        // System.out.println(str1.concat(str2)); // C. umdois

        // // A. um
        // // B. dois
        // // C. umdois 
        // // D. doisum


        // // O que a string a seguir faz com a string str1.
        // String str1 = "Entrevistabit".replace('i', 's');

        // System.out.println(str1); // B. Substitui todas as ocorrências de 'i' por 's'.

        // // A. Substitui uma única ocorrência de 'i' por 's'.
        // // B. Substitui todas as ocorrências de 'i' por 's'.
        // // C. Substitui uma única ocorrência de 's' por 'i'.
        // // D. Nenhuma.



        // // Quantos objetos serão criados a seguir?
        // String a = new String("Entrevistabit");
        // String b = new String("Entrevistabit");
        // String c = "Entrevistabit";
        // String d = "Entrevistabit";

        // // A. 2 
        // // B. 3
        // // C. 4
        // // D. Nenhum.

        // // Reposta B. 3 - Usar a palavra-chave new cria um objeto toda vez. 
        // // Portanto, 2 objetos são criados para as duas primeiras instruções. 
        // // Em seguida, é declarada uma string que cria outro objeto. 
        // // Para a quarta instrução, como já existe uma string "Entrevistabit", ela não cria um objeto adicional novamente. 
        // // Portanto, a resposta é 3.


        //  A classe de string do construtor total tem?
        
        // A. 3
        // B. 7 
        // C. 13 
        // D. 20
        
        // Resposta C. A classe String tem 13 construtore.


        // //  Encontre a saída do código a seguir.
        // int ++a = 100;

        // System.out.println(++a);

        // A. 101 
        // B. Erro de Compilação porque ++a n~´ao é identificador válido.
        // C. 100 
        // D. Nenhum.


        // // Encontre a saída do código a seguir.

        // if (1 + 1 + 1 + 1 + 1 == 5) {
            
        //     System.out.println("verdadeiro");

        // } else {
        //     System.out.println("falso");
        // }

        // // A. Verdadeiro
        // // B. Falso 
        // // C. Erro de compilação
        // // D. Nenhum



        // // Encontre a saída do código a seguir.
        // int x = 5;

        // x *= (3 + 7);

        // System.out.println(x); // A. 50 - x* = 3 + 7 é equivalente a x * (3 + 7) = 5 * 10. Portanto, x = 50.

        // // A. 50 
        // // B. 22 
        // // C. 10 
        // // D. Nenhum



        // // Identifique o tipo de retorno de um método que não retorna nenhum valor.

        // A. int 
        // B. void
        // C. double 
        // D. Nenhum


        // // Qual é a saída de Math.floor(3.6)?

        // System.out.println(Math.floor(3.6));

        // // A. 3
        // // B. 3.0
        // // C. 4
        // // D. 4.0

        // // Resposta B. 3.0 - Math.floor() retorna o valor duplo que é menor ou igual ao argumento e é igual ao inteiro matemático mais próximo.


        // // Onde o sistema armazena parâmetros e variáveis ​​locais sempre que um método é invocado?

        // A. Heap - O heap é uma área de alocação dinâmica de variáveis. 
        // B. Stack - A pilha de funções também é uma área disponibilizada dentro do espaço de endereçamento do processo.
        // C. Array 
        // D. Tree 

        // Resposta B. Stack - O sistema armazena parâmetros e variáveis ​​locais em uma pilha.



        // // Identifique o modificador que não pode ser usado para construtor.

        // A. public 
        // B. protected 
        // C. private
        // D. static 

        // Resposta D. static - Estático não pode ser usado para construtor.



        // // Quais são as variáveis ​​declaradas em uma classe para uso de todos os métodos da classe chamada?

        // A. Objeto.
        // B. Variáveis de instância.
        // C. Variáveis de referência.
        // D. Nenhum.

        // Resposta B. Variáveis de instância.


        // // Qual é o tipo de retorno implícito do construtor?

        // A. Sem tipo de retorno.
        // B. Um objeto de classe no qual é definido.
        // C. Vazio (void).
        // D. Nenhum.

        // Resposta B. O tipo de retorno implícito do construtor é o objeto de classe no qual ele está definido.


        // // Quando o método finalize() é chamado?

        // A. Antes da coleta do lixo.
        // B. Antes de um objeto sair do escopo. 
        // C. Antes de uma variável sair do escopo. 
        // D. Nenhum.

        // Resposta A. Antes da coleta do lixo.


        // // Identifique o protótipo do construtor padrão.

        // public class Solucao {}

        // A. Solucao(void)
        // B. Solucao()
        // C. public Solucao(void)
        // D. public Solucao()

        // Resposta D. public Solucao()



        // // Identifique a maneira correta de declarar o construtor.

        // public class Solucao{}

        // A. Solucao() {}
        // B. public Solucao() {}
        // C. Solucao(void) {}
        // D. Ambos (A) e (B)
        
        // Resposta D. Ambos A e B são a maneira correta de declarar o construtor.





        // // Encontre a saída do código a seguir.

        // int i;

        // for(i = 1; i < 6; i++) {

        //     if(i > 3) continue;
        // }

        // System.out.println(i); // D. 6 - Como o loop é executado até 6, o valor de i é 6.

        // // A. 3
        // // B. 4
        // // C. 5
        // // D. 6



        // // Quantas vezes "EntrevistaBit" será impresso.

        // int contar = 0;

        // do {
        //     System.out.println("EntrevistaBit");

        //     contar++;
        // } while(contar < 10);

        // // A. 8
        // // B. 9
        // // C. 10
        // // D. 11

        // Resposta C. 10 - O EntrevistaBit será impresso 10 vezes, começando em contar = 0.


        // // O que é Runnable (Executável)?

        // A. Abstract class
        // B. Interface 
        // C. Class 
        // D. Method 

        // Resposta: B. Interface.



        // // A exceção criada pelo bloco try é capturada em qual bloco?

        // A. catch 
        // B. throw
        // C. final 
        // D. Nenhuma 

        // Resposta A. catch - A exceção criada pelo bloco try é capturada no bloco catch.



        // // Qual das seguintes exceções é lançada quando a instrução dividida por zero é executada?

        // A. Null Pointer Exception 
        // B. NumberFormatException 
        // C. ArithmeticException 
        // D. Nenhum 

        // Resposta C. ArithmeticException é lançada quando a instrução dividida por zero é executada.


        // // Onde a classe System é definida?

        // A. java.lang.package 
        // B. java.util.package 
        // C. package java.io 
        // D. Nenhum

        // Resposta A. - A classe System é definida em java.lang.package.


        // // Identifique a interface que é usada para declarar métodos principais em java?

        // A. Comparator
        // B. EventListener
        // C. Set 
        // D. Collection 

        // Resposta  D. Collection - é usada para declarar métodos principais em java.


        // // Quais das seguintes afirmações são verdadeiras sobre o método finalize()?

        // A. Pode ser chamado zero ou uma vez.
        // B. Pode ser chamado zero ou mais vezes.
        // C. Pode ser chamado exatamente uma vez.
        // D. Pode ser chamado uma ou mais vezes.

        // Resposta A. - O método finalize() pode ser chamado Zero ou uma vez.


        // // O que o operador >>>> faz?

        // A. Operador de deslocamento à direita.
        // B. Operador de deslocamento à esquerda.
        // C. Deslocamento à esquerda de preenchimento zero.
        // D. Deslocamento à direita de preenchimento zero.

        // Resposta D. >>>> é o deslocamento à direita de preenchimento zero.



        // // Identifique o recurso Java incorreto.

        // A. Orientado a Objetos 
        // B. Uso de ponteiros 
        // C. Dinâmico 
        // D. neural arquitetônico 

        // Resposta B. Usuo de ponteiros - Não existe nenhuma possibilidade de uso de ponteiros brutos em Java. 
        //                                 Até mesmo referências tem uso apenas implícito através dos objetos instanciados.



        // // Qual dos seguintes é usado para encontrar e corrigir bugs no programa?

        // A. JDK
        // B. JRE 
        // C. JVM 
        // D. JDB 

        // Resposta D. JDB está incluído no SDK. O depurador é iniciado com o comando jdb; ele é anexado à JVM usando JPDA.


        // // Preveja a saída do seguinte programa Java

        // int x = -4;

        // System.out.println(x>>1); // -2 

        // int y = 4;

        // System.out.println(y>>1); // 2

        // A. Erro do compilador: Operador >> não pode ser aplicado a números negativos
        // B. - 2 2 
        // C. 2 2 
        // D. 0 2


        // // Preveja a saída do seguinte programa Java. Suponha que int é armazenado usando 32 bits.

        // int x = -1;

        // System.out.println(x>>>29); // 7
        // System.out.println(x>>>30); // 3
        // System.out.println(x>>>31); // 1

        // // A. 7 3 1
        // // B. 15 7 3 
        // // C. 0 0 0 
        // // D. 1 1 1


        // // Qual é a saída?

        // System.out.println(10 + 20 + "MeuQuiz"); // 30MeuQuiz
        // System.out.println("MeuQuiz" + 10 + 20); // MeuQuiz1020

        // // A. 30MeuQuiz MeuQuiz30
        // // B. 1020MeuQuiz MeuQuiz1020
        // // C. 30MeuQuiz MeuQuiz1020 
        // // D. 1020MeuQuiz MeuQuiz30

        // Reposta C. 30MeuQuiz MeuQuiz1020 - Nas expressões fornecidas 10 + 20 + "MeuQuiz" e "MeuQuiz" + 10 + 20, 
        // existem dois operadores +, então a associatividade entra em cena. 
        // O operador + é da esquerda para a direita. 
        // Portanto, a primeira expressão é avaliada como (10 + 20) + "MeuQuiz" 
        // e a segunda expressão é avaliada como ("MeuQuiz" + 10) + 20 .


        // // Qual será o resultado do programa?

        // Set s = new LinkedHashSet<>();

        // s.add("1");
        // s.add(1);
        // s.add(3);
        // s.add(2);

        // System.out.println(s); // [1, 1, 3, 2]


        // // Qual será o resultado do programa?

        // for(int i = 0; i < 5; i++) {

        //     System.out.println(i + ' '); // 32 33 34 35 36
        // }


        // // Qual será o resultado do programa?

        // String nome = "JavaConceitoDoDia".substring(4);

        // System.out.println(nome); // ConceitoDoDia


        // // Qual será o resultado do programa?
        
        // String s = "1".repeat(5);

        // System.out.println(s); // 11111
    

        // // Qual será o resultado do programa?

        // System.out.println("1".concat("2").repeat(5).charAt(7)); // 2



        // Para qual das seguintes classes, você pode criar objetos sem usar o operador new?

        // 1. String
        // 2. StringBuffer
        // 3. StringBuilder

        // Resposta 1. String



        // // Qual será a saída do programa abaixo?

        // String string = "string".replace('i', '0');

        // System.out.println(string.substring(2, 5)); // r0n


        // // // Qual será a saída do programa abaixo?

        // System.out.println("Java" == new String("Java")); // falso (false)


        // // Qual será a saída do programa abaixo?

        // String str = " Java\tConceito\tdo\tdia ".strip();

        // System.out.println(str);


        // // Qual será a saída do programa abaixo?

        // if ("string".toUpperCase() == "STRING") {
            
        //     System.out.println(true);

        // } else {

        //     System.out.println(false);
        // }

        // Resposta: Falso(false)

        
        // // // Qual será a saída do programa abaixo?

        // String str1 = "Java";
        // String str2 = "Java";

        // System.out.println(str1 == str2); // verdadeiro (true)
        // System.out.println(str1.equals(str2)); // verdadeiro (true)
        // System.out.println(str1.hashCode() == str2.hashCode()); // verdadeiro (true)


        // // Qual será a saída do programa abaixo?

        // String str1 = "Java";
        // String str2 = new String("Java");

        // System.out.println(str1 == str2); // falso (false)
        // System.out.println(str1.equals(str2)); // verdadeiro (true)
        // System.out.println(str1.hashCode() == str2.hashCode()); // verdadeiro (true)


        
        // // Qual será a saída do programa abaixo?

        // String str1 = new String("Java");
        // String str2 = new String("Java");

        // System.out.println(str1 == str2); // falso (false)
        // System.out.println(str1.equals(str2)); // verdadeiro (true)
        // System.out.println(str1.hashCode() == str2.hashCode()); // verdadeiro (true)


        // // // Qual será a saída do programa abaixo?


        // String str1 = "Java";
        // String str2 = str1.intern();

        // System.out.println(str1 == str2); // verdadeiro (true)
        // System.out.println(str1.equals(str2)); // verdadeiro (true)
        // System.out.println(str1.hashCode() == str2.hashCode()); // verdadeiro (true)



        // // Qual será a saída do programa abaixo?

        // String str1 = "Java";
        // String str2 = str1.intern();
        
        // String str3 = new String("Java");

        // System.out.println(str1 == str2); // verdadeiro (true)
        // System.out.println(str2 == str3); // falso (false)
        // System.out.println(str3 == str1); // falso (false)




        // // Qual será a saída do programa abaixo?
    
        // String str1 = "1";
        // String str2 = "22";
        // String str3 = "333";

        // System.out.println(str1.concat(str2).concat(str3.repeat(3))); // 122333333333


        // // Qual será a saída do programa abaixo?

        // String s1 = "UM";
        // s1.concat("DOIS");
        // s1.concat("TRES");

        // System.out.println(s1); // saída: UM


        // // Qual será a saída do programa abaixo?

        // String s1 = "1";

        // System.out.println(s1.concat("2").concat("3")); // saída: 123



        //  // Qual será a saída do programa abaixo?

        //  System.out.println("Java" + 1000 + 2000 + 3000); // saída: Java100020003000
        //  System.out.println(1000 + 2000 + 3000 + "Java"); // saída: 6000Java - antes da String soma
        //  System.out.println(7.7 + 3.3 + "Java" + 3.3 + 7.7); // saída: 11.0Java3.37.7 - antes da String entre aspas soma
        //  System.out.println("UM" + 2 + 3 + 4 + "CINCO"); // saída: UM234CINCO



        // // Qual será a saída do programa abaixo?

        // System.out.println("JAVAJ2EE".substring(2, 5).substring(1).charAt(2));

        // saida: Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 2 out of bounds for length 2.



        // // Qual será a saída do programa abaixo?


        // System.out.println(Long.SIZE); // 64 - 64 significa 8 bytes.
        // System.out.println(Double.SIZE); // 64 - 64 significa 8 bytes.
        // System.out.println(Integer.SIZE); // 32 - 64 significa 4 bytes.


        // // Qual será a saída do programa abaixo?

        // short A = 234;
        // int B = 254;

        // System.out.println(A);
        // int C = 0;

        // C = A * 10 + B - A;

        // // %d	representa números inteiros
        // // %f	representa números floats
        // // %2f	representa números doubles
        // // %b	representa valores booleanos
        // // %c	representa valores char
        // System.out.printf("C : %d", C); // Saída: 2360

        
        // // Qual será a saída do programa abaixo?

        // float A = 2.3F;
        // int B = 3;
        // float C = 0.0F;

        // C = A * B - 4;

        // System.out.printf("C : %f",  C); // saída: 2,900000


        // // Qual será a saída do programa abaixo?

        // float A = 2.3f;
        // int B = 3;
        // int C = 0;

        // C = (int) A * B - 4;

        // System.out.println(C); // 2


        // // Qual será a saída do programa abaixo?

        // byte A = 10;
        // byte B = 30;

        // System.out.println(A);
        // System.out.println(B);

        // C = A * B;

        // System.out.println(C); // Exception in thread "main" java.lang.Error: Unresolved compilation problems: C não pode ser resolvido para uma variável


        // //  Qual será a saída do programa abaixo?

        // int num = 0;

        // num = System.out.printf("Ola Mundo"); // Exception in thread "main" java.lang.Error: Unresolved compilation problem: não pode ser convertido para int 

        // System.out.println(num);



        // //  Qual será a saída do programa abaixo?

        // int a = 4;
        // int b = 8;

        // if ((b-a--)>=a) { // true
            
        //     if((b+a)%2 == 1) // verdadeiro(true)

        //        System.out.println(a*b); // 24
        //     else 
        //        System.out.println(b+a);
        // }



        // //  Qual será a saída do programa abaixo?

        // int[] A = new int[4];
        // int i = 0;

        // for(i = -1; i < A.length-1;) {

        //     A[++i] = i;

        //     // System.out.println(i);
        // }

        // String res= "" + A[2] + (4%2) + (17%5) + (i -1); 

        // System.out.println(res); // saída 2022

        

        // //  Qual será a saída do programa abaixo?

        // int i = 3;
        // int e = 6;
        // int x = 7;

        // String s = "";

        // // 9 10
        // if ((i + e) >= (i + x)) { // false
            
        //     i++;
        //     s = "gg";
        //     e--;

        //     // 3 + 6 + 7 = 16 / 
        // } else if ((i + e + x) >= 15) { //  true

        //     x++; // 8

        //     s = "wp";
            
        // }

        // System.out.println(x + s); // saída: 8wp



        // //  Qual será a saída do programa abaixo?

        // String s1 = new String("11001");
        
        // int d  = Integer.parseInt(s1, 2);

        // A função parseInt(string , int) retorna o valor decimal 
        // de acordo com a string especificada e o valor base.
        // System.out.println(d); // saida: 25


        // // Encontre a saída do seguinte programa.

        // int arr[][] = {{4,3},{2,1}};
        // int i, j;

        // for(i = 1; i >-1; i--) {

        //     for(j = 1; j >-1;j--) {

        //         System.out.print(arr[i][j]); // primeiro valor é arr[1][1]
        //                                      //                  arr[1]={ 2,1 };

        //                                      //                  arr[1][1]=1;
        //                                      //                  arr[1][0]=2;
        //                                      //                  arr[0][1]=3;
        //                                      //                  arr[0][0]=4;
        //     }
        // }


        // // Encontre a saída do seguinte programa. 

        // System.out.println('h' + 'i'); // saída: 209 - O valor ASCII de h é 104 e o valor ASCII de i é 105. 
        //                                // A adição de 104 e 105 é 209.



        // // Encontre a saída do seguinte programa. 

        // int i;

        // // for(i = 1; 1; i++) {

        // //     System.out.print(i); // saida: Type mismatch: cannot convert from int to boolean
        // //     break;
        // // }

        // //  O correto seria
        // for(i = 1; true; i++) {

        //     System.out.print(i); // saída: 1
        //     break;
        // }



        // // Encontre a saída do seguinte programa. 

        // System.out.println("Google".charAt(3)); // saída: g - "Google".charAt(3) retornará 'g' , porque 'g' existe no 3º índice.


        // // Encontre a saída do seguinte programa. 

        // System.out.println("Google" + 3); //  Google3 - "+" é um operador de concatenação, se concatenarmos qualquer número ou string com a string, ele retornará aquele número/string concatenado à string.


        // // Encontre a saída do seguinte programa. 

        // System.out.println(10 + 20); // saída: 30 -  10+20 é uma expressão numérica simples, a adição será realizada. Portanto, o resultado será 30 .


        // // Encontre a saída do seguinte programa. 

        // if (System.out.println(10) == System.out.println(10)) // O operador == é indefinido para o(s) tipo(s) de argumento void
        //    System.out.println("TRUE");

        // else 
        //    System.out.println("False");


        // Resposta: A instrução System.out.println() não retorna nada. Portanto, nenhum valor será para compactação. 
        //           O erro será do tipo "void" não permitido aqui .





        // // Encontre a saída do seguinte programa. 

        // System.out.println(10 + 20 + "" + 30); // saida: 3030
        //                                        // 10+20 serão adicionados primeiro, e o resultado de 10+20 será 30. 
        //                                        // Então, " " será concatenado ao 30.
        //                                        // então ele se tornará "30" na string.
        //                                        // Depois disso, "30"+30 será "3030"
        //                                        // qualquer string/número for adicionado à string, ela será concatenada como string



        // // // Encontre a saída do seguinte programa. 

        // // char charVar = 'A';

        // // Char obj = charVar;

        // // System.out.println(obj); // saída: Exception in thread "main" java.lang.Error: Unresolved compilation problem: Char cannot be resolved to a type

        // // O correto seria:

        // char charVar = 'A';

        // Character obj = charVar;

        // System.out.println(obj); // saída: A



        // // Encontre a saída do seguinte programa. 

        // char charVar = 'B';
        
        // Character obj = charVar;

        // obj++;

        // System.out.println(obj); // saída: C

        // 1. A
        // 2. B 
        // 3. C
        // 4.




        // // Encontre a saída do seguinte programa. 

        // long valor = 'A';
        // Long obj = valor;

        // long valor1 = obj.longValue();

        // System.out.println(valor1); // saída: 65 - criamos um valor de variável local inicializado com 'A'
        //                                         // Em seguida, coloque o valor da auto-box no objeto obj.
        //                                         // Depois disso, desmarque o valor da variável valor e atribua à variável valor 1.
        //                                         // em seguida, imprima a variável valor 1 que imprimirá 65 , que é o valor ASCII do caractere 'A'.


        // // Encontre a saída do seguinte programa. 

        // int intVar = 49;
        
        // Object obj = intVar;
        
        // intVar = 99;

        // System.out.println(intVar); // Saida: 99
        // System.out.println(obj); // saida: 49

        // 1. 49, 49 
        // 2. 99, 99
        // 3. 49, 99
        // 4. 99, 49


        // // Encontre a saída do seguinte programa. 

        // // int intVar = 50; 
        // // int resultado = 0;

        // // Object obj = intVar; // 50

        // // intVar = 100;

        // // resultado = intVar + obj; // The operator + is undefined for the argument type(s) int, Object

        // // System.out.println(resultado);

        // // // Depois da correção
        
        // int intVar = 50;
        // int result = 0;

        // Integer Obj = intVar;

        // intVar = 100;

        // result = intVar + Obj;

        // System.out.println(result);
        
        // Convertendo objeto

        // int intVar = 50;
        // int result = 0;

        // Object Obj = intVar;

        // intVar = 100;

        // result = intVar + (int) Obj; // Casting (Objeto)

        // System.out.println(result); // saida: 150


        // Qual é a saida do códifo abaixo:

        // Object[] objArray = { 1, 2, 3, 4, 5};

        // Integer[] integerArray =  new Integer[objArray.length];

        // // copiar elementos do array de objetos para o array de inteiros

        // for(int i = 0; i < objArray.length; i++) {

        //     integerArray[i] = (Integer)objArray[i];
        // }


        // System.out.println(Arrays.toString(integerArray));

        // Copiando de outra maneira Usando System.arraycopy()

        // Object[] objArray = { 1, 2, 3, 4, 5};

        // Integer[] integerArray = new 

        // // Qual é a saída do programa?
        // int arr[] = { 1, 2, 3, 4, 5 };
        // int num = 0 ;

        // for(int i = 0; i < 5; i++) {
            //     0 + 1 = 1
            //     1 + 2 = 3
            //     3 + 3 = 6
            //     6 + 4 = 10
            //    10 + 5 = 15
        //     num += arr[i];

        //     System.out.println(i);
        //     // System.out.println(num); // 1 3 6 10 15
        // }


        // // Qual é a saída do programa?

        // // int arr[5]; // error: illegal start of expression
        // int arr [] = new int[5];
        // int num = 0;

        // arr = new int[5];

        // for(int i = 0; i < 5; i++) {
        //     num += arr[i];
        // }

        // System.out.println(num); // 0

        
        // // Qual é a saída do programa?

        // int arr[] = { 5, 3, 1, 6, 2 }; 

        // int num = 0;

        // for(int i = 1; i <= 4; i++) {
        //     num += arr[i];
        // }
        // System.out.println(num); // saída: 12


        // // Qual é a saída do programa?

        // int arr[] = { 5, 3, 1, 6, 2 }; 

        // int num = 0;

        // for(int i = 1; i <= 4; i++) {

        //     // Quando I=0;
        //     //     Num = num *5;
        //     //     Num =0;
        //     // Quando I=1;
        //     //     Num = num *3;
        //     //     Num =0;
        //     // Quando I=2;
        //     //     Num = num *1;
        //     //     Num =0;
        //     // Quando I=3;
        //     //     Num = num *6;
        //     //     Num =0;
        //     // Quando I=4;
        //     //     Num = num *2;
        //     //     Num =0;
        //     // num *= arr[i];
        // }
        // System.out.println(num); // saída: 12


        // // Qual é a saída do programa?

        // int arr[] = { 5, 3, 1, 6, 2};
        // int val = 0;

        // val = arr[0];
        // System.out.println(val);

        // for(int i = 1; i < arr.length; i++) {
        //     if (val < arr[i]) {
                
        //         val = arr[i];
        //     }
        // }
        // System.out.println(val); //  saída: 6


        // // Qual é a saída do programa?
        // int arr[] = {5, 3};
        // int val = 0;

        // arr = new int[5];

        // val = arr[0];

        // for(int i = 1; i < arr.length; i++) {

        //     if (val < arr[i]) 
                
        //         val = arr[i];
        // }
        // System.out.println(val); // saída: 0


        // // Qual é a saída do programa?

        // int arr[][] = new int[][] {

        //     new int[] { 21, 22, 23, 24 },
        //     new int[] { 25, 26 },
        //     new int[] { 27, 28, 29 },
        //     new int[] { 30, 31, 32, 33, 34 }
        // };

        // for(int i = 0; i < arr.length; i++) {

        //     for(int j = 0; j < arr[i].length; j++) {

        //         System.out.print(arr[i][j] + " ");
        //         System.out.println();
        //     }
        // }

        // // Resposta: 21 22 23 24 
        //           // 25 26 
        //           // 27 28 29 
        //           // 30 31 32 33 34 



        // // Qual é a saída do programa?

        // int num = 0; 
        // int i = 0;
        // int j = 0;

        // int arr[] = { 7, 8, 9, 11, 17 };

        // for(i = 0; i < arr.length; i++) {

        //     System.out.println(i);

        //     for(j = 2; j < (arr[i] / 2); j++) {

        //         System.out.println(j);

        //         if (arr[i] % j == 0) {
                    
        //             num = 1;
        //             break;
        //         }
        //     }
        //     if(num == 0)
        //        System.out.print(arr[i]);
        // }


        // Qual é a saída do programa?
        // final int i;
        // i = 20;
        // i = 30;

        // System.out.println(i);

        // A. 30;
        // B. Erro de Compilação
        // C. Garbage Value 
        // D. 0

        // Resposta: B. Erro de compilação


        // // Qual é a saída do programa?

        // int arr[] = new int[2];

        // System.out.println(arr[0]); // saída: 0
        // System.out.println(arr[1]); // saída: 0


        // // Qual das seguintes é/são verdadeiras sobre construtores em Java?

        // 1) O nome do construtor deve ser igual ao nome da classe. // verdadeiro
        // 2) Se você não definir um construtor para uma classe,
        //     um construtor sem parâmetros padrão é automaticamente
        //     criado pelo compilador. // verdadeiro
        // 3) O construtor padrão chama super() e inicializa todos
        //     variáveis ​​de instância para o valor padrão como 0, null. // verdadeiro
        // 4) Se quisermos criar um construtor de classe pai, ele deve ser chamado em
        //     primeira linha do construtor. // verdadeiro

        // A. 1
        // B. 1, 2
        // C. 1, 2 e 3
        // D. 1, 2, 3 e 4

        // Resposta: D. 1, 2, 3 e 4

        
        // // Qual das seguintes é/são verdadeiras sobre pacotes em Java?

        // 1) Cada classe faz parte de algum pacote.
        // 2) Todas as classes em um arquivo fazem parte do mesmo pacote.
        // 3) Se nenhum pacote for especificado, as classes no arquivo
        //    entre em um pacote especial sem nome
        // 4) Se nenhum pacote for especificado, um novo pacote será criado com
        //    nome da pasta da classe e a classe é colocada neste pacote.

        // A. Apenas 1, 2 e 3
        // B. Apenas 1, 2 e 4
        // C. Apenas 4
        // D. Apenas 1 e 3

        // Resposta: A. Apenas 1, 2 e 3


        // // Qual dos seguintes é/são vantagens dos pacotes?

        // A. Os pacotes evitam conflitos de nomes
        // B. As classes, mesmo que sejam visíveis fora de seu pacote, podem ter campos visíveis apenas para pacotes
        // C. Podemos ter classes ocultas que são usadas pelos pacotes, mas não visíveis do lado de fora.
        // D. Todos estão corretas 

        // Resposta: D. Todos estão corretas 


        // // Qual é a saída do programa?

        // int arr1[] = {1, 2, 3};
        // int arr2[] = {1, 2, 3};

        // if(arr1 == arr2)
        //    System.out.println("Mesmo");
        // else 
        //    System.out.println("Não é o mesmo");
        // }
        // // A. Mesmo 
        // // B. Não é o mesmo

        // // Resposta: B. Não é o mesmo.


        // // Qual é a saída do programa?
        // int arr1[] = {1, 2, 3};
        // int arr2[] = {1, 2, 3};

        // if(arr1.equals(arr2))
        //    System.out.println("Mesmo");
        // else 
        //    System.out.println("Não é o mesmo"); 

        // // A. Mesmo 
        // // B. Não é o mesmo

        // // Resposta: B. Não é o mesmo.



        // // Qual é a saída do programa?

        // try {
        //     throw 10;
        // } catch (Exception e) {
        //     System.out.println("Obteve a exceção " + e);
        // }


        // // A. Obteve a exceção 10
        // // B. Obteve a exceção 0
        // // C. Erro do compilador

        // // Resposta: C. Erro do compilador - Em Java, somente objetos throwable 
                                                // (objetos Throwable são instâncias de qualquer subclasse da classe Throwable) 
                                                // podem ser lançados como exceção. Portanto, o tipo de dados básico não pode ser lançado.




        // // Qual é a saída do programa?

        // Double objeto = new Double("2.4");
        // int a = objeto.intValue();
        
        // byte b = objeto.byteValue();
        
        // float d = objeto.floatValue();
        
        // double c = objeto.doubleValue();
        

        
        // System.out.println(a + b + c + d); // saída: C. 2 + 2 + 2.4 + 2.4 = 8.800000095367432

        // // A. 8 
        // // B. 8.8 
        // // C. 8.800000095367432

        // Resposta: C. 8.800000095367432 - As conversões aritméticas são executadas implicitamente para converter os valores em um tipo comum. O compilador primeiro executa a promoção de inteiros. Se os operandos ainda tiverem tipos diferentes, eles serão convertidos para o tipo que aparece mais alto na hierarquia


        // Qual destas é uma superclasse de todos os erros e exceções na linguagem Java?

        // Qual é a saída do programa abaixo?

        








































    }

    // protected int x, y;
}
