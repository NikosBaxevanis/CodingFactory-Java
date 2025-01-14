package gr.aueb.cf.ch13.exceptions;

public class SssNotValidException  extends Exception{

    public SssNotValidException (String ssn) {
        super ("SSN " + ssn + "is not valid.");
    }
}
