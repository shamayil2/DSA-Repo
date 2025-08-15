package Chapter14_HW;

public class BalancedParantheses {
    public static void main(String[] args) {
        int n = 3;
        check(n,0,0,"");

    }

    public static void check(int n,int op,int cl,String ans){
        if(op>n){
           
            return;
        }
        

        if(op==n && cl==n){
             System.out.println(ans);
            return;
        }
        check(n,op+1,cl,ans+'(');
        if(op>cl){
            check(n,op,cl+1,ans+')');
        }
        
    
    }
}
