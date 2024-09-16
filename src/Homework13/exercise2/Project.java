package Homework13.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String nume;
    private String termenLimita;
    private String status;
    private List<Resource> resurse;
    private List<Team> echipe;

    public Project(String nume, String termenLimita, String status) {
        this.nume = nume;
        this.termenLimita = termenLimita;
        this.status = status;
        this.resurse = new ArrayList<>();
        this.echipe = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public String getTermenLimita() {
        return termenLimita;
    }

    public String getStatus() {
        return status;
    }

    public void adaugaResursa(Resource resursa) {
        resurse.add(resursa);
        System.out.println("Resursa " + resursa.getNumeResursa() + " a fost adăugată la proiect.");
    }

    public void adaugaEchipa(Team echipa) {
        echipe.add(echipa);
        System.out.println("Echipa " + echipa + " a fost adăugată la proiect.");
    }

    public void afiseazaStatus() {
        System.out.println("Proiect: " + nume);
        System.out.println("Status: " + status);
        System.out.println("Termen limită: " + termenLimita);
        System.out.println("Resurse folosite:");
        for (Resource resursa : resurse) {
            System.out.println(resursa);
        }


    }


    public void schimbaStatus(String statusNou) {
        this.status = statusNou;
        System.out.println("Statusul proiectului " + nume + " a fost schimbat la: " + statusNou);
    }
}
