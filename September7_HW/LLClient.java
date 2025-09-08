package September7_HW;

public class LLClient {
    public static void main(String[] args) throws Exception {
           
        LL l = new LL();

        l.addFirst(20);
        l.addFirst(30);
        l.addFirst(40);
        l.addFirst(50);
        l.addFirst(60);
        l.addFirst(70);
        l.addLast(110);

         l.removeFirst();
       
         l.removeLast();
        
        l.Display();
        System.out.println(l.linearsearch(600));
    }
}
