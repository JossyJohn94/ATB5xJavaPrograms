package src;

import java.util.Scanner;

public class Lab009Maxoftwonumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();

        if (a>b)
            System.out.println("Max=" + a);
        else
        {
            System.out.println("Max="+b);
        }
    }
}
