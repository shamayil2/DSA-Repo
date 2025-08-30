package August30_HW;
public class Stack {
    
    private int[] arr;
    private int top = -1;

    public Stack(){
        this.arr = new int[5];
    }

    public Stack(int size){
        this.arr = new int[size];
    }

    public boolean isEmpty(){
        if(this.top==-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(top==arr.length-1){
            return true;
        }else{
            return false;
        }
    }

    public void push(int item) throws Exception{

        if(isFull()){
            throw new Exception("Stack is Full.");
        }

        this.top++;
        arr[top] = item;

    }

    public int pop() throws Exception{

        if(isEmpty()){
            throw new Exception("Stack is Empty.");
        }
        int temp = arr[top];
        arr[top] =0;
        top--;
        return temp;
    }   

    public int peek() throws Exception{

        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }

        return arr[top];

    }

    public int size(){
        return top + 1;
    }

    public void display(){

        for (int i = top; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void clear(){
        this.arr = new int[arr.length];
        top = -1;
    }

}
