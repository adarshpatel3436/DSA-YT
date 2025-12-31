package Patterns;

import java.util.Scanner;

public class pattern_04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int st = n;
        int sp = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            sp++;
            st--;
            System.out.println();
        }
    }
}
