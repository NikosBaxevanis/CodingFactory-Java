package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβάνει ως input από τον χρήστη ένα
 * δυψήφιο ακέραιο και να εκτυπώνει το άθροισμα των ψηφίων του.
 * Για παράδειγμα αν ο χρήστης δώσει τον αριθμό 15 να τυπώνει 1+5 = 6
 */

public class DigitsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first;
        int num1;
        int num2;
        int sum;

        System.out.println("Give an Integer");

        first = in.nextInt();

        num1  = first/10; //Με Div 10 Παιρνουμε το αριστερο ψηφιο
        num2 = first%10; //Με mod 10 παιρνουμε το δεξι ψηφιο

        sum = num1 + num2;

        System.out.printf("Το άθροισμα των ψηφίων του ακεραίου είναι :  %d " , sum);


    }
}
