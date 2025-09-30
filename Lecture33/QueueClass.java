package Lecture33;

public abstract class QueueClass implements QueueI{

    

public static void main(String[] args) {
    QueueClass q1 = new QueueClass() {
        public void enqueue(){
            System.out.println("IN Queue");
        }
    };

    q1.enqueue();
}

}