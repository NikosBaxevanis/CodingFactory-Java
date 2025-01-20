package gr.aueb.cf.ch16.interfaces.default_static;

public class Main {
    public static void main(String[] args) {
        IWelcome.staticMethod();
        CodingWelcome.staticMethod();



        CodingWelcome codingWelcome = new CodingWelcome();
        codingWelcome.defaultMethod();
    }
}
