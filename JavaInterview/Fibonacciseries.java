package JavaInterview;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        int a,b,k;
        a=1;
        b=1;
        System.out.println("Enter the limit");
        Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();



        System.out.print(a+" "+b +" ");

        for(int i=0;i<n;i++)
        {
           k=a+b;
            System.out.print(k +" ");
           a=b;
           b=k;

        }

    }
}
