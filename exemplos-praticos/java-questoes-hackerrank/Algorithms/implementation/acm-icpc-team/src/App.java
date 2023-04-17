import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

// Primeiro, é preciso percorrer todas as combinações possíveis de 2 pessoas para formar uma equipe. Para isso, pode-se utilizar um duplo loop for que percorre todas as combinações únicas de pessoas no array de dados de entrada.

// Em seguida, é necessário contar o número de tópicos que cada equipe sabe. Para isso, pode-se utilizar uma operação de bit a bit OR (|) entre as strings binárias que representam os tópicos conhecidos por cada membro da equipe. O resultado dessa operação é uma nova string binária que representa os tópicos que pelo menos um dos membros da equipe conhece.

// O número de tópicos que a equipe sabe é igual ao número de bits com valor 1 na nova string binária gerada no passo anterior. Isso pode ser feito convertendo a string binária em um número inteiro e contando o número de bits definidos usando a função "bit_count".

// Armazena-se o número de tópicos que a equipe sabe em uma lista.

// Depois de calcular o número de tópicos para todas as equipes, pode-se determinar o número máximo de tópicos que alguma equipe sabe. Isso é feito encontrando o maior valor na lista de tópicos calculados.

// Para determinar o número de equipes que sabem o máximo de tópicos, basta contar o número de ocorrências desse valor máximo na lista.

// Retorne os valores máximo de tópicos e o número de equipes que sabem esse valor.

import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(primeiraMultiplaEntrada[0]);

        int m = Integer.parseInt(primeiraMultiplaEntrada[1]);

        List<String> tema = IntStream.range(0, n).mapToObj(i -> {

            try {

                return bufferedReader.readLine();
            } catch (IOException e) {

                throw new RuntimeException(e);
            }
        }).collect(toList());

        List<Integer> resultado = Resultado.acmTeam(tema);

        bufferedWriter.write(resultado.stream().map(Object::toString).collect(joining("\n")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Resultado {

    public static List<Integer> acmTeam(List<String> tema) {

        // inicializa a variável que armazenará a quantidade máxima de tópicos
        // conhecidos

        // AtomicInteger é uma classe do pacote java.util.concurrent.atomic que
        // representa um inteiro que pode ser atualizado atomicamente. Ela é utilizada
        // para operações em que várias threads podem tentar modificar o mesmo valor de
        // forma simultânea, garantindo que a operação seja realizada de forma atômica,
        // ou seja, sem que haja interferência de outras threads.
        AtomicInteger maxTopico = new AtomicInteger(0);

        // inicializa a variável que armazenará o número de equipes que conhecem a mesma
        // quantidade máxima de tópicos
        AtomicInteger numEquipes = new AtomicInteger(0);

        // percorre todos os pares de equipes, usando flatMap para criar uma stream
        // com a quantidade de tópicos conhecidos por cada par de equipes
        tema.stream()
                .flatMap(s1 -> tema.stream().filter(s2 -> tema.indexOf(s2) > tema.indexOf(s1))
                        .map(s2 -> {

                            // inicializa a variável que contará a quantidade de tópicos conhecidos
                            int topicoConhecido = 0;

                            // percorre todas as posições das strings e incrementa o contador
                            // se alguma das equipes conhecer o tópico
                            for (int i = 0; i < s1.length(); i += 1) {

                                if (s1.charAt(i) == '1' || s2.charAt(i) == '1') {

                                    topicoConhecido++;
                                }
                            }

                            // retorna a quantidade de tópicos conhecidos pelo par de equipes
                            return topicoConhecido;
                        }))

                // para cada quantidade de tópicos conhecidos, verifica se é maior que a
                // quantidade máxima conhecida até então e atualiza as variáveis maxTopico
                // e numEquipes
                .forEach(topicoConhecido -> {

                    if (topicoConhecido > maxTopico.get()) {

                        maxTopico.set(topicoConhecido);
                        numEquipes.set(1);

                    } else if (topicoConhecido == maxTopico.get()) {

                        // O método incrementAndGet() é um método da classe AtomicInteger, que é
                        // utilizada para operações atômicas de incrementação e atualização de valores
                        // inteiros.
                        numEquipes.incrementAndGet();
                    }
                });

        // retorna a lista com a quantidade máxima de tópicos conhecidos e o número
        // de equipes que conhecem essa quantidade máxima
        return Arrays.asList(maxTopico.get(), numEquipes.get());
    }

    // public static List<Integer> acmTeam(List<String> tema) {

    // // Cria duas listas encadeadas vazias para armazenar os resultados
    // LinkedList<Integer> lista = new LinkedList<>();
    // LinkedList<Integer> lista2 = new LinkedList<>();

    // // Inicializa a contagem máxima de tópicos conhecidos como zero
    // int maxContar = 0;

    // // Loop pelos tópicos na lista de temas
    // for (int i = 0; i < tema.size(); i++) {

    // for (int j = i + 1; j < tema.size(); j++) {

    // // Conta quantos tópicos são conhecidos entre os dois tópicos atuais
    // int contar = 0;

    // String s1 = tema.get(i);
    // String s2 = tema.get(j);

    // for (int k = 0; k < s1.length(); k++) {

    // if (s1.charAt(k) == '1' || s2.charAt(k) == '1')

    // contar++;
    // }

    // // Se a contagem atual é maior ou igual à contagem máxima, armazene a
    // contagem
    // // na lista2
    // if (contar >= maxContar) {

    // maxContar = contar;

    // lista2.add(maxContar);
    // }
    // }
    // }

    // // Encontre a frequência da contagem máxima na lista2 e armazene-a na lista
    // int maxFreq = Collections.frequency(lista2, maxContar);
    // lista.add(maxContar);
    // lista.add(maxFreq);

    // // Retorne a lista contendo a contagem máxima e a frequência da contagem
    // máxima
    // return lista;
    // }

    // public static List<Integer> acmTeam(List<String> tema) {

    // // inicializa as variáveis de máximo de tópicos conhecidos e número de
    // equipes
    // // que conhecem esse máximo
    // int maxTopico = 0;
    // int numEquipes = 0;

    // // itera sobre todas as combinações possíveis de duas equipes
    // for (int i = 0; i < tema.size(); i++) {

    // for (int j = i + 1; j < tema.size(); j++) {

    // // conta o número de tópicos conhecidos pelas duas equipes juntas
    // int topicoConhecido = 0;

    // // se o número de tópicos conhecidos for maior do que o máximo anterior,
    // // atualiza o máximo e o número de equipes que o conhecem
    // for (int k = 0; k < tema.get(0).length(); k++) {

    // if (tema.get(i).charAt(k) == '1' || tema.get(j).charAt(k) == '1') {

    // topicoConhecido++;

    // }
    // }

    // if (topicoConhecido > maxTopico) {

    // maxTopico = topicoConhecido;

    // numEquipes = 1;

    // // se o número de tópicos conhecidos for igual ao máximo anterior, incrementa
    // o
    // // número de equipes que o conhecem
    // } else if (topicoConhecido == maxTopico) {

    // numEquipes++;
    // }
    // }
    // }

    // // cria uma lista com o máximo de tópicos conhecidos e o número de equipes
    // // que o conhecem
    // List<Integer> resultado = new ArrayList<>();

    // resultado.add(maxTopico);
    // resultado.add(numEquipes);

    // return resultado;
    // }
}