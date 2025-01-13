package gr.aueb.cf.ch14;

import gr.aueb.cf.ch14.Services.CodingFactorySingleton;
import gr.aueb.cf.ch14.Services.HelloUtil;
import gr.aueb.cf.ch14.model.Point;
import gr.aueb.cf.ch14.model.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Nikos" ,"Baxevanis");
        Teacher teacher2 = new Teacher(2,"E" , "Ga");
        Teacher teacher3 = new Teacher(3, "K", "Ga");


        HelloUtil.sayHello();

        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomPoint();

        System.out.println(p1);
        System.out.println(p2);

        CodingFactorySingleton cf1 = CodingFactorySingleton.getInstance();
        CodingFactorySingleton cf2 = CodingFactorySingleton.getInstance();

        System.out.println(cf1); //αυτο που τυπωνεται ειναι η διευθυνηση του χωρου στο heap
        System.out.println(cf2);
    }
}
