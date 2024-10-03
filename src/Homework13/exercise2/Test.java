package Homework13.exercise2;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", "Inginer", "Membru");
        Employee e2 = new Employee("Renata", "Inginer", "Membru");
        Employee e3 = new Employee("Ion", "Lider echipă", "Lider");

        Team echipa = new Team("Alpha", "Ion");
        echipa.adaugaMembru(e1);
        echipa.adaugaMembru(e2);

        Manager manager = new Manager("Ana");
        echipa.vizualizeazaStructuraEchipei();

        Project proiect = new Project("Cladire Birouri", "11-02-2025", "In Progres");
        manager.adaugaProiect(proiect);

        Resource resursaCiment = new Resource("Ciment", 100);
        manager.adaugaResursaDisponibila(resursaCiment);

        manager.alocaResurse(proiect, resursaCiment);

        manager.vizualizeazaProgresProiect(proiect);

        manager.trimiteAnunturi("Ședința companiei la ora 16:00.");

        proiect.schimbaStatus("Finalizat");
    }
}

