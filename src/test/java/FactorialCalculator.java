public class FactorialCalculator {

    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number should be non-negative.");
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}