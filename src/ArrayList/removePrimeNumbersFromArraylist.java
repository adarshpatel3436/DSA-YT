package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class removePrimeNumbersFromArraylist {

    public static boolean isPrime(int val){
        for (int div = 2; div * div <= val ; div++) {
            if(val % div == 0){
                return false;
            }
        }
        return true;
    }

    public static void solution(ArrayList<Integer> li){
        for (int i = li.size() - 1; i >= 0 ; i--) {
            int val = li.get(i);
            if(isPrime(val) == true){
                li.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            li.add(sc.nextInt());
        }
        solution(li);
        System.out.println(li);
    }
}
