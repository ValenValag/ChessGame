package com.valenvalag.core;

import java.util.List;

public class Board {

    public static final Piece EMPTY = new Piece(0, true);

    public static final Piece WHITE_PAWN = new Piece(1, true);
    public static final Piece WHITE_KNIGHT = new Piece(2, true);
    public static final Piece WHITE_BISHOP = new Piece(3, true);
    public static final Piece WHITE_ROOK = new Piece(4, true);
    public static final Piece WHITE_QUEEN = new Piece(5, true);
    public static final Piece WHITE_KING = new Piece(6, true);

    public static final Piece BLACK_PAWN = new Piece(1, false);
    public static final Piece BLACK_KNIGHT = new Piece(2, false);
    public static final Piece BLACK_BISHOP = new Piece(3, false);
    public static final Piece BLACK_ROOK = new Piece(4, false);
    public static final Piece BLACK_QUEEN = new Piece(5, false);
    public static final Piece BLACK_KING = new Piece(6, false);

    private final Piece[][] board= {
            {
                    BLACK_ROOK, BLACK_KNIGHT, BLACK_BISHOP, BLACK_QUEEN,
                    BLACK_KING, BLACK_BISHOP, BLACK_KNIGHT, BLACK_ROOK
            },
            {
                    BLACK_PAWN, BLACK_PAWN, BLACK_PAWN, BLACK_PAWN,
                    BLACK_PAWN, BLACK_PAWN, BLACK_PAWN, BLACK_PAWN
            },
            { EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY },
            { EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY },
            { EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY },
            { EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY },
            {
                    WHITE_PAWN, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN,
                    WHITE_PAWN, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN
            },
            {
                    WHITE_ROOK, WHITE_KNIGHT, WHITE_BISHOP, WHITE_QUEEN,
                    WHITE_KING, WHITE_BISHOP, WHITE_KNIGHT, WHITE_ROOK
            }
    };

    private final List<Character> LETTERS = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g' ,'h');
    public void showBoard() {
        for (int i = 0; i < 8; i ++) {
            // Add Y axis legend
            System.out.print((i - 8) * -1 + "\t");

            // Print each col and row value
            for (int j = 0; j < 8; j ++) {
                System.out.print(board[i][j].getIcon() + "\t");
            }
            // Add new line each row
            System.out.println();
        }

        // Add X axis legend
        System.out.print("\t");
        for (int i = 0; i < 8; i ++) {
            System.out.print(LETTERS.get(i) + "\t");
        }
    }

}
