package Praktikum3;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int panjangArray = inputUser.nextInt();

        System.out.print("Masukkan kelipatan: ");
        int kelipatan = inputUser.nextInt();

        int[] array = new int[panjangArray];
        for (int i = 0; i < panjangArray; i++) {
            array[i] = kelipatan * (i + 1);
        }

        int total = 0;
        for (int hasil : array) {
            total += hasil;
        }

        System.out.println("Data array:");
        for (int i = 0; i < panjangArray; i++) {
                System.out.println("Kelipatan " + kelipatan + " ke-" + (i + 1)
                        + " : " + array[i]);
        }
        System.out.println("\nTotal jumlah array: " + total);
        }
}