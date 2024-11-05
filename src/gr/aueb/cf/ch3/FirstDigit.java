package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρισκει το πρωτο ψηφειο ενος ακεραιου αριθμου
 */

public class FirstDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int tempNum = 0;
        System.out.println("Enter a positive integer");
        num = in.nextInt();
        tempNum = num;
        while (tempNum >= 10) {
            tempNum /=10;
        }




        System.out.println("The first num of the number : " + num + " is " + tempNum );
    }
}
