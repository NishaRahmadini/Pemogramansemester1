package Tugas3;

public class volum {
    public static void main(String[] erer){
        int luas = 12;
        int tinggi = 10;
        int panjang = 15;
        int volume = panjang * luas * tinggi;
        int luaspermukaan = 2 * (panjang * luas) + (panjang * tinggi) + (luas * tinggi);

        System.out.println("Volume = "+volume);
        System.out.println("Luaspermukaan = "+luaspermukaan);
    }
}
