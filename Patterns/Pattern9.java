import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1;
        int nsp1 = n-1;
        int nst = 1;
        int nsp2 = n-1;

        while(row<=n){
            int csp1=0;
            while(csp1<nsp1){
                System.out.print("  ");
                csp1++;
            }

            int cst =0;
            while(cst<nst){
                System.out.print("* ");
                cst++;
            }

            int csp2 = 0;
            while(csp2<nsp2){
                System.out.print("  ");
                csp2++;
            }
            System.out.println();
            row++;
            nst+=2;
            nsp1--;
            nsp2--;
        }

    }
}
