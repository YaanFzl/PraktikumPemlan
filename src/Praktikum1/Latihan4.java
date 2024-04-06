package Praktikum1;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan angka pertama anda: ");
        int angka1 = inputUser.nextInt();
        System.out.print("Masukkan angka kedua anda: ");
        int angka2 = inputUser.nextInt();
        int i = angka1;
        while (i <= angka2){
            if (i < 0 && i % 2 == 0){
                System.out.println(i + " Negatif" + " Genap");
            } else if (i < 0) {
                System.out.println(i + " Negatif" + " Ganjil");
            } else if (i % 2 == 0) {
                System.out.println(i + " Genap");
            } else {
                System.out.println(i + " Ganjil");
            }
            i++;
        }
    }
}
