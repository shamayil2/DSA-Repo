package Lecture33;

public class AbstractChild extends AbstractDemo{
  //Overriding
    public void p1(){
        System.out.println("Inside P1 From Abstract Child");
    }

    public static void main(String[] args) {
        AbstractChild child = new AbstractChild();
        child.p1();
    }
    
};
