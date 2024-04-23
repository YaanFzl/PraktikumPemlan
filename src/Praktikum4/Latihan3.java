package Praktikum4;

import java.util.ArrayList;
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        ArrayList<Integer> dataAngka = new ArrayList();
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan 10 angka ke dalam array");
        for (int i= 0; i < 10; i++){
            dataAngka.add(inputUser.nextInt());
        }
        System.out.println("Bilangan berapa yang ingin anda tinjau kembali?");
        int x = inputUser.nextInt();
        boolean valid = dataAngka.contains(x);
        if (valid){
            check(dataAngka, x);
        } else {
            System.out.println("Bilangan " + x + " tidak ditemukan dalam data");
        }
    }
    static void check(ArrayList<Integer> data, int angka){
        int a = 0;
        for (int i = 0; i < data.size(); i++){
            if (data.get(i) == angka){
                a++;
            }
        }
        System.out.println("Jumlah bilangan " + angka + " yang ada di dalam " +
                "data adalah sebanyak " + a + " buah");
    }
}