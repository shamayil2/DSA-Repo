package Lecture33;

public class Pair<K,V> {

    K key;
    V val;

    public Pair(K key,V val){
        this.key = key;
        this.val = val;
    }

    public static void main(String[] args) {
        Pair<Integer,String> p = new Pair<>(100,"Apple");
        System.out.println(p.val);
        Pair<Boolean,Integer> p2= new Pair<>(true,200);
        System.out.println(p2.key + "  , " + p2.val);
         Pair<String,String> p3= new Pair<>("Samsung","Xiaomi");
        System.out.println(p3.key + "  , " + p3.val);
    }

}
