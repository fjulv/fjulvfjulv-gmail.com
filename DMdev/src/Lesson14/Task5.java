package Lesson14;

/*
Написать программу, которая проходит циклом по английскому алфавиту,
начиная с буквы ´b´, и выводит каждую букву до тех пор, пока не встретит гласную
(т.е. вывести согласные на консоль)
 */
public class Task5 {
    public static void printConsonantLetter() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetCharArray = alphabet.toCharArray();

        for (int i = 0; i < alphabetCharArray.length; i++) {
            if (alphabetCharArray[i] == 'a' || alphabetCharArray[i] == 'e' || alphabetCharArray[i] == 'i' ||
                    alphabetCharArray[i] == 'o' || alphabetCharArray[i] == 'u') continue;
            System.out.print(alphabetCharArray[i] + " ");
        }
    }
}

