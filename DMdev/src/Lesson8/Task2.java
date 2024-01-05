package Lesson8;

// Дано целое число. Определить, является ли последняя цифра этого числа цифрой 3
public class Task2 {
    public static void main(String[] args) {
        int number = 318522459;

        if (number % 10 == 3) {
            System.out.println("Последняя цифра числа - это 3");
        } else System.out.println("Последняя цифра числа - не 3");
    }
}

