package Chapter5;

public class FunctionDemo {
    
    public static void main(String[] args) {
        
        int a = 30;
        int b = 20;
        int total =  sum(a,b);
        System.out.println(total);

    }

    public static int sum(int b, int c){
        int sumTotal = b + c;
        return sumTotal;
    }
}
