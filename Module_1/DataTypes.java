package m1_verybasics;

public class DataTypes {
// Remember naming convention for ClassNames.
    // I.2. DataTypes

    public static void main(String[] args) {
    // main() is the entry method for every Java Program.
        // Java is a strongly typed language, that means before referring to an actually identifier, you must first tell what DataType what Identifier have.
        // All of the examples below are strongly typed, because at each variable we tell them what type they are.


        /*
         *Primitives: Build-In DataTypes Byte, Short, Int, Long, char, boolean are part of the Java Language.
         *String is not an DataType is an Object, for that reason his default value is null;
         */


        // int var = 1000000000000;  int var is out of range.
        int var = 999_999_999; // that's the max range that a integer variable can store.
        System.out.println("Integer max Value: " + var);

        // long DataType is use to store big big large numbers;
        long bigNumber = 999_999_999_999_999_999L; //L or l at the end is necessary to store a long DataType.
        System.out.println("Long Value: " + bigNumber);

        long smallNumber = 3563; // The computer will still gonna reserve a large amount of memory for this variable even if the values can be store in an Integer.
        System.out.println(smallNumber);
        /*
         *Long can store Integers, because of his memory allocation.;
         *So storing smallNumber in a Long Variable is not OK.
        */


        // Short DataType can store values from -32767 to + 32767
        short shortNumber = 32767; // is OK
        System.out.println(shortNumber); // 32767

        short negativeShortNumber = -32676; // -32676
        System.out.println("Negative Short Number: " + negativeShortNumber);

        // shortNumber = 32768;  Incompatible Types, Found "int" , Required 'Short'

        /* What about u want to store numbers  < 127
        * Byte DataType can store values from -128 to +127
        */

        byte reallySmallNumber = 127; // 127
        System.out.println(reallySmallNumber);

        byte negativeSmallNumber= -128; // -128
        System.out.println(negativeSmallNumber);

        /* Bad Example:
         *  byte badExampleByte = 128; Incompatible type found: int, Req Byte;
         */

        /* Decimal Variables:
         *  Double Precision : double var = 000.0001111;
         *  Single Precision: float var = 000.0001111f;
        * */

        double doubleVariable = 384.003; // comes from double precision.
        System.out.println("Double Variable: " + doubleVariable);

        float floatVariable = 121.01f; // float var in the initialization must end with f.
        System.out.println("Float Variable: " + floatVariable);

        /* Boolean Variables:
        * Decision making with boolean values;
        * Bool Variables have only 2 values:
        * True or False;
        * */

        boolean isItTrue = true;
        System.out.println("EX BOOL: Is it true that i'm still learning ? Q: " + isItTrue);

        boolean decision = false;
        System.out.println("My decision is : " + decision );

        /*
        * Char DataType:
        *   Can store only single Character.
        *   Must be between  ' '.
        * */
        char singleCharacter1 = '%';
        System.out.println(singleCharacter1); // %

        singleCharacter1 = 'c';
        System.out.println(singleCharacter1); // c

        singleCharacter1 = '5';
        System.out.println(singleCharacter1); // 5

        String isStringObject = ""; //prints 'blank/ empty'
        System.out.println("isStringObject return: " + isStringObject); //because before printing the language tells you can't print this var without initialization.

        /* What makes this language so special in the OOP Languages?.
        * We can define our own DataTypes.
        * All the Primitives DataTypes are Pre-Defined.
        * */








    }
}
