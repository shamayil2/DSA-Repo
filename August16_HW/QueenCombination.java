package August16_HW;

public class QueenCombination {
    public static void main(String[] args) {
          
        boolean[] arr = new boolean[3];
        rec(arr,2,0,"",0);
    }

    public static void rec(boolean[] board,int tq,int qpsf,String ans,int idx){

        if(tq==qpsf){
            System.out.println(ans);
            return;
        }

        for(int i=idx;i<board.length;i++){
            if(board[i]==false){
                board[i]= true;
                rec(board,tq,qpsf+1,ans+"q"+qpsf + "b" + i,i+1);
                board[i] = false;
            }
            
        }

    }
}
