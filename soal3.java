/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan3;
/**
 *
 * @author UTRIA
 */
import java.util.Scanner;
public class soal3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jam masuk (1-12): ");
        int jamMasuk = input.nextInt();
         while (jamMasuk < 1 || jamMasuk > 12) {
            System.out.println("Jam masuk tidak valid. Harap masukkan antara 1 hingga 12.");
            System.out.print("Masukkan jam masuk (1-12): ");
            jamMasuk = input.nextInt();
        }
        System.out.print("Masukkan jam keluar (1-12): ");
        int jamKeluar = input.nextInt();
         while (jamKeluar < 1 || jamKeluar > 12) {
            System.out.println("Jam keluar tidak valid. Harap masukkan antara 1 hingga 12.");
            System.out.print("Masukkan jam keluar (1-12): ");
            jamKeluar = input.nextInt();
        }
        int lamaBekerja;
          if (jamKeluar >= jamMasuk) {
            lamaBekerja = jamKeluar - jamMasuk;
        } else {
            lamaBekerja = (12 - jamMasuk) + jamKeluar;
        }
        System.out.println("Lama Bekerja: " + lamaBekerja + "jam");
        input.close();
    }
}
