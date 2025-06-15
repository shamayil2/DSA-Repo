import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int row=1;
        int nst= n;
        while(row<=n){
            int cst = 0;
            while(cst<nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            row++;
            nst--;

        }

    }
}
