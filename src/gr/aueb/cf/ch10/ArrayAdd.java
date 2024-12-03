package gr.aueb.cf.ch10;

public class ArrayAdd {

    public static void main(String[] args) {
            int [] arr = {9,9,9,9};
            int [] arrOut;

            arrOut = addOne(arr);
            for (int degit : arrOut) {
                System.out.print(degit + " ");
            }
    }

    public static int[] addOne(int [] arr) {
        int [] arrOut;
        int currentSum;
        int carry = 1; //Κρατούμενο


        if (arr==null) throw new IllegalArgumentException("Error. Array must not be null");
        arrOut = new int [arr.length +1];

        for (int i = arr.length -1 ; i >=0 ; i--) {
            currentSum = arr[i] + carry;

            arrOut[i+1]  = currentSum % 10; //δεξι μελος του currentSum
            carry = currentSum/10; //αριστερο μελος του currentSum

        }
        arrOut[0] = (carry ==1) ? 1:0;
        return arrOut;

    }
}
