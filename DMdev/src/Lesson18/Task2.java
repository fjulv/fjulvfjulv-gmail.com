package Lesson18;

/*
Написать программу, заносящую в массив первые 100 целых чисел,
делящихся на 13 или 17, и печатающую их
 */
public class Task2 {

    public static void printSomeNumbers() {
        int[] array = new int[100];
        int tempInd = 1;

        for (int i = 0; i < array.length; i += 2) {
            array[i] = tempInd * 13;
            array[i + 1] = (tempInd) * 17;
            tempInd++;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

