package com.valenvalag.core;

import java.util.List;

public class Board {

    // PIECES
    private static final Piece EMPTY = new Piece(null, true);

    private static final Piece WHITE_PAWN = new Piece(PieceType.PAWN, true);
    private static final Piece WHITE_KNIGHT = new Piece(PieceType.KNIGHT, true);
    private static final Piece WHITE_BISHOP = new Piece(PieceType.BISHOP, true);
    private static final Piece WHITE_ROOK = new Piece(PieceType.ROOK, true);
    private static final Piece WHITE_QUEEN = new Piece(PieceType.QUEEN, true);
    private static final Piece WHITE_KING = new Piece(PieceType.KING, true);

    private static final Piece BLACK_PAWN = new Piece(PieceType.PAWN, false);
    private static final Piece BLACK_KNIGHT = new Piece(PieceType.KNIGHT, false);
    private static final Piece BLACK_BISHOP = new Piece(PieceType.BISHOP, false);
    private static final Piece BLACK_ROOK = new Piece(PieceType.ROOK, false);
    private static final Piece BLACK_QUEEN = new Piece(PieceType.QUEEN, false);
    private static final Piece BLACK_KING = new Piece(PieceType.KING, false);

    // BOARD
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

    private static final List<Character> LETTERS = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g' ,'h');

    public List<Character> getLETTERS() {
        return LETTERS;
    }

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

    public void movePiece(int[] positions) {
        for (int i = 0; i < 4; i ++) {
            if (i % 2 != 0) {
                positions[i] *= -1;
                positions[i] += 8;
            }
        }

        board[positions[3]][positions[2]] = board[positions[1]][positions[0]];
        board[positions[1]][positions[0]] = EMPTY;
    }


}
