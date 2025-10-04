
import java.util.ArrayList;
public class Heap {
    
    private ArrayList<Integer> h;

    public Heap(){
        h = new ArrayList<>();
    }

    public void add(int num){

        h.add(num);
        upHeapify(h.size()-1);

    }

    private void upHeapify(int ci) {
       
        int pi = (ci-1)/2;

        if(h.get(pi)>h.get(ci)){
            swap(pi,ci);
            upHeapify(pi);
        }

    }

    private void swap(int pi, int ci) {
        int pe = h.get(pi);
        int ce = h.get(ci);

        h.set(pi,ce);
        h.set(ci,pe);
    }

    public void Display(){
        System.out.println(h);
    }

        public static void main(String[] args) {
        Heap hh = new Heap();

        hh.add(6);
        hh.add(25);
        hh.add(12);
        hh.add(9);
        hh.add(4);
        hh.add(-85);
        hh.Display();
    }

}
