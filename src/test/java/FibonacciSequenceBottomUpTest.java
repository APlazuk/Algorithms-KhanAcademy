import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciSequenceBottomUpTest {

    @Test
    public void testBottomUpFibonacci() {
    FibonacciSequenceBottomUp fib = new FibonacciSequenceBottomUp();
        assertEquals("Result", 5, fib.bottomUpFibonacci(5));
        assertEquals("Result", 0,fib.bottomUpFibonacci(0));
        assertEquals("Result", 1,fib.bottomUpFibonacci(1));
    }
}