package August25_HW;

public class StudentClient {
    public static void main(String[] args) {

    Student s = new Student();
    s.id = 35;
    s.name = "Shamayil";
    
    System.out.println(s.id);
    System.out.println(s.name);

    Student s1 = new Student(39);

    System.out.println(s1.id);

    Student s2 = new Student(55,"Rupali");
    System.out.println(s2.id);
    System.out.println(s2.name);    

    }
}
