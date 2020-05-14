import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursionFactorialWithMemoTest {

    @Test
    public void testRecursionFactorial() {
        RecursionFactorialWithMemo factorial = new RecursionFactorialWithMemo();
        assertEquals("Result", 120, factorial.recursionFactorial(5));
    }
}