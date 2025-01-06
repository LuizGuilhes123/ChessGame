package chess.pieces;

public class King extends Piece {
    public King(String color) {
        super("K", color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Piece[][] board) {
        return Math.abs(toRow - fromRow) <= 1 && Math.abs(toCol - fromCol) <= 1 &&
                (board[toRow][toCol] == null || board[toRow][toCol].isWhite() != white);
    }
}
