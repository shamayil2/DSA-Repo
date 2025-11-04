package Test_Questions;

public class FloydCycle {
    
    public static void main(String[] args) {
        
        LinkedList ll  = new LinkedList();
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        // ll.addLast(120);
        // ll.createCycle(500);

        System.out.println(ll.detectCycle());
    }

}
