package Chapter6;
import java.util.Scanner;
public class LeetCode238 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int[] result = arrProduct(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }


    }

    public static int[] arrProduct(int[] arr){
        int[] result = new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     int sum = 1;
        //     for(int j=0;j<arr.length;j++){
        //          if(i!=j){
        //             sum = sum * arr[j];
        //          }   
        //     }
        //     result[i] = sum;
        // }
        
        int[] left = new int[arr.length];
        left[0] = 1;
        for(int i=1;i<left.length;i++){
            left[i] = left[i-1] * arr[i-1];
        }

        int[] right = new int[arr.length];
        right[arr.length-1] = 1;
        for(int i=arr.length-2;i>=0;i--){
            right[i] = arr[i+1] * right[i+1];
        }

        for(int i=0;i<result.length;i++){
            result[i] = left[i] * right[i];
        }


        return result;

    }
}
