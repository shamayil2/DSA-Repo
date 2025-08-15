package Chapter11_HW;

import java.util.Arrays;

public class FrequencyCount {
    public static void main(String[] args) {
        String s = "abaabbccgggghhhzzzzaaaabbbcccd";

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);

            arr[ch-'a']++;

        }

        // System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){

            char ch = (char)(i + 'a');
            
            if(arr[i]>0){
                System.out.println(ch + "-->" + arr[i]);
            }


        }

    }
}
