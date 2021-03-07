package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] userArray = new int[10][4];
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length; j++){
                if(i > 5){
                    break;
                }
                userArray[i][j] = 55;
                userArray[2][3] = 250;
                if( i < 5){
                    if(userArray[i][j] == userArray[2][3]){
                        userArray[2][3] = 2;
                    }
                    System.out.print(userArray[i][j] + "   ");
                }









            }
        }


    }




}
