import java.util.*;
import java.time.LocalTime; 


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
        //     // if(num == 0)
        //     //    System.out.println(arr[i]);
        // } 

        
        // // Qual é a saída do programa?

        // float[] floatArray = { 20.2F, 21.4F, 32.4F } ;

        // for(float F : floatArray) {

        //     System.out.println(F % 3);
        // }

        // saída:
        // // 2.2000008
        // // 0.39999962
        // // 2.4000015
        

        // // Qual é a saída do programa?

        // float[] floatArray1 = { 20.2F, 21.4F, 32.4F };
        // float[] floatArray2 =  floatArray1;

        // System.out.println(floatArray1);

        // for(float F : floatArray2) {

        //     System.out.println(F % 3);
        // }

        // saída:
        // 2.2000008
        // 0.39999962
        // 2.4000015


        // Qual é a saída do programa?




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


        // // Qual é a saída do programa abaixo?

        // int p = 1;
        // int q = 2;
        // int r = 3;

        // p |= 4;
        // q >>= 1;
        // r <<= 1;
        // p ^= r;

        // System.out.println(q + " " + q + " " + r); // saída: 1 1 6
        
        // // a. 3 3 6
        // // b. 2 3 4
        // // c. 2 2 3
        // // d. 1 1 6
        

        // // Java é sucessor de qual linguagem de programação?

        // A) B
        // B) C
        // C) C++
        // D) D

        // Resposta: c++ - C++ introduziu conceitos de OOPs (Programação Orientada a Objetos) que são adotados por Java.


        // // Qual é o comando usado para executar um programa Java na Linha de Comando ou Prompt de Comando ou CMD?

        // A) >java hello.java
        // B) >javac hello.java
        // C) >javacomp hello.java
        // D) >javacmd hello.java

        // // Resposta B. >javac hello.java


        // Qual é a necessidade de mencionar "static" antes do método main?;

        // A) Para chamar o método main sem criar um objeto de classe
        // B) Tornar o método main como método de classe comum a todas as instâncias
        // C) A e B
        // D) Nenhuma das anteriores

        // Resposta C


        // // Para que serve o modificador de acesso "púbico" na linguagem Java?

        // A) Para ocultar o método principal do uso indevido
        // B) Para chamar o método main fora da classe ou pacote pela JVM
        // C) Para proteger o método principal
        // D) Nenhuma das anteriores

        // Resposta: B. Para chamar o método main fora da classe ou pacote pela JVM


        // String args[] no método main são usados ​​para? 
        // public static void main(String args[]) 
        // { 
        // // 
        // }


        // A) Passando argumentos em tempo de compilação
        // B) Passando argumentos em tempo de execução
        // C) Contando o número de palavras
        // D) Nada

        // Resposta B. Passando argumentos em tempo de execução
        // C:/>java Hello AFRICA GOLDMINE
        // Hello - Class name
        // AFICA - First argument
        // GOLDMINE - Second argument

        // Qual é o tipo de retorno padrão de um método na linguagem Java?

        // A) void
        // B) int
        // C) short
        // D) Nenhum of the above

        // Resposta D. você precisa mencionar explicitamente um tipo de retorno.


        // Nome de uma classe, variável, método ou interface na linguagem Java é chamado?

        // A) Argumento
        // B) Valor
        // C) Identificador
        // D) Nenhuma das anteriores

        // Resposta C.


        // // Um identificador válido na linguagem Java pode conter quais caracteres?

        // A) 0-9
        // B) AZ, z
        // C) $, _ (Sublinhado)
        // D) Todas as anteriores

        // Resposta: D. Todas as anteriores


        // // Um Identificador ou nome válido na linguagem Java pode começar com qual caractere?

        // A) az, AZ
        // B) $, _
        // C) 0-9
        // D) A e B

        // Resposta D. Até o JDK 8, apenas um único símbolo de sublinhado pode ser usado como 
        // identificador de uma classe, método ou variável. JDK 9 não permite.


        // // O que é Literal em Java?

        // A) Literal é o valor que é dado ou atribuído a uma variável.
        // B) Literal é um tipo de dado
        // C) Literal é semelhante a String
        // D) Nenhuma das anteriores

        // Reposta: A. Literal é o valor que é dado ou atribuído a uma variável. - exemplos 123, 45.67f, 'C', "abc", false


        // Quais são os tipos de literais inteiros em Java?

        // A) Literais decimais
        // B) Literais octais e hexadecimais
        // C) Literais Binários
        // D) Todas as anteriores

        // Resposta D - O JDK 7 introduziu literais binários para definir facilmente bits individuais de um número.


        // Escolha exemplos corretos de literais decimais em Java.

        // A) int a = 12345;
        // B) int a = 12_3__5;
        // C) a longo = 987____654_3__21L;
        // D) Todas as anteriores

        // D. Para representar números grandes, basta acrescentar a letra 'l' ou 'L' 
        // ao número para torná-lo um inteiro longo. Isso evita erros do compilador dizendo " fora do intervalo "


        // Um número octal é Java é representado com um ____ inicial?

        // A) O (Alfabeto)
        // B) 0 (ZERO)
        // C) 0x
        // D) 0X

        // Resposta B. Por exemplo. int a=0765;


        // Escolha intervalos corretos para números Decimal, Octal e Hexadecimal em Java?

        // A) Decimal: 0 a 9
        // B) Octal: 0 a 7
        // C) Hexadecimal: 0 a 9 e A a F / a a f
        // D) Todas as anteriores

        // Resposta D


        // // Escolha o exemplo correto de Octal Literal em Java?

        // A) short = 0564;
        // B) int = 076__45_2;
        // C) int = 0______11;
        // D) Todas as anteriores

        // Resposta: D. exemplo int = 0______11; // 8^1 * 1 + 8^0 * 1 = 9


        // // Qual é o prefixo usado para representar números hexadecimais em Java?

        // A) 0x
        // B) 0X
        // C) A e B
        // D) Nenhuma das anteriores

        // Resposta D. Nenhuma das anteriores - exemplo int a=0xFEB5; int b=0X9876__45;


        // // Escolha exemplos corretos de literais hexadecimais em Java?

        // A) long a = 0X987654321L;
        // B) int a = 0x76FE____23;
        // C) byte b = 0X0__________F;
        // D) Todas as anteriores

        // Resposta D. Todas as anteriores




        // Qual é o prefixo usado para representar literais binários em Java?


        // A) b or B
        // B) 0b or 0B
        // C) xB or xb
        // D) ob or oB

        // Resposta B. exemplo ZERO B ou ZERO b ; byte a = 0b00001111; //15 em decima
        
        
        // Qual é a representação correta do uso de literais binários em Java?

        // A) int a = 0b1010;
        // B) int a = 0B1011_1010;
        // C) int a = 0B0______________1;
        // D) Todas as anteriores

        // Resposta D. Todas as anteriores - int a = 0B0______________1; //decimal=1 - int b = 0b1010; //decimal=10


        // // Qual é o erro do compilador por usar indevidamente Underscores ( _ ) em literais em Java?

        // A) Os sublinhados estão fora do intervalo
        // B) IllegalUnderscoresException
        // C) Os sublinhados devem estar localizados dentro de dígitos
        // D) Muitos sublinhados

        // Resposta C. Os símbolos de sublinhado não podem ser usados ​​no início e no final dos dígitos de um número.

        
        // Qual é o sufixo usado para representar um número de ponto flutuante em Java

        // A) r ou R
        // B) f ou F
        // C) fl ou FL
        // D) Nenhuma das anteriores

        // Resposta B. float a = 1,345f; float b = 567,345678F;



        // // Qual é a saída do seguinte código Java?

        // int a = 9;
        // float b = a/2;

        // System.out.println(b);

        // // A) 4,0
        // // B) 4,5
        // // C) 5,0
        // // D) Nenhuma das anteriores

        // // Resposta A. 4.0 - Você precisa digitar cast pelo menos um número nessa expressão 
        // // para float ou double para fazer a divisão de números reais. float b = 9*1f/2 = 4.5




        // // Qual é a saída do trecho de código Java abaixo?

        // char ch = 'A'; // ASCII 65 
        // int a = ch + 1;
        // ch = (char)a;

        // System.out.println(ch); // saída: C. B - ch é promovido a int e 1 é adicionado.
        //                         // O valor int 66 é novamente o tipo convertido para o tipo char.
        //                         // Então fora será o próximo personagem de A, ou seja, B.

        // // A) 66
        // // B) A
        // // C) B
        // // D) 65






        // // Qual é a saída do trecho de código Java abaixo? 

        // float a = 8.2/2;

        // System.out.println(a);

        // A) 4.1
        // B) 8.1
        // C) 4
        // D) Compiler error

        // Resposta: D. Tem que adicionar um sufixo f ou F 


        // // Qual é a saída do trecho de código Java? 

        // byte b = 25;
        // b++;
        // b = b + 1;

        // System.out.println(b);

        // A) 25
        // B) 26
        // C) 27
        // D) Erro do compilador

        // Resposta D. Erro de compilação - A conversão de tipo explícito é necessária.


        // // Qual é a saída do trecho de código Java?

        // int a  = 260;
        // byte b = (byte) a;

        // System.out.println(b);

        // // A) 0
        // // B) 4
        // // C) 255
        // // D) 260

        // // Resposta B. 4 - Se um número for muito grande para um tipo de dado, 
        // // aplica-se a Divisão Modulo pelo maior número possível desse tipo de dado. 
        // // O intervalo de bytes é de -128 a +127. 260 > 127.
        // // 260% 256 = 4


        // // Qual é a saída do trecho de código Java?

        // short a  = (short) 65540;

        // System.out.println(a);

        // A) 0
        // B) 4
        // C) 65536
        // D) 65540

        // Resposta: B. 4 - 65540 é maior que o curto alcance -32768 a +32767. tão, 65540% 2^32 = 65540%65536 = 4



        // // Um literal booleano em Java pode ser convertido em tipo de dado para qual tipo de dado?

        // A) byte
        // B) short
        // C) int
        // D) Nenhuma das anteriores

        // Resposta Um literal ou variável booleana aceita apenas true ou false. Portanto, ele não aceita números para conversão de tipo.


        // // Qual é a saída do trecho de código Java abaixo?

        // int a = 2 - - 7;

        // System.out.println(a); // saída: 9 - Menos de Menos é Mais. Então 2 - - 7 se torna 2+7 = 9;


        // // A) -5
        // // B) 10
        // // C) 9
        // // D) Compiler Error



        // // Qual é a saída do trecho de código Java abaixo? 

        // short p = 1;
        // short k = p + 2;

        // System.out.println(k);

        // A) 1
        // B) 2
        // C) 3
        // D) Compiler error

        // Resposta D. Erro de compilação - Os números são tratados como tipo int por padrão. 
        // Portanto, um valor int não pode ser atribuído a uma variável short. 
        // Você tem que digitar cast toda a expressão.
        // short k = (short)(p+2)

        
        // // Qual é a saída do trecho de código Java?

        // short k = 1;
        // k += 2;

        // System.out.println(k); // saída: 3 - Os operadores de atribuição compostos 
        //                       // convertem automaticamente o valor da expressão para o tipo de dados do lado esquerdo.
        //                       // k = k + 1; // Erro
        //                       // k += 1 // Funciona
        //                       // k++; // Funciona

        // A) 1
        // B) 2
        // C) 3
        // D) Compiler error about Type Casting


        // // Qual é a saída do trecho de código Java? 

        // int a = 5, b = 10, c = 15;
        
        // a -= 3;
        // b *=  2;
        // c/= 5;

        // System.out.println(a + " " + b + " " + c); // saída: A. 2 20 3
        //                                            // a = a - 3; a = 5 -3 = 2;
        //                                            // b = b * 2; b = 2 * 10 = 20;
        //                                            // c = c/5; c = 15/5; c = 3;

        // A) 2 20 3
        // B) 2 20 5
        // C) 2 10 5
        // D) -2 20 3



        // // Como você reescreve o trecho de código Java abaixo?

        // int p = 10;
        // p = p % 3;


        // A) p=%3;
        // B) p%=3;
        // C) p=3%;
        // D) Nenhuma das anteriores

        // // Resposta B. p%= 3;


        // Os operadores aritméticos +, -, /, * e % possuem qual associatividade?

        // A) Da direita para a esquerda
        // B) Da esquerda para a direita
        // C) Direito a Direito
        // D) Da esquerda para a esquerda

        // Resposta B. Da esquerda para a direita


        // // Entre os operadores Postfix Decrement e Prefix Increment em Java, qual operador tem menos prioridade?

        // A) O decremento pós-fixo tem menos prioridade do que o incremento de prefixo
        // B) Incremento de prefixo tem menos prioridade do que decremento de pós-fixo
        // C) Ambos os operadores têm a mesma prioridade
        // D) Nenhuma das anteriores

        // Resposta B. a++ > ++b


        // // Operadores aritméticos de incremento e decremento em Java tem qual Associatividade?

        // A) Da esquerda para a direita
        // B) Da direita para a esquerda
        // C) Da esquerda para a esquerda
        // D) Direito a Direito

        // Resposta B. Da direita para a esquerda


        // // Escolha a afirmação correta sobre os Operadores Java +, -, *, / e %.

        // A) + e - têm a mesma prioridade
        // B) * e / têm a mesma prioridade
        // C) / e % têm a mesma prioridade
        // D) Todas as anteriores

        // Resposta D. Todos estão tendo a mesma prioridade.


        // // Entre os grupos de operadores (++, --) e (+, -, *, /, %) em Java, qual grupo tem maior prioridade?

        // A) O grupo (++, --) tem prioridade mais alta que o grupo (+, -, *, /, %)
        // B) O grupo (++, --) tem prioridade inferior ao grupo (+, -, *, /, %)
        // C) grupo (++, --) e grupo (+, -, *, /, %) têm prioridade igual
        // D) Nenhuma das anteriores

        // Resposta A. Novamente entre os operadores Prefix e Post, os operadores Postfix têm maior prioridade.



        // // Qual é a saída do trecho de código Java? 

        // int a = 10, b = 6;
        // int c = a + b * 5;

        // System.out.println(c); // saída: 40 - * tem prioridade maior que +. Portanto, a operação de multiplicação é executada primeiro.
        //                        // a + (b*5)
        //                        // 10 + (6*5)
        //                        // 10 + 30 
        //                        // 40

        // // A) 40
        // // B) 50
        // // C) 80
        // // D) Compiler error


        // // Qual é a saída do trecho de código Java? 

        // int a = 10, b = 5, c = 3;
        // int d = a + c/2*b;

        // System.out.println(d); // saída: C. 15 - / e * têm a mesma prioridade.
        //                       // Então associatividade da esquerda para a direita é usada.
        //                       // Lembre-se que 3/2 é 1 e não 1,5 pois ambos os operandos são inteiros.
        //                       // a + c/2*b
        //                       // a+(c/2*b)
        //                       // a+((c/2)*b)
        //                       // a+(3/2 * b)
        //                       // a+(1*5)
        //                       // 10+5
        //                       // 15

        // // A) 17.5
        // // B) 32.5
        // // C) 15
        // // D) 30


        // // Qual é a saída do trecho de código Java?

        // int a = 5, b = 6;

        // if(a++ == --b) {

        //     System.out.println("5=5");
             
        // } else {
        //     System.out.println("NENHUM");
        // }

        // // A) NENHUM
        // // B) 5=5
        // // C) Erro de compilação 
        // // D) Nenhuma das anteriores 

        // // Resposta: B. 5=5 - No momento da avaliação de a++ == --b, a(5) é comparado com --b(6-1). 
        //                    // Então, a condição "se" passa.
        //                    // Se você verificar um valor após o bloco ELSE, será a+1, ou seja, 6.


        // // Qual é a saída do trecho de código Java?

        // int a = 6, b = 5;

        // if (++b == a--) {
        //     System.out.println("COELHO");

        // } else {
        //     System.out.println("COELHA");
        // }

        // // A) COELHO
        // // B) COELHA
        // // C) Erro do compilador
        // // D) Nenhuma das anteriores

        // // Resposta: A. COELHO - Após o bloco ELSE, b será b+1, ou seja, 6
        //                       // ++b = a--
        //                       // ++b == (a-1)
        //                       // b = (a-1)
        //                       // 5 == 5


        // // Qual é a saída do trecho de código Java?

        // int a = 10, b = 20;
        // int c = a++*2;
        // int d = --b*2;

        // System.out.println(c + "," + d); // saída: C. 20,38 - O prefixo é incrementado ou decrementado imediatamente. 
        //                                                    // Postfix incrementado ou decrementado na próxima linha/instrução.
        //                                                    // 1) a+*2
        //                                                    // a*2
        //                                                    // 10*2 = 20
        //                                                    // 2) --b*2
        //                                                    // (b-1)*2
        //                                                    // (20-1)*2
        //                                                    // 19*2 = 38

        // // A) 20,40
        // // B) 22,40
        // // C) 20,38
        // // D) 22,38


        // // Quais são os tipos de dados que podem ser usados ​​junto com os operadores relacionais em Java?

        // A) char, boolean, Object
        // B) byte, short, int, long
        // C) float, double
        // D) Todas as anteriores

        // Resposta: D. Todas as anteriores


        // Qual grupo de operadores tem maior prioridade entre (>, >=, <, <=) e (==, !=)?

        // A) (>, >=, <, <=) tem prioridade mais baixa (==, !=)
        // B) (>, >=, <, <=) tem prioridade mais alta (==, !=)
        // C) (>, >=, <, <=) tem prioridade igual a (==, !=)
        // D) Nenhuma das anteriores

        // Resposta B. (>, >=, <, <=) tem prioridade mais alta (==, !=)


        // // Qual é a saída do trecho de código Java?

        // int k = 20;

        // if (k) {
            
        //     System.out.println("SIM");
        // } else {
        //     System.out.println("NÃO");
        // }

        // // A) NÃO
        // // B) SIM
        // // C) Erro do compilador
        // // D) Nenhuma das anteriores

        // Resposta: C. Erro de compilação - Erro: if(k) --> k não é booleano. 
        //              Tipo incompatível: não é possível converter de int para boolean.



        // // Qual é a saída do trecho de código Java?
        
        // int[] array = { 5, 6, 7, 8};

        // if (array.length > 2) {
            
        //     System.out.println(array[2]); // saída: B. 7 - Todos os arrays Java têm um campo "length" que contém o tamanho desse array.
        // }

        // // A) 6
        // // B) 7
        // // C) 8
        // // D) Compiler error



        // // Qual é a saída do trecho de código Java?

        // char ch = 'A';

        // if (ch > 70) {
        //     System.out.println("PIZZA");
        // } else {
        //     System.out.println("BURGUER");
        // }

        // // A) PIZZA
        // // B) BURGER
        // // C) Compiler error
        // // D) Nenhuma das acima

        // // Resposta: B. BURGUER -  valor ASCII ou UNICODE do caractere 'A' é 65.
        //                         // Um valor char é convertido em int antes de compará-lo.




        // // Qual é a saída do trecho de código Java?

        // int a = 20, b = 10;
        // boolean c = a>= 10 & b<20;

        // System.out.println(c); // saída: verdadeiro(true) 

        // // A) falso
        // // B) verdade
        // // C) Erro do compilador
        // // D) Nenhuma das anteriores

        
        // // Quais são os dois tipos possíveis de Operadores Lógicos?

        // A) Lógico bit a bit
        // B) Lógica booleana
        // C) Aritmética Lógica
        // D) A e B
        
        // Resposta D. A e B

        // Na linguagem Java, um índice de array começa com: 

        // A) -1
        // B) 0
        // C) 1
        // D) Qualquer número inteiro

        // Resposta B


        // Quais são os símbolos especiais usados ​​para declarar um array em Java?

        // A) Chaves { }
        // B) Parênteses ()
        // C) Colchetes [ ]
        // D) Suportes angulares < >

        // Resposta C. Colchetes [ ]

        
        // Quais são os símbolos especiais usados ​​para inicializar um array no momento da própria declaração?

        // A) Parênteses ( )
        // B) Colchetes [ ]
        // C) Chaves { }
        // D) Suportes angulares < >

        // Resposta C. Chaves {} - int[] nums = {1,3,6};


        // É possível pular a inicialização de alguns elementos do array durante a inicialização?

        // A) FALSO
        // B) VERDADEIRO

        // Resposta: A. falso - Todos os elementos precisam ser inicializados de uma só vez ou ao mesmo tempo.


        // // Qual é a saída do trecho de código Java abaixo?

        // int [] marcas = {35, 65, 95 };

        // System.out.println(marcas.length + "," + marcas[1]); // saída: C. 3,65

        // // A) 2,65
        // // B) 3,95
        // // C) 3,65
        // // D) Erro do compilador


        // // Qual é a saída do trecho de código Java abaixo?

        // int[] bolas = {};

        // System.out.println(bolas.length); // saída: A. 0

        // // A) 0
        // // B) -1
        // // C) 1
        // // D) Erro do compilador


        // Qual é a maneira correta de saber o tamanho do array em Java?

        // A) //int[] array; 
        //    array.length()

        // B) //int[] array;
        // array.length

        // C) //int[] array;
        // array->length()

        // D) //int[] array;
        // array->length

        // Resposta: B.


        // // Qual é a saída do programa Java abaixo com arrays?

        // String[] cores = {"VERMELHO", "AMARELO", "BRANCO"};

        // System.out.println(cores);

        // // A) VERMELHO
        // // B) AMARELO 
        // // C) BRANCO 
        // // D) Erro de compilação
        
        // // Resposta D. Erro de compilação - Os elementos do array devem ser separados por vírgulas(,)s.


        // // Qual é a saída do programa Java abaixo com arrays?

        // String[] computador = { "RAM", "HDD", "MOUSE" };
        // String[] partes = { computador[0], computador[2]};

        // System.out.println(partes[1]); // saída: C. MOUSE

        // // A) RAM
        // // B) HD
        // // C) MOUSE
        // // D) Erro do compilador


        // // Qual é a saída do programa Java abaixo?
        // int idades[3] = { 25, 27, 30};

        // System.out.println(idades[1]);

        // // A) 25
        // // B) 27
        // // C) 30
        // // D) Erro de compilação

        // // D. Erro de compilação - Não devemos mencionar o tamanho do array no momento da inicialização.




        // Se um índice de um elemento é N, qual é sua posição real na matriz?

        // A) N-1
        // B) N
        // C) N+1
        // D) N+2

        // Resposta: C. N+1 - O índice de matriz começa com 0. 
                           // Portanto, um índice de 6 significa 7ª posição. 
                           // Um índice de N significa, N+1 posição.

        
    // Um array em Java pode ser declarado apenas de alguns tipos predefinidos:

    // A) Falso 
    // B) Verdadeiro

    // Resposta A. Falso - Um array pode ser de qualquer tipo de dado, primitivo ou tipo de objeto.


    // Qual é o valor padrão de um elemento do tipo Object array

    // A) 0
    // B) nulo
    // C) -1
    // D) Garbage value

    // Resposta B. Os objetos podem ser String, ArrayList, HashMap, HashSet etc.


    // Qual é o valor padrão dos elementos de tipo de dados byte, short, int ou long de um array em Java?

    // A) -1
    // B) 1
    // C) 0
    // D) Garbage value

    // Resposta C. 0


    // Qual é o valor padrão dos elementos do tipo de dados float ou double de um array em Java?

    // A) 0
    // B) 0,0
    // C) 1
    // D) 1,0

    // Resposta B. 0,0


    // Qual é o valor padrão dos elementos do tipo de dados char de um array em Java?

    // A) 'A'
    // B) '\0'
    // C) null
    // D) '\0' or null

    // Resposta D. '\0' or null


    // Qual é o valor padrão dos elementos do tipo de dados booleanos de um array em Java?

    // A) True 
    // B) False 

    // Resposta B. falso(false)


    // // Qual é a saída do programa Java abaixo?

    // int bolas[], rodadas = 3;

    // bolas = new int[rodadas];

    // for(int i = 0; i < bolas.length; i++) 
    //     bolas[i] = (i+1)*2;

    // for(int j = 0; j < bolas.length; j++)
    //    System.out.println(bolas[j] + ",");

    // // A) 0,2,4,
    // // B) 1,2,3,
    // // C) 2,4,6,
    // // D) Compiler error

    // // Resposta C. 2, 4, 6



    // // Qual é a saída do programa Java abaixo com arrays?

    // String[] array = {"KITE", "AR"};
    // String str = "AVIÃO";

    // array[1] = str;
    // str = "VOAR";

    // System.out.println(array[1]); // saída: B. AVIÂO

    // // A) AR
    // // B) AVIÃO
    // // C) VOAR
    // // D) Compiler error

    // Um array de arrays em Java é chamado array?

    // A) Bidirecional
    // B) Combinação
    // C) Multidimensional
    // D) Multi-valor

    // Resposta: C. Multidimensional


    // Um array multidimensional contém elementos do mesmo tipo de dados em todas as linhas e colunas. 
    // Indique VERDADEIRO ou FALSO.

    // A) Falso 
    // B) Verdadeiro 

    // Resposta: 

    
    // Escolha a forma correta de inicializar um array multidimensional abaixo.

    // A) int[][] codigo = {{1,2},{3,4,5}};
    // B) int[2][] codigo = {{1,2},{3,4,5}};
    // C) int[][] codigo = {1,2,3,4,5};
    // D) Todos

    // Resposta: A. int[][] codigo = {{1,2},{3,4,5}};


    // // Qual é a saída do programa Java com o array multidimensional?

    // int[][] cabras;
    // cabras = new int[3][];
    // cabras[0] = {1, 2};

    // System.out.println(cabras[0][1]);

    // // A) 0
    // // B) 1
    // // C) 2
    // // D) Compiler error

    // // Resposta: D. Erro de compilação - use a palavra-chave new




     // Qual das seguintes é uma afirmação válida?

    // A. char[] c = new char();
    // B. char[] c = new char[5];
    // C. char[] c = new char(4);
    // D. char[] c = new char[];
 
    // Resposta B. char[] c = new char[5];


    // // Qual é a saída do programa Java?

    // int[] a = new int[0];

    // System.out.println(a.length); // saída: A. 0

    // // A) 0
    // // B) Erro de compilação 
    // // C) Nenhuma acima 


    // // Qual é a saída do programa Java?

    // int[] x = new int[3];

    // System.out.println("x[0] é " + x[0]); // saída: C. x[0] é 0

    // // A) O programa tem um erro de compilação porque o tamanho do array não foi especificado ao declarar o array.
    // // B) O programa tem um erro de tempo de execução porque os elementos da matriz não foram inicializados.
    // // C) O programa funciona bem e exibe x[0] é 0.
    // // D) O programa tem um erro de tempo de execução porque o elemento da matriz x[0] não está definido.



    // // Qual é a saída do programa Java?

    // double[] minhaLista = {1, 5, 5, 5, 5, 1};
    // double max = minhaLista[0];
    // int indiceDeMax = 0;

    // for(int i = 0; i < minhaLista.length; i++) {

    //     if (minhaLista[i] > max) {
            
    //         max = minhaLista[i];
    //         indiceDeMax = i;
    //     }
    // }
    // System.out.println(indiceDeMax); // saída: B. 1

    // // A) 0
    // // B) 1
    // // C) 2
    // // D) 3
    // // E) 4



    // // Qual é a saída do programa Java?

    // int[]x = { 120, 200, 016 };

    // for(int i = 0; i < x.length; i++) {

    //     System.out.println(x[i] + " "); // saída: B. B. 120 200 14


    // // A. 120 200 16
    // // B. 120 200 14
    // // C. 120 200 016
    // // D. 016 is a compile error. It should be written as 16.


    // // Qual é a saída do programa Java?

    // int[]x = { 1, 2, 3, 4 };
    // int[]y = x;

    // x = new int[2];

    // for(int i= 0; i < x.length; i++)
    //    System.out.println(y[i] + " "); // saída: C. 1 2


    // //    A. 1 2 3 4
    // //    B. 0 0 0 0
    // //    C. 1 2
    // //    D. 0 0
    // //    E. Nenhum desses
        
        

    // // Analise o código a seguir e escolha a resposta correta:

    // int[] arr = new int[5];
    // arr = new int[6];

    // A) O código tem erros de compilação porque a variável arr não pode ser alterada depois de atribuída.
    // B) O código tem erros de tempo de execução porque a variável arr não pode ser alterada depois de atribuída.
    // C) O código pode compilar e rodar bem. A segunda linha atribui um novo array para arr .
    // D) O código tem erros de compilação porque não podemos atribuir uma matriz de tamanho diferente para arr .

    // Resposta C. 


    // // Qual é a saída do programa Java?

    // int[]a = new int[4];
    // a[1] = 1;
    // a = new int[2];

    // System.out.println("a[1] é " + a[1]); // saída: C. a[1] é 0

    // // A)  O programa tem um erro de compilação porque new int[2]
    // // B) O programa tem um erro de tempo de execução porque um [1]
    // // C) a [1] é 0
    // // D) a [1] é 1


    // Quando voc~e passa um array para um método, o método recebe:

    // A) Uma cópia da matriz
    // B) Uma cópia do primeiro elemento 
    // C) A referência da matriz 
    // D) O comprimento da matriz

    // Resposta: C. A referência da matriz


    // // Qual é a saída do trecho de código com o operador ternário?

    // int p = 5;

    // System.out.println("Olá");

    // (p < 6) ? 5 : 6;

    // // A) Olá 5
    // // B) Olá 6
    // // C) Olá
    // // D) Compiler error

    // // Resposta D. Erro de compilação - o lado esquerdo de uma atribuição deve ser uma variável.


    // // Qual é a saída do trecho de código com o operador ternário?

    // int num = false ? 10:20;

    // System.out.println(num); // saída: B. 20

    // // A) 10
    // // B) 20
    // // C) 0
    // // D) Compiler error


    // // Qual é a saída do trecho de código com o operador ternário?

    // String nome = "java";
    // int marcas = nome == "java" ? 10:20;

    // System.out.println("Marcas = " + marcas); // saída marcas = 10


    // // Qual é a saída do trecho de código com o operador ternário?

    // String nome = "gato";
    // int marcas = nome == "Gato" ? 10:20;

    // System.out.println("Marcas = " + marcas); // saída: C. marcas = 20

    // // // A) marcas=0
    // // // B) marcas=10
    // // // C) marcas=20
    // // // D) Compiler error


    // // Qual é a saída do trecho de código com o operador ternário?

    // String nome1 = "pen";
    // String nome2 = "pen";
    // int marcas = nome2.equals(nome1) ? 50:80;

    // System.out.println("Marcas = " + marcas); // saída: B. Marcas = 50

    // // A) Marcas=0
    // // B) Marcas=50
    // // C) Marcas=80
    // // D) Compiler error

    
    // // Qual é a saída do trecho de código com o operador ternário?
    
    // void exibir() {
    //     int num = true ? buscarNumero() : 20;

    //     System.out.println("Tomate = " + num);
    // }

    // void buscarNumero() {

    //     System.out.println(30);
    // }

    // // A) TOMATE=0
    // // B) TOMATE=20
    // // C) TOMATE=30
    // // D) Erro do compilador

    // // Resposta: D. Erro de compilação - O tipo "void" não é permitido como Operando de um operador Ternário ou Condicional.


    // // Qual é a saída do trecho de código com o operador ternário?

    // String floresta = null;
    // String saida = floresta != null ? "Pantanal" : "Amazonia";

    // System.out.println(saida); // saída C. Amazonia

    // // A) null
    // // B) Pantanal
    // // C) Amazonia
    // // D) Compiler error

    
    // // Qual é a saída do trecho de código Java abaixo?

    // int a = 20, b = 30;
    // int total = a > 10 && b < 10 ? 65:75;

    // System.out.println(total); // saída B. 65

    // // A) 0
    // // B) 65
    // // C) 75
    // // D) Erro: O lado esquerdo de uma atribuição deve ser uma variável.


    // // Qual é a saída do trecho de código Java abaixo?

    // int a = 20, b = 30;
    // boolean resultado = a & b ? true : false;

    // System.out.println(resultado);

    // // A) false
    // // B) true
    // // C) 0
    // // D) Compiler error

    // // Resposta: D. Erro de compilação.

    
    // // Qual é a saída do trecho de código Java abaixo?

    // int a = 4, b = 7;
    // int resultado = (true ? a & b : a | b) > 3 ? 120 : 150;

    // System.out.println(resultado); // saída: B. 120

    // // A) 4
    // // B) 120
    // // C) 150
    // // D) Compiler error

    
    // // Qual é a saída do trecho de código Java abaixo?

    // final int a = 25, b = 33;
    // String nome = !true ? "Dino" : "Tom";

    // System.out.println(nome); // saída: C. Tom

    // // A) Empty
    // // B) Dino
    // // C) Tom
    // // D) Compiler error

    
    // // Qual é a saída do trecho de código Java abaixo?

    // int a = 25, b = 33;
    // String nome = true ? "GATO" : ;

    // System.out.println(nome);

    // // A) Empty
    // // B) GATO
    // // C) null
    // // D) Compiler error

    // // Resposta D. Erro de compilação - Você não pode pular nenhuma das duas expressões de um operador Ternário ou Condicional (?:).


    // // Qual é a saída do programa Java com a instrução IF? 
    // if (1) {
    //     System.out.println("OK");
    // }

    // // A) OK
    // // B) Sem saída
    // // C) Erro do compilador
    // // D) Nenhum

    // // Resposta C. Erro de compilação - A condição dentro de uma instrução IF deve ser avaliada como verdadeira/falsa. O erro abaixo é acionado.
    //                                  // Tipo incompatível: não é possível converter de int para boolean



    // // Qual é a saída do programa Java com instruções IF-ELSE?

    // if (TRUE)
    //    System.out.println("IR");
    // else 
    //    System.out.println("PARAR"); 

    // // A) IR
    // // B) PARAR
    // // C) Compiler error
    // // D) Nenhum

    // // Resposta: C. Erro de compilação - TRUE cannot be resolved to a variable


    // // Qual é a saída do programa Java?

    // int a = 10;

    // if(a == 9)
    //    System.out.println("OK");
    //    System.out.println("MESTRE");
    // else 
    //    System.out.println("ADEUS");

    // // A) OK MESTRE
    // // B) ADEUS
    // // C) Compiler error
    // // D) Nenhum

    // // Resposta C. Erro de compilação - Mais de 1 instrução deve ser mantida entre chaves { } se ELSE ou ELSE IF estiver próximo à instrução IF.



    // // Qual é a saída do programa Java?

    // String nome1 = "FOX", nome2 = "CACHORRO";

    // if(nome1 == "FOX")
    //    System.out.println("FOX");
    //    System.out.println("BOM");

    // if(nome2 == "GATO")
    //    System.out.println("DINO"); 


    // // A) FOX
    // // DINO
    // // B) FOX BOM
    // // C) Compiler error
    // // D) Nenhum

    // // Resposta: B. FOX BOM


    // // Qual é a saída do programa Java?

    // String nome = "dino";

    // if(nome == "dino")
    //    System.out.println("DINO");

    // System.out.println("BOM");

    // // A) DINO BOM
    // // B) DINO
    // // C) BOM
    // // D) Compiler error

    // // Resposta: A. DINO BOM


    // // Qual é a saída do programa Java?

    // int marcas = 55;

    // if(marcas >= 80)
    //    System.out.println("DISTINÇÃO");
    // else if(marcas >= 35)
    //    System.out.println("PASSAR");
    // else 
    //    System.out.println("FALHA");


    // // A) DISTINÇÃO
    // // B) PASSAR
    // // C) PASSAR
    // // D) Compiler error

    // // Resposta: C. PASSAR


    // // Qual é a saída do programa Java?

    // int marcas = 85;

    // if(marcas >= 80)
    //    System.out.println("DISTINÇÃO");
    // else if(marcas >= 35)
    //    System.out.println("PASSAR");

    // // A) DISTINÇÃO
    // // B) PASSAR
    // // C) Compiler error
    // // D) Nenhum

    // // Resposta: A. DISTINÇÃO


    // // Qual é a saída do programa Java abaixo?

    // float temp = 98.4f;

    // if(temp > 98.4) {
    //     System.out.println("VERÃO");

    // }  else {
    //     System.out.println("NÃO SEI");
    // }

    // A) VERÃO
    // B) NÃO SEI
    // C) Compiler error
    // D) 
    
    // // Resposta A. VERÃO


    // // Qual é a saída do programa Java abaixo?

    // long num = 123L;

    // if(num > 123) {

    //     System.out.println("TIGRE");

    // } else {

    //     System.out.println("PASSARO");
    // }

    // // A) TIGRE
    // // B) PASSARO
    // // C) Compiler error
    // // D) Nenhum

    // // Resposta B. PASSARO


    // // Qual é a saída do programa Java abaixo?

    // int cavalos = 10;
    // int camelos = 5;

    // if(cavalos > 5) {

    //     if (camelos > 3) {
            
    //         System.out.println("FLORESTA");
    //     }

    // } else {

    //     System.out.println("CIDADE");
    // }

    // // A) FLORESTA
    // // B) CIDADE
    // // C) Compiler error
    // // D) Nenhum

    // // Resposta: A. FLORESTA


    // // Qual é a saída do programa Java abaixo?

    // int cavalos = 10;
    // int camelos = 5;

    // if (cavalos < 5) {
        
    //     System.out.println("CIDADE");

    // } else if(cavalos >= 5)
    //    System.out.println("FLORESTA");
    //    System.out.println("AMAZONIA");

    // else 
    //    System.out.println("NÃO SEI");

    // // A) CIDADE
    // // B) FLORESTA AMAZONIA
    // // C) NÃO SEI
    // // D) Compiler error

    // // Resposta D. Erro de compilação - A instrução ELSE-IF não deve conter mais de uma instrução sem chaves {}.


    // // Qual é a saída do programa Java?

    // int marcas = 29;

    // if(marcas > 29)
    //    System.out.println("PASSA");

    // System.out.println("CLASSIFICAÇÃO");

    // // A) CLASSIFICAÇÃO
    // // B) PASSA
    // // C) PASSA DE CLASSIFICAÇÃO
    // // D) Erro do compilador

    // // Resposta: A. CLASSIFICAÇÃO


    // // Qual é a saída do programa Java abaixo?

    // if (3 > 1) {
        
    //     4;
    // }

    // // A) 0
    // // B) 4
    // // C) Erro do compilador
    // // D) Nenhum

    // // Resposta C. Erro de compilação


    // // Qual é a saída do programa Java com a instrução IF?

    // if(true) {

    //     break;

    //     System.out.println("ELEFANTE");
    // }

    // // A) Sem saída
    // // B) ELEFANTE
    // // C) Erro do compilador
    // // D) Nenhum

    // // Resposta: C. Erro de compilação - break não pode ser usado fora de um loop ou switch.


    // Um operador "this" usado dentro de um método Java refere-se à variável?

    // A) Variável global
    // B) Variável local do método
    // C) Variável de instância
    // D) Nenhum

    // Resposta C. Variável de instância



    // Uma variável local declarada dentro de um método não pode ser usada em expressões sem inicializá-la primeiro.
    // (VERDADEIRO FALSO).

    // A) Verdadeiro 
    // B) Falso

    // Resposta: A) Verdadeiro


    // // Qual é a saída do programa Java abaixo?

    // int localVariavel;

    // System.out.println(localVariavel);

    // // A) 0
    // // B) valor do lixo
    // // C) NullPointerException
    // // D) Erro do compilador

    // // Resposta D. Erro de compilação


    // Em Java, as variáveis ​​locais são armazenadas na memória __ e as variáveis ​​de instância são armazenadas na memória ___.

    // A) Pilha, Pilha
    // B) Monte, Monte
    // C) Pilha, Monte
    // D) Pilha, Pilha

    // Resposta C. Pilha, Monte


    // Um método estático ou uma variável estática é compartilhada entre todas 
    // as instâncias de uma classe. (VERDADEIRO FALSO)

    // A) Verdadeiro
    // B) Falso

    // Resposta: A. Verdadeiro - uma única cópia de uma variável ou método estático é comum a todos os objetos de instância.



    // // Java não permite aninhamento de métodos. (VERDADEIRO FALSO)

    // A) Verdadeiro
    // B) Falso 

    // // Resposta: A. Verdadeiro

    
    // // Qual é a saída do programa abaixo:

    // double[] x = new double[]{1, 2, 3};

    // System.out.println("Valor é " + x[1]); // saída: D. O programa compila e roda bem e a saída - Valor é 2.0

    // // A) O programa tem um erro de compilação porque a sintaxe new double[]{1, 2, 3} está errada e deve ser substituída por {1, 2, 3}.
    // // B) O programa tem um erro de compilação porque a sintaxe new double[]{1, 2, 3} está errada e deve ser substituída por new double[3]{1, 2, 3};
    // // C) O programa tem um erro de compilação porque a sintaxe new double[]{1, 2, 3} está errada e deve ser substituída por new double[]{1.0, 2.0, 3.0};
    // // D) O programa compila e roda bem e a saída


    // Qual declaração, construção e inicialização correta de um array?

    // A) int [] minhaLista = {};
    // B) int [] minhaLista = (5, 8, 2);
    // C) int minhaLista [] [] = {4,9,7,0};
    // D) int minhaLista [] = {4, 3, 7};

    // Resposta: D. int minhaLista [] = {4, 3, 7};


    // // Qual é a saída do programa abaixo:

    // String s1 = args[1];
    // String s2 = args[2];
    // String s3 = args[3];
    // String s4 = args[4];

    // System.out.println(" args[2] = " + s2 );
    

    // // A. args[2] = 2
    // // B. args[2] = 3
    // // C. args[2] = null
    // // D. An exception is thrown at runtime.

    // // Resposta D. Index 1 out of bounds for length 0


    // // Qual é o valor de a[1] depois que o código a seguir for executado?

    // int[] a = { 0, 2, 4, 1, 3};

    // for(int i = 0; i < a.length; i++)
    //    a[i] = a[(a[i] + 3) % a.length];

    // //    A. 0
    // //    B. 1
    // //    C. 2
    // //    D. 3
    // //    E. 4

    // // Resposta: B. 1
        

    // // Qual será a saída do seguinte código Java?

    // double num[] = { 5.5, 10.1, 11, 12.8, 56.9, 2.5 };
    // double resultado;
    
    // resultado = 0;

    // for(int i = 0; i < 6; i++) {

    //     resultado = resultado + num[i];

    //     System.out.println(resultado / 6); // saída: C. 16.46666666666667
    // }

    // // a) 16.34
    // // b) 16.566666644
    // // c) 16.46666666666667
    // // d) 16.46666666666666
        

    // // Qual será a saída do seguinte código Java?

    // int a = 10;

    // System.out.println(++a * a++); // saída: A. 121

    // // (A) 121
    // // (B) 132
    // // (C) 144
    // // (D) 100

    
    // // Qual será a saída do seguinte código Java?

    // int a = 10;

    // System.out.println(a++ * a++); // saída: A. 110

    // // (A) 100
    // // (B) 110
    // // (C) 121
    // // (D) 144


    // // Qual será a saída do seguinte código Java?

    // int a = 10;

    // System.out.println(a * a++); // saída: A. 100

    // // (A) 100
    // // (B) 110
    // // (C) 121
    // // (D) Compilation Error


    // // Qual será a saída do seguinte código Java?
    
    // int a = 10;

    // System.out.println(a++); // saída: A. 10 - Seu operador pós-incremento aqui, é por isso que println(a++); é avaliado como 10.

    // a++;

    // // (A) 10
    // // (B) 11
    // // (C) 12
    // // (D) 13


    // // Qual será a saída do seguinte código Java?

    // int a = 10;

    // System.out.println(a++++);

    // // (A) 11
    // // (B) 12
    // // (C) 13
    // // (D) Compilation Error

    // // Resposta: D. Erro de compilação - é avaliado como 10++; variável é necessária para executar o operador ++. Executar ++ em 10 é um erro de compilação.


    // // Qual será a saída do seguinte código Java?

    // int a = 10;

    // System.out.println(++a++);

    // // (A) 10
    // // (B) 11
    // // (C) 12
    // // (D) Compilation Error

    // // Resposta: D. Erro de compilação - Os operadores de pré-incremento e pós-incremento não são permitidos na mesma variável ao mesmo tempo.


    // // Qual será a saída do seguinte código Java?

    // String nome;

    // Scanner teclado = new Scanner(System.in);

    // System.out.println("Digite seu nome: ");
    // nome = teclado.nextLine();

    // switch(nome.length()) {
        
    //     case 5:
    //     case 6:
    //     case 7:
    //     case 8:
    //     case 9:
    //     case 10: System.out.print("Comprimento é 5-10");
    //        break;
    //     default:
    //        System.out.print("Comprimento não em 5-10");


    //     // (A) Compilation Error
    //     // (B) Comprimento é 5-10
    //     // (C) Comprimento não in 5-10
    //     // (D) nada é impresso

    //     // Resposta: C. Comprimento é 5-10
    // }


    // // Qual será a saída do seguinte código Java?


    // int a = 5;
    // a += 5;

    // switch(a) {

    //     case 5:
    //         System.out.print("5");
    //         break;

    //     case 10:
    //        System.out.print("10");
    //        System.out.print(((a%2 == 0) ? "-até-" : "-impar-"));

    //     default:
    //        System.out.println("0");
    // }

    // // (A) Compilation Error
    // // (B) 10-até-
    // // (C) 10-impar-
    // // (D) 10-até-0

    // // Resposta D. 10-até-0


    // // Qual será a saída do seguinte código Java?

    // int a = 5;
    // a += 5;

    // // a = 10

    // switch(a) {

    //     case 5:
    //        System.out.print("5");
    //        break;

    //     case 10: 
    //        System.out.print("10");
    //        System.out.print(((a %2 == 0) ? "-ate-" : "-impar-"));
    //        break;

    //     default:
    //        System.out.println("0");
    // }
    
    // // (A) Compilation Error
    // // (B) 10-ate-
    // // (C) 10-ate-0
    // // (D) 10-impar

    // // Resposta: B. 10 -ate-


    // // Qual será a saída do seguinte código Java?

    // int a = 5;
    // a += 5;

    // switch(a) {

    //     case 5:
    //        System.out.print("5");
    //        break;

    //     case 10: 
    //        System.out.print("10");

    //     default: 
    //        System.out.print("0");
    // }

    // // (A) 10
    // // (B) 510
    // // (C) 5100
    // // (D) 100

    // // Resposta: D. 100


    // // Qual será a saída do seguinte código Java?

    // int a = -5;
    // a += 5;

    // switch(a) {

    //     case 5: 
    //        System.out.print("5");
    //        break;

    //     case 10: 
    //        System.out.print("10");
           
    //     default:
    //        System.out.print("0");
    // }

    // // (A) 5
    // // (B) 10
    // // (C) 100
    // // (D) 0

    // // Resposta D. 0


    // // Qual será a saída do seguinte código Java?

    // int a = 0;
    // a += 5;

    // switch(a) {
        
    //     case 5:
    //         System.out.println("5");
    //         break;

    //     case 10: 
    //        System.out.println("10");

    //     default: 
    //        System.out.println("0");
    // }

    // // (A) 5
    // // (B) 510
    // // (C) 5100
    // // (D) 100

    // // Resposta A. 5


    // // Qual será a saída do seguinte código Java?

    // int a = 0;

    // a += 5;

    // switch(a) {

    //     case 5:
    //        System.out.print("5");

    //     case 10: 
    //        System.out.print("10");

    //     default: 
    //        System.out.print("0");
    // }

    // // (A) 5
    // // (B) 510
    // // (C) 5100
    // // (D) Erro de compilação

    // // Resposta: C. 5100 - não tem break.


    // // Qual será a saída do seguinte código Java?

    // int a = 0;
    // a += 5;

    // switch(a) {

    //     case 5:
    //        System.out.print("5");

    //     case 10: 
    //        System.out.print("10");
    //        break;

    //     default: 
    //        System.out.print("0");
    // }

    // // (A) 5
    // // (B) 10
    // // (C) 510
    // // (D) Erro de compilação

    // // Resposta C. 510


    // // Qual será a saída do seguinte código Java?

    // int a =5;
    // a += 5;

    // switch(a) {

    //     case 5:
    //        System.out.println("5");
    //        break;

    //     case 10: 
    //        System.out.println("10");
    //        break;

    //     default:
    //        System.out.println("0");
    // }

    // // (A) 5
    // // (B) 10
    // // (C) 0
    // // (D) Erro de compilação

    // // Resposta: B. 10


    // // Quantas vezes 'Olá' é impresso?

    // for(int i = 0; i < 5; i = 5) {

    //     System.out.println("Olá");
    // }

    // // (A) 5
    // // (B) 4
    // // (C) 2
    // // (D) 1

    // // Resposta: D. será impresso 1 vez, Na primeira vez, será executado para i=0; O valor da segunda vez de i torna-se 5 por isso 5 < 5; é condição falsa para parar o loop.


    // // Quantas vezes 'Olá' é impresso?

    // for(int i = 0; i > 5; ) {

    //     System.out.println("Olá");
    // }

    // // (A) 5
    // // (B) 4
    // // (C) 3
    // // (D) 0

    // // Resposta D. Nada é impresso porque o loop não será executado; 0>5 é condição falsa


    // // Quantas vezes 'Olá' é impresso?

    // for(int i = 0; i < 5; ) {

    //     System.out.println("Olá");
    // }

    // // (A) 0
    // // (B) 1
    // // (C) 2
    // // (D) Tempos infinitos

    // // Resposta D. Infinito


    // // O que será impresso?

    // for(int i = 0; i < 5; i +=2) {

    //     System.out.println("Olá");

    //     i += 2;

    // }

    // // (A) 0
    // // (B) 1
    // // (C) 2
    // // (D) 3

    // // Resposta: C. 2 - o loop for será executado duas vezes apenas para i=0; i=4


    // // O que será impresso?

    // for(int i = 0; i < 5; i++) {

    //     System.out.println("Olá");

    //     i += 2;
    // }

    // // (A) 1
    // // (B) 2
    // // (C) 3
    // // (D) 4

    // // Resposta: B. 2 - O loop é executado 2 vezes apenas porque i é incrementado em 3 a cada vez. i = 0; i=3; i=6;


    // // O que será impresso?

    // for(int i = 0; i < 5; i++) {

    //     System.out.println("Olá");

    //     i++;
    //     i--;
    // }

    // // (A) 5
    // // (B) 4
    // // (C) 3
    // // (D) 2

    // // Resposta: A. 5 - i++; incrementará o valor de i em 1
    //                  // mas na próxima instrução i--; diminuirá o valor de i em 1.
    //                  // Portanto, essas duas operações não fazem sentido



    // // O que será impresso?

    // for(int i = 0; i < 5; i++) {

    //     System.out.println("Olá");

    //     i++;
    // }

    // // (A) 5
    // // (B) 4
    // // (C) 3
    // // (D) 2

    // // Resposta C. 3 - é impresso 3 vezes porque i é incrementado 2 vezes para uma iteração


    // // Quantas vezes 'Olá' é impresso?

    // for(int i = 0; i < 5; i++) {

    //     System.out.println("Olá");
    //     break;
    // }

    // // (A) 5
    // // (B) 4
    // // (C) 1
    // // (D) 0

    // // Resposta: C. 1 - Ele é impresso apenas uma vez porque break; terminará o loop atual


    // // O método main() de um aplicativo deve ser público. Caso contrário, não poderia ser chamado por um interpretador Java. Isso é verdade?

    // A) Verdadeiro 
    // B) Falso 

    // // Resposta: A. Verdadeiro


    // // Qual é a saída do programa abaixo?

    // int arr[] = {'a', 'b', 'c', 'd', 'e'};

    // System.out.print(arr); // saída: D. Some Garbage Value

    // // (A) abcde
    // // (B) 6566676869
    // // (C) Compilation Error
    // // (D) Some Garbage Value


    // // Qual é a saída do programa abaixo?

    // int arr[] = { 'a', 'b', 'c', 'd', 'e'};

    // for(int i = 0; i < 5; i++) {

    //     System.out.print(" " + (char) arr[i]); // saída: A. a b c d e
    // }

    // // (A) a b c d e
    // // (B) 96 97 98 99 101
    // // (C) 65 66 67 68 69
    // // (D) Nenhuma das acima


    // // Qual é a saída do programa abaixo?

    // int arr[] = { 'a', 'b', 'c', 'd', 'e'};

    // for(int i = 0; i < 5; i++) {

    //     System.out.print(" " + arr[i]); // saída: C. 97 98 99 100 101
    // }

    // // (A) a b c d e
    // // (B) abcde
    // // (C) 97 98 99 100 101
    // // (D) 65 66 67 68 69



    // // Qual é a saída do programa abaixo?

    // int arr[] = {1, 2, 3, 4, 5};
    // int contar = 0;

    // for(int i = 0; i < 5; i++) {

    //     if(arr[i] % 2 == 0)
    //        arr[i] *= 2;

    //     System.out.print(arr[i]); // saída: D. 14385
    // }

    // // (A) 12345
    // // (B) 135
    // // (C) 22222
    // // (D) 14385


    // // Qual é a saída do programa abaixo?

    // int arr[] = {1, 2, 3, 4, 5};
    // int contar = 0;

    // for(int i = 0; i < 5; i++) {

    //     if(arr[i] % 2 == 0)
    //        contar++;
    // }

    // System.out.println(contar); // saída: B. 2

    // // (A) 3
    // // (B) 2
    // // (C) 1
    // // (D) 0



    // // Qual é a saída do programa abaixo?

    // int arr[] = {1, 2, 3, 4, 5};

    // for(int i = 0; i < 5;) {

    //     System.out.print(arr[i]);
    // }

    // // (A) 12345
    // // (B) Nada é imprimido
    // // (C) 1
    // // (D) Tempos infinitos

    // // Resposta D. Tempos infinitos


    // // Qual é a saída do programa abaixo?

    // int arr[] = { 1, 2, 3, 4, 5};

    // for(int i = 0; i < 5; i++) {

    //     System.out.print(arr[i++]); // saída: D. 135
    // }

    // // (A) 12345
    // // (B) 123
    // // (C) 124
    // // (D) 135


    // // Qual é a saída do programa abaixo?

    // String s = "amigos";
    // int x = 0;

    // do {
    //     System.out.print(s.charAt(x)); // saída: C. am
    //     x++;
    // } while(x < 2);

    // // A) amigos 
    // // B) amigo 
    // // C) am 
    // // D) Erro de compilação

    
    // // Qual é a saída do programa abaixo?

    // int a = 9;
    // String b = "10 + 10";

    // System.out.println(a + b); // saída: D. 910 + 10

    // // (A) 30
    // // (B) 1020
    // // (C) 10+10+10
    // // (D) 910+10


    // // Qual é a saída do programa abaixo?

    // int a = 10;
    // String b = "-10";

    // System.out.println(a + b); // saída: C. 10-10

    // // (A) 0
    // // (B) 10"-10"
    // // (C) 10-10
    // // (D) Compilation Error


    // // Qual é a saída do programa abaixo?

    // int a = 10;
    // String b = "10";

    // System.out.println(b + a); // saída: B. 1010

    // // (A) 10+10
    // // (B) 1010
    // // (C) Compilation Error
    // // (D) Undefined


    // // Qual é a saída do programa abaixo?

    // int a = 10;
    // String b = "10";

    // System.out.println(a - b);

    // // (A) 10-10
    // // (B) 0
    // // (C) 1010
    // // (D) Compilation Error

    // // Resposta D. Erro de compilação


    // // Qual é a saída do programa abaixo?

    // int a = 10;
    // String b = "10";

    // System.out.println(a + b); // saída: D. 1010

    // // (A) 10"10"
    // // (B) Compilation Error
    // // (C) 20
    // // (D) 1010
    


    // // Qual é a saída do programa abaixo?

    // String str = "1234";
    // int a = Integer.parseInt(str);

    // System.out.print(a); // saída: B. 1234

    // // (A) 123
    // // (B) 1234
    // // (C) 12340
    // // (D) Compilation Error


    // // Qual é a saída do programa abaixo?

    // do{
    //     System.out.println("cppbuzz"); // saída: E. cppbuzz
    // } while(false);

    // // (A) 0
    // // (B) 1
    // // (C) Infinite Times
    // // (D) Compilation Error
    // // (E) cppbuzz

    
    // // Qual é a saída do programa abaixo?

    // while(true) {

    //     System.out.println("cppbuzz"); // saída: D. cppbuzz

    //     break;
    // }

    // // (A) Infinite times
    // // (B) 0
    // // (C) 1
    // // (D) cppbuzz


    // // Qual é a saída do programa abaixo?

    // final int a;
    // a = 5;
    // a = 10;

    // System.out.println(a);

    // // (A) 5
    // // (B) 10
    // // (C) 0
    // // (D) Erro: variável a pode já ter sido atribuída

    // // Resposta: D. variável a pode já ter sido atribuída


    // // Qual é a saída do programa abaixo?

    // final int a;
    // a = 10;

    // System.out.println(a); // saída: 10

    // // (A) 0
    // // (B) 10
    // // (C) Undefind
    // // (D) Error: Não é possível modificar a variável final a


    // // Qual é a saída do programa abaixo?

    // final int a = 5;
    // a = 10;

    // System.out.println(a);

    // // (A) 5
    // // (B) 10
    // // (C) Erro: Não é possível atribuir um valor à variável final a
    // // (D) None of the above

    // // Resposta C. Não é possível atribuir um valor à variável final a


    // // Qual é a saída do programa abaixo?

    // int a = 0;

    // if(a == 1);
    //    System.out.print("Sol");
    //    System.out.println("Lua");

    // // (A) Compilation Error
    // // (B) exception: unreachable code
    // // (C) Sol
    // // (D) SolLua

    // // Resposta C. SolLua


    // // Qual é a saída do programa abaixo?

    // int a = 0;

    // if (a == 1); {
        
    //     System.out.println("Sol");
    // }

    // // (A) Compilation Error
    // // (B) Sol
    // // (C) Nada é impresso
    // // (D) error: declaração inacessível

    // // Resposta B. Sol


    // // Qual é a saída do programa abaixo?

    // int a = 0;

    // if (a == 1) {
        
    //     System.out.println("Sol");
    // }

    // // (A) Sol
    // // (B) Nada é impresso
    // // (C) Compilation Error
    // // (D) Exception

    // // Resposta B. Nada é impresso


    // // Qual é a saída do programa abaixo?

    // int a = 0;

    // if (a == 0) {
        
    //     System.out.println("Sol");

    // } else {

    //     System.out.println("Lua");
    // }

    // // (A) Sol
    // // (B) Lua
    // // (C) SolLua
    // // (D) Compilation Error

    // // Resposta A. Sol
       
    

    // // Qual é a saída do programa abaixo?

    // if (0 == 0) {
        
    //     System.out.println("Sol");

    // } else {

    //     System.out.println("Lua");
    // }

    // // (A) Sol
    // // (B) Lua
    // // (C) SolLua
    // // (D) Compilation Error

    // // Resposta: A. Sol


    // // Qual é a saída do programa abaixo?

    // String temp = "10.87";
    // Float a  = Float.parseFloat(temp);

    // System.out.println(a); // saída: A. 10.87

    // // (A) 10.87
    // // (B) 10.870000
    // // (C) 10.8700
    // // (D) 10.00


    // // Qual é a saída do programa abaixo?

    // String temp = "10.87";
    // int a = Float.parseFloat(temp);

    // System.out.println(a);

    // // (A) 10.87
    // // (B) 10.00
    // // (C) 10
    // // (D) erro: possível perda de precisão

    // // Resposta D. erro: possível perda de precisão


    // // Qual é a saída do programa abaixo?

    // String temp = "10.87";
    // int a = Integer.parseInt(temp);

    // System.out.println(a);

    // // (A) 10
    // // (B) 10.00
    // // (C) 10.87
    // // (D) NumberFormatException

    // // Resposta D. NumberFormatException


    // // Qual é a saída do programa abaixo?

    // String temp = "10";
    // int a = Integer.parseInt(temp);

    // System.out.println(a); // saída: B. 10

    // // (A) 0
    // // (B) 10
    // // (C) 100
    // // (D) Exception


    // // Qual é a saída do programa abaixo?

    // float a = 10.0000f;
    // String temp = Double.toString(a);

    // System.out.println(temp); // saída: D. 10.0

    // // (A) 10.0000f
    // // (B) 10.0000
    // // (C) 10.00
    // // (D) 10.0


    // // Qual é a saída do programa abaixo?

    // float a = 10.0000f;
    // String temp = Float.toString(a);

    // System.out.println(temp); // saída: B. 10.0

    // // (A) 10.0f
    // // (B) 10.0
    // // (C) 10.00
    // // (D) 10.0000

    
    // // Qual é a saída do programa abaixo?

    // float a = 10.0f;
    // String temp = Float.toString(a);

    // System.out.println(temp); // saída: B. 10.0

    // // (A) 10.0f
    // // (B) 10.0
    // // (C) 10.00
    // // (D) 10.0000

    
    // // Qual é a saída do programa abaixo?

    // float a = 10.0f;
    // String temp = Integer.toString(a);

    // System.out.println(temp);

    // // (A) 10.0f
    // // (B) 10.0
    // // (C) 10
    // // (D) error: nenhum método adequado encontrado para toString(float)

    // // Resposta D. error: nenhum método adequado encontrado para toString(float)


    // // Qual é a saída do programa abaixo?

    // int a = 10.0;
    // String temp = Integer.toString(a);

    // System.out.println(temp);

    // // (A) 10.0
    // // (B) 10
    // // (C) error: loss precision
    // // (D) Exception

    // // Resposta C. erro precisão perdida - cannot convert from double to int


    // // Qual é a saída do programa abaixo?

    // int a = 10;
    // String temp = Integer.toString(a);

    // System.out.println(temp); // saída: C. 10

    // // (A) Compilation Error
    // // (B) Exception
    // // (C) 10
    // // (D) 1

    
    // // Qual é a saída do programa abaixo?

    // String str = "1234.34";
    // Float a = Float.parseFloat(str);

    // System.out.println(a); // saída: B. 1234.34

    // // (A) 1234.00
    // // (B) 1234.34
    // // (C) 1234
    // // (D) Exception


    // // Qual é a saída do programa abaixo?

    // String str = "1234.34";
    // int a  = Integer.parseInt(str);

    // System.out.println(a);

    // // (A) 1234.34
    // // (B) 1234
    // // (C) .1234.00
    // // (D) NumberFormatException

    // // Resposta D. NumberFormatException


    // // Qual é a saída do programa abaixo?

    // int i = 0;

    // for(i = 0; i < 5; i++) {

    // }

    // System.out.println(i); // saída: A. 5

    // // A. 5
    // // B. 0
    // // C. 4
    // // D. Compilation Error


    // // Qual é a saída do programa abaixo?

    // int i = 0;

    // for(i = 0; i < 10; i++) {
        
    //     break;
    // }

    // System.out.println(i); // saída: B. 0

    // // A. 1
    // // B. 0
    // // C. 10
    // // D. 9

    
    // // Qual é a saída do programa abaixo?

    // int i = 0;

    // for(i = 0; i < 10; i++) {

    //     continue;
    // }

    // System.out.println(i); // saída: A. 10 - A palavra-chave continue Java faz com que o loop for ignore a iteração atual e continue com a próxima iteração.
                                             // Haverá um total de 10 iterações após as quais o valor da variável i se torna 10 e isso tornaria a condição do loop for falsa.
                                             // Então, finalmente, o valor da variável i é 10 após o loop.

    // // A. 10
    // // B. 0
    // // C. Compilation error
    // // D. 9


    // // Qual é a saída do programa abaixo?

    // for(int i = 0; i < 10; i++) {

    //     if(i % 2 == 0) {

    //         continue;
    //     }

    //     System.out.println(i); // saída: 3 5 7 9 - B. O programa imprimirá todos os números ímpares entre 0 e 10
                                                      // O loop for começa com 0 e vai até 9 depois que a condição se torna falsa. 
                                                      // Dentro do loop, a condição if verifica se o valor atual da variável i é divisível por 2, verificando o restante. 
                                                      // Se for 0, a iteração atual é ignorada usando a instrução continue.
                                                      // Caso contrário, o número é ímpar (não divisível por 2) e o valor é impresso.
    // }

    // // A.  O programa imprimirá todos os números pares entre 0 e 10
    // // B.  O programa imprimirá todos os números ímpares entre 0 e 10
    // // C.  O programa dá um erro de compilação
    // // D.  Nenhuma das opções acima


    // // Qual é a saída do programa abaixo?

    // boolean var1 = true;
    // boolean var2 = false;

    // if (var1)
    //    System.out.println(var1);
    // else 
    //    System.out.println(var2);

    // // A) 0
    // // B) 1
    // // C) true 
    // // D) false

    // // Resposta C. verdadeiro(true)


    // // Qual é a saída do programa abaixo?

    // char var1 = 'A';
    // char var2 = 'a';

    // System.out.println((int) var1 + " " + (int)var2); // saída: B. 65 97

    // // A) 162 
    // // B) 65 97 
    // // C) 67 95
    // // D) 66 98


    // // Qual é a saída do programa abaixo?

    // double var1 = 1 + 5; // 6.0
    // double var2 = var1 / 4; // 1.5
    // int var3 = 1 + 5; // 5.0 
    // int var4 = var3 / 4; // 1,25

    // System.out.print(var2 + " " + var4); // saída 1.5 1

    // // A) 1 1
    // // B) 0 1
    // // C) 1.5 1
    // // D) 1.5 1.0


    // // // Qual é a saída do programa abaixo?

    // double a = 25.64;
    // int b = 25;

    // a = a % 10; // 5.640000000000001
    // b = b % 10; // 5
    

    // System.out.println(a + " " + b); // saída: A. 5.640000000000001 5

    // // A) 5.640000000000001 5
    // // B) 5.640000000000001 5.0
    // // C) 5 5
    // // D) 5 5.640000000000001


    // // Qual será a saída do seguinte programa Java?

    // int a = 1;
    // int b = 2;
    // int c;
    // int d;

    // c = ++b; // 3
    // d = a++; // 1
    
    // c++; // 4
    // b++; // 4
    // ++a; // 3
    

    // System.out.print(a + " " + b + " " + c); // saída: 3 4 4

    // // A) 3 2 4
    // // B) 3 2 3 
    // // C) 2 3 4
    // // D) 3 4 4


    // // Qual será a saída do seguinte programa Java?

    // float f = (1/4) * 10;
    // int i = Math.round(f);

    // System.out.println(i); // saída: B. 0

    // // A) 2
    // // B) 0
    // // C) 3
    // // D) 2.5

    
    // // Qual será a saída do seguinte programa Java?

    // int a = 42;
    // double b = 42.25;
    

    // System.out.println((a % 10) + " " + (b % 10)); // saída: B 2 2.5

    // // A) 42 42.5
    // // B) 2 2.5
    // // C) 4.2 4.225
    // // D) Erro de compilação


    // Quantos construtores na classe String?

    // A) 1
    // B) 2
    // C) 13
    // D) 11

    // Resposta: C. 13

    // String()
    // String(String original)
    // String(byte[] bytes)
    // String(byte bytes[], String charsetName)
    // String(byte bytes[], Charset charset)
    // String(byte bytes[], int offset, int length)
    // String(byte bytes[], int offset, int length, Charset charset)
    // String(byte bytes[], int offset, int length, String charsetName)
    // String(char value[])
    // String(char value[], int offset, int count)
    // String(int[] codePoints, int offset, int count)
    // String(StringBuffer buffer)
    // String(StringBuilder buffer)


    // // Qual será a saída do seguinte programa Java?

    // String str = new String("Ola");

    // System.out.println(str.length()); // saída: C. 3

    // // A) 1
    // // B) 2
    // // C) 3
    // // D) 4


    // // Qual será a saída do seguinte programa Java?

    // String str = "Bob";

    // System.out.println(str.indexOf('s')); // saída: E. -1 - O método indexOf() retorna o valor do índice se estiver presente.
                                                            // Caso contrário, retorna -1;


    // // A) true
    // // B) false
    // // C) 0
    // // D) 1
    // // E) -1


    // // Qual será a saída do seguinte programa Java?

    // StringBuffer s = new StringBuffer("Bob");
    // s.deleteCharAt(0);

    // System.out.println(s); // saída: B. ob - deleteCharAt() exclui o caractere no índice fornecido.
    
    // // A) Bo
    // // B) ob 
    // // C) Bob 
    // // D) B


    // Qual das seguintes afirmações está correta?

    // A) método reverse() inverte todos os caracteres.
    // B) reverseall() inverte todos os caracteres.
    // C) replace() substitui a primeira ocorrência de um caractere em uma string por outro caractere.
    // D) replace() substitui a primeira ocorrência de um caractere em uma string por outro caractere.

    // Resposta: A. método reverse() inverte todos os caracteres. - O método reverse() inverte todos os caracteres. 
                                                                 // Ele retorna o objeto invertido no qual foi chamado. Exemplo:




    // // Qual será a saída do seguinte programa Java?
    
    // StringBuilder reverteStr = new StringBuilder("Ola").reverse();

    // System.out.println(reverteStr); // saída: C. alO

    // // A) ola 
    // // B) alo 
    // // C) alO 
    // // D) olA 
                                
    
    // // Qual será a saída do seguinte programa Java?

    // String str = "tatu".replace('t', 's');

    // System.out.println(str); // saída: sasu - Todos os caracteres 't' são substituídos por 's'.

    // // A) A primeira ocorrência de 't' é substituída por 's'.
    // // B) Todos os caracteres 't' são substituídos por 's'.
    // // C) Todos os caracteres 's' são substituídos por 't'.
    // // D) Nenhuma das anteriores


    // // Qual é a saída do código a seguir?

    // String str = "x1y2z3";
    // String[] arr = str.split("\\d");

    // for(String s : arr)
    //    System.out.print(s); // saída: C. xyz - O método split pertence à classe String, usa expressões regulares para dividir uma string. 
    //                                          // \d divide uma string com base em números.
    
    // // A) x1y2z3
    // // B) 123 
    // // C) xyz 
    // // D) Nenhuma das acima


    // // Qual é a saída do código a seguir?

    // String s = null;

    // if (s == null ) {
        
    //     System.out.println("A");

    // } else if (s.length() == 0) {
        
    //     System.out.println("B");

    // } else {

    //     System.out.println("C");
    // }

    // // A) A
    // // B) B 
    // // C) C 
    // // D) ABC 

    // // Resposta: A


    // // Qual é a saída do código a seguir?

    // String str = "Bem-vindo ao quiz java";

    // System.out.println(str.startsWith("Bem")); // saída: A. verdadeiro(true)

    // // A) true
    // // B) false 
    // // C) 0 
    // // D) 1


    // // Qual é a saída do código a seguir?

    // String str = "EmpilharComoFazer";

    // System.out.println(str.substring(3, 5)); // saída: B. il

    // // A) pil 
    // // B) il 
    // // C) ilh 
    // // D) ilhar 


    // // Qual é a saída do código a seguir?

    // char chars[] = { 'b', 'o', 'b'};
    // String str = new String(chars);

    // System.out.println(str); // saída: C. bob

    // // A) b
    // // B) o
    // // C) bob 
    // // D) Erro 


    // // Qual é a saída do código a seguir?

    // String str = "EU AMO JAVA";

    // System.out.println(str.charAt(4)); // saída: B. M

    // // A) A 
    // // B) M 
    // // C) O 
    // // D) J 


    // // Qual é a saída do código a seguir?

    // String str = "EU AMO JAVA";

    // System.out.println(str.length()); // saída: B. 11

    // // A) 10
    // // B) 11
    // // C) 12 
    // // D) 13


    // // Qual é a saída do código a seguir?

    // String str1 = "Emily";
    // String str2 = "Alex";

    // System.out.println(str1.charAt(0) > str2.charAt(0)); // saída: A. verdadeiro(true)

    // // A) true 
    // // B) false 
    // // C) 0 
    // // D) 1


    // // Qual é a saída do código a seguir?

    // String a = "lorem";
    // int b = 8;

    // System.out.println(a += b); // saída: B. lorem8

    // // A) 8lorem
    // // B) lorem8
    // // C) Compilation error
    // // D) Will throw an exception


    // // Qual é a saída do código a seguir?

    // String str = "Ola";

    // System.out.println(str.substring(1, 3)); // saída: C. la

    // // A) ol 
    // // B) ola 
    // // C) la 
    // // D) Ola 

    
    // // Qual é a saída do código a seguir?

    // String str = "Ola";

    // System.out.println(str.indexOf('e')); // saída: B. -1

    // // A) 0
    // // B) -1
    // // C) false 
    // // D) Erro de compilação


    // // Qual é a saída do código a seguir?

    // String s1 = new String("Ali");
    // String s2 = new String("Alis");

    // System.out.println(s1 = s2); // saída: D. Alis - s1 recebe s2

    // // A) true 
    // // B) false 
    // // C) Ali 
    // // D) Alis 


    // // Qual é a saída do código a seguir?

    // String s1 = new String("Ola");
    // String s2 = new String(s1);

    // System.out.println(s1 == s2); // saída: C. falso(false)

    // // A) Ola 
    // // B) true 
    // // C) false 
    // // D) Erro 


    // // Qual é a saída do código a seguir?

    // String s1 = "Ola";
    // String s2 = "Ola";

    // System.out.println(s1.equals(s2));
    // System.out.println(s1 == s2); // saída: D. true true 

    // // A) false false 
    // // B) true false 
    // // C) false true 
    // // D) true true


    // // Qual é a saída do código a seguir?

    // int[] arr = new int[0];

    // System.out.println(arr.length); // saída: C. 0

    // // A) erro de compilação, o tamanho das matrizes não pode ser inicializado como zero.
    // // B) Erro de compilação, é arr.length() não arr.length
    // // C) 0 
    // // D) Nenhuma das anteriores


    // // Qual é a saída do código a seguir?

    // int[] arr = { 2, 3, 012};

    // for(int i = 0; i < arr.length; i++) {

    //     System.out.print(arr[i] + " "); // saída: C. 2 3 10
    // }

    // // A) 2 3 12 
    // // B) 2 3 012
    // // C) 2 3 10
    // // D) null 

    
    // // Qual é a saída do código a seguir?

    // int arr[] = new int[10];

    // for(int i = 0; i < 10; ++i) {

    //     arr[i] = i;

    //     System.out.print(arr[i] + " "); // saída: A. 0 2 4 6 8 - Sempre que um array é declarado usando a palavra-chave "new", 
    //                                                           // todos os seus itens são inicializados com 0 automaticamente. 
    //                                                           // O loop "for" é executado 5 vezes, pois sempre que os controles 
    //                                                           // entram no loop o valor i é incrementado duas vezes,
    //                                                           // primeiro por i++ dentro do loop
    //                                                           // e depois por ++i na condição de incremento do loop "for".
    //     i++;
    // }

    // // A) 0 2 4 6 8
    // // B) 1 3 5 7 9
    // // C) 0 1 2 3 4 5 6 7 8 9
    // // D) 1 2 3 4 5 6 7 8 9 10


    // // Qual é a saída do código a seguir?

    // float[] arr = new float[] {1, 2, 3, 4};

    // System.out.println("O valor é " + arr[1]); // saída: D. O programa compila sem erros. O valor é 2.0 

    // // A) O programa dá um erro de compilação devido à sintaxenew float []{ 1 , 2 , 3 , 4 } está incorreto e deve ser alterado por{ 1 , 2 , 3 , 4 }.
    // // B) O código dá um erro de compilação devido à sintaxenew float []{ 1 , 2 , 3 , 4 } está incorreto e deve ser alterado pornew float [ 4 ]{ 1 , 2 , 3 , 4 } ; 
    // // C) O código dá um erro de compilação devido à sintaxenew float []{ 1 , 2 , 3 , 4 } está incorreto e deve ser alterado pornew float []{ 1.0 , 2.0 , 3.0 , 4.0 } ; 
    // // D) O programa compila sem erros.


    // // Qual é a saída do código a seguir?

    // char arr[] = new char[5];

    // for(int i = 0; i < 5; ++i) {

    //     arr[i] = 'i';

    //     System.out.print(arr[i] + ""); // saída: D. i i i i i 
    // }

    // // A) 1 2 3 4 5 
    // // B) 1 2 3 4 
    // // C) i j k l m 
    // // D) i i i i i

    
    // Em Java os arrays são? 

    // A) Objetos 
    // B) Referências de objetos 
    // C) Tipo de dados primitivo
    // D) Nunhuma das anteriores 

    // Resposta: A. Objetos - Em java, um array é um objeto container que contém um número fixo de valores de um único tipo.
    //                        O tamanho de um array é fixo quando o array é criado. Após a criação, seu comprimento é fixo.



    // Acessamos os dados no Array usando

    // A) Operador 
    // B) Variável 
    // C) Índice 
    // D) Ponteiro 

    // Resposta C. índice - Acessamos dados em Array usando indice.


    // Sobre o ponto de inicialização do array, o que é necessário especificar?

    // A) linha
    // B) coluna 
    // C) Linha e Coluna
    // D) Nenhuma das anteriores

    // Resposta A. Linha - linha é essencial para especificar ao inicializar uma matriz

    
    // Qual é o valor padrão de uma variável declarada booleana?

    // A) true 
    // B) Falso 
    // C) null
    // D) 1
    
    // Resposta B. O valor padrão de uma variável booleana declarada é False.


    // // Qual é a saída do código a seguir?
    // int a;
    // a= 10;

    // if (a == 10) {
        
    //     int b = 20;

    //     System.out.println("a e b: " + a + " " + b);

    //     b = a*2;
    // }

    // b = 100;

    // System.out.println("a e b: " + a + " " + b); // saída: D. Erro - A variável b é acessada fora de sua área. 
    //                                                               // Como a variável b é declarada dentro do bloco if,
    //                                                               // sua área é limitada apenas ao bloco if. 
    //                                                               // Fora se a variável do bloco b não for identificada, 
    //                                                               // resultará em um erro.

    // // A) 10 20 10 100
    // // B) 10 20 10 20
    // // C) 10 20 10 10
    // // D) Erro


    // // Qual conversão automática de tipo é viável?

// A) long para int 
// B) int para long 
// C) byte para int 
// D) short para int 

// // Resposta: B, C, D - Os dois tipos de dados são compatíveis.
//                     // Quando atribuímos valor de um tipo de dado menor a um tipo de dado maior.



// Qual afirmação está correta sobre interfaces em Java?

// A) A interface é usada para executar herança múltipla em java.
// B) Não podemos instanciar uma interface.
// C) Uma interface pode herdar de outra interface.
// D) Todas as respostas são verdadeiras

// Resposta D. Todas as respostas são verdadeiras


// // Qual é a saída do código a seguir?

// LinkedList<Integer> lang = new LinkedList<Integer>();

// lang.add(8);
// lang.add(2);
// lang.add(1);
// lang.add(6);

// Iterator it = lang.iterator();

// Collections.reverse(lang);
// Collections.sort(lang);

// while (it.hasNext()) {
    
//     System.out.print(it.next() + " "); // sáida: B. 1 2 6 8
// }

// // A) 6 1 2 8
// // B) 1 2 6 8
// // C) 8 6 2 1
// // D) 8 2 1 6


// // Qual é a saída do código a seguir?

// int tab[] = new int[6];

//     for(int i = 6; i > 0; i--)
//        tab[6-i] = i;

//     Arrays.fill(tab, 1, 5, 0);

//     for(int i = 0; i < 6; i++) 
//        System.out.print(tab[i]);

// // A) 611110
// // B) 543210
// // C) 654321
// // D) 600001

// // Resposta: D. 600001 - Na linha "tab[6-i] = i;" o array contém 6,5,4,3,2,1
                         // mas quando o Arrays.fill(tab, 1, 5, 0); é chamado,
                         // ele preenche o slot de índice começando de 1 a 5 com o valor 0,
                         // então a matriz se torna 6,0,0,0,0,1.




// Qual desses métodos pode misturar todos os elementos de uma lista?

// A) rand()
// B) srand()
// C) randomize()
// D) shuffle()

// Resposta: D. shuffle()


// // Qual é a saída do código a seguir?

// ArrayList<String> lista = new ArrayList<String>();

// lista.add("A");
// lista.add("B");
// lista.add("C");

// System.out.println("Antes de misturar os elementos: " + lista); // saída: Antes de misturar os elementos: [A, B, C]

// Collections.shuffle(lista);

// System.out.println("Depois de misturar os elementos: " + lista); // saída: Depois de misturar os elementos: [C, B, A]


// // Qual é a saída do código a seguir?

// int x = 3;

// if(x == 3) {

//     int x = 4;
//     System.out.println(x);
// }

// // A) Runtime error
// // B) Compilation error
// // C) 3
// // D) 4

// // Resposta B. Erro de compilação - Duas variáveis ​​com o mesmo nome não podem ser criadas na mesma classe. 
                                    // Isso produz um erro de compilação.


// // Qual é a saída do código a seguir?

// int i = 0;

// i = i++ +i;
// // System.out.println(i++);
// // System.out.println(+i);

// System.out.println("I = " + i); // saída: B. 1

// // A) 0
// // B) 1
// // C) 2
// // D) 3


// // Qual é a saída do código a seguir?

// int resultado, x;

// x = 1;
// resultado = 0;

// while(x <= 10) {

//     if(x % 2 == 0)

//        // x: 1   
//        // x: 2   resultado 0
//        // x: 3   
//        // x: 4   resultado 2
//        // x: 5   
//        // x: 6   resultado 6
//        // x: 7   
//        // x: 8   resultado 12
//        // x: 9   
//        // x: 10  resultado 20

//        resultado += x; // 20
       
//     ++x; // 20 + 10

// }

// System.out.println(resultado); // saída: B. 30

// // (a) 55 
// // (b) 30 
// // (c) 25 
// // (d) 35 
// // (e) 45


// // Qual é a saída do código a seguir?

// StringBuilder s1 = new StringBuilder("Java");
// String s2 = "Amor";

// s1.append(s2); // JavaAmor
// s1.substring(4); // JavaAmor

// int encontradoEm = s1.indexOf(s2);

// System.out.println(encontradoEm); // saída: C. 4 - método append(String str) , concatena o str para s1.
//                                                 // O método substring(int index) retorna a String do índice fornecido até o final.
//                                                 // Mas como não há nenhuma variável String para armazenar a string retornada, ela será destruída.
//                                                 // Agora o método indexOf(String s2) retorna o índice da primeira ocorrência de s2.
                                        

// // A) -1
// // B) 3
// // C) 4
// // D) A


// // Qual é a saída do código a seguir?

// try {

//     System.out.println("Primeira instrução do bloco try");
//     int num = 45/3;

//     System.out.println(num);

// } catch (Exception e) {
    
//     System.out.println("Exceção capturada");

// } finally {

//     System.out.println("finally bloquear");
// }

// System.out.println("Método Principal");

// // Resposta: Como não há exceção, o bloco catch não é chamado,
//           // mas o bloco finally é sempre executado após um bloco try,
//           // independentemente de a exceção ser tratada ou não.
// // Primeira instrução do bloco try
// // 15
// // finally bloquear
// // Método


// // Qual é a saída do código a seguir?

// Integer a = 128, b = 128;

// System.out.println(a == b); // saída: falso(false)

// Integer c = 100, d = 100;

// System.out.println(c == d); // saída: verdadeiro(true)

// // No código fonte do objeto Integer encontraremos um método 'valueOf' 
// // no qual podemos ver que o intervalo do objeto Integer está de IntegerCache.low(-128) a IntegerCache.high(127).
// // Portanto, os números acima de 127 não fornecerão a saída esperada. 


// // remover todas as ocorrências de um determinado caractere da string de entrada?

// String str1 = "abcdABCDabcdABCD" ;

// str1 = str1.replace("a", ""); // saída: bcdABCDbcdABCD

// System.out.println(str1);


// // Como obter caracteres distintos e sua contagem em uma String?

// String str1 = "abcdABCDabcd";

// char[] chars = str1.toCharArray();

// Map<Character, Integer> caracterContar = new HashMap<>();

// for(char c : chars) {

//     if (caracterContar.containsKey(c)) {
        
//         caracterContar.put(c, caracterContar.get(c) + 1);

//     } else {

//         caracterContar.put(c, 1);
//     }
// }

// System.err.println(caracterContar); // saída: {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}


// // Qual é a saída do código a seguir?

// String a = "JavaQuizPratico";
// String b = new String(a);
// int valor = 0;

// valor = (a == b) ? 1:2;

// if (valor == 1) {
//     System.out.println("JAVAQUIZPRATICO");

// } else if (valor == 2) {
    
//     System.out.println("Java Quiz Pratico");

// } else {

//     System.out.println("Java");
// }

// // A) JAVAQUIZPRATICO
// // B) Java Quiz Pratico
// // C) Java 
// // D) Nenhuma das acima

// // Resposta: B. Java Quiz Pratico - == operador verifica se duas variáveis ​​se referem ao mesmo objeto
                                     //// Aqui a e b referem-se a dois objetos diferentes.

    
// // Qual é a saída do seguinte programa?

// PriorityQueue<Integer> queue =  new PriorityQueue<>();

// queue.add(11);
// queue.add(10);
// queue.add(22);
// queue.add(5);
// queue.add(12);
// queue.add(2);

// while (queue.isEmpty() == false)
//    System.out.println("%d", queue.remove());


// System.out.println("\n"); // saída C. 2 5 10 11 12 22 - PriorityQueue sempre gera o elemento mínimo da fila quando o método remove() é chamado, não importa qual seja a sequência de entrada.


// // a) 11 10 22 5 12 2 
// // b) 2 12 5 22 10 11 
// // c) 2 5 10 11 12 22 
// // d) 22 12 11 10 5 2 


// // Qual é a saída do seguinte programa?

// TreeSet<String> treeSet = new TreeSet<>();

// treeSet.add("Java");
// treeSet.add("Quiz");
// treeSet.add("Pratico");
// treeSet.add("JavaQuizPratico");

// for(String temp : treeSet)
//    System.out.println(temp + " ");

// System.out.println("\n");

// // A) JavaQuizPratico 
// // B) Java Quiz Pratico JavaQuizPratico
// // C) Java JavaQuizPratico Pratico Quiz 
// // D) JavaQuizPratico

// // Resposta C. Java JavaQuizPratico Pratico Quiz



// // Qual é a saída do programa abaixo?

// LinkedList<String> lista1 = new LinkedList<>();
// lista1.add("Java");
// lista1.add("Quiz");
// lista1.add("Pratico");
// lista1.add("JavaQuizPratico");
// lista1.add("Pratico");

// LinkedList<String> lista2 = new LinkedList<>();
// lista2.add("Java");

// lista1.removeAll(lista2);

// for(String temp : lista1) 
//    System.out.printf(temp + " ");

// System.out.println();

// // A) Java Quiz Pratico JavaQuizPratico Pratico
// // B) Java Quiz Pratico JavaQuizPratico
// // C) Pratico JavaQuizPratico Pratico 
// // D) Quiz Pratico JavaQuizPratico Pratico 

// // Resposta D. Quiz Pratico JavaQuizPratico Pratico 


// // Qual é a saída do programa abaixo?

// HashSet<String> hashSet = new HashSet<>();

// hashSet.add("Java");
// hashSet.add("Quiz");
// hashSet.add("Pratico");
// hashSet.add("Java");
// hashSet.add("JavaQuizPratico");

// System.out.println(hashSet); // saída: A. [Java, Quiz, Pratico, JavaQuizPratico]

// // A) [Java, Quiz, Pratico, JavaQuizPratico]
// // B) [JavaQuizPratico, Pratico, Java]


// // Qual é a saída do programa abaixo?

// LinkedList<String> lista = new LinkedList<>();

// lista.add("Java");
// lista.add("Quiz");
// lista.add("Pratico");
// lista.add("Java");
// lista.add("JavaQuizPratico");

// Iterator<Integer> iter = lista.iterator();

// while(iter.hasNext())
//    System.out.printf(iter.next() + " ");

// System.out.println();

// // a) Java Quiz Pratico Java JavaQuizPratico
// // b) JavaQuizPratico Java Quiz Pratico
// // c) Runtime Error 
// // d) Compilation Error

// // Resposta: d. Um iterador feito para iterar sobre Integer não 
//              // pode ser usado para iterar sobre o tipo de dados String.



// // Escreva um programa para encontrar a raiz quadrada de um número.


// try (Scanner entrada = new Scanner(System.in)){
    
//     System.out.println("Insira um número para encontrar a raiz quadrada:");

//     double quadrada = entrada.nextDouble();
//     double raizQuadrada = Math.sqrt(quadrada);

//     System.out.printf("A raiz quadrada é : %f", raizQuadrada); // entrada: 25, saída: 5
// } 



// // Encontre a contagem de palavras em uma string usando o HashMap Collection.

// String str = "Ola mundo, BemVindo ao Java Quiz Pratico";

// String[] split = str.split(" ");

// HashMap<String, Integer> mapa = new HashMap<String, Integer>();

// for(int i = 0; i < split.length; i++) {

//     if(mapa.containsKey(split[i])) {

//         int contar = mapa.get(split[i]);

//         mapa.put(split[i], contar + 1);

//     } else {

//         mapa.put(split[i], 1);
//     }
// }

// System.out.println(mapa); // saída: {Java=1, Quiz=1, Ola=1, Pratico=1, BemVindo=1, ao=1, mundo,=1}



// // Escreva um programa para encontrar o segundo número mais alto em um ArrayList

// int array[] = {1, 2, 3, 4, 11, 12, 13, 14, 21, 22, 23, 24, 31, 32};
// int alto = 0;
// int proximoAlto = 0;

// System.out.printf("A matriz fornecida é: ");

// for(int i = 0; i < array.length; i++) {

//     System.out.print(array[i] + " \t "); // saída 1 2 3 4 11 12 13 14 21 22 23 24 31 32
// }

// for(int i = 0; i < array.length; i++) {

//     if (array[i] > alto) {
        
//         proximoAlto = alto;
//         alto = array[i];

//     } else if (array[i] > proximoAlto) {
        
//         proximoAlto = array[i];
//     }
// }

// System.out.println("O segundo mais alto é: " + proximoAlto); // saída: O segundo mais alto é: 31
// System.out.println("O número mais alto é: " + alto); // saída: O número mais alto é: 32




// // Qual é a saída do seguinte programa java?

// int [] x = { 120, 200, 016, 2 };

// for(int i = 0; i < x.length; i++) {

//     System.err.print(x[i] + " "); // saída: 120 200 014 - 016 octal é equivalente a 014
// }


// // Qual é a saída do seguinte programa java?

// byte x = 127;
// x++;
// x++;

// System.out.println(x); // saída: 127


// // Qual é a saída do seguinte programa java?

// short x = 10;

// x = x * 5;

// System.out.print(x); // saída: cannot convert from int to short


// // Qual é a saída do seguinte programa java?

// String str1 = "incluir";
// String str2 = "ajuda";

// System.out.println(str1 + str2); // saída: incluirajuda



// // Qual é a saída do seguinte programa java?

// System.out.println(Math.copySign(100.6, -200.6)); // saída: -100.6


// // Qual é a saída do seguinte programa java?

// StringBuffer sb = new StringBuffer("Incluir");
// sb.append("ajuda");

// System.out.println(sb); // saída: Incluirajuda - A string aqui é um StringBuffer, portanto, o conteúdo pode ser editado, 
                                                 // o que faz com que o método append funcione adicionando 'ajuda' ao final da string.







// // Qual é a saída do seguinte programa java?

// int i; 

// for(i = 1; i <= 12; i +=2) {

//     if(i == 8) {

//         System.out.println(i);
//         break;
//     }
// }

// // A. 1
// // B. Sem saída 
// // C. 8
// // D. 1357911

// // Resposta: B. Sem saída



// // Qual é a saída do seguinte programa java?

// String str = "Ola";

// str = "Adeus";

// System.out.println(str); // saída: Adeus


// // Qual é a saída do seguinte programa java?

// double numero[] = {12, 17.66, 17, 12.4, 18, 19.77, 10}; // a soma é 106,83
// double resultado;
// resultado = 0;

// for(int i = 0; i < 7; i++) 
//    resultado = resultado + numero[i];

// System.out.println("Resultado é " + resultado / 7); // saída: Resultado 106,83 / 7 é 15.26142857142857



// // Qual é a saída do seguinte programa java?

// String str1 = new String("Ola");
// String str2 = new String("Adeus");

// System.out.print(str1 = str2); // saída: Adeus


// // Qual é a saída do seguinte programa java?

// float i = 5;

// if (i) {
    
//     System.out.println("SIM");

// } else {

//     System.out.println("NÃO");
// }

// // A. SIM
// // B. NÃO
// // C. error: incompatible types
// // D. Nenhum

// // Reposta: C. error: incompatible types



// // Qual é a saída do seguinte programa java?

// char c = 'Z';

// if (c > 100) {
    
//     System.out.println("Java");

//  } else {

//     System.out.println("Python");
//  }

// // 1. Java
// // 2. Python
// // 3. Compilation error
// // 4. Nenhum

// Resposta: 2. Python


// // Qual é a saída do seguinte programa java?

// Pattern p = Pattern.compile("gosto", Pattern.CASE_INSENSITIVE);
// Matcher m = p.matcher("Eu gosto de Java");

// boolean combinacaoEncontrada = m.find();

// if (combinacaoEncontrada) {
    
//     System.out.println("Combinação encontrada");

// } else {

//     System.out.println("Combinação não encontrada");
// }

// // A. Combinação encontrada
// // B. Combinação não encontrada
// // C. Erro de compilação 
// // D. Nenhum

// Resposta: saída: A. Combinação encontrada


// // // Qual é a saída do seguinte programa java?

// int contar = 0;

// while(contar <= 4) {

//     System.out.println(contar % 2 == 1 ? "111" : "2222"); // saída: A. 111 imprimi 5 vezes & 2222 imprimi 6 vezes
//     ++contar;
// }

// // // A. 111 imprimi 5 vezes & 2222 imprimi 6 vezes
// // // B. 111 imprimi 5 vezes
// // // C. 2222 imprimi 6 vezes
// // // D. Nenhum



// // Qual é a saída do seguinte programa java?

// StringBuffer str = new StringBuffer("Técnico");

// str.setCharAt(3, 'l');
// str.setCharAt(2, 'v');

// System.out.println("Saída = " + str); // saída: saída = Tévlico




// // Qual é a saída do seguinte programa java?


// HashSet obj = new HashSet();
// obj.add("Maçã");
// obj.add("Morango");
// obj.remove("Morango");
// obj.add("Uvas");

// System.out.println(obj + " " + obj.size() + " " + obj.hashCode()); // saída: 4. [Maçã, Uvas] 2 5043267



// // 1.[Morango, Uvas] 2 5043267
// // 2. [Morango, Uvas] 2 5043267
// // 3. [Morango, Uvas] 2 5043267
// // 4. [Maçã, Uvas] 2 5043267


// // Qual é a saída do seguinte programa java?

// ArrayList<Integer> obj = new ArrayList<Integer>();

// obj.add(14);
// obj.add(12);
// obj.add(89);
// obj.add(23);

// obj.forEach(s->System.out.println(s));

// obj.forEach(s-> {
//     if(s % 4 == 0)
//         System.out.println(s);
// });

// // A. 14 12 89 23 12
// // B. 14 89 12 23 12
// // C. 89 14 12 23 12
// // D. 12 23 12 89 14

// Resposta: A. 14 12 89 23 12


// // Qual é a saída do seguinte programa java?

// LocalTime t1 = LocalTime.of (11, 34, 10);
// System.out.println (t1); // saída: 11:34:10

// LocalTime t2 = t1.plusHours (3);
// LocalTime t3 = t2.plusMinutes (16);
// System.out.println (t3); // saída: 14:50:10

// // A. 11:34:10 14:50:10
// // B. 11:34:10 14:51:11
// // C. 11:34:10 14:55:13
// // D. 11:34:10 14:56:16


// ORM significa___


// // A. Object Relational Mapping
// // B. Operating Rate Mapping
// // C. Operating Relational Mapping
// // D. Object Rate Mapping

// Resposta A. Mapeamento Relacional de Objetos.









 }

    // protected int x, y;
}
