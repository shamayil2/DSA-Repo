package August17;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {2,-1,3,14,13,6,-2,3};
        int ans[] = mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mergesort(int[] arr,int i , int j){

        if(i==j){
            int[] t = new int[1];
            t[0] = arr[i];
            return t;
        }


        int mid = (i+j)/2;
        int[] lh = mergesort(arr, i, mid );
        int[] rh = mergesort(arr, mid+1, j);

        return MergeTwoSortedArr(lh,rh);

    }


    public static int[] MergeTwoSortedArr(int[] arr1,int[] arr2){

        int i = 0;
        int j = 0;
        int k =0;

        int[] ans = new int[arr1.length + arr2.length];

        while(i<arr1.length && j <arr2.length){

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
            i++;
            k++;
        }

        while (j<arr2.length) {
           ans[k] = arr2[j];
           j++;
           k++;     
        }


        return ans;

    }
}
