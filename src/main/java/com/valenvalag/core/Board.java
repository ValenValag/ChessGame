package com.valenvalag.core;

import com.valenvalag.pieces.*;

import java.util.List;

public class Board {
    private static final Piece EMPTY = null;

    private static final Piece WHITE_PAWN = new Pawn(true);
    private static final Piece WHITE_KNIGHT = new Knight(true);
    private static final Piece WHITE_BISHOP = new Bishop(true);
    private static final Piece WHITE_ROOK = new Rook(true);
    private static final Piece WHITE_QUEEN = new Queen(true);
    private static final Piece WHITE_KING = new King(true);

    private static final Piece BLACK_PAWN = new Pawn(false);
    private static final Piece BLACK_KNIGHT = new Knight(false);
    private static final Piece BLACK_BISHOP = new Bishop(false);
    private static final Piece BLACK_ROOK = new Rook(false);
    private static final Piece BLACK_QUEEN = new Queen(false);
    private static final Piece BLACK_KING = new King(false);

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
                System.out.print((board[i][j] == null ? "·" : board[i][j].getIcon()) + "\t");
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

    public boolean movePiece(int[] positions) {
        for (int i = 0; i < 4; i ++) {
            if (i % 2 != 0) {
                positions[i] *= -1;
                positions[i] += 8;
            }
        }

        Piece piece = board[positions[1]][positions[0]];
        if (!piece.isValidMovement(this, positions)) {
            System.out.println("Wrong movement!");
            return false;
        }

        board[positions[3]][positions[2]] = piece;
        board[positions[1]][positions[0]] = EMPTY;
        return true;
    }

    public Piece getPiece(int row, int col) {
        return board[col][row];
    }

}
