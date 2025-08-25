package Chapter12;

import java.util.Scanner;

public class Max_Path_Sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        int sumMax = maxSum(arr1,arr2);
        System.out.println(sumMax);
    }

    public static int maxSum(int [] arr1,int[] arr2){

       int sum1 = 0;
       int sum2 = 0;
       int i =0;
       int j = 0;
       int res = 0;
       while(i<arr1.length && j<arr2.length){

        if(arr1[i]<arr2[j]){
            sum1 = sum1 + arr1[i];
            i++;
        }else if(arr2[j]<arr1[i]){
            sum2 = sum2 + arr2[j];
            j++;
        }else{

            if(sum1>sum2){
                res =res +  sum1;
            }else{
                res = res +  sum2;
            }

            while(i<arr1.length && j <arr2.length && arr1[i]==arr2[j]){
                
                res = res + arr1[i];
                i++;
                j++;
               
            }
             sum1 = 0;
            sum2 = 0;
        }

     

        
       }
          while(i<arr1.length){
            sum1 = sum1 + arr1[i];
            i++;
        }

         while(j<arr2.length){
            sum2= sum2+ arr2[j];
            j++;
        }

        if(sum1>sum2){
            res = res + sum1;
        }else{
            res = res + sum2;
        }
       return res;

    }

}
