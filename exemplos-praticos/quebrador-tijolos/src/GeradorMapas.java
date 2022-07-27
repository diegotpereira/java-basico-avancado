import java.awt.*;

public class GeradorMapas {
    
    public int map[][];
    public int tijoloLargura;
    public int tijoloAltura;

    public GeradorMapas(int linha, int coluna) {

        map = new int[linha][coluna];

        for(int i = 0; i < map.length; i++) {

            for(int j = 0; j < map[0].length; j++) {

                map[i][j] = 1;
            }
        }
        tijoloLargura = 540 / coluna;
        tijoloAltura = 150 / linha;
    }
    public void desenhar(Graphics2D g) {

        for(int i = 0; i < map.length; i++) {

            for(int j = 0; j < map[0].length; j++)  {

                if (map[i][j] > 0) {
                    
                    g.setColor(Color.WHITE);
                    g.fillRect(j * tijoloLargura + 80, i * tijoloAltura + 50, tijoloLargura, tijoloAltura);
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * tijoloLargura + 80, i * tijoloAltura + 50, tijoloLargura, tijoloAltura);
                }
            }
        }
    }
    public void setTijoloValor(int valor, int linha, int coluna) {

        map[linha][coluna] = valor;
    }
}
