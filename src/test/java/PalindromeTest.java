import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class PalindromeTest {
    private static final String EXPECTED_OUTPUT = "true";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Palindrome.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void testIsPalindrome() {
        Assert.assertEquals(output.trim().equals(EXPECTED_OUTPUT), true);
    }
}