package Tasks0601202;

import java.util.Scanner;

/*
Задача 2:
Написать программу, которая принимает строку с клавиатуры.
Если строка == "Hi" - вывести в консоль "Hello",
если Bye - Good bye,
если How are you - How are your doing.
Если любая другая строка - вывести Unknown message. Сделать через:

1)   if-else

2)   switch-case

 */
public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, Bye or How are you");
        String str = sc.nextLine();

        if (str.equalsIgnoreCase("hi")) System.out.println("Hello");
        else if (str.equalsIgnoreCase("bye")) System.out.println("Good bye");
        else if (str.equalsIgnoreCase("How are you")) System.out.println("How are you doing");
        else System.out.println("Unknown message");

        switch ((str)) {
            case "Hi" -> System.out.println("Hello");
            case "Bye" -> System.out.println("Good bye");
            case "How are you" -> System.out.println("How are you doing");
            default -> System.out.println("Unknown message");
        }
    }
}

