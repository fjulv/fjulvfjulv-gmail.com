package Tasks0601202;

import java.util.Scanner;

/*
. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner
число, соответствующее количеству этажей в здании.
Используя условный оператор if,
необходимо вывести в консоль сообщение о типе такого дома.
Условия:
если этажей 1-4 - “Малоэтажный дом”,
5-8 - “Среднеэтажный дом”,
9 и более - “Многоэтажный дом”.
Также, необходимо учесть что может быть введено отрицательное значение,
в таком случае сообщить “Ошибка ввода”.

 */
public class Task13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи количество этажей: ");
        int floor = sc.nextInt();

        if (floor <= 0) System.out.println("Ошибка ввода");
        else if (floor < 5) System.out.println("Малоэтажный дом");
        else if (floor < 9) System.out.println("Среднеэтажный дом");
        else System.out.println("Многоэтажный дом");
    }
}
