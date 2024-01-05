package Lesson18;

/*
Написать метод equals, который определяет, равны ли между собой соответствующие элементы двух
двухмерных массивов
 */
public class Task3 {
    public static boolean equals(int[][] arr1, int[][] arr2) {
        boolean result = false;
        if (arr1.length != arr2.length)
            result = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i].length != arr2[i].length)
                    result = false;
                else if (arr1[i][j] == arr2[i][j]) result = true;
            }
        }

        return result;
    }
}

