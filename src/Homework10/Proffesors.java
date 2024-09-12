package Homework10;

public class Proffesors {

    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String birth;
    private String CNP;
    private String adress;

    public Proffesors(String firstName, String lastName,String sex,int age,String birth, String CNP, String adress){
        this.firstName= firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.birth = birth;
        this.CNP = CNP;
        this.adress = adress;
    }
    public void viewProffesors(){
        System.out.println("Proffesor: "+ firstName +" " +lastName );
        System.out.println("Sex: "+ sex);
        System.out.println("Age: "+ age);
        System.out.println("Birth: " + birth);
        System.out.println("CNP: "+ CNP);
        System.out.println("Adress: "+ adress);
    }
}
