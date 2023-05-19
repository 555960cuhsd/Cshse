package pieces;
import java.util.ArrayList;
public class Piece {
    // is Valid
    private Coordinate spot;
    private boolean white;
    private String name;
    // Names: "K" = king, "Q" = queen, "R" = rook, "B" = bishop, "N" = knight, "P" = pawn
    private ArrayList<Coordinate> possibleSpots;

    /**
     * 0 <= x <= 7
     * 0 <= y <= 7
     * @param x initial starting row value
     * @param y initial starting column value
     * @param name name of piece
     * @param white value for if the piece is white
     */
    public Piece(int x, int y, String name, boolean white) {
        spot = new Coordinate(x, y);
        this.name = name;
        this.white = white;
    }
    public Piece(int x, int y, String name) {
        spot = new Coordinate(x, y);
        this.name = name;
        white = true;
    }
    public Piece(int x, int y) {
        spot = new Coordinate(x, y);
        name = null;
    }

    public Coordinate getSpot() {
        return spot;
    }
    public String getName() {
        return name;
    }
    public boolean isWhite() {
        return white;
    }
    public ArrayList<Coordinate> getPossibleSpots() {
        return possibleSpots;
    }

    public String toString() {
        String whitePrefix = " ";
        if (!white) {
            whitePrefix = "b";
        }
        return whitePrefix + name;
    }

}
