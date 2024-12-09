package gr.aueb.cf.ch10;


import javax.management.StringValueExp;
import java.util.Scanner;

/**
 * 153 => 1^3 + 5^3 + 3^3 if this equals 153 , it's an Armstrong number
 */

public class Armstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = in.nextInt();
        int originalNum = num;
        int sum= 0;
        int numberOfDigits = String.valueOf(num).length();




        while (num>0) {
            int digit = num %10;
            sum += Math.pow(digit,numberOfDigits);
            num /=10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " The number is Armstrong one");
        }
        else {
            System.out.println(originalNum + " The number is not an Armstrong one");
        }
    }
}
