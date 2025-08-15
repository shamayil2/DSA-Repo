package Chapter9_HW;

public class TimeComplexity {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(start);
        for (int i = 0; i < 1002000000; i++) {
            
        }

        long end = System.currentTimeMillis();
        System.out.println(end);
         System.out.println(end-start);
    }
}
