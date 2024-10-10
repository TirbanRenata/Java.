package Homework18;

import Homework12.exercise3.A;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestAveragePrice {
    public static void main(String... args){
        List<Product> products = Arrays.asList(
                new Product("Shoes","Clothing",300),
                new Product("Laptop","Electronics",5000),
                new Product("Shirt","Clothing",50)
        );

        String highestAveragePrice = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,Collectors.averagingDouble(Product::getPrice)))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("No category found");
        System.out.println(highestAveragePrice);
    }
}
class Product{
    private String name;
    private String category;
    private double price;
    public Product(String name, String category, double price){
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }


}
