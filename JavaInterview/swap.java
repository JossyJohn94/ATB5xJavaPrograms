package JavaInterview;

public class swap {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println("Before swapping:"+x+ " "+y);
        x=x+y; //30
        y=x-y;
        x=x-y;
        System.out.println("After swapping:"+x+ " "+y);
    }
}
