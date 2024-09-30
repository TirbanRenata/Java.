package Homework16;

import java.util.Objects;

public class Student {
    public static void main(String[] args){

        Student student1 = new Student("Ion", 22, 12345, "ion11@gmail.com");
        Student student2 = new Student("Ion", 22, 67890, "ion11@gmail.com");
        Student student3 = new Student("Jane", 23, 54321, "jane.smith@gmail.com");

        System.out.println("Student 1 equals Student 2: " + student1.equals(student2));
        System.out.println("Hashcodes are equal (Student 1 and Student 2): " + (student1.hashCode() == student2.hashCode()));

        System.out.println("Student 1 equals Student 3: " + student1.equals(student3));
        System.out.println("Hashcodes are equal (Student 1 and Student 3): " + (student1.hashCode() == student3.hashCode()));


    }

    private String name;
    private int age;
    private int studentID;
    private String email;

    public Student(String name, int age, int studentID, String email){
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o){
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof Student))
            return false;
        Student student = (Student) o;
        return student.age == this.age && Objects.equals(this.name, student.name) && Objects.equals(this.email,student.email);
    }



    @Override

    public int hashCode(){
        return Objects.hash(name,age,email);
    }
}
