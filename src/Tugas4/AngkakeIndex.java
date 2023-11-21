package Tugas4;

import java.util.Scanner;
public class AngkakeIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (0-100): ");
        int angka = input.nextInt();

        if (angka >= 0 && angka <= 100) {
            double nilaiIndeks;

            if (angka >= 80) {
                nilaiIndeks = 4.0;
            } else if (angka >= 70) {
                nilaiIndeks = 3.0;
            } else if (angka >= 60) {
                nilaiIndeks = 2.0;
            } else if (angka >= 50) {
                nilaiIndeks = 1.0;
            } else {
                nilaiIndeks = 0.0;
            }

            System.out.println("Nilai Indeks: "+ nilaiIndeks);
        } else {
            System.out.println("Angka tidak valid. Harap masukkan angka 0-100.");
        }

        input.close();
    }
}
