package Sololearn;

import java.util.Scanner;
public class BoilingWater {
    public static void main(String[] args){
        //your code goes here
        Scanner sc = new Scanner(System.in);
        int temperatureCelcius = sc.nextInt();

        if (temperatureCelcius >= 100){
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
        }
    }
}
