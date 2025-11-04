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
   while(temp!=null){
    System.out.print( temp.val + " ==> ");
    temp = temp.next;
   }

   System.out.println(".");

}

public void createCycle( int temp){
    Node nn  = new Node();
    nn.val = temp;
    this.tail.next = nn;
    nn.next= this.head;

}

public boolean detectCycle(){

    Node slow = this.head;
    Node fast = this.head;

    while(fast!=null && fast.next!=null){

        slow = slow.next;
        fast = fast.next.next;

        if(slow==fast){
            return true;
        }
    }


    return false;
}}

