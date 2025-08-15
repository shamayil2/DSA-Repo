package Chapter13;

public class Sum_first_n {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }

    public static int sum(int  n ){
        if(n==1){
            return 1;
        }
        int sumNow = sum(n-1);
        int finalSum =  sumNow + n;
        return finalSum;

    }
}
