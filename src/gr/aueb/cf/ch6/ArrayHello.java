package gr.aueb.cf.ch6;

public class ArrayHello {
    public static void main(String[] args) {
        int [] arr = new int[3]; //declare and init


        int [] arr3;
        int [] arr2 = {1,2,3,4,5};
        arr3 = new int[] {1,2,3,4,5};
        //Populate
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 4;

        //Traverse
        for (int i = 0; i< arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int el : arr3) {
            System.out.print(el + " ");
        }


    }
}
