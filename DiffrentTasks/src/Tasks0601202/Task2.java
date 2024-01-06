package Tasks0601202;

///*
//Задача 2
//Используя:
// - Переменную типа String
// - несколько переменных типа char
// - одну переменную типа char
//вывести свое имя в консоль.
//Вывод в консоль с переходом на новую строку:
//    System.out.println(/*ваша переменная*/);
//    Вывод в консоль без перехода на новую строку:
//    System.out.print(/*ваша переменная*/);
//
//        Усложнение для внимательных:
//        вывести ваше имя посимвольно, где каждая буква — на новой строке,
//        не используя System.out.println(). Реализуется как с использованием String, так и используя char.
//*/
public class Task2 {

    public static void main(String[] args) {
        String name = "Iiulia";
        char[] arr = name.toCharArray();

        for (Character letter : arr) {
            System.out.println(letter);

        }
    }
}

