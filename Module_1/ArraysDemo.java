package oracle_tutorials;
import java.lang.reflect.Array;
import java.util.*;
public class ArraysDemo {
    public static void main(String[]args){
        // Declare an Array;
        int[] anArray; //declaration;

        // Allocate memory for 10 elements;
        anArray = new int[10];

        // Initialize the first element;
        anArray[0] = 100;

        // Initialize the second element;
        anArray[1] = 200;

        // And so for;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1_000;

        System.out.println("Element at index 0: " + anArray[0]); // 100;
        System.out.println("Element at index 1: " + anArray[1]); // 200;
        System.out.println("Element at index 2: " + anArray[2]); // 300;
        System.out.println("Element at index 3: " + anArray[3]); // 400;
        System.out.println("Element at index 4: " + anArray[4]); // 500;
        System.out.println("Element at index 5: " + anArray[5]); // 600;
        System.out.println("Element at index 6: " + anArray[6]); // 700;
        System.out.println("Element at index 7: " + anArray[7]); // 800;
        System.out.println("Element at index 8: " + anArray[8]); // 900;
        System.out.println("Element at index 9: " + anArray[9]); // 1000;
        //  System.out.println("Element at index 10 :" + anArray[10]); IndexOutOfBoundsException;


        /*
         * The Array Declaration has 2 elements;
         * type[] arrayName;
         * [] special symbol that indicates that this variable holds an array;
         * The size of array is not specified in the declaration;
         * At declaration, doesn't actually create the array, it's simply tells the compiler that this variable will hold an Array of Specific Type[];
         * */

        byte[] byteArray;
        short[] shortArray;
        int[] intArray;
        long[] longArray;
        String[] StringArray;
        boolean[] boolArray;
        char[] charArray;
        float[] floatArray;
        double[] doubleArray;

        System.out.println("Arrays Created!");

        /*
        * Shortcut to Declare and Initialize an Array;
        * Here the length of the array is determined by  the number of values provided between braces and separated by commas;
        * You can also declare and initialize multidimensional arrays with  this shortcut form;
        * */

        int[] someOtherArray = {100,200,300,400,500,600,700,800,900,1000};
        System.out.println("someOhterArray first:" + someOtherArray[0] + " and last: " + someOtherArray[9]);

        String[][] names = {
                {"Mr.", "Ms.", "Mrs."},
                {"Smith", "Jones", "Harley"}
        };

        // Combine some names;
        System.out.println(names[0][2] + " " + names[1][2]); // Mrs. Harley;
        System.out.println(names[0][1] + " " + names[1][1]); // Ms. Jones;

        // Build-in length property to determine the size of an array;
        System.out.println("The length of names array is:" + names.length); // 2, beceause we have 2 rows
        System.out.println("The length of names array[0] is:" + names[0].length); // 3, Mr, Ms, Mrs
        System.out.println("The length of names array[1] is:" + names[1].length); // 3, Smith, Jones, Harley

        // Creating MultiDimensional Arrays;
        int[][] multiArray = new int[3][3]; // 3 rows , 3 columns.
        /*
         * r0 |0 | 0 | 0|
         * r1 |0 | 0 | 0|
         * r2 |0 | 0 | 0|
         * */


        /*
        * Copying Arrays with System.arrayCopy
        *
        * public static void arrayCopy(Object src, int srcPos,
        *                              Object dest, int destPos, int length);
        * */

        String[] copyFrom = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };
        System.out.println("\nPriting CopyFrom!\n");
        for (int i = 0; i < copyFrom.length - 1; i++) {
            System.out.println("|"+ copyFrom[i] + "|");
        }

        String[] copyTo = new String[copyFrom.length];
        System.arraycopy(copyFrom, 4, copyTo, 0, 5);


        System.out.println("\nPriting CopyTo!\n");

        // Printing the Array's CopyTo Elements;
        for (int i = 0; i < copyTo.length - 1; i++) {
            System.out.println("|"+ copyTo[i] + "|"); // Look! The last 7 positions are null. Because String is an Object, so the default values for an object is null;
        }

        //Doing the same exercise from above with a different function from java.util.arrays.copyOfRange(Object src, int startPos, lastPos);
        System.out.println("\nPriting CopyTo2!\n");
        String copyTo2[] = Arrays.copyOfRange(copyFrom,0, copyFrom.length -3 ); // CopyFrom except the last 3 elements;
        for (int i = 0; i < copyTo2.length - 1 ; i++) {
            System.out.println("|"+ copyTo2[i] + "|");
        }

        // Converting an Array to a String with Arrays.toString();
        System.out.println("\n Printing with Array.toString(): " + Arrays.toString(copyFrom) + "\n");

        /*
        * Searching an array for a specific value to get the index at which is placed / Arrays.binarySearch();
        * Comparing 2 arrays to determine is they are equal or not / Arrays.equals(arr1, arr2);
        * Fill an array to place a specific value at each index / Arrays.fill();
        * */

        System.out.println("copyFrom = copyTo2? : " + Arrays.equals(copyFrom,copyTo2)); // I guess it just compare if they have the same number of elements.
        String copyToEqual[] = Arrays.copyOfRange(copyFrom,0, copyFrom.length);

        System.out.println("CopyFrom length: " + copyFrom.length);
        System.out.println("CopyTo3 length: " + copyToEqual.length);

        System.out.println(Arrays.toString(copyFrom));
        System.out.println("\n--------------------");
        System.out.println(Arrays.toString(copyToEqual));

        System.out.println("copyFrom = copyToEqual? : " + Arrays.equals(copyFrom, copyToEqual));
    }
}