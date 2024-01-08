package src;

import java.util.Scanner;

public class Lab008EvenorOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();


        if(a%2==1)
        {
            System.out.println("Number is Odd");
        }
        else{
            System.out.println("Number is Even");
        }
    }
}
