package Recursion3_Rec;

public class BoardPath {
    public static void main(String[] args) {
            bp2(0,4,"");
    }

    public static void bp2(int sum,int n,String str){
        if(sum==n){
            System.out.println(str);
            return;
        }
        if(sum>n){
            return;
        }
        for (int i = 1; i <= n; i++) {
            bp2(sum+i,n,str+i);
        }
        
     

    }
}
