package Tugas4;

import java.util.Scanner;
public class Konversiangka1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai angka: ");
        double nilai = scanner.nextDouble();
        scanner.close();

        char nilaiHuruf;

        if (nilai >= 80 && nilai <= 100) {
            nilaiHuruf = 'A';
        } else if (nilai >= 70 && nilai < 80) {
            nilaiHuruf = 'B';
        } else if (nilai >= 60 && nilai < 70) {
            nilaiHuruf = 'C';
        } else if (nilai >= 50 && nilai < 60) {
            nilaiHuruf = 'D';
        } else if (nilai >= 0 && nilai < 50) {
            nilaiHuruf = 'E';
        } else {
            nilaiHuruf = 'T'; // Tanda nilai tidak valid
        }

        System.out.println("Nilai huruf: " + nilaiHuruf);
    }
}
