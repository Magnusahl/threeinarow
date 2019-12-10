package com.company;

public class Field {

    int size;
    int rows;
    char number;

    private String [][] player = new String[3][3];

    public Field(int size, int rows, char number) {
        player[0][0] = "1";
        player[0][1] = "2";
        player[0][2] = "3";
        player[1][0] = "4";
        player[1][1] = "5";
        player[1][2] = "6";
        player[2][0] = "7";
        player[2][1] = "8";
        player[2][2] = "9";
    }

    public void clearField() {
        for( int col=0;col<3;col++){
            for( int row=0;row<3;row++){
                player[col][row] =" ";
            }
        }
    }

    public void printfield() {
        System.out.println("-------");
        for( int col=0;col<3;col++){
            System.out.print("|");
            for( int row=0;row<3;row++){
                System.out.print(player[col][row] +"|");
            }
            System.out.println();
            System.out.println("-------");
        }
        clearField();
    }



    /*public Field (int size, int rows,char number){
        this.size=size;
        this.rows=rows;
        this.number=number;
    }
    public int getSize() {
        return size;
    }

    public int getRows() {
        return rows;
    }

    public int getNumber() {
        return number;
    } */







}
