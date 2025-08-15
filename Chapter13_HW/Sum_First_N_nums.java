package Chapter13_HW;

public class Sum_First_N_nums {
    public static void main(String[] args) {
        
        int n = 10;
        int ans = sum(n);
        System.out.println(ans);
    }

    public static int sum(int n ){
        if(n==0){
            return 0;
        }

        int sumSmall = sum(n-1);
        int finalSum = sumSmall + n;

        return finalSum;
    }

}
