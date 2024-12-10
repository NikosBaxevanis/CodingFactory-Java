package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης θα δινει:
 * 1. τους συνολικους βαθμους
 * 2. το πληθος των μαθηματων
 *
 * Θα υπολογιζει τον μεσο ορο και θα χαρακτηριζει
 * Αριστα αν ο  μεσος ορος πανω απο >=9
 * Πολυ καλα αν ο μεσος ορος >=7
 * Καλως αν ειναι >=5
 * Αποτυχια αν ειναι κατω απο 5
 */

public class GradesApp {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total marks");
        totalMarks = in.nextInt();

        if (totalMarks <=0) {
            System.out.println("Total marks must not be 0");
            System.exit(1);
        }

        System.out.println("Give me the count of courses");
        coursesCount = in.nextInt();

        if (coursesCount <=0) {
            System.out.println("Courses must not be 0");
            System.exit(1);
        }

        average = totalMarks/coursesCount;

        if (average > 10) {
            System.out.println("Something went wrong. The average is not valid");
            System.exit(1);
        }

        if (average >=9) {
            System.out.println("Excellent " + average);
        }
        else if (average >= 7 ) {
            System.out.println("Very good " + average);
        }
        else if (average >=5) {
            System.out.println("Good " + average);
        }
        else {
            System.out.println("Fail " + average);
        }
    }

}
