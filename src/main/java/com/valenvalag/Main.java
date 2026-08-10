package com.valenvalag;

import com.valenvalag.core.Board;
import com.valenvalag.core.TurnManager;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Board board = new Board();

    private static final TurnManager turnManager = new TurnManager(board, scanner);

    static void main() {

        turnManager.loop();

    }



}
