package August30_HW;

public class StackClient {
    
   public static void main(String[] args) throws Exception {
  
		Stack st =  new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		st.display();
		System.out.println(st.pop());
		st.display();
		System.out.println(st.peek());
   }


}
