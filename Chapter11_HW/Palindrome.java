package Chapter11_HW;
public class Palindrome {
    public static void main(String[] args) {
        String s = "nittins";
        System.out.println(palindrome(s));
    }

    public static boolean palindrome(String s){

        int i =0;
        int j = s.length() -1;

        while(i<=j){

            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }

        }

        return true;
    }

}
