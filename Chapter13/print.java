package Chapter13;
public class print {
    public static void main(String[] args) {
        int n =5;
        increase(5);
    }

    public static void increase(int n){

        if(n==0){
            return;
        }
        
        increase(n-1);
        System.out.println(n);
      

    }
}
