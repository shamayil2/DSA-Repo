package August18;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        sortArrays(arr, list, 4);
        for(int i: arr){
                
        }


    }

    public static int sortArrays(int[] arr,ArrayList<Integer> list,int num){

        
        list.add(num);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<num){
                list.add(0,arr[i]);
            }else{
                list.add(arr[i]);
            }
        }

        return 0;

    }
}
