package gr.aueb.cf.ch20;

public class RegExMain {
    public static void main(String[] args) {
        String s = "red";
        System.out.println(isRed(s));
        System.out.println(isRedOrGreen(s));

        String [] tokens = doSplit(s);
        for (String token : tokens) {
            System.out.println(token + " ");
        }
    }


    /**
     * Ελέγχει (matches) αν το Input string
     * είναι το "red"
     * @param s
     * @return
     */

    public static boolean isRed(String s) {
        return s.matches("Red");
    }


    /**
     * Ελέγχει (matches) αν το Input string
     * είναι "red | green"
     * @param s
     * @return
     */

    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }


    /**
     * Ελέγχει (matches) αν το Input string
     * είναι "red | green | Green | Red"
     * @param s
     * @return
     */
    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    public static boolean beginsWithOneUpperCaseAndEndsIning(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean isOneLetterEndsIng(String s) {
        return s.matches("[A-Za-z]ing");
    }

    public static boolean whitespaceDigit(String s) {
        return s.matches("^\\s\\d$");
    }

    public static boolean anySymbolDigit(String s) {
        return s.matches(".\\d");
        //return s.matches(".[0-9]");
    }

    public static boolean isEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isDate (String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static String[] doSplit(String s){
        return s.split("\\s+");
    }

    public static String doReplace(String s) {
        return s.replaceAll("\\s+","&");
    }


    /**
     * Αντιστρεφει τη σειρα 2 string . Δηλαδη αν του δωσουμε Νικος Μπαξεβανης θα το κανει Μπαξεβανης Νικος
     * @param s
     * @return
     */
    public static String doReplaceBackReference(String s) {
        return s.replaceAll("(.+)\\s+(.+)" , "$2 $1");
    }
}
