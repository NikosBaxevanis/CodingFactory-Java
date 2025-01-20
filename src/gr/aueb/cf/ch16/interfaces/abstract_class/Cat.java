package gr.aueb.cf.ch16.interfaces.abstract_class;

public class Cat  extends  Animal {

    public Cat () {
        super();
    }
    @Override
    public void speak() {
        System.out.println("niaou");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("... ate all her food");
    }

    @Override
    public String toString() {
        return getId() + ", " + getName();
    }
}
