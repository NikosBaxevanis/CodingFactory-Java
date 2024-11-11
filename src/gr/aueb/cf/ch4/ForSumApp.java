package gr.aueb.cf.ch4;

public class ForSumApp {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1 ; i<=10 ; i++) {
            sum = sum + i;
            mul = mul * i;
        }
        System.out.println("Sum: " + sum + " " + "Mul: " + mul);
    }
}
