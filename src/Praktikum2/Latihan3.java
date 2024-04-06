package Praktikum2;

import java.util.Scanner;

public class Latihan3 {
        public static void main(String[] args) {
            int batas = Inputan();
            System.out.println("Berikut bilangan fibonacci hinga mencapai batas: " + batas);
            Fibonacci(batas);
        }

        static void Fibonacci(int batas){
            int  a = 0, b = 1;
            for (int i = 1; i <= batas; ++i) {
                if (a <= batas){
                    System.out.print(a + "   ");
                }
                int ab = a + b;
                a = b;
                b = ab;
            }
        }
        static int Inputan(){
            Scanner inputUser = new Scanner(System.in);
            System.out.print("Masukkan batas bilangan fibonacci: ");
            int batas = inputUser.nextInt();
            return batas;
        }
    }