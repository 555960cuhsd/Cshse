package pieces;

public abstract class Piece {
    // is Valid
    public abstract void move(Piece[][] board, int row, int col);
    public abstract boolean isValid();


}
