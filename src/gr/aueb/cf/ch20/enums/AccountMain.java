package gr.aueb.cf.ch20.enums;

public class AccountMain {
    public static void main(String[] args) {
        AccountType accountType = AccountType.CURRENT;

        //enum to string
        String strAccountType = accountType.name();
        System.out.println(strAccountType);

        //String to enum
        AccountType accountType1 = AccountType.valueOf(strAccountType);

        for (AccountType value : AccountType.values()) {
            System.out.println(value.name()); //String
            System.out.println(value.ordinal()); // ordinal number
        }
    }
}
