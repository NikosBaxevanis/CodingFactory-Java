package gr.aueb.cf.ch7;

import java.util.Scanner;

public class IOStrApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert two strings");

        s1 = in.next();
        s2 = in.next();

        /**
         * or s2 = in.nextline();
         */

        System.out.println("The first string is: " + s1);
        System.out.println("The second string is: " + s2);

        System.out.printf("s1: %s\n",s1);
        System.out.printf("s2: %s\n",s2);
    }
}
