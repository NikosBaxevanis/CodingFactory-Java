package gr.aueb.cf.ch13;


import javax.sound.midi.Soundbank;

/**
 * Defines a {@link Account } class.
 */

public class Account {

    private int id;
    private String iban;
    private String firstname;
    private  String lastname;
    private String ssn; //αριθμός ασφάλισης
    private double balance;

    public Account() {

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    /*
     * Public API
     */

    /**
     * Deposits a certain amount of money
     * @param amount         the amount of money to be deposited.
     * @throws Exception     if the amount is negative
     */

    public  void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("The amount must not be Negative");
            }
            balance += amount;
            System.out.println("Amount " + amount + "Successfully deposited.");
        }catch(Exception e) {
            System.err.println("Error. Amount " + amount + " can not be negative");
            throw e;
        }
    }

    /**
     * Withdraws an amount of money from {@link Account}
     * based on a valid ssn checked by {@link #isSsnValid(String)}
     * @param amount
     *        The amount to be withdrawn
     * @param ssn
     *        the given ssn
     * @throws Exception
     *         if the ssn is not valid or the balance is not sufficient or the amount is negative.
     */


    public void withdraw(double amount, String ssn) throws  Exception{
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Ssn "+ ssn + " Is not Valid.");
            }

            if (amount > balance) {
                throw new Exception("Insufficient balance " + balance +" for amount " + amount );
            }

            if (amount < 0) {
                throw new Exception("The amount must not be Negative");
            }

            balance -= amount;
            System.out.println("Amount " + amount + "Successfully withdrawn.");

        } catch (Exception e) {
            System.err.println("Error" + e.getMessage());
            //e.printStackTrace();
            throw  e;
        }
    }

    /**
     * Returns the balance of the {@link Account}
     * @return the Account's balance.
     */

    public double getAccountBalance() {
        System.out.println("The account balance was returned");//logging
        return getBalance();
    }


    /**
     * Returns a string represntation of the {@link Account} state.
     * @return the string-based format of the state of the {@link Account}
     */

    public String accountToString () {
        return "(" + id + ", " + iban + ", " + firstname + ", " + lastname + ", " +ssn + ", " + balance + ")" ;
    }

    private  boolean isSsnValid (String ssn) {
        return this.ssn.equals(ssn);
    }
}
