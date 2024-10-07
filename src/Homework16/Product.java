package Homework16;

import java.util.Objects;

public class Product {
    public static void main(String[] args){
        Product product1 = new Product("Laptop",4000,"L3456");
        Product product2 = new Product("Tablet",2200,"L3456");
        Product product3 = new Product("Smartphone",3500,"S3333");

        System.out.println("Product 1 equals Product 2: " + product1.equals(product2));
        System.out.println("Hashcodes are equal (Product 1 and Product 2): " + (product1.hashCode() == product2.hashCode()));

        System.out.println("Product 1 equals Product 3: " + product1.equals(product3));
        System.out.println("Hashcodes are equal (Product 1 and Product 3): " + (product1.hashCode() == product3.hashCode()));

    }

    private String name;
    private int price;
    private  String priceID;

    public Product(String name, int price,String priceID){
        this.name = name;
        this.price = price;
        this.priceID = priceID;
    }
    @Override
    public boolean equals(Object o){
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof Product))
            return false;
        Product product = (Product) o;
        return Objects.equals(this.priceID,product.priceID)  ;
    }



    @Override

    public int hashCode(){
        return Objects.hash(priceID);
    }


}
