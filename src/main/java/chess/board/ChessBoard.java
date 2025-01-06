package chess.board;

public class ChessBoard {

    private Piece[][] board;

    public ChessBoard() {
        board = new Piece[8][8];
    }

    public void initialize() {
        // Initialize pawns
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn("black");
            board[6][i] = new Pawn("white");
        }

        // Initialize other pieces
        board[0][0] = new Rook("black");
        board[0][7] = new Rook("black");
        board[7][0] = new Rook("white");
        board[7][7] = new Rook("white");

        board[0][1] = new Knight("black");
        board[0][6] = new Knight("black");
        board[7][1] = new Knight("white");
        board[7][6] = new Knight("white");

        board[0][2] = new Bishop("black");
        board[0][5] = new Bishop("black");
        board[7][2] = new Bishop("white");
        board[7][5] = new Bishop("white");

        board[0][3] = new Queen("black");
        board[7][3] = new Queen("white");

        board[0][4] = new King("black");
        board[7][4] = new King("white");
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(".");
                } else {
                    System.out.print(board[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean movePiece(String from, String to, boolean whiteTurn) {
        int fromRow = 8 - Character.getNumericValue(from.charAt(1));
        int fromCol = from.charAt(0) - 'a';
        int toRow = 8 - Character.getNumericValue(to.charAt(1));
        int toCol = to.charAt(0) - 'a';

        Piece piece = board[fromRow][fromCol];

        if (piece == null || piece.isWhite() != whiteTurn) {
            return false;
        }

        if (piece.isValidMove(fromRow, fromCol, toRow, toCol, board)) {
            board[toRow][toCol] = piece;
            board[fromRow][fromCol] = null;
            return true;
        }
        return false;
    }
}

