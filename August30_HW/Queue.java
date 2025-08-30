package August30_HW;

public class Queue {
    private int[] arr;
    private int size;
    private int front;

    public Queue(){
        this.arr = new int[5];
    }

    public Queue(int capacity){
        this.arr = new int[capacity];
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public boolean isFull(){
        return this.size==arr.length;
    }

    public void enqueue(int item) throws Exception{

        if(isFull()){
            throw new Exception("Queue is full");
        }
        
        int idx = (this.front + this.size)% arr.length;
        arr[idx] = item;
        this.size++;
        
    }

    public int dequeue() throws Exception{

        int temp = arr[front];
        arr[front] = 0;
        front = (front+1)%arr.length;
        this.size--;
        return temp;

    }

  	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx  = (front+i)%arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}

}
