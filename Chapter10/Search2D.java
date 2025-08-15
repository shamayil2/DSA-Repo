package Chapter10;

import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=scn.nextInt();
            }
        }

        boolean ans = search(arr,14);
        System.out.println(ans);


    }

    public static boolean search(int[][] arr,int i){
        for (int j = 0; j < arr.length; j++) {
            for (int j2 = 0; j2 < arr[0].length; j2++) {
                if(arr[j][j2]==i){
                    return true;

                }
            }
        }
        return false;
    }
}
