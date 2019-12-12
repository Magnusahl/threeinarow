package com.company;

public class Player {

   private String name;
    private String symbol;

    //Constructor for player
    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }


    public String getSymbol() {
        return symbol;
    }


}
