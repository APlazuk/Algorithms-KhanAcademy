public class FibonacciSequenceBottomUp {

    public static void main(String[] args) {

        long preTime = System.currentTimeMillis();
        System.out.println(bottomUpFibonacci(25));

        long postTime = System.currentTimeMillis();
        System.out.println(postTime - preTime);
    }

    public static int bottomUpFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int twoBehind = 0;
        int oneBehind = 1;
        int result = 0 ;

        for (int i = 1; i < n; i++) {

            result = oneBehind + twoBehind;
            twoBehind = oneBehind;
            oneBehind = result;

        }
        return result;
    }
}
