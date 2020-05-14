public class RecursionFactorial {

    public static void main(String[] args) {
        System.out.println(recursionFactorial(5));
    }

    public static int recursionFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        return recursionFactorial(n - 1) * n;
    }
}
