package August25_HW;

public class Person {
     static int count = 0;
    int id;
    String name;
    int age;

    public Person(int id,String name){
        this.id = id;
        this.name = name;
        count++;
    }

    public void greet(String name){
        System.out.println(this.name + " says hello to " + name + " and count is " + count);
    }

    public void setAge(int age){

        try{
            if(age<0){
                throw new Exception("Age cannot be negative");
            }else{
                this.age = age;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Hello from finally");
        }

    }

}
