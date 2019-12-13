package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Player", "X");
        Player p2 = new Player("Player", "O");

        while (true) {
            System.out.println("New Game Started!");
            System.out.println("XOXO Three in a row XOXO");
            System.out.println("Choose a number between 0-8.");

            Field field = new Field();
            //System.out.println("\n");
            field.print();

            boolean winner = false;
            while (winner == false) {
                //Player X
                System.out.println("\n" + p1.getName() + " " + p1.getSymbol() + " Choose a number: ");
                boolean correctChoice = false;
                while (correctChoice == false) {
                    Scanner scan = new Scanner(System.in);
                    int choice = scan.nextInt();

                    if (field.available(choice)) {
                        field.placeMarker(p1.getSymbol(), choice);
                        correctChoice = true;
                    } else if (field.available(choice) == false) {
                        System.out.println("Position is taken!");
                        System.out.println(p1.getName() + " " + p1.getSymbol() + " Choose a new number: ");
                    }
                    winner = field.winner();
                }
                field.print();

                if (winner == true) {
                    break;
                }
                //Player O
                System.out.println(p2.getName() + " " + p2.getSymbol() + " Choose a number: ");
                boolean correctChoice1 = false;
                while (correctChoice1 == false) {
                    Scanner scan = new Scanner(System.in);
                    int choice = scan.nextInt();

                    if (field.available(choice)) {
                        field.placeMarker(p2.getSymbol(), choice);
                        correctChoice1 = true;
                    } else if (field.available(choice) == false) {
                        System.out.println("Position is taken!");
                        System.out.println(p2.getName() + " " + p2.getSymbol() + " Choose a new number: ");
                    }
                    winner = field.winner();
                }
                field.print();

                if (winner == true) {
                    break;
                }
            }

            System.out.println("Game ended!\n");
        }




    }
}
