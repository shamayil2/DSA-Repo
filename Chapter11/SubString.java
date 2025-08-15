package Chapter11;

public class SubString {
    public static void main(String[] args) {

        String s1 = "aBcD";
        for (int i = 0; i < s1.length(); i++) {
               char ch = s1.charAt(i);
               if(Character.isUpperCase(ch)){
                System.out.println(ch);
               }
        }
     

    }

    public static void Substring(String s){

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }

    }
}
