package Lesson14;

// Написать программу, высчитывающую факториал введенного числа
// 5! = 1*2*3*4*5
public class Task1 {
    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}

