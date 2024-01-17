package src;

import java.util.Scanner;

public class Lab013Cuberootpowerprogram {
    public static void main(String[] args) {
        double result;

        //3/ x^2 + y^2 -|z|
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of x");
        double x= sc.nextDouble();

        System.out.println("Enter the value of y");
        double y= sc.nextDouble();

        System.out.println("Enter the value of z");
        double z= sc.nextDouble();

        result= Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println("Result="+result);

        sc.close();

    }
}
