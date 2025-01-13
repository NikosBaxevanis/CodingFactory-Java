package gr.aueb.cf.ch14.Services;

public class CodingFactorySingleton {

    private static final CodingFactorySingleton INSTANCE = new CodingFactorySingleton();


    private CodingFactorySingleton () {

    }

    public static CodingFactorySingleton getInstance() {
        return INSTANCE;
    }

    public void sayHello () {
        System.out.println("Hello");
    }

}
