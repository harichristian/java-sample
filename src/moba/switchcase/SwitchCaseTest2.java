package moba.switchcase;

import java.util.Scanner;

/**
 * Created by hc on 6/4/15.
 */
public class SwitchCaseTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println(" Program menghitung luas");
        System.out.println("==========================");
        System.out.println("1. Luas persegi panjang");
        System.out.println("2. Luas segitiga");
        System.out.println("3. Luas lingkaran");
        System.out.println("");
        System.out.println("ketik angka untuk memilih");
        System.out.print("Pilih luas : ");
        int pilih = input.nextInt();
        System.out.println("==========================");

        switch (pilih) {
            case 1:
                System.out.print("Masukan Panjang : ");
                int d = input.nextInt();
                System.out.print("Masukan Lebar : ");
                int e = input.nextInt();
                int z = d * e;
                System.out.println("");
                System.out.println("==========================");
                System.out.println("Luas Persegi panjang = " + z);
                break;

            case 2:
                System.out.print("Masukan Alas : ");
                double f = input.nextInt();
                System.out.print("Masukan Tinggi : ");
                double g = input.nextInt();
                double y = (f * g) / 2;
                System.out.println("==========================");
                System.out.println("");
                System.out.println("Luas Segitiga = " + y);
                break;

            case 3:
                System.out.print("Masukan jari-jari : ");
                f = input.nextInt();
                y = f * f * 22 / 7;
                System.out.println("");
                System.out.println("==========================");
                System.out.println("Luas Lingkaran = " + y);
                break;

        }
    }
}
