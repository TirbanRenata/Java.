package Homework10WithScanner;

public class Students {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String birth;
    private String CNP;
    private String adress;

    public Students(String firstName, String lastName,String sex,int age,String birth, String CNP, String adress){
        this.firstName= firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.birth = birth;
        this.CNP = CNP;
        this.adress = adress;
    }
    public void viewStudents(){
        System.out.println("Student: "+ firstName +" " +lastName );
        System.out.println("Sex: "+ sex);
        System.out.println("Age: "+ age);
        System.out.println("Birth: " + birth);
        System.out.println("CNP: "+ CNP);
        System.out.println("Adress: "+ adress);
    }
}
