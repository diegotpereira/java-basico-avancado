final class Complexo {
    
    private final double re;
    private final double im;

    public Complexo(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public String toString() {

        return "(" + re + " + " + im + " i)";
    }
    class Principal {

        public static void main(String[] args) {
            
            Complexo complexo = new Complexo(10, 15);
    
            System.out.println("O número complexo é " + complexo); // A. O número complexo é (10.0 + 15.0i)
        }
    }
}


// A. O número complexo é (10.0 + 15.0i)
// B. Compiler Error
// C. O número complexo é SOME_GARBAGE
// D. O número complexo é Complexo@8e2fb5