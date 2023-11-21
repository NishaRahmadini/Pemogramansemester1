package Tugas5;

import java.util.Scanner;
public class Factorialfor {
    public static void main(String[] rren){

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter positive integer:");
        int number = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= number; i++){

            factorial *= i;
        }

        System.out.println("Factorial of"+ number + " is: " + factorial);
    }
}
