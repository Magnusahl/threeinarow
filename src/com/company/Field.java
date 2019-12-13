package com.company;

public class Field {

    private String[] board;
    //Count steps to determin if the game is draw
    private int counter = 0;

    public Field() {
        board = new String[9];
        board[0] = "_";
        board[1] = "_";
        board[2] = "_";
        board[3] = "_";
        board[4] = "_";
        board[5] = "_";
        board[6] = "_";
        board[7] = "_";
        board[8] = "_";
    }

    public void placeMarker(String marker, int position) {
        board [position] = marker;
        counter++;
    }

    public void print() {
        System.out.print("|"); System.out.print(board[0]); System.out.print("|"); System.out.print(board[1]); System.out.print("|"); System.out.print(board[2]);
        System.out.println("|");
        System.out.print("|"); System.out.print(board[3]); System.out.print("|"); System.out.print(board[4]); System.out.print("|"); System.out.print(board[5]);
        System.out.println("|");
        System.out.print("|"); System.out.print(board[6]); System.out.print("|"); System.out.print(board[7]); System.out.print("|"); System.out.print(board[8]);
        System.out.println("|");
    }

    public boolean available(int posiotion) {
        if (!board[posiotion].equals("_")) {
            return false;
        }
        return true;
    }

    public boolean winner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = board[0] + board[4] + board[8];
                    break;
                case 1:
                    line = board[2] + board[4] + board[6];
                    break;
                case 2:
                    line = board[0] + board[3] + board[6];
                    break;
                case 3:
                    line = board[1] + board[4] + board[7];
                    break;
                case 4:
                    line = board[2] + board[5] + board[8];
                    break;
                case 5:
                    line = board[0] + board[1] + board[2];
                    break;
                case 6:
                    line = board[3] + board[4] + board[5];
                    break;
                case 7:
                    line = board[6] + board[7] + board[8];
                    break;
            }
            if (line.equals("XXX")) {
                System.out.println("Player X Wins!");
                return true;
            }
            else if (line.equals("OOO")) {
                System.out.println("Player O Wins!");
                return true;
            }
            if (counter == 9) {
                System.out.println("It's a Draw!");
                return true;
            }
        }
        return false;
    }
}
