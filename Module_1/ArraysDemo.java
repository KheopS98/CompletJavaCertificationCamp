package oracle_tutorials;
import java.util.*;

public class ArraysDemo {
    public static void main(String[] args) {
        // Declaring an Array of Integers.
        int[] anArray;

        // Allocate memory for 10 integer elements.
        anArray = new int[10];

        // Initialize the first element.
        anArray[0] = 100; // index 0 = 1 element
        // Initialize the second element.
        anArray[1] = 200; // index 1 = 2 element
        // so on.
        anArray[2] = 300; // index 2 = 3 element
        anArray[3] = 400; // index 3 = 4 element
        anArray[4] = 500; // index 4 = 5 element
        anArray[5] = 600; // index 5 = 6 element
        anArray[6] = 700; // index 6 = 7 element
        anArray[7] = 800; // index 7 = 8 element
        anArray[8] = 900; // index 8 = 9 element
        anArray[9] = 1000; // index 9 = 10 element

        System.out.println("Element at index 0 :" + anArray[0]); // 100
        System.out.println("Element at index 1 :" + anArray[1]); // 200
        System.out.println("Element at index 2 :" + anArray[2]); // 300
        System.out.println("Element at index 3 :" + anArray[3]); // 400
        System.out.println("Element at index 4 :" + anArray[4]); // 500
        System.out.println("Element at index 5 :" + anArray[5]); // 600
        System.out.println("Element at index 6 :" + anArray[6]); // 700
        System.out.println("Element at index 7 :" + anArray[7]); // 800
        System.out.println("Element at index 8 :" + anArray[8]); // 900
        System.out.println("Element at index 9 :" + anArray[9]); // 1000
       //  System.out.println("Element at index 10 :" + anArray[10]); IndexOutOfBoundsException


        /*
        * The Array Declaration has 2 elements:
        * type[] arrayName
        * [] special symbol that indicates that this variable holds an array.
        * The size of array is not specified in the declaration.
        * At declaration, doesn't actually create the array, it's simply tells the compiler that this variable will hold an Array of Specific Type[].
        * */

        // Declaring Variables that Refer to an Array

        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        int[] anArrayOfInt;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;

        boolean[] anArrayOfBooleans;

        char[] anArrayOfChars;

        String[] anArrayOfStrings;
        // System.out.println(anArrayOfBytes); anArrayOfBytes might not be initialized. have nothing to be printed, any value, it's just a reference.

        // Create an array of integers with 10 elements.
        anArray = new int[10];

        // Shortcut for creating and initialize an Array
        int[] shortArray = {1,2,3,4,5,6}; //
        System.out.println("First & Last elements: " + shortArray[0] + " " + shortArray[shortArray.length - 1]);

        // Creating MultiDimensional Arrays
        int[][] multiArray = new int[3][3]; // 3 rows , 3 columns.
        /*
        * r0 |0 | 0 | 0|
        * r1 |0 | 0 | 0|
        * r2 |0 | 0 | 0|
        * */

        /* Crating MultiDimensional Arrays with the Shortcut */

        String[][] names = {
                {"Ms.", "Mr.", "Sir."},
                {"John", "Lindsey", "Josh"}
        };

        System.out.println("Result is: " + names[0][0] + " " + names[1][1]); //Ms. Lindesy
        System.out.println("Result is: " + names[0][1] + " " + names[1][0]); // Mr. John

        /*
         * Build-in Property to determine the size of an Array  (array.length)
         * Quiz: Determine the size of anArray
        */

        System.out.println("The size of the Array is: " + anArray.length);

        /*
        * Copying Arrays
        * public static void arrayCopy(Object src, int srcPosition,
        *                              Object dest, int destPos,int length);
        * Object src, dest -> arrayCopyFrom, arrayCopyTo
        * srcPosition -> start position arrayCopyFrom
        * destPos ->start position in the arrayCopyTo
        * length -> number of array elements to copy.
        * */
        System.out.println("\n");

        int[] arrayCopyFrom = {1,3,5,7,9,11,12,13};
        // Print out arrayCopyFrom
        for (int i = 0; i < arrayCopyFrom.length - 1; i++) {
            System.out.println("Array CopyFrom: "+ i +" " + arrayCopyFrom[i]);
        }

        System.out.println("\n");

        // Copy intro arrayCopyTo from position 2
        int[] arrayCopyTo = new int[10];
        System.arraycopy(arrayCopyFrom, 2,arrayCopyTo,0,5);

        for (int i = 0; i < arrayCopyTo.length - 1; i++) {
            System.out.println("Array CopyTo: "+ i + " " + arrayCopyTo[i]);

        }

        System.out.println();

        //Simplest method to print a array.
        System.out.println(Arrays.toString(arrayCopyTo));

        String[] array = new String[3];
        System.out.println("ce zice:" + array[3]);











    }
}
