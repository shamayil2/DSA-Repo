package August17;

import java.util.Scanner;

public class SudokuSolver {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("\n  Solved Sudoku : ");
        rec(arr, 0, 0);

    }

    public static void rec(int[][] arr, int row, int col) {

        if(col==9){
            row++;
            col=0;
        }

        if(row==9){
            Display(arr);
            return;
        }

        

        if (arr[row][col] != 0) {
            rec(arr, row, col + 1);
        } else {

            

                for (int j = 1; j < 10; j++) {

                    if (isPossible(arr, j, row, col)) {

                        arr[row][col] = j;
                        rec(arr, row, col+1);
                        arr[row][col] = 0;

                    }

                }

            

        }

    }

    public static boolean isPossible(int[][] arr, int val, int row, int col) {
        //checking row
        for (int i = 0; i < arr.length; i++) {
             
            if(arr[row][i]==val){
                return false;
            }

        }
        //checking column
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][col]==val){
                return false;
            }
        }

        int r = row - row%3;
        int c = col - col%3;

        for (int i = r; i < r+3; i++) {
            for (int j = c; j < c+3; j++) {
                if(arr[i][j]==val){
                    return false;
                }
            }
        }


        return true;
    }

    public static void Display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
