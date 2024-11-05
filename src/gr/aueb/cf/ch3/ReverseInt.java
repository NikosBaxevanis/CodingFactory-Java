package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Να δινει ο χρηστης εναν αριθμο και να παιρνουμε τον αντιστροφο του
 * Π.χ να δινει το 123 και να παιρνουμε το 321
 */

public class ReverseInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int reversed = 0;
        int tempNum = 0;
        int rightDigit = 0;
        System.out.println("Give the Number");
        num = in.nextInt();


        tempNum = num;
        while (tempNum > 0) {
            rightDigit =tempNum % 10;
            reversed = reversed * 10 + rightDigit;
            tempNum /=10;
        }


        System.out.println("The reversed Number is: " + reversed);
    }
}
