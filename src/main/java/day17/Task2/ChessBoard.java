package day17.Task2;

import java.util.Arrays;

public class ChessBoard {
    private ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public void print() {
        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces.length; j++) {
                System.out.print(chessPieces[i][j]);
            }
            System.out.println();
        }
    }
}
