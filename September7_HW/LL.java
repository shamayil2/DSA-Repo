package September7_HW;

public class LL {

    public class Node{
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
    private int size = 0;

    public void addFirst(int temp){

        if(size==0){
            Node nn = new Node();
            nn.val = temp;
            this.head = nn;
            this.tail = nn;
           
        }else{
            Node nn = new Node();
            nn.val = temp;
            nn.next = head;
            this.head = nn;
            
        }
       
        this.size++;
    }    

    public void addLast(int temp){

        if(size==0){
            
            Node nn = new Node();
            nn.val = temp;
            this.head = nn;
            this.tail = nn;

        }else{
            Node nn = new Node(); 
            nn.val = temp;
            tail.next = nn;
            this.tail = nn;
        }

        this.size++;

    }

    public void removeFirst() throws Exception{

        if(size==0){
            throw new Exception("LinkedList is Empty");
        }else{

            this.head = head.next;
            this.size--;
        }

    }

    public void removeLast() throws Exception{
        

        if(size==0){
            throw new Exception("LinkedList is empty");
        }else{

           Node temp = this.head;
           while(temp.next != this.tail){
            temp = temp.next;
           }
          
           this.tail = temp;
           this.tail.next = null;
           this.size--;
        }

    }

    public void Display(){

        Node temp = this.head;

        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println(".");

    }

    public int getAtIdx(int idx){

        if(idx>=size){
            return -1;
        }
         Node temp = this.head;
        int count = 0;
        {
            while(count!=idx){
                temp = temp.next;
                count++;
            }

        }

        return temp.val;

    }    

    public void addAtIdx(int idx,int t){

        int count = 0;
        Node temp = this.head;
        while(count!=idx-1){

            temp = temp.next;
            count++;
        }

        Node nn = new Node();
        nn.val = t;
        nn.next = temp.next;
        temp.next = nn;
        this.size++;
    }

    public void removeAtIdx(int idx){

    int count = 0;
    Node temp = this.head;
    while(count!=idx-1){
        temp = temp.next;
        count++;
    }

    temp.next = temp.next.next;
    this.size--;

    }

    public int Mid(){
        int count =0;
        Node temp = this.head;
        int targetIdx = this.size/2;
        if(this.size%2!=0){

            while(count!=targetIdx){
                count++;
                temp = temp.next;
            }

        }else{
             while(count!=targetIdx-1){

                count++;
                temp = temp.next;
            }
        }

        return temp.val;

    }

    public boolean linearsearch(int k){

        Node temp = this.head;

        while(temp!=null){
            if(temp.val==k){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}


