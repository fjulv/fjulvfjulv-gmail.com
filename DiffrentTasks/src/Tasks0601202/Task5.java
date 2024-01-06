package Tasks0601202;

import java.util.Scanner;

/*
Завести три переменные типа String.
С клавиатуры ввести в них вашу фамилию, имя и отчество.
Вывести в консоль в одну строку ваше ФИО. Сделать, используя:
1)   System.out.println
2)   System.out.printf
 */
public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FIO: ");
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        System.out.println(str + " " + str2 + " " + str3);
        System.out.printf("%s %s %s", str, str2, str3);
    }
}
