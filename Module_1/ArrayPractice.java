package com.practice;
import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {
        byte[] byteArray = new byte[10];
        short[] shortArray = new short[10];
        int[] intArray = new int[10];
        long[] longArray = new long[10];
        char[] charArray = new char[10];
        String[] stringArray = new String[10];

        byteArray[0] = 0;
        shortArray[1] = 1;
        intArray[2] = 2;
        longArray[3] = 3L;
        charArray[4] = '4';
        stringArray[5] = "five";

        System.out.println(byteArray[0] + " " + shortArray[1] + " " + intArray[2] + " " + longArray[3]
                + " " + charArray[4] + " " + stringArray[5]);


        byte[] copyFrom = new byte[10];
        copyFrom[0] = 0;
        copyFrom[1] = 10;
        copyFrom[2] = 20;
        copyFrom[3] = 30;
        copyFrom[4] = 40;
        copyFrom[5] = 50;
        copyFrom[6] = 60;
        copyFrom[7] = 70;
        copyFrom[8] = 80;
        copyFrom[9] = 90;

        for (int i = 0; i < copyFrom.length - 1; i++) {
            System.out.println("copyFrom, Element at index " + i + ": " + copyFrom[i]);
        }


        int[] shortcutArray = {0, 1, 3, 5, 7, 9};
        for (int i = 0; i < shortcutArray.length - 1; i++) {
            System.out.print(shortcutArray[i] + " ");
        }
        System.out.println("Length: " + shortcutArray.length);

        String[][] names = {
                {"Ms.", "Mr."},
                {"Jones", "Marie", "John"},
                {"Something", "Else", "Here"}
        };

        System.out.println(names[0][0] + " " + names[1][1] + " " + names[2][2]); // Miss Marie Here
        System.out.println(names[0][1] + " " + names[1][0] + " " + names[2][1]) ; // Mr. Jones Else
        System.out.println(names[0][0] + " " + names[1][1] + " " + names[2][0]); // Ms. Marie Something

        // Array CopyOfDemo
        byte[] copyTo = new byte[copyFrom.length];
        System.arraycopy(copyFrom,0,copyTo,0,copyFrom.length-2);

        System.out.println("Copy From Length: " + copyFrom.length);
        System.out.println("Copy TO Length: " + copyTo.length);


        for (int i = 0; i < copyFrom.length - 1; i++) {
            System.out.println("copyFrom " + i + " " + copyFrom[i]);
        }

        System.out.println();
        for (int i = 0; i < copyTo.length - 1; i++) {
            System.out.println("copyTo " + i+ " "  + copyTo[i]);
        }
    }
}