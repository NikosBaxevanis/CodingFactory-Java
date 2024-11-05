package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπαρχει ενα Secret που ειναι integer και ο
 * χρηστης με μια μονο προσπαθεια θα προσπαθησει να τον βρει
 */

public class SecretFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int secret = 12;

        System.out.println("Insert a guessed number");
        num = in.nextInt();

        if (num == secret) {
            System.out.println("You found it");
        }
        else {
            System.out.println("You didn't found it");
        }
    }
}
