package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Player p1 = new Player("Player", "X");
        Player p2 = new Player("Player", "O");

        System.out.println("Tre i rad");
        System.out.println("\nVälj en siffra mellan 0-8\n");

        Field field = new Field();
        field.print();

        boolean winner = false;
        while (winner == false) {

            //Player X
            System.out.println(p1.getName() + " " + p1.getSymbol() + " Välj en siffra: ");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();

            if(field.available(choice)) {
                field.placeMarker(p1.getSymbol(), choice);
            }
            else if (field.available(choice) == false) {
                System.out.println("Position is taken!");
                System.out.println(p1.getName() + " " + p1.getSymbol() + " Sista chansen! Välj en siffra: ");
                choice = scan.nextInt();
            }

            winner = field.winner();
            field.print();

            if (winner == true) {
                break;
            }

            //Player O
            System.out.println(p2.getName() + " " + p2.getSymbol() + " Välj en siffra: ");
            choice = scan.nextInt();

            if(field.available(choice)) {
                field.placeMarker(p2.getSymbol(), choice);
            }
            else if(field.available(choice) == false) {
                System.out.println("Position is taken!");
                System.out.println(p2.getName() + " " + p2.getSymbol() + " Sista chansen! Välj en siffra: ");
                choice = scan.nextInt();
                //field.placeMarker(p2.getSymbol(), choice);
            }

            winner = field.winner();
            field.print();

        }

    }

}
