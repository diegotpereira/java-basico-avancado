import java.util.Comparator;

public class AutorIdadeComparador implements Comparator<Autor>{

    @Override
    public int compare(Autor o1, Autor o2) {
        // TODO Auto-generated method stub
        if (o1.auIdade == o2.auIdade) {
            return 0;
        } else if (o1.auIdade > o2.auIdade) {
            return 1;
        }
        return -1;
    }
    
}
