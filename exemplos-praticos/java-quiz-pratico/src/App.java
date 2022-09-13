public class App {
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

        // Reposta D. Ambos Acima


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

        // // Reposta C. 256 0 

        
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
    }
    // protected int x, y;
}
