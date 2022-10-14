public class Ponto {
    
    int m_x, m_y;

    public Ponto(int x, int y) {
        m_x = x;
        m_y  = y;
    }

    public Ponto() {

        this(10, 10);
    }
    public int getX() {
        return m_x;
    }
    public int getY() {
        return m_y;
    }

    public static void main(String[] args) {
        
        Ponto p = new Ponto();

        System.out.println(p.getX()); // saída: 10
    }

    // A. 10
    // B. 0
    // C. Erro de compilação
}
