package Sololearn;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        int number = Scanner.nextInt();
        int fact = 1;
        for(int x=1; x<=number; x++){
            fact *= x;
        }
        System.out.println(fact);
    }
}
