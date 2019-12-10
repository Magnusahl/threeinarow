package com.company;

import java.util.Scanner;

public class Game {

    private int inputvalue;
    private boolean available;

    public Game(int inputvalue, boolean available) {
        this.inputvalue = inputvalue;
        this.available = available;
    }

    public int getInputvalue() {
        return inputvalue;
    }

    public boolean isAvailable() {
        return available;
    }

    public void gameRun (Player name) {
        int choice = 0;

        System.out.println(name.getName() + name.getSymbol() + "Välj en siffra: ");
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        Field field1 = new Field('3','3','1');
        field1.printfield();

        if(getInputvalue() == 1) {
            field1.player[0][0] = name.getSymbol();
        }
    }
}
