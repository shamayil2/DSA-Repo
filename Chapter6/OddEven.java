package Chapter6;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        
          Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=0;i<n;i++){
            int n1 = scn.nextInt();
            int sum1=0;
            int sum2 = 0;
            while(n1>0){

                int digit = n1%10;
                if(digit%2==0){
                    sum1 = sum1 + digit;
                }else{
                    sum2 = sum2 + digit;
                }

                n1 = n1/10;

            }

            if(sum1%4==0 || sum2%3==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
