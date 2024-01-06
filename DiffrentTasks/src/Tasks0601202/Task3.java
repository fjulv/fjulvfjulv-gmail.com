package Tasks0601202;

import java.util.Scanner;

/*
Ввести с клавиатуры два целых числа.
Если Число1 четное, вывести произведение двух чисел(пр.1),
если нет - частное(пр.2).
Также если числа равны - вывести надпись "Числа равны!"

пр1.: "Число1 * Число2 = Произведение", где число1 - значение 1го числа, число2 - значение 2го числа,
Произведение - результат умножения.

пр2.: "Число1 / Число2 = Частное", где число1 - значение 1го числа, число2 - значение 2го числа,
Частное - результат деления. Помните, что результат деления двух целых чисел – тоже целое число.
 */
public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        if (num1 % 2 == 0 && num1 != num2) {
            System.out.println(num1 * num2);
        } else if (num1 == num2) {
            System.out.println("Числа равны!");
        } else System.out.println(num1 / num2);
    }
}
