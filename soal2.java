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
public class soal2 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi pertama:");
        double ss = masukan.nextDouble();
        System.out.println("Masukkan panjang sisi kedua:");
        double sd = masukan.nextDouble();
        System.out.println("Masukkan panjang sisi ketiga:");
        double st = masukan.nextDouble();

        if (ss == sd && sd == st) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
