package String;

import java.util.Scanner;

public class stringDeclare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s1 = "hello";
        //String s1 = sc.next();   // abc def  -- abc
        //String s = sc.nextLine();  // abc def -- abc def

//        System.out.println(s);
//        System.out.println(s.length());
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            System.out.println(ch);
//        }
       // s.charAt(0) = 'x';   // won't work

        String s = "abcd";
        System.out.println(s.substring(0,1));  //(0,0) -- __   //(3,1) -- error
        System.out.println(s.substring(2));  // 2-end
    }
}

// you can't change the value of char