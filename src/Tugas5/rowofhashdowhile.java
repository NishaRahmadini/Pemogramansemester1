package Tugas5;

import java.util.Scanner;
public class rowofhashdowhile {
    public static void main(String[] erer){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to star: ");
        int startNumber = scanner.nextInt();

        do{
            for (int i = startNumber; i >= 0; i--){
                System.out.print("#");
            }
            System.out.println();
            startNumber--;
        } while (startNumber >= 0);

        scanner.close();
    }
}
