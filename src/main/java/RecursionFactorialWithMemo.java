public class RecursionFactorialWithMemo {

    public static int recursionFactorial(int n) {

        if (n == 0) {
            return 1;
        }else if(factorial[n] !=0){
            return factorial[n];
        }else{
            int result = recursionFactorial(n - 1) * n;
            factorial[n] = result;
            return result;
        }
    }

    public static int factorial[] = new int[26];
}
