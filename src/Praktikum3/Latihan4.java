package Praktikum3;

public class Latihan4 {
    public static void main(String[] args) {
        int total = 0;
        int[][] matriks1 = new int[3][3];
        matriks1[0][0] = 1; matriks1[0][1] = 1; matriks1[0][2] = 2;
        matriks1[1][0] = 2; matriks1[1][1] = 3; matriks1[1][2] = 3;
        matriks1[2][0] = 4; matriks1[2][1] = 4; matriks1[2][2] = 5;
        System.out.println("-------Array 1----------");
        for (int bar = 0; bar < matriks1.length; bar++) {
            for (int kol = 0; kol < matriks1[bar].length; kol++) {
                System.out.format("|%s|", matriks1[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------Array 2----------");;

        int[][] matriks2 = new int[3][3];
        matriks2[0][0] = 1; matriks2[0][1] = 2; matriks2[0][2] = 3;
        matriks2[1][0] = 3; matriks2[1][1] = 5; matriks2[1][2] = 4;
        matriks2[2][0] = 3; matriks2[2][1] = 2; matriks2[2][2] = 1;

        for (int bar = 0; bar < matriks2.length; bar++) {
            for (int kol = 0; kol < matriks2[bar].length; kol++) {
                System.out.format("|%s|", matriks2[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------Array Hasil----------");

        int[][] totalMatriks = new int[3][3];
        System.out.println("Hasil perkalian antara baris dan kolom yang sama");
        for (int kol = 0; kol < totalMatriks.length; kol++) {
            for (int bar = 0; bar < totalMatriks[kol].length; bar++) {
                totalMatriks[kol][bar] = matriks1[kol][bar] * matriks2[kol][bar];
                System.out.format("|%s|", totalMatriks[kol][bar]);
            }
            System.out.println("");
        }
    }
}
