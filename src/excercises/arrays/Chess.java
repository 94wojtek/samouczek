package excercises.arrays;

public class Chess {

    public String[][] board;
    private static String bKing = "Black King";
    private static String bBishop = "Black Bishop";
    private static String bKnight = "Black Knight";
    private static String bRook = "Black Rook";
    private static String bPawn = "Black Pawn";

    private static String queen = "Queen";
    private static String wKing = "Black King";
    private static String wBishop = "Black Bishop";
    private static String wKnight = "Black Knight";
    private static String wRook = "Black Rook";
    private static String wPawn = "Black Pawn";


    public Chess(String[][] board) {
        this.board = board;
    }

    public static Chess deepBlueKasparov() {
        String[][] board = new String[][] {
                new String[] {bRook, null,  bKing,   null,    null,    null,    null,    bRook},
                new String[] {bPawn, null,  null,    bKnight, bBishop, null,    bPawn,   null},
                new String[] {null,  null,  bBishop, null,    null,    null,    null,    bPawn},
                new String[] {null,  bPawn, null,    bKnight, null,    bPawn,   null,    null},
                new String[] {null,  null,  wPawn,   wPawn,   null,    null,    null,    null},
                new String[] {null,  null,  null,    queen,   null,    wKnight, wBishop, null},
                new String[] {null,  wPawn, null,    null,    null,    wPawn,   wPawn,   wPawn},
                new String[] {wRook, null,  null,    null,    null,    null,    wKing,   null},
        };
        return new Chess(board);
    }
}
