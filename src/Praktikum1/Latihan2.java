package Praktikum1;

import java.util.Scanner;

public class Latihan2 {
        public static void main(String[] args) {
            System.out.print("Masukkan bilangan = ");
            Scanner inputUser =  new Scanner(System.in);
            int i, j, k, n = inputUser.nextInt();

            for (i = 1; i <= n; i++) {
                for (j = 1; j < i; j++) {
                  System.out.print(' ');
                }

                for (k = i; k <= n; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (i = n - 1; i >= 1; i--) {
                for (j = 1; j < i; j++) {
                    System.out.print(' ');
                }
                for (k = i; k <= n; k++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
