package NumberSystem;

import java.util.Scanner;

public class anyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2 greater than n1: ");
        int n2 = sc.nextInt();

        int d = getDifference(b , n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2){
        int rv = 0;

        int c = 0;
        int p = 1;
        while (n2>0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1/10;
            n2 = n2/10;

            int d = 0;
            d2 = d2 + c;

            if(d2>=d1){
                c = 0;
                d = d2 - d1;
            }else{
                c = -1;
                d = d2 + b - d1;
            }

            rv += d* p;
            p = p*10;
        }
        return rv;
    }
}
