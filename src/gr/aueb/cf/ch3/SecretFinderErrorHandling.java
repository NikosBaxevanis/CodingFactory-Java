package gr.aueb.cf.ch3;


import java.util.Scanner;

public class SecretFinderErrorHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int secret = 12;
        boolean isSuccess = false;

        while (true) {
            System.out.println("Insert a guessed number");
            num = in.nextInt();

            if (num != secret) {
                System.out.println("Try again");
                continue;
            }

            System.out.println("Bingo");
            break;
        }
    }
}
