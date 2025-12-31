package basicDSA;

import java.util.Scanner;

public class RorateANumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.print("Enter K: ");
        int k = sc.nextInt();

        int nod = 0;
        int temp = n;
        while (temp >0){
            temp = temp / 10;
            nod++;
        }
        k = k % nod ;
        if(k<0){
            k = k + nod;
        }

        int div = 1;
        int multi = 1;
        for (int i = 1; i <= nod ; i++) {
            if(i <= k ){
                div = div * 10;
            }else {
                multi = multi * 10;
            }
        }
        int q =  n / div;
        int rem = n % div;

        int rot = rem * multi + q;
        System.out.println(rot);

    }
}
