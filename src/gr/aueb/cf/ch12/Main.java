package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.*;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1,"Athanasios","Androutsos");
        User user = new User(1,"Nikos" , "Baxevanis" , "nikba" ,"1234" ,true);
        Customer customer = new Customer(1, "Andrew" , "Dimitriou", "075423232" , "6932423532","West Attica" , "Attica" , "Athens", "Patision" , "76", "10423" );
        Point point = new Point(0,10);
        Order order = new Order(1,5.5,"Meat","Ordered");



        System.out.println("Teacher full name: "+ teacher.getFirstname() + ", " + teacher.getFirstname());
        System.out.println("User username: " + user.getUsername());
        System.out.println("Customer vat: " + customer.getVatRegistrationNo());
        System.out.println("Order Formated Timestamp" +order.getFormatedTimestamp());
        System.out.printf("Point: {%d, %d}\n",point.getX() , point.getY());
    }
}
