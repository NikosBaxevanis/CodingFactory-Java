package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numerator = 0;
        double denominator = 0;
        double result = 0;

        while (true) {
            System.out.println("Please insert numerator (Quit with numerator = 0)");
            numerator = in.nextInt();

            if (numerator ==0) {
                System.out.println("numerator is zero. Quits..");
                break;
            }

            System.out.println("Please insert denominator (Quit with denominator = 0)");
            denominator = in.nextInt();

            if (denominator == 0) {
                System.out.println("denominator must not be zero");
                continue;
            }
            result = numerator / denominator;
            System.out.println("Result is: " + result);
        }
    }
}
