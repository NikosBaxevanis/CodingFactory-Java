package gr.aueb.cf.ch19.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMain {

    public static void main(String[] args) {
        List<String> cities = List.of("Athens","London","Toronto","Tunis");

        var tCities = cities.stream()  //Σαν να υπάρχει μια for . Το startsWith επιστρέφει true/false(boolean function)
                .filter(city -> city.startsWith("T")).collect(Collectors.toList()); //Java 8+ , mutable list

        var tCities2 = cities.stream()  //Σαν να υπάρχει μια for . Το startsWith επιστρέφει true/false(boolean function)
                .filter(city -> city.length() >= 6).toList();                     //Java 16+ , immutable list


        tCities.forEach(System.out::println);

        Set<String> uniqueCityNames = cities.stream().collect(Collectors.toSet());

        //        Set<String> uniqueCityNames = new HashSet<>(cities);


        uniqueCityNames.forEach(System.out::println);


        var strCities = cities.stream()
                .collect(Collectors.joining(", "));

        System.out.println(strCities);

       // var strCities = String.join(", ", cities);
    }
}
