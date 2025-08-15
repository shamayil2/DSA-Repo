package Chapter10;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        transpose(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0] .length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void transpose(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i] = temp;
            }
            
        }
    }
}
