package gr.aueb.cf.ch19.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {
    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Apples", 10.5,45),
                new Product("Oranges",8.5,20),
                new Product("Mangoes",18.5,10),
                new Product("Strawberries",28.5,30));


        ArrayList<String> listOfFruitNames = products.stream()
                .map(Product::getName)
                .collect(Collectors.toCollection(ArrayList::new));

        int totalQuantities = products.stream().
                filter(p -> p.getName().equals("Oranges"))
                .mapToInt(Product::getQuantity)
                .sum();
    }
}
