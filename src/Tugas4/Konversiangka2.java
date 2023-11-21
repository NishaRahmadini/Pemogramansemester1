package Tugas4;

import java.util.Scanner;
public class Konversiangka2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai angka: ");
        double nilai = scanner.nextDouble();
        scanner.close();

        char nilaiHuruf;

        if (nilai >= 0 && nilai <= 100) {
            int nilaiBulat = (int) nilai; // Mengonversi nilai angka ke bilangan bulat
            switch (nilaiBulat / 10) {
                case 10:
                case 9:
                    nilaiHuruf = 'A';
                    break;
                case 8:
                    nilaiHuruf = 'B';
                    break;
                case 7:
                    nilaiHuruf = 'C';
                    break;
                case 6:
                    nilaiHuruf = 'D';
                    break;
                default:
                    nilaiHuruf = 'E';
            }
            System.out.println("Nilai huruf: " + nilaiHuruf);
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}
