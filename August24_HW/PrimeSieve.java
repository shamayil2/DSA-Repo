package August24_HW;

public class PrimeSieve {
    public static void main(String[] args) {
        int n = 20;
        primesieve(n);
    }


    public static void primesieve(int n){
        boolean[] arr = new boolean[n+1];


        for (int i = 2; i*i <=n; i++) {

            if(arr[i]==false){

                for (int j = 2; i*j < arr.length; j++) {
                    arr[i*j] = true;
                }

            }

        }
        
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]==false){
                System.out.print(i + " ");
            }
        }
    }

}
