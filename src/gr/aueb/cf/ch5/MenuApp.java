package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            choice = in.nextInt();
            if (!isChoiceVaild(choice)) {
                System.out.println("Error. Choice not vaild");
                continue;
            }
            doOnChoice(choice);
        } while (choice !=5);
    }



    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Εισαγωγη");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Εξοδος");
    }

    public static boolean isChoiceVaild(int choice) {
        return choice >=1 &&  choice <=5;
    }

    public static void doOnChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Εισαγωγή proseccs");
                break;
            case 2:
                System.out.println("Διαγραφή proseccs");
                break;
            case 3:
                System.out.println("Αναζήτηση proseccs");
                break;
            case 4:
                System.out.println("Ενημέρωση proseccs");
                break;
            case 5:
                System.out.println("Έξοδος proseccs");
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }
    }
}
