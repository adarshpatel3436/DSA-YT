package basicDSA;

import java.util.Scanner;

public class digitOfANumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int nod = 0;
        int temp = n;
        while(temp !=0){
            temp = temp/10;
            nod++;
        }
        int div = (int) Math.pow(10 , nod-1);

        while(n != 0){
            int q = n/div;
            System.out.println(q);
            n = n % div ;
            div = div/10;
        }


    }
}
