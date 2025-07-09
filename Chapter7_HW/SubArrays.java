package Chapter7_HW;

import java.util.Scanner;

public class SubArrays {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
              int sum = 0;
            for (int j = i; j < arr.length; j++) {
                
                sum = sum + arr[j];
                max = Math.max(max,sum);
            }
           

        }   
        
        System.out.println(max);

    }
}
