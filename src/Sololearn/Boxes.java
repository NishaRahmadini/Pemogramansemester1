package Sololearn;

import java.util.Scanner;
public class Boxes {
    public static void main(String[] args){
        //your code goes here
        Scanner Scanner = new Scanner(System.in);
        String color = Scanner.nextLine();

        int boxNumber;

        switch (color){
            case "red":
                boxNumber = 1;
                break;
            case "green":
                boxNumber = 2;
                break;
            case "black":
                boxNumber = 3;
                break;
            default:
                boxNumber = -1; //hadle unknown colors

                break;
        }
        if (boxNumber !=-1){
            System.out.println(boxNumber);
        } else {
            System.out.println(" Unknown color");
        }
    }
}
