package Tugas5;

import java.util.Scanner;
public class rowofhashfor {
    public static void main(String[] wewe){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int startNumber = scanner.nextInt();

        for (int i = startNumber; i >=0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        scanner.close();
    }
}
