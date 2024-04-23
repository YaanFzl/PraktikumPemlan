package Praktikum4;

import java.util.ArrayList;
import java.util.Scanner;
public class Latihan1 {
    static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        Scanner inputUser = new Scanner(System.in);
        do { menuPilihan();
            int milihMenu =  inputUser.nextInt();
            switch (milihMenu){
                case 1:
                    tampilkan(data);
                    break;
                case 2:
                    tambah(data);
                    break;
                case 3:
                    edit(data);
                    break;
                case 4:
                    hapus(data);
                    break;
                default:
                    System.exit(0);
            }
        } while (true);
    }

    static void tampilkan(ArrayList data){
        System.out.println(data);
    }
    static ArrayList tambah(ArrayList data) {
        System.out.print("Masukkan data yang ingin ditambahkan: ");
        data.add(inputUser.nextLine());
        return data;
    }
    static ArrayList edit(ArrayList data){
        System.out.print("Masukkan indeks yang ingin diubah: ");
        int ubah = inputUser.nextInt();
        System.out.print("Masukkan perubahan nilai: ");
        inputUser.nextLine();
        String nilaiBaru = inputUser.nextLine();
        data.set(ubah, nilaiBaru);
        return data;
    }

    static ArrayList hapus(ArrayList data){
        System.out.println("Indeks ke berapa yang ingin anda hapus?");
         data.remove(inputUser.nextInt());
         return data;
    }

    static void menuPilihan(){
        System.out.println("1. Tampilkan data");
        System.out.println("2. Tambahkan data");
        System.out.println("3. Edit data");
        System.out.println("4. Hapus data");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
    }
}