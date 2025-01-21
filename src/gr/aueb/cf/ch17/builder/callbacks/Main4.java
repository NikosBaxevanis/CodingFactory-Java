package gr.aueb.cf.ch17.builder.callbacks;

public class Main4 {
    public static void main(String[] args) {
        doPrint(Main4::sayHelloWorld); //Method References


        doPrint(Main4::sayHelloCoding); //Method References

    }

    public static void doPrint(Printable printable) {
        printable.print();
    }

    public static void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void sayHelloCoding() {
        System.out.println("Hello Coding");
    }
}
