package Chapter8_HW;

public class FirstBadVersion {
     public static void main(String[] args) {

        


     }

     public static int firstBadVersion(int n){

        int lo = 1;
        int hi = n;
        int ans = 0;
        while(lo<=hi){
            int mid = (lo + hi)/2;
            if(isBadVersion(mid)){
                ans = mid;
                hi=mid-1;
            }

            if(isBadVersion(mid)==false){
                lo = mid + 1;
            }

        }

        return ans;

     }

     public static boolean isBadVersion(int num){
        return false;
     }
}
