package Chapter13;

public class factorial {
    public static void main(String[] args) {
            int n = 5;
          int res =   factorial(n);
        System.out.println(res);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }

        int product = factorial(n-1);
        int fact = product * n;
        return fact;
    }
}
