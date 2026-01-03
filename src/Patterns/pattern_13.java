package Patterns;

import java.util.Scanner;

public class pattern_13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int icj = 1;
            for (int j = 0; j <= i ; j++) {
                System.out.print(icj + "\t");
                int icj1 = icj * (i-j)/(j+1);
                icj = icj1;
            }
            System.out.println();
        }
    }
}
