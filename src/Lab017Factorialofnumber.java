package src;

import java.util.Scanner;

public class Lab017Factorialofnumber {
    public static void main(String[] args) {
        //5*4*3*2*1
        float fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        int i=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of number="+fact);
    }
}
