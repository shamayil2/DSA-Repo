package Lecture33;

public class GenericsDemo {
    public static void main(String[] args) {
        Integer[] arr = {10,20,30,40,60,80};
        String[] arr2 = {"Mango","Apple","Banana","Cherry"};
        Double[] arr3 = {1.2,6.55,7.23,8.14};
        Display(arr);
        Display(arr2);
        Display(arr3);

    }

    private static <T> void Display(T[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }



}
