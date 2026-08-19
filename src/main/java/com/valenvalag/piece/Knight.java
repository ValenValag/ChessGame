package com.valenvalag.piece;

import com.valenvalag.core.Board;

public class Knight extends Piece {

    public Knight(boolean white) {
        this.white = white;

        this.type = PieceType.KNIGHT;
        this.value = 3;
        this.icon = white ? '♞' : '♘';
    }

    @Override
    public boolean isValidMovement(Board board, int[] positions) {
        return false;
    }

}
