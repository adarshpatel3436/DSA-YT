package basicDSAQue;

import java.util.Scanner;

public class numberReverse {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        while(n != 0){
            int dig = n % 10 ;
            n = n/10;
            System.out.println(dig);
        }
    }
}
