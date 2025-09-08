package September7;

public class LL {
    public class Node {
        int val;
        Node next;
        public Node() {
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size = 0;
    public void addfirst(int temp) {
        if (size == 0) {
            Node nn = new Node();
            nn.val = temp;
            this.head = nn;
            this.tail = nn;
        } else {
            Node nn = new Node();
            nn.val = temp;
            nn.next = head;
            this.head = nn;
        }
        this.size++;
    }
    public void addLast(int temp) {
        if (size == 0) {
            Node nn = new Node();
            nn.val = temp;
            this.head = nn;
            this.tail = nn;
        } else {
            Node nn = new Node();
            nn.val = temp;
            tail.next = nn;
            this.tail = nn;
        }
        this.size++;
    }
    public void removefirst() {
        if (size == 0) {
        } else {
//          Node temp = head.next;
//          head = temp;
            head = head.next;
            this.size--;
        }
    }
    public void removelast() {
        if (size == 0) {
        } else {
            Node temp = this.head;
            
            while(temp.next!=tail) {
                temp =  temp.next;
            }
            this.tail = temp;
            this.tail.next = null;
        }
    }
    
    public void Display() {
        Node temp = this.head;
        while(temp!=null) {
            System.out.print(temp.val+" ==> ");
            temp = temp.next;
        }
        System.out.println(".");
    }
    
    

}
