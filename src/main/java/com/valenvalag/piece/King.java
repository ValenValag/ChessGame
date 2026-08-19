package com.valenvalag.piece;

import com.valenvalag.core.Board;

public class King extends Piece {

    public King(boolean white) {
        this.white = white;

        this.type = PieceType.KING;
        this.value = 12;
        this.icon = white ? '♚' : '♔';
    }

    @Override
    public boolean isValidMovement(Board board, int[] positions) {
        return false;
    }

}
