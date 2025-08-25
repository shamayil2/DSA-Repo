package Chapter12;

public class StringToNumber {
    public static void main(String[] args) {
        String s = "123458";
        System.out.println(s + 1);
        int n = Integer.parseInt(s);
        System.out.println(n + 1);

        long m = Long.parseLong(s);
        System.out.println(m +1);
    }
}
