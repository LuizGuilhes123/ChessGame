package chess.pieces;

public class Queen extends Piece {
    public Queen(String color) {
        super("Q", color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Piece[][] board) {
        Rook rook = new Rook(white ? "white" : "black");
        Bishop bishop = new Bishop(white ? "white" : "black");
        return rook.isValidMove(fromRow, fromCol, toRow, toCol, board) ||
                bishop.isValidMove(fromRow, fromCol, toRow, toCol, board);
    }
}