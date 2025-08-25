package August17;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr1 = {1,5,9};
        int[] arr2= {2,3,8,10,50,90};

        int[] ans = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k =0;

        while(i<arr1.length && j<arr2.length){

            if(arr1[i]<arr2[j]){
                ans[k] = arr1[i];
                i++;
            }else{
                ans[k] = arr2[j];
                j++;
            }

            k++;

        }

        while(i<arr1.length){
           
            ans[k] = arr1[i];
            k++;
            i++;

        }

        while(j<arr2.length){
            ans[k] = arr2[j];
            k++;
            j++;
        }

        System.out.println(Arrays.toString(ans));
            

    }
}
