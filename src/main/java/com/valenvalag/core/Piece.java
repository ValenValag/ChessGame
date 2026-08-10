package com.valenvalag.core;

import java.util.List;

public class Piece {

    private final int value;
    private final boolean white; // 1 = white, 0 = black
    private final Character icon;

    public Character getIcon() {
        return this.icon;
    }


    private final List<Character> whiteIcons = List.of('♟', '♞', '♝', '♜', '♛', '♚');
    private final List<Character> blackIcons = List.of('♙', '♘', '♗', '♖', '♕', '♔');

    public Piece(int value, boolean white) {
        if (value == 0) {
            this.icon = '·';
            this.white = true;
            this.value = value;
            return;
        }

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
