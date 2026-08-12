package com.valenvalag.pieces;

import com.valenvalag.core.Board;
import com.valenvalag.core.Piece;
import com.valenvalag.core.PieceType;

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
