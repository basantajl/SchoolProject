package com.mycompany.sola1pakchan;

import java.util.Scanner;

public class MenentukanUangpecahan {
  
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uang, ratusanribu, limaplhribu, dua_puluh_ribu, sepuluh_ribu, lima_ribu, dua_ribu, seribu;

        System.out.print("Masukkan jumlah uang dalam rupiah: ");
        uang = input.nextInt();

        ratusanribu = uang / 100000;
        uang %= 100000;
        limaplhribu = uang / 50000;
        uang %= 50000;
        dua_puluh_ribu = uang / 20000;
        uang %= 20000;
        sepuluh_ribu = uang / 10000;
        uang %= 10000;
        lima_ribu = uang / 5000;
        uang %= 5000;
        dua_ribu = uang / 2000;
        uang %= 2000;
        seribu = uang / 1000;

        if (ratusanribu > 0) {
            System.out.println(ratusanribu + " Lembar 100000");
        }
        if (limaplhribu > 0) {
            System.out.println(limaplhribu + " Lembar 50000");
        }
        if (dua_puluh_ribu > 0) {
            System.out.println(dua_puluh_ribu + " Lembar 20000");
        }
        if (sepuluh_ribu > 0) {
            System.out.println(sepuluh_ribu + " Lembar 10000");
        }
        if (lima_ribu > 0) {
            System.out.println(lima_ribu + " Lembar 5000");
        }
        if (dua_ribu > 0) {
            System.out.println(dua_ribu + " Lembar 2000");
        }
        if (seribu > 0) {
            System.out.println(seribu + " Lembar 1000");
        }
   }
}

