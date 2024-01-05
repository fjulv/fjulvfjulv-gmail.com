package Lesson8;

import java.util.Scanner;

/* Имеется целое число, вводимое пользователем с консоли.
Это число - сумма денег в рублях.
Вывести это число, добавив к нему слово "рубль" в правильном падеже
*/
public class Task3 {
    public static void main(String[] args) {

        System.out.println("Введи сумму денег: ");

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int number = money;
        int temp = number;

        if (money > 100) {
            number = money % 100;
            temp = number;
        }
        if (number > 20) {
            while (temp > 9) {
                temp = number % 10;
            }
        }

        switch (temp) {
            case 1 -> System.out.println(money + " рубль");
            case 2, 3, 4 -> System.out.println(money + " рубля");
            default -> System.out.println(money + " рублей");
        }
    }
}

