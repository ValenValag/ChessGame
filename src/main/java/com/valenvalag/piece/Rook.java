package com.valenvalag.piece;

import com.valenvalag.core.Board;

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
