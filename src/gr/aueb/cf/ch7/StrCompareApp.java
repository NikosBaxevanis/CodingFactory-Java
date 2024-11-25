package gr.aueb.cf.ch7;


/**
 * Compares two strings for lt (less than) , gt(greater than) , eq (equal)
 */

public class StrCompareApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "ATHENS";

        if (s1.compareTo(s2) > 0) { //συμφωνα με το ASCI το μικρο γραμμα ειναι > απο το μεγαλο γραμμα. δηλαδη α > Α
            System.out.println("s1 > s2");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("s1 < s2");
        }
        else {
            System.out.println("The are equal");
        }

        if (s1.compareToIgnoreCase(s2) > 0) {
            System.out.println("s1 > s2");
        } else if (s1.compareToIgnoreCase(s2) < 0) {
            System.out.println("s1 < s2");
        }
        else {
            System.out.println("The are equal");
        }
    }
}
