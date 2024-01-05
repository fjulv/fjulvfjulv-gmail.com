package Lesson14;

import java.time.Year;

/*
В 1626 году индейцы продали Манхэттен за $24.
Написать программу, которая высчитывает сумму,
получившуюся бы в текущем году,
если бы индейцы положили эти деньги в банк под 5% годовых
 */
public class Task3 {
    public static double calculateSum() {
        double sum = 24;
        int yearOfSale = 1626;
        int currentYear = Year.now().getValue();

        for (int i = yearOfSale; i < currentYear; i++) {
            sum = sum + sum * 5 / 100;
        }
        return sum;
    }
}
