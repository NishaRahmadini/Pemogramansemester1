package Tugas7;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] dataArray = new int[6];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan 6 data:");

        for (int i = 0; i < dataArray.length; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            dataArray[i] = scanner.nextInt();
        }

        System.out.println("\nData dan Jenis:");

        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + " ");

            if (dataArray[i] % 2 == 0) {
                System.out.println("(Genap)");
            } else {
                System.out.println("(Ganjil)");
            }
        }

        int totalSemua = 0;

        for (int data : dataArray) {
            totalSemua += data;
        }

        double rataRata = (double) totalSemua / dataArray.length;

        System.out.println("\nTotal Semua: " + totalSemua);
        System.out.println("Rata-rata: " + rataRata);
    }
}
