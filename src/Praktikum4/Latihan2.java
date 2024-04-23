package Praktikum4;

import java.util.ArrayList;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa: ");
        int jumlah = inputUser.nextInt();
        ArrayList<String> namaMhs = new ArrayList<>(jumlah);
        ArrayList<Integer> matkul1 = new ArrayList<>(jumlah);
        ArrayList<Integer> matkul2 = new ArrayList<>(jumlah);
        ArrayList<Integer> matkul3 = new ArrayList<>(jumlah);

        for (int i = 0; i < jumlah; i++) {
            inputUser.nextLine();
            System.out.print("Masukkan nama mahasiswa " + (i + 1) + " :");
            namaMhs.add(inputUser.nextLine());
            System.out.print("Nilai mata kuliah 1: ");
            matkul1.add(inputUser.nextInt());
            System.out.print("Nilai mata kuliah 2: ");
            matkul2.add(inputUser.nextInt());
            System.out.print("Nilai mata kuliah 3: ");
            matkul3.add(inputUser.nextInt());
        }
            System.out.println("------------------------------------------------------------------");
            System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |\n", "Nama", "Matkul 1", "Matkul 2", "Matkul 3", "Rata-rata");
            System.out.println("------------------------------------------------------------------");
            for (int i = 0; i < jumlah; i++) {
                String nama = namaMhs.get(i);
                int matakul1 = matkul1.get(i);
                int matakul2 = matkul2.get(i);
                int matakul3 = matkul3.get(i);
                double rataRata = (double) (matakul1 + matakul2 + matakul3) / 3;
                System.out.printf("| %-15s | %-10s | %-10d | %-10d | %-10f |\n", nama, matakul1, matakul2, matakul3, rataRata);
            }
            System.out.println("------------------------------------------------------------------");
    }
}