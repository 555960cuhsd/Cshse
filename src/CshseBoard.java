import pieces.*;
import java.util.ArrayList;

public class CshseBoard {
    // Random chess pieces on each side
    // Random piece to take
    private Piece[][] board;
    private ArrayList<Piece> options;
    public CshseBoard() {
        board = new Piece[8][8];
        newBoard();
    }

    public void newBoard() {
        for (int t = 0; t < 2; t++) {
            boolean white = t != 1;
            for (int i = 0; i < 7; i++) {
                for (int j = 6*t; j < 6*t + 2; j++) {
                    int randValue = (int) (Math.random()*6) + 1; // random from 1 to 6
                    System.out.println(randValue);
                    switch (randValue) {
                        case 1:
                            board[i][j] = new Piece(i, j, "K", white);
                            break;
                        case 2:
                            board[i][j] = new Piece(i, j, "Q", white);
                            break;
                        case 3:
                            board[i][j] = new Piece(i, j, "R", white);
                            break;
                        case 4:
                            board[i][j] = new Piece(i, j, "B", white);
                            break;
                        case 5:
                            board[i][j] = new Piece(i, j, "N", white);
                            break;
                        case 6:
                            board[i][j] = new Piece(i, j, "P", white);
                            break;
                    }
                }
            }
        }
    }

    public void printBoard() {
        for (int r = 0; r < 8; r++) {
            System.out.println("");
            System.out.println("---------------------------------");
            for (int c = 0; c < 8; c++) {
                String piece;
                if (board[r][c] == null) {
                    piece = "  ";
                }
                piece = board[r][c].toString();
                System.out.print("|" + piece);
            }
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("---------------------------------");
    }

    public void move(String message) {

    }

}
