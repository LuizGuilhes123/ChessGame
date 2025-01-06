package chess;

import chess.board.ChessBoard;

public class Game {

    private ChessBoard board;
    private boolean whiteTurn;

    public Game() {
        board = new ChessBoard();
        whiteTurn = true;
    }

    public void start() {
        board.initialize();
        board.printBoard();

        // Example moves (Extend with proper game loop and input handling)
        move("e2", "e4");
        move("e7", "e5");
        move("g1", "f3");
    }

    public void move(String from, String to) {
        if (board.movePiece(from, to, whiteTurn)) {
            whiteTurn = !whiteTurn;
            board.printBoard();
        } else {
            System.out.println("Invalid move! Try again.");
        }
    }
}