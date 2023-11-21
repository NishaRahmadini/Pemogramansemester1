package Tugas3;

import java.util.Scanner;
public class interval {
    public static void main(String[] rreen){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka = ");
        int n = scanner.nextInt();

        System.out.println("Minimum = ");
        int minVal = scanner.nextInt();

        System.out.println("Maximum = ");
        int maxVal = scanner.nextInt();

        System.out.println("Interval = ");
        int interval = scanner.nextInt();

        if (maxVal - minVal < interval){
            System.out.println("Invalid interval");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++){
                sum += minVal;
                minVal += interval;
            }
            System.out.println("Sum = " + sum);
        }
    }
}
