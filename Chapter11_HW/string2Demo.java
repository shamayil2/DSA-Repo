package Chapter11_HW;

public class string2Demo {
   public static void main(String[] args) {
     	String s = "hello";
		String t = s;
		System.out.println(s); 
		s = "hello"+"hi";
		System.out.println(s);
		System.out.println(t);
		
		System.out.println(s.charAt(2));
		
		System.out.println(s.length());
		
		System.out.println(s.substring(1,3));
		
		System.out.println(s.substring(2));
   }
}
