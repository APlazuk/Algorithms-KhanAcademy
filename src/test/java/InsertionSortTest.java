import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.assertj.core.api.Assertions.assertThat;

public class InsertionSortTest{

    private static final String EXPECTED_OUTPUT = "-5, 1, 2, 4, 10";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        InsertionSort.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void testInsertionSort() {
        assertThat(output.trim()).contains(EXPECTED_OUTPUT);
    }
}