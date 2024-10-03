package Homework13.exercise2;

public class Employee {
    private String nume;
    private String pozitie;
    private String rol;

    public Employee(String nume, String pozitie, String rol) {
        this.nume = nume;
        this.pozitie = pozitie;
        this.rol = rol;
    }

    public String getNume() {
        return nume;
    }

    public String getPozitie() {
        return pozitie;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return nume + " (" + pozitie + ", Rol: " + rol + ")";
    }
}
