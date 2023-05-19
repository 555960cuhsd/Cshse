package pieces;

public class Coordinate {
    private int x;
    private int y;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean outOfBounds() {
        return (x > 7 || x < 0) || (y > 7 || y < 0);
    }
}
