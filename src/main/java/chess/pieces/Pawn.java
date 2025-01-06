package chess.pieces;

public class Pawn extends Piece {
    public Pawn(String color) {
        super("P", color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Piece[][] board) {
        int direction = white ? -1 : 1;
        if (fromCol == toCol && board[toRow][toCol] == null) {
            if (toRow - fromRow == direction) {
                return true;
            }
            if ((white && fromRow == 6 || !white && fromRow == 1) && toRow - fromRow == 2 * direction) {
                return board[fromRow + direction][fromCol] == null;
            }
        } else if (Math.abs(fromCol - toCol) == 1 && toRow - fromRow == direction && board[toRow][toCol] != null) {
            return board[toRow][toCol].isWhite() != white;
        }
        return false;
    }
}
