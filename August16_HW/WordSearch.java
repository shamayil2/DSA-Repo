package August16_HW;

import java.util.Arrays;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            String s = scn.next();
            for (int j = 0; j < board[0].length; j++) {
                   
                board[i][j] = s.charAt(j);

            }
        }

        String word = scn.next();
        boolean result = check(board, word);
        System.out.println(result);

    }

    public static boolean check(char[][] board,String word){

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==word.charAt(0)){
                    boolean ans = rec(board,word,i,j,0);
                    if(ans){
                        return true;
                    }
                }
            }
        }


        return false;
    }

    public static boolean rec(char[][] board,String word,int cr,int cc,int idx){

        if(idx==word.length()){
            return true;
        }
        
        if(cr<0 || cc<0 || cr>=board.length || cc>board[0].length || board[cr][cc]!=word.charAt(idx)){
            return false;
        }

        board[cr][cc] = '*';
        int r[] = {-1,1,0,0};
        int c[] = {0,0,-1,1};

        for (int i = 0; i < c.length; i++) {
            boolean ans = rec(board, word, cr + r[i], cc + c[i], idx + 1);
            if(ans){
                return true;
            }
        }
        board[cr][cc] = word.charAt(idx);
        return false;
    }

}
