package com.company;



public class Main {
    public static void main(String[]args) {
        Player p1 = new Player("Player", "X");
        Player p2 = new Player("Player", "O");

        Field field1 = new Field('3','3','1');
        field1.printfield();

        while(true) {
            Game gamea = new Game(1, true);
            gamea.gameRun(p1);
            gamea.gameRun(p2);
        }

    }

}
