package src;

public class Lab020Array1 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};

        System.out.println(arr1==arr2);

        int[] arr3=arr1;
        System.out.println(arr3==arr1);

        System.out.println(arr1.equals(arr2));
    }
}
