package JavaEight;

import java.util.ArrayList;
import java.util.List;

public class Product {

    String name;
    int price;

    Product(String name,int price){
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return name+" "+price;
    }

    public static void main(String[] args) {
        List<Product> productListlist=new ArrayList<>();
        productListlist.add(new Product("mobile",13000));
        productListlist.add(new Product("Laptop",28000));
        productListlist.add(new Product("computer",40000));
        productListlist.add(new Product("television",18000));


        productListlist.forEach(n->System.out.println(n));


    }


}
