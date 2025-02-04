package gr.aueb.cf.ch19.deq_queue;

import gr.aueb.cf.ch19.deq_stack.MyStack;

public class DeqMain {
    public static void main(String[] args) {
        MyQueue<String> strQueue = new MyQueue<>();

        strQueue.enQueue("ABC1234");
        strQueue.enQueue("z107781");
        strQueue.enQueue("ZIA5752");


        String firstOut = strQueue.deQueue();

        System.out.println(firstOut);
        System.out.println();

        strQueue.forEach(System.out::println);
    }
}
