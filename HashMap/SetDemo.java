package HashMap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(50);
        set.add(60);
        set.add(80);
        set.add(100);




        for(int num: set){
            System.out.println(num);
        }
    }
}
