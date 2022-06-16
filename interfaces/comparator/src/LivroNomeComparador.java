import java.util.Comparator;


public class LivroNomeComparador implements Comparator<Autor>{

    @Override
    public int compare(Autor o1, Autor o2) {
        // TODO Auto-generated method stub
        return o1.livroNome.compareTo(o2.livroNome);
    }
    
}
