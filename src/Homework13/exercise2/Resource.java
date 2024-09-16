package Homework13.exercise2;

public class Resource {
    private String numeResursa;
    private int cantitate;

    public Resource(String numeResursa, int cantitate) {
        this.numeResursa = numeResursa;
        this.cantitate = cantitate;
    }

    public String getNumeResursa() {
        return numeResursa;
    }

    public int getCantitate() {
        return cantitate;
    }

    @Override
    public String toString() {
        return numeResursa + " (Cantitate: " + cantitate + ")";
    }
}
