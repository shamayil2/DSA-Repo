package Chapter13_HW;

public class IsSorted {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,9,0,10};
		boolean ans = check(arr,1);
		System.out.println(ans);
    }

    public static boolean check(int[] arr,int idx){

        if(idx == arr.length){
            return true;
        }

        if(arr[idx-1]>arr[idx]){
            return false;
        }
        
        boolean ans = check(arr,idx+1);
        return ans;

    }
}
