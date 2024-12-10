package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConventer {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputEuros;
        final int isotimia = 99;
        int totalUsaCents, usaCents, usaDollars;

        System.out.println("Please insert amount of Euros");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * isotimia;
        usaDollars = totalUsaCents/100;
        usaCents = totalUsaCents%100;

        System.out.printf("%d  euros = %d   usa cents = %d usa dollars = %d & usa cents " , inputEuros,totalUsaCents,usaDollars,usaCents);
    }
}
