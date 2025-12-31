package basicDSAQue;

import java.util.Scanner;

public class inverseANumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:  ");
        int n = sc.nextInt();

        int inv = 0;
        int op = 1;       // original place

        while(n != 0){
            int od = n % 10;   // original digit
            int id = op;
            int ip = od;

            inv = inv + id * (int)Math.pow(10 , ip - 1);

            n = n/10;
            op++;

        }
        System.out.println(inv);
    }
}
