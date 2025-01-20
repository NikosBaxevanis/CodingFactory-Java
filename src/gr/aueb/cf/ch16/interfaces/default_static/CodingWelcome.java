package gr.aueb.cf.ch16.interfaces.default_static;

public class CodingWelcome implements IWelcome{

    //Hide

    public static void staticMethod() {
        System.out.println("Static method from CodingWelcome hides IWelcome");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in CodingWelcome");
        IWelcome.super.defaultMethod();
    }
}
