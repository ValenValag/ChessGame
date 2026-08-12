package com.valenvalag.core;

import java.util.List;

public abstract class Piece {

    protected PieceType type;
    protected int value;
    protected boolean white; // 1 = white, 0 = black
    protected Character icon;

    public Character getIcon() {
        return this.icon;
    }

    public PieceType getType() {
        return type;
    }

    public boolean isWhite() {
        return white;
    }

    public abstract boolean isValidMovement(Board board, int[] positions);

}
