import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int testeCasos = Integer.parseInt(teclado.nextLine());

        List<Estudante> estudanteLista = new ArrayList<Estudante>();

        while (testeCasos > 0) {
            
            int id = teclado.nextInt();
            String fNome = teclado.next();
            double cgpa = teclado.nextDouble();

            Estudante estudante = new Estudante(id, fNome, cgpa);

            estudanteLista.add(estudante);

            testeCasos--;
        }

        estudanteLista.sort(new Comparator<Estudante>() {

            @Override
            public int compare(Estudante estudante1, Estudante estudante2) {

                // Se dois alunos tiverem o mesmo CGPA  
                if (estudante1.getCgpa() == estudante2.getCgpa()) {
                    
                    //  primeiro nome em ordem alfabética.
                    return estudante1.getfNome().compareTo(estudante2.getfNome());

                } else if (estudante1.getCgpa() < estudante2.getCgpa()) {
                    
                    return 1;

                } else {

                    return -1;
                }
            }
            
        });
        
        for(Estudante estudante : estudanteLista) {

            System.out.println(estudante.getfNome());
        }

        teclado.close();
    }
}

class Estudante {

    private int id;
    private String fNome;
    private double cgpa;

    public Estudante(int id, String fNome, double cgpa) {

        super();
        this.id =id;
        this.fNome = fNome;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getfNome() {
        return fNome;
    }

    public double getCgpa() {
        return cgpa;
    }
}
