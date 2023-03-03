package sai;

public class BooleanArrayExample {
    public static void main(String[] args) {
        // create a boolean array with 5 elements
        boolean[] boolArray = new boolean[5];

        // initialize the elements of the array
        boolArray[0] = true;
        boolArray[1] = false;
        boolArray[2] = true;
        boolArray[3] = false;
        boolArray[4] = true;

        // print the values of the array
        System.out.println("The values of the boolean array are:");
        for (int i = 0; i < boolArray.length; i++) {
            System.out.println("Element " + i + ": " + boolArray[i]);
        }

        // count the number of true values in the array
        int trueCount = 0;
        for (int i = 0; i < boolArray.length; i++) {
            if (boolArray[i]) {
                trueCount++;
            }
        }
        System.out.println("The number of true values in the array is: " + trueCount);

        // check if all elements in the array are true
        boolean allTrue = true;
        for (int i = 0; i < boolArray.length; i++) {
            if (!boolArray[i]) {
                allTrue = false;
                break;
            }
        }
        System.out.println("Are all elements in the array true? " + allTrue);
    }
}
