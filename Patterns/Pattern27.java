import java.util.Scanner;
public class Pattern27 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int row=1;
        int nsp = n-1;
        int nst = 1;
        while(row<=n){

            int csp = 0;
            while(csp<nsp){
                System.out.print("  ");
                csp++;
            }

            int cst = 0;
            int val = 0;
            while(cst<nst){
              
                if(cst<=nst/2){
                    val++;
                }else{
                    val--;
                }
                  System.out.print(val + " ");
                cst++;
            }
            System.out.println();
            row++;
            nsp--;
            nst+=2;

        }

    }

}
