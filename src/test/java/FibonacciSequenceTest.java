import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciSequenceTest  {

    @Test
    public void testRecursionFibonacci() {
        FibonacciSequence fib = new FibonacciSequence();
        assertEquals("Result", 5,fib.recursionFibonacci(5));
        assertEquals("Result", 75025,fib.recursionFibonacci(25));
        assertEquals("Result", 0,fib.recursionFibonacci(0));
        assertEquals("Result", 1,fib.recursionFibonacci(1));
    }
}