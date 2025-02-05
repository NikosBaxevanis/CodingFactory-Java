package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products1 = List.of(new Product("",12.5,10),    //Immutable List
                new Product("",13,11));

        List<Product> products2 = Arrays.asList(new Product("Apples", 12.5, 10), //Partially Immutable List
                new Product("Oranges", 13, 11));


        List<Product> products = Arrays.asList(new Product("Apples", 12.5, 10), new Product("Oranges", 13, 11),  //Mutable List
                new Product("Berries", 13, 11));

        products.sort(Comparator.naturalOrder());
        products.sort(Comparator.reverseOrder());

        products.sort(Comparator.comparing(Product::getName));
        products.sort(Comparator.comparing(Product::getName).thenComparing(Product::getQuantity, Comparator.reverseOrder()));

        products.forEach(System.out::println);
    }
}
