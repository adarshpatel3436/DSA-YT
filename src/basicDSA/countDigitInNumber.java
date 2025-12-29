package basicDSA;

import java.util.Scanner;

public class countDigitInNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int count = 0;

        while(n!=0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);

    }
}
