package gr.aueb.cf.ch12;

public class StudentDemo {
    public static void main(String[] args) {

        Student student  = new Student(); // καλουμε τον default constructor
        Student bob = new Student(2, "Bob" , "D. "); //εδω καλουμε τον overloaded constructor

        bob.setLastname("Dylan");

        student.setId(1);
        student.setFirstname("Alice");
        student.setLastname("W.");


        System.out.println("id : " + student.getId());
        System.out.println("Firstname: " + student.getFirstname());
        System.out.println("Lastname: " +student.getLastname());

        System.out.println("Student instances' count : " + Student.getStudentsCount());
        System.out.println("id : " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastname: " +bob.getLastname());

//        System.out.println("id : " + student.id);
//        System.out.println("Firstname: " + student.firstname);
//        System.out.println("Lastname: " + student.lastname);


    }
}
