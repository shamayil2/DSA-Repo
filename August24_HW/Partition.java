package August24_HW;

import java.util.Arrays;

public class Partition {
    public static void main(String[] args) {
        int[] arr = {11,2,4,5,1,-1,13,3};
        int idx = part(arr,0,arr.length-1);
        System.out.println(idx);
        System.out.println(Arrays.toString(arr));
    }

    public static int part(int[] arr,int si,int ei){

        int temp = arr[ei];
        int idx = si;

        for (int i = 1; i < ei; i++) {
                
            if(arr[i]<temp){
                int j = arr[idx];
                arr[idx] = arr[i];
                arr[i] = j;
                idx++;
            }
            
        }

        int j = arr[idx];
        arr[idx] = arr[ei];
        arr[ei] = j;

        return idx;
    }
}
