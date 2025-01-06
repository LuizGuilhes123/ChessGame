package chess.pieces;

public class Bishop extends Piece {
    public Bishop(String color) {
        super("B", color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Piece[][] board) {
        if (Math.abs(toRow - fromRow) != Math.abs(toCol - fromCol)) {
            return false;
        }
        int rowStep = Integer.compare(toRow, fromRow);
        int colStep = Integer.compare(toCol, fromCol);
        for (int i = 1; i < Math.abs(toRow - fromRow); i++) {
            if (board[fromRow + i * rowStep][fromCol + i * colStep] != null) {
                return false;
            }
        }
        return board[toRow][toCol] == null || board[toRow][toCol].isWhite() != white;
    }
}