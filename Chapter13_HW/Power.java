package Chapter13_HW;

public class Power {
    public static void main(String[] args) {
        int a =2;
		int b =6;
		
		int ans = pow(a,b);
		System.out.println(ans);
    }

    public static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        
        int powSmall = pow(a,b-1);
        int finalAns = powSmall * a;
        return finalAns;
    }

}
