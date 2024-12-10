package gr.aueb.cf.ch4;

import java.math.BigInteger;

/**
 * Calculates a^n
 * e.g 2^10 = 1024
 */

public class PowerApp {
    public static void main(String[] args) {
        int base = 2;
        int power = 100;
        int result = 1;
        BigInteger bigresult = new BigInteger("1");

        for (int i = 1; i<=power ; i++) {
            result = result * base;
            bigresult = bigresult.multiply(BigInteger.valueOf(base));

        }
        System.out.println("result: " + result);
        System.out.println("Big result is: " + bigresult) ;
    }
}
