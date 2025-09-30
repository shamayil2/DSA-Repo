package Lecture33;

public abstract class AbstractDemo {
    
    public abstract void p1();

    public void p2(){
        System.out.println("Hi this is in p2");
    }

    public static void main(String[] args){

        AbstractDemo demo = new AbstractDemo() {
             //Overriding
            public void p1(){
                System.out.println("This is in P1");
            }

        };

        demo.p1();
        demo.p2();
    
    }

}



