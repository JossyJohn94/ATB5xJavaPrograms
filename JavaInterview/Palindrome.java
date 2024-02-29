package JavaInterview;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String originalstr;
        String reversedstr = "";

        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the size:");

        // int n=sc.nextInt();

        System.out.println("Enter the String");
        originalstr = sc.next();
        int len = originalstr.length();

        for (int i = 0; i < len; i++) {
            reversedstr = originalstr.charAt(i) + reversedstr;
        }
        System.out.println("Reversed String:" + reversedstr);

        if(originalstr.equals(reversedstr))
        {
            System.out.println("Is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
