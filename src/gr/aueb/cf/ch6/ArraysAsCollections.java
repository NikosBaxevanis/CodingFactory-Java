package gr.aueb.cf.ch6;

public class ArraysAsCollections {
    public static void main(String[] args) {
         int [] arr = {1,5,7,9};

    }

    public static int [] getEvens (int [] arr) {
        int count = 0;

        for (int el : arr) {
            if (el% 2 == 0) count++;
        }

        int [] evens = new int[count];

        int pivot = 0;
        for (int el : arr) {
            if (el % 2==0) evens[pivot++] = el;
        }
        return evens;
    }

    public  static int [] mapToDouble (int[] arr) {
        int[] newArr  = new int [arr.length];
        for (int el : arr) {
           newArr[el] = arr[el] *2;
        }
        return newArr;
    }

    public  static int  sum (int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum = sum +el;
        }
        return sum;
    }

    public static double avg (int[] arr) {
        return sum(arr) / (double) arr.length;

    }

    public static boolean anyEven (int [] arr) {
        boolean isEven = false;
        for (i = 1 ; i < arr.length ; i++) {
            if (arr[i] % 2 == 0) {
                isEven = true;
                break;
            }
        }
        return isEven;
    }

    public static boolean moreThanTwoEvens (int [] arr) {
        boolean isEven = false;
        int count = 0;
        for (i = 1 ; i < arr.length ; i++) {
            if (arr[i] % 2 == 0) {
                count += count
            }
        }
        return count >2 ;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;
        for (int i=0; i<arr.length-2 ; i++) {
            if (arr[i] == arr[i+1] -1 && arr[i] == arr[i+2] -2) {
                count ++;
                break;
            }
        }
        return count>=1;
    }

    public static boolean moreThanTwoWithSameEnding (int[] arr) {
        int [] endings = new int [10];
        boolean isSameEnding = false;

        for (int num : arr){
            endings[num %10] ++;
        }
        for (int count : endings) {
            if (count > = 3) {
                isSameEnding= true;
            }
        }
    }

    public static boolean AllAreEven (int [] arr) {
//        return getEvens(arr).length == arr.length;
        boolean allEven = false;
        int count = 0;

        for (int el : arr) {
            if (el %2== 0) count++;
        }
        return count == arr.length;
    }
}

