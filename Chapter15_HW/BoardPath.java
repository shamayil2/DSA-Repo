package Chapter15_HW;

public class BoardPath {
    public static void main(String[] args) {

        int count = board(0,4,3,"");
        System.out.println(count);
    }

    public static int board(int i,int n,int m,String ans){

        if(i>n){
            return 0;
        }

        if(i==n){
            System.out.println(ans);
            return 1;
        }

        int count =0;
        for(int j=1;j<=m;j++){

            count = count + board(i+j, n, m, ans + j);

        }

        return count;
    }
}
