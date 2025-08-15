package Chapter10_HW;

import java.util.Scanner;

public class JaggedArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][];

        for (int i = 0; i < arr.length; i++) {
            int m = scn.nextInt();
            int[] temp = new int[m];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ,");
            }
            System.out.println();
        }

    }
}
