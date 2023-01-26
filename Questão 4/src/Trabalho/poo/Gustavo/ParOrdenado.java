package Trabalho.poo.Gustavo;
public class ParOrdenado {
    
    private int x,y;

    public ParOrdenado(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    
}
