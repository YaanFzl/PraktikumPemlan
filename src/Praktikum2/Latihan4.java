package Praktikum2;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        System.out.println("Pengecekan tahun kabisat");
        System.out.print("Masukkan tahun yang anda ingin cek: ");
        Scanner inputUser = new Scanner(System.in);
        int tahun = inputUser.nextInt();
        boolean check = Kabisat(tahun);
        Hasil(check, tahun);
    }

    static boolean Kabisat(int a){
        Boolean hasil = (a % 4 == 0) ? true : false;
        return hasil;
    }

    static void Hasil(boolean check, int a){
        if (check == true){
            System.out.println("Tahun " + a + " adalah Tahun Kabisat");
        } else {
            System.out.println("Tahun " + a + " bukan Tahun Kabisat");
        }
    }
}
