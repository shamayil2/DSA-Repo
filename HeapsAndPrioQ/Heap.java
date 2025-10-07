
import java.util.ArrayList;
import java.util.Scanner;
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

    public int remove() {
		swap(0, h.size()-1);//swap first and last
		int rv=  h.remove(h.size()-1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {//O(LogN)
		// TODO Auto-generated method stub
		int c1 = 2*pi +1;
		int c2 = 2*pi +2;
		int mini = pi;
		
		if(c1<h.size() && h.get(mini)>h.get(c1)) {
			mini = c1;
		}
		if(c2<h.size() && h.get(mini)>h.get(c2)) {
			mini = c2;
		}
		
		if(pi!=mini) {
			swap(pi,mini);
			downheapify(mini);
		}
		
		
	}

    public int get(){
        return h.get(0);
    }

    public void Display(){
        System.out.println(h);
    }

        public static void main(String[] args) {
        // Heap hh = new Heap();
        Heap hh = new Heap();
        hh.add(3);
        hh.add(2);
        hh.add(1);
        hh.add(5);
        hh.add(6);
        hh.add(4);
            Scanner scn = new Scanner(System.in);
            int k = scn.nextInt();
            
            // for (int i = 1; i < k; i++) {
            //     hh.remove();
            // }

           hh.Display();

        
        // hh.Display();
    }

}
