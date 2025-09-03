package August31_HW;
import java.util.Arrays;
import java.util.Stack;
public class Form_Minimum_From_DI_Sequence {
    public static void main(String[] args) {
        String s = "IDI";
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[s.length() + 1 ];
        int c = 1;
        for (int i = 0; i <= s.length(); i++) {
                
            if(i==s.length() || s.charAt(i)=='I'  ){
                ans[i] = c++;

                while(!st.isEmpty()){
                    ans[st.pop()] = c++;
                }
            }else{
                st.push(i);
            }
            
        }

        System.out.println(Arrays.toString(ans));

    }
}
