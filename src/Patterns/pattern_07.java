package Patterns;

import java.util.Scanner;

public class pattern_07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i==j){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
