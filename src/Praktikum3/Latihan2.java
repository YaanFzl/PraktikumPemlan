package Praktikum3;

import java.util.Scanner;

public class Latihan2{
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Panjang array : ");
        int panjangArray = inputUser.nextInt();
        int[] nilai = new int[panjangArray];

        for (int j = 0; j < nilai.length; j++){
            System.out.print("Angka indeks ke-" + j + " : ");
            nilai[j] = inputUser.nextInt();
        }

    int min = Integer.MAX_VALUE;
    int Index = 0;

    for(int i=0; i<nilai.length; i++) {
        if(min > nilai[i])
        {
            min = nilai[i];
            Index = i;
        }
        }
        System.out.print("Nilai minimum pada index ke-" + Index + " dengan nilai " + min);
    }
}