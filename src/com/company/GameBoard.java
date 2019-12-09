package com.company;

public class GameBoard {

    public void arrNew() {
        int[][] arrInt = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] arrNew = new int[2][];
        //Create two arrays
        arrNew[0] = new int[3];
        arrNew[1] = new int[3];

        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                System.out.print(arrInt[i][j] + " ");
            }
            System.out.println("");
        }
    }


}
