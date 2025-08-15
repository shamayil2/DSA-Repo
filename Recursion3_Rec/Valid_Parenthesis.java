package Recursion3_Rec;

public class Valid_Parenthesis {
    public static void main(String[] args) {
        printParenthesis(0, 0, 3, "");
    }

    public static void printParenthesis(int op,int cl,int n,String s){

        if(op==n && cl==n){
            System.out.println(s);
            return;
        }

        if(op>n || cl>n){
            return;
        }

        printParenthesis(op+1, cl, n, s+"(");
        if(op>cl){
            printParenthesis(op, cl+1, n, s + ")");
        }
        
    }
}
