public class RecursivePower {

    public static int powers(int number, int power) {

        //base case
        if (power == 0) {
            return 1;
        }

        // recursive case: n is negative
        if (power < 0) {
            return 1 / powers(number, -power);
        }
        // recursive case: n is odd
        if (isOdd(power)) {
            return powers(number, power - 1) * number;
        }

        if (isEven(power)) {

            int y = powers(number, power / 2);
            return y * y;
        }
        return -1;
    }

    public static boolean isOdd(int number) {
        return !isEven(number);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
