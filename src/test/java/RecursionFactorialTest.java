import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.assertj.core.api.Assertions.assertThat;

public class RecursionFactorialTest {
    private static final String EXPECTED_OUTPUT = "120";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        RecursionFactorial.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void testRecursionFactorial() {
        assertThat(output.trim()).contains(EXPECTED_OUTPUT);
    }
}