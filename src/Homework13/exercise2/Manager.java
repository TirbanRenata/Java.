package Homework13.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Manager implements User {
    private String nume;
    private List<Employee> angajati;
    private List<Team> echipe;
    private List<Project> proiecte;
    private List<Resource> resurseDisponibile;
    private List<String> loguri;

    public Manager(String nume) {
        this.nume = nume;
        this.angajati = new ArrayList<>();
        this.echipe = new ArrayList<>();
        this.proiecte = new ArrayList<>();
        this.resurseDisponibile = new ArrayList<>();
        this.loguri = new ArrayList<>();
    }

    @Override
    public void vizualizeazaProgresProiect(Project proiect) {
        System.out.println(nume + " vizualizează progresul proiectului: " + proiect.getNume());
        proiect.afiseazaStatus();
    }

    @Override
    public void interactioneazaCuDate() {
        System.out.println(nume + " interacționează cu datele proiectului.");
    }

    @Override
    public List<String> vizualizeazaLoguri() {
        return loguri;
    }

    public void adaugaProiect(Project proiect) {
        proiecte.add(proiect);
        System.out.println("Proiectul " + proiect.getNume() + " a fost adăugat.");
        loguri.add("Adăugat proiect: " + proiect.getNume());
    }

    public void alocaResurse(Project proiect, Resource resursa) {
        if (resurseDisponibile.contains(resursa)) {
            proiect.adaugaResursa(resursa);
            resurseDisponibile.remove(resursa);
            System.out.println("Resursa " + resursa.getNumeResursa() + " a fost alocată proiectului " + proiect.getNume());
            loguri.add("Alocată resursa " + resursa.getNumeResursa() + " la proiectul " + proiect.getNume());
        } else {
            System.out.println("Resursa nu este disponibilă.");
        }
    }

    public void trimiteAnunturi(String anunt) {
        for (Employee angajat : angajati) {
            EmailService.trimiteEmail(angajat, anunt);
        }
        loguri.add("Anunț trimis: " + anunt);
    }

    public void gestioneazaStructuraEchipei(Team echipa, Employee angajat, boolean esteLider) {
        if (esteLider) {
            echipa.setLiderEchipa(String.valueOf(angajat));
            loguri.add("Liderul echipei " + echipa + " a fost schimbat în: " + angajat.getNume());
        } else {
            echipa.adaugaMembru(angajat);
            loguri.add("Angajatul " + angajat.getNume() + " a fost adăugat la echipa: " + echipa);
        }
    }
    public void adaugaResursaDisponibila(Resource resursa) {
        resurseDisponibile.add(resursa);
        System.out.println("Resursa " + resursa.getNumeResursa() + " a fost adăugată în lista de resurse disponibile.");
    }

}
