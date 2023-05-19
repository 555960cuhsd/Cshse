import pieces.Coordinate;
import pieces.Piece;
import java.util.ArrayList;

public class Move {
    private Piece piece;
    private Coordinate spot;

    public Move(Piece piece, Coordinate spot) {
        this.piece = piece;
        this.spot = spot;
    }

    public boolean isValid() {
        ArrayList<Coordinate> possibleSpots = piece.getPossibleSpots();
        return !spot.outOfBounds() && possibleSpots.contains(spot);
    }

}
