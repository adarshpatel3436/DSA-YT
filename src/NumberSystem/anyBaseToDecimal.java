package NumberSystem;

import java.util.Scanner;

public class anyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter base: ");
        int b = sc.nextInt();

        int d = getValueInDecimal(n , b);
        System.out.println(d);
    }

    public static int getValueInDecimal(int n , int b){
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
}
