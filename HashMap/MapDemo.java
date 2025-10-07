package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
      HashMap<Integer,String> map = new HashMap<>();
      map.put(1,"Raj");
      map.put(2,"Mannu");
      map.put(3, "Ramesh");
      map.put(4, "Neha");
        System.out.println(map);

        for(int id : map.keySet()){
            System.out.println("Id=>> " + id + " " + map.get(id));
        }
    }
}
