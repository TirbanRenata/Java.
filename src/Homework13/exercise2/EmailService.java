package Homework13.exercise2;

public class EmailService {
    public static void trimiteEmail(Employee angajat, String mesaj) {
        System.out.println("Se trimite e-mail către " + angajat.getNume() + ": " + mesaj);
    }
}
