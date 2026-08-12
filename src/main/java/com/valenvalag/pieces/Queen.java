package com.valenvalag.pieces;

import com.valenvalag.core.Board;
import com.valenvalag.core.Piece;
import com.valenvalag.core.PieceType;

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
