package Test_Questions;

public class LinkedList {
   
private class Node{

        int val;
        Node next;

        public Node(){

        }

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }

    }

private Node head;
private Node tail;
private int size;

public void addFirst(int temp){

   Node nn = new Node();
   nn.val = temp;
   if(size==0){
    this.head = nn;
    this.tail = nn;
   }else{
    nn.next = this.head;
    this.head = nn;
   }
   
    this.size++;

}

public void addLast(int temp){

    Node nn = new Node();
    nn.val = temp;

    if(size==0){
        this.head = nn;
        this.tail = nn;
    }else{
        tail.next = nn;
        this.tail = nn;
    }
    this.size++;


    
}



public void Display(){

   Node temp = head;
   while(temp!=null ){
    System.out.print( temp.val + " ==> ");
    temp = temp.next;
   }

   System.out.println(".");

}

public void createCycle(int position) {
    if (head == null || position < 0) {
        return;
    }
    
    Node temp = head;
    int count = 0;
    
    // Find the node at the given position
    while (temp != null && count < position) {
        temp = temp.next;
        count++;
    }
    
    // If position is valid, create cycle
    if (temp != null) {
        tail.next = temp;  // Connect tail to the node at position
    }
}

public boolean detectCycle(){

    Node slow = this.head;
    Node fast = this.head;

    while(fast!=null && fast.next!=null){

        slow = slow.next;
        fast = fast.next.next;

        if(slow==fast){

             slow = head;

             while(slow!=fast){
                slow=slow.next;
                fast= fast.next;
             }
             System.out.println("Cycle starts at " + slow.val);
            return true;
        }
    }


    return false;
}

public void removeCycle(){

    Node slow = head;
    Node fast = head;

    while(fast.next!=null && fast!=null){
        slow = slow.next;
        fast= fast.next.next;

        if(slow==fast){

            System.out.println("Cycle is present...");

            slow = head;
            while(fast!=slow){
                slow=slow.next;
                fast = fast.next;
            }

            slow.next=null;
            this.tail = slow;
            System.out.println("Cycle Removed");
            return;
        }

    }



}

}