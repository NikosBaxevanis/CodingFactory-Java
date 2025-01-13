package gr.aueb.cf.ch14;

import gr.aueb.cf.ch14.Services.HelloUtil;
import gr.aueb.cf.ch14.model.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Nikos" ,"Baxevanis");
        Teacher teacher2 = new Teacher(2,"E" , "Ga");
        Teacher teacher3 = new Teacher(3, "K", "Ga");


        HelloUtil.sayHello();
    }
}
