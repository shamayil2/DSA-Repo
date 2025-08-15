package Chapter13_HW;

public class LinearSearch {
    public static void main(String[] args) {
        	int arr[] = {3,4,-1,11,17,19,6};
		int ans = ls(arr,6,0);
		System.out.println(ans);
    }

    public static int ls(int[] arr,int num,int idx){

        if(idx==arr.length){
            return -1;
        }

        if(num==arr[idx]){
            return idx;
        }

       int temp =  ls(arr,num,idx+1);
       return temp; 
        
    }

}
