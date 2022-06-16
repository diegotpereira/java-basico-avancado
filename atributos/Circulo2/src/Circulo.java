public class Circulo {
    public float raio;
    
    public float x;

    public float y;

    public void move(float dx, float dy) {
        this.x = dx;
        y += dy;
    }


    public void mostra() {
        System.out.println("(" + x + "," + y + "," + raio + ")");
    }
}