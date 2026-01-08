package NumberSystem;

import java.util.Scanner;

public class decimalToBase {

    public static int getValueInBase(int n , int d){
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

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Decimal num: ");
        int n = scn.nextInt();
        System.out.print("Enter base: ");
        int d = scn.nextInt();
        int res = getValueInBase(n , d);
        System.out.println(res);
    }
}
