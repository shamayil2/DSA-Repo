package Chapter8_HW;
import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
            Scanner scn = new Scanner((System.in));
            int n = scn.nextInt();
            int c = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }

            Arrays.sort(arr);

            int minDistance = minDistance(arr, n, c);
            System.out.println("Max Minimum Distance:" + minDistance);

    } 

    public static int minDistance(int[] arr,int n,int c){

        int lo = 1;
        int hi = arr[arr.length-1] - arr[0];
        int ans = 0;
        while(lo<=hi){

            int mid = (lo+hi)/2;
            if(isPossible(arr,mid,n,c)){
                lo++;
                ans=mid;
            }

            if(isPossible(arr, mid, ans, c)==false){
                hi--;
            }



        }

        return ans;
        

    }

    public static boolean isPossible(int[] arr,int mid,int n,int c){

        int cpsf = 1;
        int prev = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[prev]>=mid){
                cpsf++;
                prev=i;
            }

            if(cpsf==c){
                return true;
            }
        }

        return false;

    }
}
