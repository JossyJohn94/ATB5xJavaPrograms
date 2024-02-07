package src;

public class Reverseofstring {

    public static void main(String[] args) {
        String originalstr="Jossy";
        String reversedstr="";

        System.out.println("Original string="+originalstr);

        for(int i=0;i<originalstr.length();i++)
        {
            reversedstr = originalstr.charAt(i)+reversedstr;

        }
        System.out.println("Reversed string="+reversedstr);
    }
}
