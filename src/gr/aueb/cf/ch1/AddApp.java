package gr.aueb.cf.ch1;

/**
 * calculates the sum of 2 integers
 * and the result is printed at console
 * (standard output)
 */
public class AddApp {
    public static void main(String[] args) {
        // Δήλωση και Αρχικοποιήση Μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;


        //Εντολές
        result = num1 + num2;

        //Εκτύπωση

        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το άθροισμα των " + num1 + " , " + num2 + " είναι ίσο με " + result);
        // \n Αφήνει μια γραμμή (ln) , τα %d ειναι Position mapping για τα nums
        System.out.printf("Το άθροισμα των %d , %d είναι ίσο με: %d\n" , num1 , num2 , result);
    }
}
