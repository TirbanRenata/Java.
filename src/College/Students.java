package College;


public class Students {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String birthDate;
    private String CNP;
    private String address;

    public Students(String firstName, String lastName, String gender, int age, String birthDate, String CNP, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.birthDate = birthDate;
        this.CNP = CNP;
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }
}


