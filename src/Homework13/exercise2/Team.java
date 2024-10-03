package Homework13.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String numeEchipa;
    private String liderEchipa;
    private List<Employee> membri;

    public Team(String numeEchipa, String liderEchipa) {
        this.numeEchipa = numeEchipa;
        this.liderEchipa = liderEchipa;
        this.membri = new ArrayList<>();
    }

    public void adaugaMembru(Employee membru) {
        if (!membri.contains(membru)) {
            membri.add(membru);
            System.out.println("Angajatul " + membru.getNume() + " a fost adăugat la echipa " + numeEchipa);
        } else {
            System.out.println("Angajatul " + membru.getNume() + " este deja membru al echipei " + numeEchipa);
        }
    }


    public void setLiderEchipa(String lider) {
        this.liderEchipa = lider;
    }

    public void vizualizeazaStructuraEchipei() {
        System.out.println("Echipa: " + numeEchipa);
        System.out.println("Lider echipă: " + liderEchipa);
        System.out.println("Membri:");
        for (Employee membru : membri) {
            System.out.println(membru);
        }
    }
}
