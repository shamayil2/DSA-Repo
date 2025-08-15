package Chapter13;

public class Is_Sorted {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,9,10};
        boolean ans = check(arr,0);
    }
    public static boolean check(int[] arr,int idx){
        if(idx==arr.length){
            return true;
        }
        if(arr[idx]<arr[idx +1]){
            return check(arr, idx + 1);
        }

        return false;
    }

}
