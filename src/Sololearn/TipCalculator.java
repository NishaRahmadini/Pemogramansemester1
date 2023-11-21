package Sololearn;

import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args){
        //your code goes here
        Scanner Scanner = new Scanner(System.in);
        double bill = Scanner.nextDouble();
        double tip =bill*0.15; //15% of the bill
        System.out.println(tip);
    }
}
