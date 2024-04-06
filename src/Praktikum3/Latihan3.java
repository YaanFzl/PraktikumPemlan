package Praktikum3;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Panjang baris dan kolom: ");
        int total = 0;
        int panjangMatriks = inputUser.nextInt();
        int[][] matriks = new int[panjangMatriks][panjangMatriks];
        for (int bar = 0; bar < matriks.length; bar++) {
            for (int kol = 0; kol < matriks[bar].length; kol++) {
                System.out.format("Angka pada baris-" + bar + " kolom-" + kol + " : ");
                matriks[bar][kol] = inputUser.nextInt();
                if(bar == kol){
                    total += matriks[bar][kol];
                }
            }
        }

        System.out.println("-------------------------");
        for (int bar = 0; bar < matriks.length; bar++) {
            for (int kol = 0; kol < matriks[bar].length; kol++) {
                System.out.format("|%s|", matriks[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("Jumlah diagonal: " + total);
        System.out.println("-------------------------");
    }
}