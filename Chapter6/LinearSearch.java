package Chapter6;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,8,-2,6,7,9,10,-4};
        boolean ans = LinearSearch(arr, 4);
        System.out.println(ans);
    }

    public static boolean LinearSearch(int[] arr , int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return true;
            }
        }
        return false;
    }

}
