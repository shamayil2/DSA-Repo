package Chapter6;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        int sum = 0;
        while(sum>=0){
            int i = scn.nextInt();
            sum = sum + i;
            if(sum>=0){
                 System.out.println(i);
            }
           
        }
    }
}
