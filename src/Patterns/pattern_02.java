package Patterns;

import java.util.Scanner;

public class pattern_02 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
//        for (int i = 1; i <= n ; i++) {
//            for (int j = n; j >= i; j--) {
//                System.out.print("* \t");
//            }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* \t");
            }
            System.out.println();
        }
    }
}
