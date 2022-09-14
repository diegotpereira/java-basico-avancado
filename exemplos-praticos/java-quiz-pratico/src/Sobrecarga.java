public class Sobrecarga {
    
    int x;
    double y;

    void add(int a, int b) {

        x = a + b;
    }

    void add(double c, double d) {
        y = c + d;
    }
    Sobrecarga() {
        this.x = 0;
        this.y = 0;
    }
}

class Sobrecarga_Metodos {

    public static void main(String[] args) {
        Sobrecarga obj = new Sobrecarga();
        int a = 2;
        double b = 3.2;

        obj.add(a, a);
        obj.add(b, b);

        System.out.println(obj.x + " " + obj.y); // 4 e 6.4
    }
}

// a) 4 6.4
// b) 6.4 6
// c) 6.4 6.4
// d) 6 6