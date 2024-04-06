package Praktikum2;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        int panjang = 0, lebar = 0, tinggi = 0, checker = 0;
        do {
            menu();
            System.out.print("Silahkan pilih menu yang ada diatas: ");
            int pilihan = inputUser.nextInt();
            if (pilihan == 1){
                checker = 1;
                System.out.print("Input Nilai Panjang: ");
                panjang = inputUser.nextInt();
                System.out.print("Input Nilai Lebar: ");
                lebar = inputUser.nextInt();
                System.out.print("Input Nilai Tinggi: ");
                tinggi = inputUser.nextInt();

            }else if (pilihan == 5){
                System.out.println("Terima kasih!");
                System.exit(0);
            }

            if (checker == 1){
                if (pilihan == 2) {
                    Pilihan2(panjang, lebar, tinggi);
                } else if (pilihan == 3) {
                    Pilihan3(panjang, lebar, tinggi);
                } else if (pilihan == 4) {
                    Pilihan4(panjang, lebar, tinggi);
                }
            } else {
                System.out.println("Tolong masukkan nilai terlebih dahulu!");
            }
        }while (true);
    }

    static void menu(){
        System.out.println("1. Input Nilai Panjang, Lebar, dan Tinggi");
        System.out.println("2. Hitung Luas Permukaan dan Volume Balok");
        System.out.println("3. Hitung Luas Permukaan dan Volume Prisma Segitiga");
        System.out.println("4. Hitung Luas Permukaan dan Volume Limas Segiempat");
        System.out.println("5. Keluar ");
    }

    static void Pilihan2(int p, int l, int t){
        int lpBalok = 2 * ((p *l) + (p * t) + (l *t));
        System.out.println("Hasil Luas Permukaan Balok: " + lpBalok);
        int volBalok = p * l * t;
        System.out.println("Hasil Volume Balok: " + volBalok);
    }

    static void Pilihan3(int p, int l, int t){
        int d;
        d = (int) Math.sqrt((p * p) + (t * t));
        double lpPrisma = (2 * (0.5 * p * t) + ((d + p + l) * t));
        System.out.println("Hasil Luas Permukaan Balok: " + lpPrisma);
        double volPrisma = ((0.5) * p * t * t);
        System.out.println("Hasil Volume Prisma Segitiga: " + volPrisma);
    }

    static void Pilihan4(int p, int l, int t){
        double lpLimas = ((p * p) + (4 * ((0.5) * p * t)));
        System.out.println("Hasil Luas Permukaan Limas: " + lpLimas);
        double volLimas =  ((0.33) * (p * p) * t);
        System.out.println("Hasil Luas Permukaan Limas: " + volLimas);
    }
}
