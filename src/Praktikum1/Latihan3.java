package Praktikum1;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int nilaiTertinggi = Integer.MAX_VALUE;
        int nilaiTerendah = Integer.MIN_VALUE;
        int nilaiUser, rataRata = 0, counter = 0, hasil = 0;
        boolean kondisi = true;
        do {
            System.out.print("Masukkan nilai anda: ");
            nilaiUser = inputUser.nextInt();
            if (nilaiUser < nilaiTertinggi) nilaiTertinggi = nilaiUser;
            else if (nilaiUser > nilaiTerendah) nilaiTerendah = nilaiUser;
            rataRata += nilaiUser;
            counter++;
            hasil = rataRata/counter;

            for (int i = 1; i == 1;){
                System.out.println("Mau lanjut input nilai? (y/n)");
                inputUser.nextLine();
                String check = inputUser.nextLine();
                if (check.toLowerCase().equals("y")){
                    i = 0;
                    kondisi = true;
                }
                else if (check.toLowerCase().equals("n")){
                    i = 0;
                    kondisi = false;
                } else {
                    System.out.println("Tolong masukkan input yang benar");
                    i = 1;
                }
            }
        }while (kondisi);

        System.out.println("Nilai tertinggi anda: " + nilaiTerendah);
        System.out.println("Nilai terendah anda: " + nilaiTertinggi);
        System.out.println("Nilai rata-rata anda: " + hasil);
    }
}