public class Trava {
    
    public String quem;

    public boolean travado;

    public void trave(String q) {
        this.travado = true;
        this.quem = q;
    }

    public void destrave(String q) {
        this.travado = false;
        this.quem = q;
    }

    public boolean estado() {
        return travado;
    }
}
