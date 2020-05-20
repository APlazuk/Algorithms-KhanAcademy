public class FibonacciSequence {

    public static void main(String[] args) {

        long preTime = System.currentTimeMillis();
        System.out.println(recursionFibonacci(25));

        long postTime = System.currentTimeMillis();
        System.out.println(postTime - preTime);
    }

    public static int recursionFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return recursionFibonacci(n - 1) + recursionFibonacci(n - 2);
    }
}
