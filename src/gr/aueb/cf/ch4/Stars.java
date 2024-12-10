package gr.aueb.cf.ch4;


/**
 * prints differnt outputs of stars
 */

public class Stars {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("*");
        }
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("*");
            }
        }

        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
