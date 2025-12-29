package basicDSA ;

import java.util.Scanner;

public class printAllPrime {
     static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range: ");
        int low = sc.nextInt();
        System.out.print("Enter upper range: ");
        int high = sc.nextInt();



        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }

    }
}