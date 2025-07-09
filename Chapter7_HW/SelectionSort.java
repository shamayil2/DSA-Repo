package Chapter7_HW;
import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            int minIdx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

        }

        System.out.println(Arrays.toString(arr));

    }
}
