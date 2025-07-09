package Chapter6;

import java.util.*;

public class Boston {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

           int sum1 = 0;
            int val = n;
            while(val>0){
                sum1 = sum1 + val%10;
                val = val/10;
            }
             int sum2 = 0;
             int i=2;
        while(i<=n){
           
            if(n%i==0){
                if(i>10){
                    int j = i;
                    while(j>0){
                        sum2 = sum2 + j%10;
                        j= j/10;
                    }
                }else{
                     sum2 = sum2 + i;
                }
                n= n/i;

            }else{
                i++;
                
            }


        }

        if(sum1 == sum2){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        // System.out.println(sum2);
    }
}
