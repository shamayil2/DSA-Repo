package Chapter14;

public class Combination {
    public static void main(String[] args) {
        
        brackets(3,0,0 ,"");

    }

    public static  void brackets(int n,int open,int close, String ans){
        if(open>n){
            return;
        }

        brackets(n,open,close,ans + '(');

        if(open>close){
            brackets(n,open,close,ans+')');
        }
        

    }
}
