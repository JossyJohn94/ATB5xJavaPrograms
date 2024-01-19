package src;

import java.util.Scanner;

public class Scannerclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name");
        String name=sc.next();

        System.out.println("Enter your Age");
        int age=sc.nextInt();

        System.out.println("Enter your salary");
        double salary=sc.nextDouble();

        System.out.println("Your details are" +name +" - " +age +" - " +salary );
    }
}
