package basicDSAQue;

import java.util.Scanner;

public class GCDnLCM {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 and n2: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int num1 = n1;
        int num2 = n2;

        while( n1 % n2 != 0 ){
            int rem = n1 % n2;
            n1 = n2 ;
            n2 = rem ;

        }

        int gcd = n2 ;
        int lcm = (num1 * num2 )/gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
