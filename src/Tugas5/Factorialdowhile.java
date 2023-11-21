package Tugas5;

import java.util.Scanner;
public class Factorialdowhile {
    public static void main(String[] rren){

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter positive integer:");
        int number = scanner.nextInt();

        long factorial = 1;
        int i = 1;

        do{
            factorial *= i;
            i++;
        } while (i <= number);

        System.out.println("Factorial of"+ number + " is: " + factorial);
    }
}
