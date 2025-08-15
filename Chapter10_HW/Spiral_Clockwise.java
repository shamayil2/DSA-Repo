package Chapter10_HW;

import java.util.Scanner;

public class Spiral_Clockwise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int minR = 0;
        int maxR = arr.length-1;
        int minC = 0;
        int maxC = arr[0].length - 1;
        int elements = n*m;
        int count = 0;

        while(count<elements){
            for (int i = minC; i <= maxC && count<=elements; i++) {
            System.out.print(arr[minR][i] + " ");
          
            count++;
        }
          minR++;
        for (int i = minR; i <= maxR && count<=elements; i++) {
            System.out.print(arr[i][maxC] + " ");
            
            count++;
        }
        maxC--;
        for (int i = maxC; i >= minC  && count<=elements; i--) {
            System.out.print(arr[maxR][i] + " ");
            
            count++;
        }
        maxR--;
        for (int i = maxR; i >=minR && count<=elements; i--) {
            System.out.print(arr[i][minC] + " ");
            
            count++;
        }
        minC++;
        }
    }
}
