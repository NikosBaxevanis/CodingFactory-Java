package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {
    public static void main(String[] args) {
        String cf = "Coding Factory" ;


        int positionOfo = cf.indexOf("o"); //1 , μετραμε απο το 0
        int positionOfSecondo = cf.indexOf("0" , 2); //ψαχνει απο το d και μετα
        int lastPositionOfo = cf.lastIndexOf("o"); // ψαχνει απο τα δεξια προς τα αριστερα

        // η Index δειχνει το position που βρισκεται ενα γραμμα στο string

        String cf2 = cf.substring(0); // η πρωτη παραμετρος ειναι το start index και η δευτερη παραμετρος ειναι το last index - 1. Αρα θα φερει "oding Factory"
        String slice = cf.substring(1,3); // εδω θα φερει "od"
    }
}
