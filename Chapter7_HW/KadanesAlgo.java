package Chapter7_HW;

import java.util.Scanner;

public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        // Intuition : Array with all positives will have the sum of each element so we take account of negatives
        // if negative is there we perform operation and see if sum has become -ve or not. we put sum=0 if its -ve.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
             
            sum = sum + arr[i];
            max = Math.max(max, sum);
            if(sum<0){
                sum = 0;
            }
        }

        System.out.println(max);
    }
}
