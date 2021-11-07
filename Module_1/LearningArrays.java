package m1_verybasics;

public class LearningArrays {
    //I.3. Arrays.
    public static void main(String[] args){
        /*
        * Arrays are fixed length.
        * Arrays index starts from 0 to n-1.
        * U can't assign an double/float value to an Array that store int value.
        */
        int value = 100; // container to a single value

        int[] values = new int[10]; // container for 10 elements / an array with 10 slots
        values[0] = 100; // first_index position
        values[9] = 1000; // last_index position

        System.out.println(values[0] + " " + values[9]);

        System.out.println("Default value for index 2: "+ values[2]); // by default int default value is 0, so 0 will be printed.

        //Printing the whole array
        for (int i = 0; i < values.length; i++){
            System.out.println("values index "+ i + " : " + values[i]);

        }

        // Another way to create an array, but this time we are not gonna give a length  = new String[n];
        String[] words = new String[] {"My", "name", "is"};

        //Quiz: Print the last element from the array words.
        System.out.println("This Array have " + words.length + " elements, and the last one is: " + words[words.length - 1]);

        String[] otherWords = new String[5];
        otherWords[0] = "My";
        otherWords[1] = "Name";
        otherWords[2] = "is";

        for (int i = 0; i < otherWords.length - 1 ; i++) {
            System.out.print(otherWords[i]); // MyNameisnull, string obj default value is NULL.
        }

        //Quiz: Creating a brand new array with the same name but 10 elements, the 3 elements will still be there? R: NO all the values are NULL
        otherWords = new String[10];

        for (int i = 0; i < otherWords.length - 1; i++) {
            System.out.println("Brand New: " + otherWords[i]); // ALL VALUES ARE NULL;

        }

    }
}
