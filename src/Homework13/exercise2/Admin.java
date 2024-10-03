package Homework13.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Admin implements User {
    private String nume;
    private List<String> loguri;

    public Admin(String nume) {
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
        System.out.println(nume + " interacționează cu datele aplicației.");
    }

    @Override
    public List<String> vizualizeazaLoguri() {
        return loguri;
    }


    public void actualizeazaConfiguratiaAplicatiei() {
        System.out.println(nume + " actualizează configurația aplicației.");
        loguri.add("Admin a actualizat configurația aplicației.");
    }
    public void adaugaUtilizator(User utilizator) {
        System.out.println(nume + " a adăugat utilizatorul: " + ((utilizator instanceof Manager) ? "Manager" : "Utilizator") + " în sistem.");
        loguri.add("Utilizator adăugat de admin: " + utilizator.getClass().getSimpleName());
    }

    public void stergeUtilizator(User utilizator) {
        System.out.println(nume + " a șters utilizatorul: " + ((utilizator instanceof Manager) ? "Manager" : "Utilizator") + " din sistem.");
        loguri.add("Utilizator șters de admin: " + utilizator.getClass().getSimpleName());
    }
    public void vizualizeazaLoguriAplicație() {
        System.out.println("Admin vizualizează logurile aplicației:");
        for (String log : loguri) {
            System.out.println(log);
        }
    }

}
