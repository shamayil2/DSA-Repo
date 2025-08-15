package Chapter13;

public class LinearSearch {
    public static void main(String[] args) {
            int arr[] = {3,4,-1,11,17,19,6};
            int ans = ls(arr,19,0);
            System.out.println(ans);

    }

    public static int ls(int[] arr,int n,int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==n){
            return idx;
        }

        
           
        return ls(arr, n, idx+1);

       
    }
}
