package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int inputHours;
        final int inputDays;
        final int inputMins;
        final int inputSeconds;
        final int sec_per_day = 3600*24;
        final int sec_per_hour = 3600;
        final int sec_per_min = 60;

        int hours , days , mins , seconds;


        System.out.println("Give an amount of Hours or Days or Mins or Seconds");
        inputHours = in.nextInt();
        inputDays = in.nextInt();
        inputMins = in.nextInt();
        inputSeconds = in.nextInt();
        int totalSecs = 0;

        seconds = inputSeconds;
        mins = inputSeconds*60;
        hours = inputHours*3600;
        days = inputDays*86400;

        totalSecs = inputDays * sec_per_day + inputHours * sec_per_hour + inputMins * sec_per_min + inputSeconds;
        System.out.printf("seconds = %d   mins = %d  hours = %d  days = %d" , seconds,mins,hours,days);
        System.out.printf("Total seconds: %,d seconds\n" , totalSecs);

    }
}
