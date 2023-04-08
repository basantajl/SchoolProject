package com.mycompany.soal2pakchan;
import java.util.Scanner;
public class TesakademikProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // meminta input nilai tes akademik, tes keterampilan, dan tes psikologi
        System.out.print("Masukkan nilai tes akademik: ");
        double nilaiAkademik = input.nextDouble();
        System.out.print("Masukkan nilai tes keterampilan: ");
        double nilaiKeterampilan = input.nextDouble();
        System.out.print("Masukkan nilai tes psikologi: ");
        double nilaiPsikologi = input.nextDouble();
        
        // menghitung nilai rata-rata ketiga tes
        double rataRata = (nilaiAkademik + nilaiKeterampilan + nilaiPsikologi) / 3.0;
        
        // menentukan status diterima tidaknya berdasarkan nilai rata-rata
        if (rataRata >= 75) {
            // menentukan penempatan berdasarkan nilai tes
            if (nilaiAkademik > nilaiKeterampilan && nilaiAkademik > nilaiPsikologi) {
                System.out.println("Selamat, Anda diterima sebagai karyawan bagian Administrasi!");
            } else if (nilaiKeterampilan > nilaiAkademik && nilaiKeterampilan > nilaiPsikologi) {
                System.out.println("Selamat, Anda diterima sebagai karyawan bagian Produksi!");
            } else {
                System.out.println("Selamat, Anda diterima sebagai karyawan bagian Pemasaran!");
            }
        } else {
            System.out.println("Maaf, Anda belum diterima sebagai karyawan.");
        }
    }
}
    

