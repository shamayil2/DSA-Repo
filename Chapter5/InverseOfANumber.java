package Chapter5;
import java.util.Scanner;
public class InverseOfANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sum = 0;
        int place = 1;        
        while(n>0){
            int digit = n % 10;

            sum = sum + place *(int)Math.pow(10,digit-1);
            place++;    
            n = n/10;

        }

        System.out.println(sum);


    }
    
}