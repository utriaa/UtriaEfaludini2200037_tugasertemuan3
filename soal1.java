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
public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tiga huruf  : ");
        String inputhuruf = input.nextLine().toLowerCase();
        
        if(inputhuruf.length() != 3){
            System.out.println("Masukan harus terdiri dari 3 huruf. ");
            return;
        }
        char huruf1 = konsonan(inputhuruf.charAt(0));
        char huruf2 = vokal(inputhuruf.charAt(1));
        char huruf3 = konsonan(inputhuruf.charAt(2));
        
        if (huruf1 == 'C' && huruf2 == 'V' && huruf3 == 'C' ) {
            System.out.println("Urutan konsonan-vokal-konsonan terpenuhi.");
        } else {
            System.out.println("Urutan konsonan-vokal-konsonan tidak terpenuhi.");
        }
    }   
    public static char konsonan(char ch) {
        String konsonan = "bcdfghjklmnpqrstvwxyz";
        return konsonan.indexOf(Character.toLowerCase(ch)) != -1 ? 'C' : 'V';
    } 
    public static char vokal(char ch){
        String vokal = "aeiou";
        return vokal.indexOf(Character.toLowerCase(ch)) != -1 ? 'V' : 'C';
    }
}
