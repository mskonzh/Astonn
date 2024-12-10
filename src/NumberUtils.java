public class NumberUtils {
    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static boolean sumNumbers(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}