package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel2 {
    public static void main(String[] args) {
        int positives = 0;
        Scanner in = new Scanner(System.in);
        int inputNum=0;
        int count = 0;
        System.out.println("Please insert a num");


        while ((inputNum = in.nextInt()) >=0 ) {
            positives ++;
            System.out.println("Please insert a num");
            count ++;

        }
        System.out.println("Positives are: " + count);
    }
}
