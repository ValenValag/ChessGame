package com.valenvalag.pieces;

import com.valenvalag.core.Board;
import com.valenvalag.core.Piece;
import com.valenvalag.core.PieceType;

public class Rook extends Piece {

    public Rook(boolean white) {
        this.white = white;

        this.type = PieceType.ROOK;
        this.value = 5;
        this.icon = white ? '♜' : '♖';
    }

    @Override
    public boolean isValidMovement(Board board, int[] positions) {
        return false;
    }

}
