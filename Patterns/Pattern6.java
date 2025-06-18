import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int row=1;
        int nst = n;
        int nsp1 = 0;

        while(row<=n){

            int csp1=0;
            while(csp1<nsp1){
                System.out.print("  ");
                csp1++;
            }   

            int cst = 0;
            while(cst<nst){
                System.out.print("* ");
                cst++;
            }

             System.out.println();
            row++;
            nsp1+=2;
            nst--;

        }

       

    }
}
