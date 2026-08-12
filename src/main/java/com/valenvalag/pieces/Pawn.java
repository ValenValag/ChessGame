package com.valenvalag.pieces;

import com.valenvalag.core.Board;
import com.valenvalag.core.Piece;
import com.valenvalag.core.PieceType;

public class Pawn extends Piece {

    public Pawn(boolean white) {
        this.white = white;

        this.type = PieceType.PAWN;
        this.value = 1;
        this.icon = white ? '♟' : '♙';
    }

    @Override
    public boolean isValidMovement(Board board, int[] positions) {
        int direction = this.white ? -1 : 1;
        int fromCol = positions[0];
        int fromRow = positions[1];
        int toCol = positions[2];
        int toRow = positions[3];

        // avanzar una casilla
        if (fromCol == toCol &&
                toRow == fromRow + direction &&
                board.getPiece(toRow, toCol) == null) {

            return true;
        }

        // captura
        if (Math.abs(toCol - fromCol) == 1 &&
                toRow == fromRow + direction &&
                board.getPiece(toRow, toCol) != null &&
                board.getPiece(toRow, toCol).isWhite() != this.white) {

            return true;
        }

        return false;
    }

}
