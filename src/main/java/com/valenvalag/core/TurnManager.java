package com.valenvalag.core;

import java.util.List;
import java.util.Scanner;

public class TurnManager {
    private final Board board;
    private final Scanner scanner;
    private int turn;
    private boolean whitesTurn;
    private boolean gameRunning;
    private List<Character> LETTERS;
    public TurnManager(Board board, Scanner scanner) {
        this.board = board;
        this.scanner = scanner;
        this.turn = 0;
        this.whitesTurn = true;
        this.gameRunning = true;
        this.LETTERS = this.board.getLETTERS();
    }

    public int loop () {
        while (gameRunning) {
            nextTurn();
        }


        return 0;
    }

    private boolean checkMovement(String[] movement) {
        if (movement.length < 2) {
            System.out.println("\nWrong format! Use:e2 e4");
            return false;
        }

        return true;
    }

    private String[] askMovement() {
        String turnColor = "white";
        if (!whitesTurn) { turnColor = "black"; }

        System.out.print("\nEnter next movement for "+ turnColor +": ");
        String action = scanner.nextLine();

        String[] movement = action.split(" ");

        if (!checkMovement(movement)) {
            askMovement();
        }

        return movement;
    }

    private int[] formatMovement(String[] movement) {
        int[] positions = new int[4];

        String from = movement[0];
        String to = movement[1];

        positions[0] = LETTERS.indexOf(from.charAt(0));
        positions[1] = from.charAt(1) - '0';
        positions[2] = LETTERS.indexOf(to.charAt(0));
        positions[3] = to.charAt(1) - '0';

        return positions;
    }

    private void nextTurn() {
        board.showBoard();

        if (turn % 2 == 0) whitesTurn = true;
        else whitesTurn = false;

        String[] movement = askMovement();

        int[] positions = formatMovement(movement);

        board.movePiece(positions);

        turn ++;
    }

}
