package Chapter10_HW;

import java.util.Scanner;

public class TwoDArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int m = scn.nextInt();
        // int[][] arr = new int[n][m];

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         arr[i][j] = scn.nextInt();
        //     }
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         System.out.print(arr[i][j] + ", ");
        //     }
        //     System.out.println();
        // }

        // System.out.println(arr[0]);
		// System.out.println(arr[1]);
		
		// int brr[] = arr[0];
		
		// System.out.println(brr[0]);
		// System.out.println(arr[0][0]);

        int[] arrNew = {1,2,3,4,5};

        for(int i: arrNew){
            System.out.println(i);
        }

        String[] arrString = {"abc","def","ghi","jkl"};
        for(String i:arrString){
            System.out.println(i);
        }

        
    }
}
