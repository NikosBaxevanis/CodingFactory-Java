package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretWhileFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int secret = 12;
        boolean isSuccess = false;


        do {
            System.out.println("Insert a guessed number");
            num = in.nextInt();
            if (num == secret) {
                System.out.println("You found it");
                isSuccess = true;
            } else {
                System.out.println("You didn't found it");
            }
        } while (!isSuccess);
    }
}
