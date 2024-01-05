package Lesson8;

// Дан порядковый номер месяца. Вывести пору года, к которой он относится
public class Task1 {
    public static void main(String[] args) {
        int monthNumber = 5;
        if (monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("It's spring!");
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            System.out.println("It's summer!");
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            System.out.println("It's autumn!");
        } else if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            System.out.println("It's winter!");
        } else System.out.println("Incorrect month of the year");
    }
}


