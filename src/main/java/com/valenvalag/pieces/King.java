package com.valenvalag.pieces;

import com.valenvalag.core.Board;
import com.valenvalag.core.Piece;
import com.valenvalag.core.PieceType;

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
