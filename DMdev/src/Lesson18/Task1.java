package Lesson18;

import java.lang.reflect.Array;
import java.sql.SQLOutput;

/*
Написать программу, которая будет печатать массив сначала в обычном порядке, а потом в обратном
 */
public class Task1 {
    private static void printArray(Object [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void printReversArray(Object [] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void print(Object [] arr) {
        System.out.println("Обычный массив:");
        printArray(arr);
        System.out.println();
        System.out.println("Перевернутый массив:");
        printReversArray(arr);
    }
}
