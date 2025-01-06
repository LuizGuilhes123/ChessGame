package chess.pieces;

public class Knight extends Piece {
    public Knight(String color) {
        super("N", color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Piece[][] board) {
        int rowDiff = Math.abs(toRow - fromRow);
        int colDiff = Math.abs(toCol - fromCol);
        return rowDiff * colDiff == 2 && (board[toRow][toCol] == null || board[toRow][toCol].isWhite() != white);
    }
}