package basicDSAQue;

import java.util.Scanner;

public class BenjaminBulbs {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i * i  <= n  ; i++) {
            System.out.println(i * i);
        }
    }

}
