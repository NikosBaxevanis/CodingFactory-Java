package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with vat.
 */

public class PriceWithVat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double vat = 1.24;
        double price = 0.0;
        double aftervatprice = 0.0;

        System.out.println("Please insert price");
        price = in.nextDouble();

        aftervatprice = price * vat;

        System.out.println("aftervatprice is: " + aftervatprice);


    }
}
