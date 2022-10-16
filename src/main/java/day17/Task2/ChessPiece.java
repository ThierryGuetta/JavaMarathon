package day17.Task2;

public enum ChessPiece {
    KING_WHITE("Король (белый) ♔", 100),
    KING_BLACK("Король (черный) ♚", 100),
    QUEEN_WHITE("Ферзь (белый) ♕", 9),
    QUEEN_BLACK("Ферзь (черный) ♛", 9),
    ROOK_WHITE("Ладья (белая) ♖", 5),
    ROOK_BLACK("Ладья (черная) ♜", 5),
    BISHOP_WHITE("Слон (белый) ♗", 3.5),
    BISHOP_BLACK("Слон (черный) ♝", 3.5),
    KNIGHT_WHITE("Конь (белый) ♘", 3),
    KNIGHT_BLACK("Конь (черный) ♞", 3),
    PAWN_BLACK("Пешка (черная) ♟", 1),
    PAWN_WHITE("Пешка (белая) ♙", 1),
    EMPTY("_", -1);

    private double value;
    private String name;

    ChessPiece(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(name.charAt(name.length() - 1));
    }
}
