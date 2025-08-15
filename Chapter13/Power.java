package Chapter13;

public class Power {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int ans = pow(a,b);
        System.out.println(ans);
    }


    public static int pow(int a,int b){

        if(b==0){
            return 1;
        }
        int prod = pow(a,b-1);
        int prodFinal = prod * a;
        return(prodFinal);
    }
}    
