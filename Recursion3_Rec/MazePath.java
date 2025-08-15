package Recursion3_Rec;

public class MazePath {
    public static void main(String[] args) {
        int n = 3;
        mp(1,1,3,"");
    }

    public static void mp(int cr,int cc,int n , String str){

        if(cr==n && cc==n){
            System.out.println(str);
            return;
        }

        if(cr>n || cc>n){
            return;
        }

        mp(cr+1,cc,n,str+"V");
        mp(cr,cc+1,n,str+"H");

    }
}
