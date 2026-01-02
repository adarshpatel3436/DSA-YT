package Patterns;

import java.util.Scanner;

public class pattern_09 {
    static void main() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= scn.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i==j || i+j == n+1 ) {
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }
}
