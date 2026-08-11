package com.valenvalag.core;

import java.util.List;

public class Piece {

    private final PieceType type;
    private final int value;
    private final boolean white; // 1 = white, 0 = black
    private final Character icon;

    public Character getIcon() {
        return this.icon;
    }

    public PieceType getType() {
        return type;
    }

    private final List<Character> whiteIcons = List.of('♟', '♞', '♝', '♜', '♛', '♚');
    private final List<Character> blackIcons = List.of('♙', '♘', '♗', '♖', '♕', '♔');

    private int getPieceValueFromType() {
        int value = 0;
        switch (this.getType()) {
            case PAWN -> value = 1;
            case KNIGHT -> value = 2;
            case BISHOP -> value = 3;
            case ROOK -> value = 4;
            case QUEEN -> value = 5;
            case KING -> value = 6;
        }

        return value;
    }

    public Piece(PieceType type, boolean white) {
        if (type == null) {
            this.type = type;
            this.icon = '·';
            this.white = true;
            this.value = 0;
            return;
        }

        this.type = type;
        int value = getPieceValueFromType();
        this.white = white;
        int mod = 1;
        if (!this.white) {
            mod = -1;
        }

        this.value = value * mod;

        if (this.white) {
            this.icon = whiteIcons.get(value - 1);
        } else {
            this.icon = blackIcons.get(value - 1);
        }

    }


}
