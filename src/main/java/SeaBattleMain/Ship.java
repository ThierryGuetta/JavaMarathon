package SeaBattleMain;

public class Ship {

    private int x, y, x1, y1, x2, y2, x3, y3;
    private final char symbolOfShip = 'O';
    private final char symbolOfOreol = '*';

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    public char getSymbolOfShip() {
        return symbolOfShip;
    }

    public char getSymbolOfOreol() {
        return symbolOfOreol;
    }

    public Ship(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ship(int x1, int y1, int x2, int y2) {
        this.x = x1;
        this.y = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Ship(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x = x1;
        this.y = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public Ship(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x = x1;
        this.y = y1;
        this.x1 = x2;
        this.y1 = y2;
        this.x2 = x3;
        this.y2 = y3;
        this.x3 = x4;
        this.y3 = y4;
    }
}
