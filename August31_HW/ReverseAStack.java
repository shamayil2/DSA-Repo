package August31_HW;
import java.util.Stack;
public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        st.push(55);
        System.out.println(st);
        rev(st);
        System.out.println(st);
    }

    public static void rev(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }

        int a = st.pop();
        rev(st);
        iab(st,a);

    }

    public static void iab(Stack<Integer> st , int a){

        if(st.isEmpty()){
            st.push(a);
            return;
        }

        int b = st.pop();
        iab(st,a);
        st.push(b);

    }


}
