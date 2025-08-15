package Chapter10_HW;

import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        boolean ans = search2D(arr,5);
        System.out.println(ans);
    }

    public static boolean search2D(int[][] arr,int num){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(num==arr[i][j]){
                    return true;
                }
            }
        }

        return false;

    }
}
