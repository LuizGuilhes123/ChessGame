package chess.pieces;

public class Rook extends Piece {
    public Rook(String color) {
        super("R", color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Piece[][] board) {
        if (fromRow != toRow && fromCol != toCol) {
            return false;
        }
        int rowStep = Integer.compare(toRow, fromRow);
        int colStep = Integer.compare(toCol, fromCol);
        for (int i = 1; i < Math.max(Math.abs(toRow - fromRow), Math.abs(toCol - fromCol)); i++) {
            if (board[fromRow + i * rowStep][fromCol + i * colStep] != null) {
                return false;
            }
        }
        return board[toRow][toCol] == null || board[toRow][toCol].isWhite() != white;
    }
}