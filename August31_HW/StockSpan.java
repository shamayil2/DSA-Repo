package August31_HW;
import java.util.Arrays;
import java.util.Stack;
public class StockSpan {
    public static void main(String[] args) {
        int arr[] = {30,35,40,38,35,39,45};

        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
                
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i] = i +1;
            }else{
                ans[i] = i - st.peek();
            }
            
            st.push(i);
        }

        System.out.println(Arrays.toString(ans));

    }
}
