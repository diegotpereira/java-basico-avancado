public class Intervalo implements Comparable<Intervalo>{
    
    int c1;
    int c2;

    Intervalo(int c1, int c2) {

        this.c1 = c1;
        this.c2 = c2;
    }

    // public int compareTo(Intervalo outro) {

    //     return Integer.compare(this.c1, outro.c1);
    // }

    @Override
    public int compareTo(Intervalo o) {
        if (c1 != o.c1) {
            return Integer.compare(c1, o.c1);
        } else {
            return Integer.compare(c2, o.c2);
        }
    }
}
