package NumberSystem;

import java.util.Scanner;

public class anyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter base 1: ");
        int b1 = sc.nextInt();
        System.out.print("Enter base 2: ");
        int b2 = sc.nextInt();

        int d = getValue(n , b1, b2);
        System.out.println(d);
    }

    public static int getValue(int n, int b1, int b2){
        int dec = anyBaseToDecimal(n , b1);
        int dn = DecimalToAnyBase(dec , b2);
        return dn;
    }

    public static int anyBaseToDecimal(int n , int b){
        int rv = 0;
        int pow = 1;

        while(n>0){
            int dig = n % 10;
            n = n/10;

            rv += dig * pow;
            pow = pow*b;
        }
        return rv;
    }

    public static int DecimalToAnyBase(int n , int d){
        int rv = 0;

        int pow = 1;
        while (n>0){
            int dig = n % d;
            n = n / d;
            rv += dig * pow;
            pow = pow * 10;
        }
        return rv;
    }
}
