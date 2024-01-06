package Tasks0601202;

/*
Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, \
используя цикл while.
Вывод в консоль должен быть таким:
JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA

 */
public class Task7 {

    public static void main(String[] args) {

        int n = 10;
        while (n > 0) {
            System.out.print("JAVA ");
            n--;
        }
    }
}
