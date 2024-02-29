package JavaInterview;

import java.util.Scanner;

public class RevereseString {
    public static void main(String[] args) {
        String originalstr;
        String reversedstr="";

        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the size:");

       // int n=sc.nextInt();

        System.out.println("Enter the String");
        originalstr=sc.next();
        int len=originalstr.length();

        for(int i=0;i<len;i++)
        {
            reversedstr=originalstr.charAt(i)+reversedstr;
        }
        System.out.println("Reversed String:"+reversedstr);
    }
}
