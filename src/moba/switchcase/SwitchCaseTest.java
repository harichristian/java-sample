package moba.switchcase;

import java.util.Scanner;

/**
 * Created by hc on 6/4/15.
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Menu :");

            System.out.println("[1]. Red");

            System.out.println("[2]. Blue ");

            System.out.println("[3]. Yellow");

            System.out.println("[4]. Green");

            System.out.println("[5]. Exit");

            System.out.print("Masukkan Pilihan anda : ");

            int opsi = input.nextInt();

            System.out.println("-----------------------");

            switch (opsi)

            {

                case 1:
                    System.out.println("Anda memilih merah");

                    break;

                case 2:
                    System.out.println("Anda memilih biru");

                    break;

                case 3:
                    System.out.println("Anda memilih kuning");

                    break;

                case 4:
                    System.out.println("Anda memilih hijau");

                    break;

                case 5:
                    System.out.println("Anda memilih keluar.. bye");

                    System.exit(0);

                    break;

                default:
                    System.out.println("Maaf .. pilihan Anda tidak ada");

                    break;

            }

            System.out.println("-----------------------");

        }


    }
}

