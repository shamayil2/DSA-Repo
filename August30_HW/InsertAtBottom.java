package August30_HW;
import java.util.Stack;
public class InsertAtBottom {
    public static void main(String[] args) throws Exception {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        iab(1100, st);
        System.out.println(st);
    }

    public static void iab(int i,Stack<Integer> st){

        if(st.isEmpty()){
            st.push(i);
            return;
        }

        int a = st.pop();
        iab(i,st);
        st.push(a);

    }

    // public static void iab(int i,Stack<Integer> st){

    //    Stack<Integer> temp = new Stack<>();
       
    //    while(!st.isEmpty()){
    //     int item = st.pop();
    //     temp.push(item);
    //    }
    //    st.push(i);
    //    while(!temp.isEmpty()){
    //     int item = temp.pop();
    //     st.push(item);
    //    }

    // }


    

}
