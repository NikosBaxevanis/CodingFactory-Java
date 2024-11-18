package gr.aueb.cf.ch6;

public class ArraySearch {
    public static void main(String[] args) {
        int []arr = {1,2,3,5};
        final int Secret = 4;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Secret) {
                found  = true;
                break;
            }
        }
        if (found) {
            System.out.println("Secret Found");
        }
        else {
            System.out.println("Secret not Found");
        }
    }
}
