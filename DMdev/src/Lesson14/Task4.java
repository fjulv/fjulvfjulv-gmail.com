package Lesson14;

/*
Написать программу, определяющую, является ли введенное число простым,
т.е. делится без остатка только на 1 и само себя
 */
public class Task4 {
    public static boolean isSimple(int number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) result = false;
        }
        return result;
    }
}

