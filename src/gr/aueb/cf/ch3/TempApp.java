package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Να δίνει ο χρήστης μια θερμοκρασία και αν η θερμοκρασία είναι κάτω απο το 0 να λέει ότι είναι κάτω από το μηδέν.
 */

public class TempApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int temp = 0;
        boolean isTempBelowZero = false;

        System.out.println("Please insert the current temperature");
        temp = in.nextInt();

        isTempBelowZero = temp < 0;

        System.out.println("The temp is below zero : " + isTempBelowZero);
    }
}
