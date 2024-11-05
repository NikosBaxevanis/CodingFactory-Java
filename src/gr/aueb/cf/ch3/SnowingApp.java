package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Snowing if raining and temp < 0
 */

public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;


        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert the temp");
        temp = in.nextInt();


        isSnowing = isRaining && temp < 0;

        System.out.println("Is snowing: " + isSnowing);
    }
}
