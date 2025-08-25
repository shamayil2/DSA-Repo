package August25_HW;

public class Student {
    int id;
    String name;

    public Student(){

    }

    public Student(int id){
        this.id = id;
        
    }

    public Student(int id,String name ){
        this.id = id;
        this.name = name;
    }

    public void greet(){
        System.out.println("Hello");
    }

}
