package Chapter8_HW;

public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = {-1,2,6,7,13,21};
        System.out.println(binarySearch(arr, 6))    ;
       


    }

    public static boolean binarySearch(int[] arr,int target){

         int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi){
        
            int midIdx = (lo + hi)/2;
            if(arr[midIdx]==target){
                return true;
            }            
            
            if(target>arr[midIdx]){
                lo++;
            }

            if(target<arr[midIdx]){
                hi--;
            }
            

        }
        return false;
        
    }
}
