package August17;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];

        rec(board,n,0,0);

    }


    public static void rec(boolean[][] board,int tq,int qpsf,int row){

        if(qpsf == tq ){
            Display(board);
            return;
        }
        if(row==board.length){
            return;
        }
        

        
            for (int j = 0; j < board[0].length; j++) {
                
                if(isPossible(board,row,j)){
                    
                    board[row][j] = true;
                    rec(board,tq, qpsf+1, row+1);
                    board[row][j] = false;

                }
                
            }
        

    }

    public static boolean isPossible(boolean[][] board,int row,int col){
        //UP
        for (int i = row; i >=0; i--) {
            if(board[i][col]){
                return false;
            }
        }

        //Left - Diagonal Up
        int r = row;
        int c = col;
        while(r>=0 && c>=0){

            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

        //Right- Diagonal Up

         r = row;
         c = col;

        while(r>=0 && c<board.length){
            if(board[r][c]){
                return false;
            }

            r = r -1;
            c = c +1;

        }

        return true;

    }

    public static void Display(boolean[][] board){

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                
                if(board[i][j]){
                    System.out.print("Q");
                }else{
                    System.out.print(".");
                }
                
            }

            System.out.println();
        }

       System.out.println();
    }

}
