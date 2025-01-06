package chess.pieces;

public abstract class Piece {
    protected String type;
    protected boolean white;
    public Piece(String type, String color) {
        this.type = type;
        this.white = color.equals("white");
    }

    public boolean isWhite() {
        return white;
    }

    @Override
    public String toString() {
        return (white ? "W" : "B") + type;
    }

    public abstract boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Piece[][] board);
}