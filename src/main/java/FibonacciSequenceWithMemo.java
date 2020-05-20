public class FibonacciSequenceWithMemo {

    public static void main(String[] args) {

        long preTime = System.currentTimeMillis();
        System.out.println(recursionFibonacci(25));

        long postTime = System.currentTimeMillis();
        System.out.println(postTime - preTime);
    }

    public static int recursionFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else if (fib[n] != 0) {
            return fib[n];
        } else {
            int result = recursionFibonacci(n - 1) + recursionFibonacci(n - 2);
            fib[n] = result;
            return result;
        }
    }

    public static int fib[] = new int[50];
}
