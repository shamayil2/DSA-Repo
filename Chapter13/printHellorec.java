package Chapter13;

public class printHellorec {
    public static void main(String[] args) {
        
        int n = 10;
        print(n);
    }

    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello");
        print(n-1);
    }
}
