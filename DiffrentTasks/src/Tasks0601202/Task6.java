package Tasks0601202;

import java.util.Scanner;

/*
Ввести с клавиатуры два целых числа.
Если первое – четное ИЛИ второе – кратно трем,
вывести в консоль результат сравнения этих чисел.

Если первое число кратно и двум, и трем –
вывести на экран число один, возведенное в степень N,
где N – второе число.
 Для возведения в степень можно использовать Math.pow().
 В случае, если результат выражения выходит за пределы типа int
  (допустимые значения - [-2147483648; 2147483647]) –
  вывести сообщение «Результат выражения слишком большой!»

Также минимальное и максимальное значение int содержится в константах Integer.MIN_VALUE и Integer.MAX_VALUE соответственно.
 */
public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        if (num1 % 2 == 0 && num1 % 3 == 0) {
            double res = Math.pow(num1, num2);
            if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE)
                System.out.println("Результат выражения слишком большой!");
            else System.out.println(res);
        } else if (num1 % 2 == 0 || num2 % 3 == 0) {
            if (num1 > num2) System.out.println(num1 + " > " + num2);
            else if (num2 > num1) System.out.println(num1 + " < " + num2);
            else System.out.println(num1 + " = " + num2);
        }
    }
}
