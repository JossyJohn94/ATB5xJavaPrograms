package src;

import java.util.Scanner;

public class Lab012SwitchCondition {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character I will say vowel or not");
        char vowelchar= sc.next().toCharArray()[0];

        switch (vowelchar)
        {
            case 'a':
                System.out.println("Vowel");
                break;

            case 'e':
                System.out.println("Vowel");
                break;

            case 'i':
                System.out.println("Vowel");
                break;

            case 'o':
                System.out.println("Vowel");
                break;

            case 'u':
                System.out.println("Vowel");
                break;

            default :
                System.out.println("Not a vowel");
                break;

        }
    }
}
