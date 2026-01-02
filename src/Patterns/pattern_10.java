package Patterns;

import java.util.Scanner;

public class pattern_10 {
    static void main() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scn.nextInt();

        int os = n/2;
        int is = -1 ;

        for (int i = 1; i <= n  ; i++) {
            for (int j = 1; j <= os ; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");

            for (int j = 1; j <= is ; j++) {
                System.out.print("\t");
            }

            if(i > 1 && i < n){
                System.out.print("*\t");
            }

            if(i <= n / 2 ){
                os--;
                is += 2;
            }else{
                os++;
                is -= 2;
            }

            System.out.println();
        }
    }
}
