package Praktikum2;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        int a, b;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai 1: ");
        a = inputUser.nextInt();
        System.out.print("Masukkan nilai 2: ");
        b = inputUser.nextInt();

        int nilaiFPB = FPB(a, b);
        int nilaiKPK = KPK(a, b);

        printNilaiFPB(nilaiFPB, a, b);
        printNilaiKPK(nilaiKPK, a, b);
    }

    static void printNilaiFPB(int x, int a, int b){
        System.out.println("Hasil dari FPB bilangan " + a + " dan " + b + " adalah: " + x);
    }

    static void printNilaiKPK(int x, int a, int b){
        System.out.println("Hasil dari KPK bilangan " + a + " dan " + b + " adalah: " + x);
    }


    public static int KPK(int nilai1, int nilai2) {
        int kpk = (nilai1 > nilai2) ? nilai1 : nilai2;
        while (true) {
            if (kpk % nilai1 == 0 && kpk % nilai2 == 0) {
                return kpk;
            }
            ++kpk;
        }
    }

    public static int FPB(int nilai1, int nilai2){
            int r;
            r = nilai2 % nilai1;

            while (r != 0) {
                nilai1 = nilai2;
                nilai2 = r;
                r = nilai1 % nilai2;
            }
            return nilai2;
        }
    }