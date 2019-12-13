package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create two players
        Player X = new Player("Player", "X");
        Player O = new Player("Player", "O");

        //Creates a loop for the game
        while (true) {
            System.out.println("New Game Started!");
            System.out.println("XOXO Three in a row XOXO");
            System.out.println("Choose a number between 0-8.");

            //Create a new field = board to play on for the players
            Field field = new Field();
            field.print();

            //
            boolean winner = false;
            //As long as no player have win go thourgh the loop
            while (winner == false) {
                //Player X
                System.out.println("\n" + X.getName() + " " + X.getSymbol() + " Choose a number: ");
                boolean correctChoice = false;
                while (correctChoice == false) {
                    Scanner scan = new Scanner(System.in);
                    int choice = scan.nextInt();
                    //Check if the position in the field is avaiable
                    if (field.available(choice)) {
                        field.checkSymbol(X.getSymbol(), choice);
                        correctChoice = true;
                    } else if (field.available(choice) == false) {
                        System.out.println("Position is taken!");
                        System.out.println(X.getName() + " " + X.getSymbol() + " Choose a new number: ");
                    }
                    winner = field.winner();
                }
                field.print();
                //Stop the loop when player X wins
                if (winner == true) {
                    break;
                }
                //Player O
                System.out.println(O.getName() + " " + O.getSymbol() + " Choose a number: ");
                boolean correctChoice1 = false;
                while (correctChoice1 == false) {
                    Scanner scan = new Scanner(System.in);
                    int choice = scan.nextInt();

                    if (field.available(choice)) {
                        field.checkSymbol(O.getSymbol(), choice);
                        correctChoice1 = true;
                    } else if (field.available(choice) == false) {
                        System.out.println("Position is taken!");
                        System.out.println(O.getName() + " " + O.getSymbol() + " Choose a new number: ");
                    }
                    //if player O wins return the message in the boolean winner
                    winner = field.winner();
                }
                field.print();
                //Stop the loop when player O wins
                if (winner == true) {
                    break;
                }
            }
            System.out.println("Game ended!\n");
        }
    }
}
