package August16_HW;

import java.util.Arrays;
import java.util.Scanner;

public class RatChasesCheese {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        char[][] arr = new char[n][m];

        for (int i = 0; i < arr.length; i++) {
            String s = scn.next();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = s.charAt(j);               
            }
        }
        int[][] ans = new int[n][m];
       int count =  rec(arr,ans,0,0,n,m);
        if(count==0){
            System.out.println("No Path Found");
        }else{
            System.out.println(count + "Paths");
        }

    }

    public static int rec(char[][] arr,int[][] ans,int cr,int cc,int n,int m){

        if(cc==m-1 && cr == n-1){

            ans[cr][cc] = 1;
            Display(ans);
            ans[cr][cc] = 0;
            return 1;
        }

        if(cc<0 || cr<0 || cr>=n || cc>=m || arr[cr][cc]=='X'){
            return 0;
        }

        arr[cr][cc] = 'X';
        ans[cr][cc] = 1;
        int count =0;
        //up 
        count+=rec(arr, ans, cr-1, cc, n, m);
        //down
        count+=rec(arr, ans, cr+1, cc, n, m);
        //left
        count+=rec(arr, ans, cr, cc-1, n, m);
        //right
        count+=rec(arr, ans, cr, cc+1, n, m);
        arr[cr][cc] = '0'; //backtracking 
        ans[cr][cc] = 0;

        return count;

    }

    public static void Display(int[][] arr){
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }
}
