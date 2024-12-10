package gr.aueb.cf.ch5;

public class PowerAppRecursive {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        System.out.println("the result is: " + pow(a, b));
    }

    public static int pow(int a, int b) {
        if (b == 0)
            return 1;
        return pow(a, b - 1) * a;
            //return (n==0) ? 1 : power(a,n-1)*a;

    }
}
