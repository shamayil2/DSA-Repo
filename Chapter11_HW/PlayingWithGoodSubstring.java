package Chapter11_HW;

public class PlayingWithGoodSubstring {
    public static void main(String[] args) {
        
        String s = "cbaeicdeaiaiaiaiaiaiai";

        int count= 0;
        int max = 0; 

        for (int i = 0; i < s.length(); i++) {
                
            if(isVowel(s.charAt(i))){
                count++;
            }else{
                max = Math.max(count,max);
                count = 0;
            }
            
        }
        max = Math.max(max,count);
        System.out.println(max);
                       
    }

    public static boolean isVowel(char ch){

        if(ch == 'a' || ch=='i' || ch=='o' || ch=='e' || ch=='u'){

            return true;

        }

        return false;

    }

}
