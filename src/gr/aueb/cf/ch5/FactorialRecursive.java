package gr.aueb.cf.ch5;

public class FactorialRecursive {
    public static void main(String[] args) {
        int n =3 ;
        System.out.println("Factorial of n: is " + facto(n));
    }

    public static int facto(int n) {
        if (n<=1) return 1;
        return facto(n-1)*n;
        //or return (n <=1) ? 1L : n * facto(n-1);
    }
}
