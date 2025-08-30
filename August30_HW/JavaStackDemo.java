package August30_HW;
import java.util.Stack;
public class JavaStackDemo {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.pop();
        st.peek();
        System.out.println(st.isEmpty());;
        System.out.println(st);

    }
}
