package Tasks0601202;

public class Calculate {

    public static void printLastSixFigures(int number, int power) {

        int result = (int)Math.pow(number, power);
        if (result <= 999999) {
            System.out.println(result);
        }
        else {

        }
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(1000000, 100000));

    }
}
