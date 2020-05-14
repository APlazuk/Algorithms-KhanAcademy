import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RecursivePowerTest {

    @Test
    public void testPowers() {
        RecursivePower power = new RecursivePower();
        assertEquals("Result", 625, power.powers(5, 4));
        assertEquals("Result", 0, power.powers(3, -1));
        assertEquals("Result", 1, power.powers(1, 0));
        assertEquals("Result", 3, power.powers(3, 1));
    }

}