package Chapter6;

import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean result = armstrongNum(n);
        System.out.println(result);
    }

    public static boolean armstrongNum(int n){

      

            int place = 0;
            int num = n;
            while(num>0){
              
                place++;
                num = num/10;
            }
            int val = n;
            int sum =0;
            while(val>0){
               int digit = val%10;   
               sum = sum +  (int)Math.pow(digit,place);  
               val = val/10; 
                
            }

            if(sum == n){
                return true;
            }else{
                return false;
            }

        

    }
}
