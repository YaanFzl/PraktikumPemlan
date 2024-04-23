package Praktikum4;
import java.util.ArrayList;
import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Program penghitungan gaji");
        System.out.print("Masukkan berapa karyawan yang ingin dihitung: ");
        int jumlah = inputUser.nextInt();
        ArrayList<String> namaKaryawan = new ArrayList<>(jumlah);
        ArrayList<String> golonganKaryawan = new ArrayList<>(jumlah);
        ArrayList<Integer> jamKerjaKaryawan = new ArrayList<>(jumlah);

        for (int i = 1; i <= jumlah; i++){
            inputUser.nextLine();
            System.out.print("Masukkan nama karyawan anda: ");
            namaKaryawan.add(inputUser.nextLine());
            System.out.print("Masukkan golongannya (A/B/C/D/E): ");
            golonganKaryawan.add(inputUser.next());
            System.out.print("Berapa jam karyawan ini telah bekerja: ");
            jamKerjaKaryawan.add(inputUser.nextInt());
        }

        System.out.println("------------------------------------------------------------------");
        System.out.printf("| %-20s | %-10s | %-20s | %-15s |\n", "Nama", "Golongan", "Jam Kerja", "Total Gaji");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < jumlah; i++) {
            String nama = namaKaryawan.get(i);
            String golongan = golonganKaryawan.get(i);
            int jamKerja = jamKerjaKaryawan.get(i);
            int golonganValue = penggolonganKaryawan(golongan);
            int totalGaji = jamKerja * golonganValue;
            System.out.printf("| %-20s | %-10s | %-20d | %-15d |\n", nama, golongan, jamKerja, totalGaji);
        }
        System.out.println("------------------------------------------------------------------");

    }

    static int penggolonganKaryawan(String a){
        int gaji = 0;
        switch (a){
            case "A":
                gaji = 5000;
                break;
            case "B":
                gaji = 4000;
                break;
            case "C":
                gaji = 3000;
                break;
            case "D":
                gaji = 2000;
                break;
            case "E":
                gaji = 1000;
                break;
        }
        return gaji;
    }
}