package Lesson18;

// Определить сумму элементов целочисленного массива,
// расположенных между минимальным и максимальным числом
public class Task4 {

    public static int sumElementBetweenMinAndMax(int[] array) {
        int result = 0;
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        if (minIndex < maxIndex) {
            for (int i = minIndex + 1; i < maxIndex; i++) {
                result += array[i];
            }
        } else for (int i = maxIndex + 1; i < minIndex; i++) {
            result += array[i];
        }

        return result;
    }
}

