package gr.aueb.cf.ch8;

public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        int [] arr = new int [10];

        for (int i =0 ; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
/*
Προσοχη στο παραπανω. Πρεπει να ειμαστε στο i < arr.length και οχι στο i<=arr.length αλλιως οδηγουμαστε out of bounds του arr
 */