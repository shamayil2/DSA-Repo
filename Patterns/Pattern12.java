import java.util.Scanner;
public class Pattern12 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = n-1;
        int nst=1;
        int row =1;

        while(row<=n){

            int csp1=0;
            while(csp1<nsp){
                System.out.print("  ");
                csp1++;
            }

            int cst = 0;
            while(cst<nst){
                if(cst%2==0){
                    System.out.print("* ");
                    cst++;
                }else{
                    System.out.print("! ");
                    cst++;
                }
            }
            System.out.println();
            nst+=2;
            nsp--;
            row++;

        }
        


    }
}