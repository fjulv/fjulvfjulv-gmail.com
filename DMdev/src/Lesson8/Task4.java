package Lesson8;

import java.util.Scanner;

/*
Написать программу, которая считывает код, введенный пользователем, и определяет,
является ли год високосным.
Високосный - делится без остатка на 4, не делится без остатка на 100, делится без остатка на 100
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введи год: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Год не високосный");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");
    }
}

