package com.valenvalag.piece;

import com.valenvalag.core.Board;

public class Bishop extends Piece {

    public Bishop(boolean white) {
        this.white = white;

        this.type = PieceType.BISHOP;
        this.value = 3;
        this.icon = white ? '♝' : '♗';
    }

    @Override
    public boolean isValidMovement(Board board, int[] positions) {
        return false;
    }

}
