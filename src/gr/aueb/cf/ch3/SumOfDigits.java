package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το αθροισμα των ψηφιων
 * ενος ακεραιου. Για παράδειγμα, το αθροισμα
 * των ψηφιων του 123 ειναι 6
 */

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        System.out.println("Enter a positive integer");
        num = in.nextInt();

        while (num > 0) {
            int digit = num % 10;  // Παίρνει το τελευταίο ψηφίο
            sum += digit;             // Προσθέτει το ψηφίο στο άθροισμα
            num /= 10;
        }
        System.out.println("The sum of Digits " + num + " is " + sum);
    }
}
