package Tugas5;

import java.util.Scanner;
public class rowofhashwhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to start from: ");
        int startNumber = scanner.nextInt();

        while (startNumber >= 0) {
            for (int i = startNumber; i >= 0; i--) {
                System.out.print("#");
            }
            System.out.println();
            startNumber--;
        }

        scanner.close();
    }
}
