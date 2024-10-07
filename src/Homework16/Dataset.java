package Homework16;

import java.util.List;

public class Dataset {
    private List<String> data;

    public Dataset(List<String> data) {
        this.data = data;
    }

    @Override
    public String toString() {

        return "Dataset Summary: " + data.subList(0, Math.min(data.size(), 5)).toString() +
                (data.size() > 5 ? ", ... (Total: " + data.size() + " items)" : "");
    }

    public static void main(String[] args) {
        Dataset dataset = new Dataset(List.of("Item1", "Item2", "Item3", "Item4", "Item5", "Item6"));
        System.out.println(dataset.toString());
    }
}
