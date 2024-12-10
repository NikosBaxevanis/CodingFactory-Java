package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Turn Lights on , if it is raining
 * AND car is running >100 or is dark.
 *
 */

public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isDark = false;
        boolean isCarRunning = false;
        boolean isRaining = false;
        boolean areLightsOn = false;
        int carSpeed;
        final int MAX_CAR_SPEED = 100;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed");
        carSpeed = in.nextInt();

        isCarRunning = carSpeed > MAX_CAR_SPEED;

        areLightsOn = (isRaining && isDark) || (isRaining && isCarRunning);

        System.out.println("Are Lights on? " + areLightsOn);
    }
}
