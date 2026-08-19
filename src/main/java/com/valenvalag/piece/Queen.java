package com.valenvalag.piece;

import com.valenvalag.core.Board;

public class Queen extends Piece {

    public Queen(boolean white) {
        this.white = white;

        this.type = PieceType.QUEEN;
        this.value = 10;
        this.icon = white ? '♛' : '♕';
    }

    @Override
    public boolean isValidMovement(Board board, int[] positions) {
        return false;
    }

}
