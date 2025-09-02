package August31_HW;
import java.util.Stack;
public class CelebrityProblem {
    public static void main(String[] args) {
        int arr[][] = {{0,1,1,1},{0,0,1,1},{1,1,0,1},{0,0,0,0}};

        int res = celebrity(arr);
        if(res==-1){
            System.out.println("No Celeb Found");
        }else{
            System.out.println(res + 1);
        }
    }

    public static int celebrity(int[][] arr){

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }

        while(st.size()!=1){

            int a = st.pop();
            int b = st.pop();

            if(arr[a][b]==1){
                st.push(b);
            }else{
                st.push(a);
            }

        }

        int celeb = st.peek();

        for (int i = 0; i < arr.length; i++) {
             if(i==celeb){
                continue;
             }
             
             if(arr[i][celeb]==0 || arr[celeb][i]==1){
                return -1;
             }
        }

        return celeb;
    }
}
