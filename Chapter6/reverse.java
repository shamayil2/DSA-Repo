package Chapter6;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void reverse(int[] arr){
        
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
