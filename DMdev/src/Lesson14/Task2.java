package Lesson14;

// Имеется число. Посчитать сумму цифр данного числа
public class Task2 {
    public static int sumOfDigits(int number) {
        int result = 0;

        while (number > 0) {
            result = result + number % 10;
            number = number / 10;
        }
        return result;
    }
}
