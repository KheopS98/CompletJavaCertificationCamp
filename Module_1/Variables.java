package m1_verybasics;

public class Variables {
    // I.1. Variables
    /*
     * Class Naming Convention:
     *   Must start with a capital letter, for example: Animal, House, HelloWorld, Variables
     *   Multiples Words in the name each must start with capital letter.
     *  HelloWorld, SomeOtherClass, ThisIsAnExampleForClassName.
     * */
    public static void main(String[]args){
        /*
        Java Interpreter needs main method to run the program
        *   And execute the program line by line.
        * */

        /*
        * Variables in programming are places where u can store data.
        * Variables "have a variable values" means vars data can be changed.
        * Varibles naming convention:
        *   Variables names must start with a letter Ex: x, x1, yourNumber, ourNumber, textToBeStored, words.
        *   int 1x = 4; ERROR or int 5ourNumber
        *   Starting a variable name with a number will throw an error. Some symbols are allowed but will talk about it later on.
        */


        // ' = ' operator is THE ASSIGN operator

        int x; // Declaring an integer number(INTEGER DATATYPE) , keep in mind declaring.
        x = 34; // here we assign to the x variable with the ASSIGN OPERATOR =  , this line of code is often called "Variable Initialization"
        System.out.println(x); // value of current data from x is 34

        x = 23;
        System.out.println(x); // value of current data from x is 23

        //Declaration and Initialization on the same line. U don't actually have to write 2 separated statements.
        int x1 = 110; // Declaration and Initialization on the same line.


        /*
        * What about storing pieces of text, here STRING DATA TYPE will help us.
        * We specify string values only in " " Double Quotes.
         */

        String words; // String variables Declaration.
        words = "this is a sentence"; // Initialization

        System.out.println(words); // this is a sentence

        /*
        * Using Operators with compatible DataTypes.
        * Let's say for example we want your var x1 to add to it 10 more, but we don't actually change the value of the variable.
        * It's a simple operatorion that is displayed on the sceen.
        * */

        System.out.println("x1 + 10 = " + (x1 + 10)); // 120 will be printed.

        System.out.println(words + " " + x1+ " " +(x1 + 10));

        System.out.println(words + " This are some more words added to the existing sentence");


    }
}
