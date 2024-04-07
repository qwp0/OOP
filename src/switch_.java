public class switch_ {

    public static void main(String[] args){
        Student s1 = new Student();
        Person p1 = (Person) s1;
        System.out.println("Person? " + (p1 instanceof Person));
        System.out.println("Student? " + (p1 instanceof Student));
        System.out.println("Professor? " + (p1 instanceof Professor ));
    }}