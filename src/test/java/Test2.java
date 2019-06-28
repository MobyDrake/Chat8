import SolutionLesson6.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test2 {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {true, new int[]{1, 1, 1, 4, 4, 1, 4, 4}},
                {false, new int[]{1, 1, 1, 1, 1, 1}},
                {false, new int[]{4, 4, 4, 4 }},
                {false, new int[]{1, 4, 4, 1, 1, 4, 3}},
        });
    }

    private boolean a;
    private int[] b;
    private Solution solution;

    public Test2(boolean a, int[] b) {
        this.a = a;
        this.b = b;
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testT1() {
        Assert.assertEquals(a, solution.containOneAndFour(b));
    }
}
