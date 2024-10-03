package Homework13.exercise2;

import java.util.ArrayList;
import java.util.List;

public class ConstructorEngineer implements User {
    private String nume;
    private List<String> loguri;

    public ConstructorEngineer(String nume) {
        this.nume = nume;
        this.loguri = new ArrayList<>();
    }

    @Override
    public void vizualizeazaProgresProiect(Project proiect) {
        System.out.println(nume + " vizualizează progresul proiectului: " + proiect.getNume());
        proiect.afiseazaStatus();
    }

    @Override
    public void interactioneazaCuDate() {
        System.out.println(nume + " poate interacționa cu date limitate.");
    }

    @Override
    public List<String> vizualizeazaLoguri() {
        return loguri;
    }
}
