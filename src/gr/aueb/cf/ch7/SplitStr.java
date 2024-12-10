package gr.aueb.cf.ch7;

public class SplitStr {
    public static void main(String[] args) {
        String s = "Athens Uni       of Econ           and Business";
        String [] tokens = s.split("\\s+"); //αγνοει τα παραπανω απο ενα spaces

        for (String token : tokens) {
            System.out.print(token + " ");
        }
    }
}
