import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FibonacciSequenceWithMemoTest{

    @Test
    public void testRecursionFibonacci() {
    FibonacciSequenceWithMemo fib = new FibonacciSequenceWithMemo();
    assertEquals("Result", 5, fib.recursionFibonacci(5));
    assertEquals("Result", 75025,fib.recursionFibonacci(25));
    assertEquals("Result", 0,fib.recursionFibonacci(0));
    assertEquals("Result", 1,fib.recursionFibonacci(1));
    }
}