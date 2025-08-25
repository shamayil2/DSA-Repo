package August25_HW;

public class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person(20,"Shamayil");

        p1.greet("Minha");
        Person p2 = new Person(99,"Azeem");
        p2.greet("Nabiya");
         
        p2.setAge(-50);
        System.out.println("Hello");
       
    }


}
