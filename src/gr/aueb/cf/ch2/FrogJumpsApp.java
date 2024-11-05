package gr.aueb.cf.ch2;


/**
 *
 */

public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        jumps = (int) Math.ceil((target - start) / (double) hop);


        //for (int i = 10 ; i<=85;  i+=30) {
         //   jumps = jumps + 1;
        //}

        System.out.println("Jumps: " + jumps);
    }
}
