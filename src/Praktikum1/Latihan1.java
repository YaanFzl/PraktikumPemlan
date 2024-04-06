import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Batas Perkalian: ");
        int n = inputUser.nextInt();

        System.out.println();
        System.out.print("X |");
        for (int a = 1; a <= n; a++) {
            System.out.printf("  %d", a);
        }
        System.out.println();

        for (int i = 0; i < n * 4 + 3; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int b = 1; b <= n; b++) {
            System.out.printf("%d |", b);
            for (int c = 1; c <= n; c++) {
                System.out.printf("  %d", b * c);
            }
            System.out.println();
        }

        for (int i = 0; i < n * 4 + 3; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}