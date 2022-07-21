package br.com.java.data;

public class Tupla {
    
    public int x;
    public int y;
    public int xf;
    public int yf;

    
    public Tupla(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void alterarDado(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
   
    public int getXf() {
        return xf;
    }
    
    public int getYf() {
        return yf;
    }
}
