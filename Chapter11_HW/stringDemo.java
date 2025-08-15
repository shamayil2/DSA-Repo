package Chapter11_HW;

public class stringDemo {
    public static void main(String[] args) {
       String one = "One String";
	//    System.out.println(one);
	   String two = new String("Two String");
	//    System.out.println(two);

	   String three = "One String";
	   String four = new String("One String");
	//    System.out.println(one==three);
	//    System.out.println(one==four);

	String s = "abc";
		String t  = "def";
		
		String f = s+t;
		System.out.println(f+"sdf");
		
		String s1 = "abc";
		int a = 1;
		System.out.println(a+s1);
		System.out.println(s1+a);
		
		System.out.println(10 + 20 + "h" +"ell"+40+60+"o");
		
    }
}
