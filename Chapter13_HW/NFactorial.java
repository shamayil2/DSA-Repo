package Chapter13_HW;

public class NFactorial {
    public static void main(String[] args) {
        int n = 4;
		int ans = fact(n);
		
		System.out.println(ans);
    }

    public static int fact(int n){  
        if(n==1){
            return 1;
        }

        int factSmall = fact(n-1);
        int finalAns = factSmall * n;
        return finalAns;
                                         

    }

}
