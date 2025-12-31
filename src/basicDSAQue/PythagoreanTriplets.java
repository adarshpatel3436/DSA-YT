package basicDSAQue;

import java.util.Scanner;

public class PythagoreanTriplets {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 num: ");
        int n1 = sc.nextInt();
        int n2 =  sc.nextInt();
        int n3 = sc.nextInt();

        int max = n1;

        if(n2 >= max){
            max = n2;
        }

        if(n3 >= max){
            max =n3;
        }

        if(max == n1 ){
            boolean py = ((n2*n2 + n3*n3) == (n1*n1));
            System.out.println(py);

        } else if (max == n2) {
            boolean py = ((n1*n1 + n3*n3) == (n2*n2));
            System.out.println(py);

        }else{
            boolean py = ((n1*n1 + n2*n2) == (n3*n3));
            System.out.println(py);

        }

    }
}
