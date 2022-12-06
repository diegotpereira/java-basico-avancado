import java.util.*;

class Estudante implements Comparable<Estudante>{

    int id;
    String nome;
    double cgpa;

    public int getID() {

        return id;
    }

    public String getNome() {

        return nome;
    }

    public Double getCGPA() {

        return cgpa;
    }

    Estudante(int id, String nome, double cgpa) {

        this.id = id;
        this.nome = nome;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Estudante o) {
        
        // O aluno com a média de notas cumulativa mais alta (CGPA) é atendido primeiro.
        if (cgpa == o.cgpa) {
            
            // Quaisquer alunos que tenham o mesmo CGPA serão atendidos pelo nome em ordem alfabética crescente com distinção entre maiúsculas e minúsculas.
            if (nome.compareTo(o.nome) == 0) {
                
                if (id == o.id) 
                    
                    return 0;
                
                else if(id > o.id)
                    
                    return 1;

                else 
                  
                    return -1;

            } else 
                
                return nome.compareTo(o.nome);
        } else if(cgpa > o.cgpa)

            return -1;

        else 
        return 1;
    }}
class Priorities {

    // Processa todos os eventos dados e retornar todos os alunos ainda a serem atendidos na ordem de prioridade.
    public ArrayList<Estudante> obterEstudantes(List<String> eventos) {

        int n = eventos.size();

        PriorityQueue<Estudante> pq = new PriorityQueue<Estudante>();

        for(String i : eventos) {

            String[] s = new String[4];

            s = i.split("\\s");

            if (s.length > 1) {
                
                pq.add(new Estudante(Integer.valueOf(s[3]), s[1], Double.valueOf(s[2])));

            } else {

                // O método poll() da Interface da Fila retorna e remove o elemento na frente do contêiner. 
                // Ele exclui o elemento do contêiner. O método não lança uma exceção quando a Fila está vazia, 
                // ele retorna nulo em vez disso.
                pq.poll();
            }
        }

        while(pq.size() > 1) {

            System.out.println(pq.poll().nome);
        }

        return new ArrayList<Estudante>(pq);
    }
}

public class App {

    private final static Scanner teclado = new Scanner(System.in);
    private final static Priorities priorites = new Priorities();
    public static void main(String[] args) throws Exception {

        int totalEventos = Integer.parseInt(teclado.nextLine());
        List<String> eventos = new ArrayList<>();


        while(totalEventos-- != 0) {

            String evento = teclado.nextLine();

            eventos.add(evento);
        }

        List<Estudante> estudantes = priorites.obterEstudantes(eventos);

        if(estudantes.isEmpty()) {

            System.out.println("VAZIO");

        } else {

            for(Estudante estudante : estudantes) {

                System.out.println(estudante.getNome());
            }
        }
    }
}
